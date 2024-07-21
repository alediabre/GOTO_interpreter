package org.lenguajegoto;

import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.lenguajegoto.dto.GotoResponse;
import org.lenguajegoto.dto.InstructionTriplet;
import org.lenguajegoto.enums.ErrorType;
import org.lenguajegoto.util.MathUtils;
import org.lenguajegoto.util.InputUtils;

import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Visitor extends BaseVisitor {
    List<String> macroVars; //Input variables for the macro function are held temporally in this list for their assignment

    public Object visitMacro(Anasint.MacroContext ctx) {
        //Get macro file for the function found by the parser
        Integer result = null;
        String directory_name;
        String functionFile;
        String function_name = ctx.ID_FUNCION().getText().toLowerCase();

        directory_name = propertyLoader.getProperty("app.function."+function_name+".type");
        functionFile = propertyLoader.getProperty("app.function."+function_name);
        if(directory_name==null || functionFile==null){
            //If macro is not defined in config.properties, notify user and go to program end
            error(ErrorType.MACRO, "Function "+function_name+" not defined in macros");
        }
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("macros/"+directory_name+"/"+functionFile);
        if (inputStream != null) {
            ParseTree tree = InputUtils.subProgramTree(inputStream);
            //Create macro Visitor and set basic properties
            Visitor visitor_macro= new Visitor();
            visitor_macro.setProgramName(function_name);
            //Create new variable space (macroVars) and set to Visitor
            macroVars = new ArrayList<>();
            visitor_macro.setVariable("Y", 0);
            visit(ctx.variables());
            for (int i=1; i<=macroVars.size(); i++){
                Integer var = variables.get(macroVars.get(i-1));
                visitor_macro.setVariable("X"+i, var==null?0:var);
            }

            //Visit tree and save the result (Y value)
            GotoResponse res = (GotoResponse) visitor_macro.visit(tree);
            result = res.getResult();
            //Set the resulting execution as the nested executions of last instruction
            response.setNestedExecutionLastInstruction(res.getExecutions());
        }else{
            //If macro is not defined or misspelled, notify user and go to program end
            error(ErrorType.MACRO, "Function "+function_name+" program not found in macros");
            instr = max_instr;
        }
        //Returns macro result to be used
        return result;
    }


    public Object visitVariables(Anasint.VariablesContext ctx){
        //Add recursively the input variables of the macro function to macroVars
        String var = (String) visit(ctx.variable());
        macroVars.add(var);
        if (ctx.variables() != null){
            visit(ctx.variables());
        }
        return null;
    }

    public Object visitAsignacion(Anasint.AsignacionContext ctx){
        String var0 = (String) visit(ctx.variable(0));
        Integer nuevoValor;

        if (ctx.macro() != null){
            //If it is a macro, first the value returned by the macro must be evaluated
            nuevoValor = (Integer) visit(ctx.macro());
        }else if (ctx.godel() != null){
            nuevoValor = (Integer) visit(ctx.godel());
        }else{
            //If it is a variable, the value of that variable is assigned to the first one (0 if var1 was not assigned)
            String var1 = (String) visit(ctx.variable(1));
            if (!variables.containsKey(var1)){
                variables.put(var1,0);
            }
            nuevoValor = variables.get(var1);
        }
        variables.put(var0, nuevoValor);
        instr +=1;
        return null;
    }

    public Object visitSalto_incondicional(Anasint.Salto_incondicionalContext ctx){
        String etiq = (String) visitEtiqueta(ctx.etiqueta());
        if (etiq.equals("E1")){
            //The E label ends the program
            instr = max_instr;
        }else if (!etiquetas.containsKey(etiq)){
            //If label does not exist, it ends the program and notify user
            error(ErrorType.LABEL, "Label "+etiq+" does not exist in this program. Execution ends");
            instr = max_instr;
        }else{
            //In other case, goes to the instruction the label points
            instr = etiquetas.get(etiq);
        }
        return null;
    }

    public Object visitGodel(Anasint.GodelContext ctx){
        String prog_label = ctx.PROGRAM_LABEL().getText();
        List<Anasint.InstruccionContext> prog_instrucciones = progs.get(prog_label);

        //Transform a list of instruction contexts in a list of triplets for those instructions (<a,<b,c>)
        List<InstructionTriplet> triplets = getTriplets(prog_instrucciones);
        System.out.println("\nGÖDEL ---> INSTRUCTIONS of "+prog_label+" codified as:");
        for (int i=0; i<triplets.size(); i++){
            InstructionTriplet t = triplets.get(i);
            if (t==null){
                System.out.println("Instr "+i+" = Wrong instrucion");
                instr = max_instr;
                return null;
            }else {
                System.out.println("Instr "+i+" = <"+t.a()+",<"+t.b()+","+t.c()+">");
            }
        }

        //Requires de _pair macro to codify the instructions using goto
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("macros/codification/codifytriplet.goto");
        ParseTree tree = InputUtils.subProgramTree(inputStream);

        //Initialize a list for the codified instructions and a BigInteger number for the program number (Godel number of program)
        List<Integer> codifiedInstructions = new ArrayList<>();
        BigInteger godelNumber = BigInteger.ONE;
        int prime = 2;
        for (InstructionTriplet t : triplets) {
            Visitor visitor = new Visitor();
            visitor.setProgramName("_codifytriplet");
            visitor.setExecution_level(execution_level + 1);
            visitor.setVerbose_level(verbose_level);
            //Set a,b,c variables to the macro
            visitor.setVariable("Y", 0);
            visitor.setVariable("X1", t.a());
            visitor.setVariable("X2", t.b());
            visitor.setVariable("X3", t.c());
            GotoResponse res = (GotoResponse) visitor.visit(tree);
            int y = res.getResult();

            codifiedInstructions.add(y);
            BigInteger term = BigInteger.valueOf(prime).pow(y);
            godelNumber = godelNumber.multiply(term);
            prime = MathUtils.nextPrime(prime);
        }
        System.out.println("\nGÖDEL ---> Program "+prog_label+" instructions codified as: "+codifiedInstructions+"\n");
        System.out.println("GÖDEL NUMBER of "+prog_label+" = "+godelNumber+"\n");

        instr +=1;
        if (godelNumber.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))>0){
            error(ErrorType.GODEL, "Gödel number too big to assign as a variable");
            instr = max_instr;
            return null;
        }else {return godelNumber.intValue();}
    }

    public List<InstructionTriplet> getTriplets(List<Anasint.InstruccionContext> prog_instrucciones){
        List<InstructionTriplet> triplets = new ArrayList<>();
        for (Anasint.InstruccionContext inst : prog_instrucciones){
            int a = 0;
            int b = 0;
            int c = 0;
            //Logic for a
            if(inst.etiqueta()!=null){
                String label = (String) visit(inst.etiqueta());
                a = codifyLabel(label);
            }
            //Logic for b and c depending on the type of instruction
            Anasint.Instruccion_basicaContext basica = inst.instruccion_basica();
            if(basica.asignacion()!=null){
                Pair<Integer,Integer> p = caseAssignGodel(basica.asignacion());
                b = p.a;
                c = p.b;

            }else if(basica.incremento()!=null){
                Pair<Integer,Integer> p = caseIncrementGodel(basica.incremento());
                b = p.a;
                c = p.b;

            }else if(basica.decremento()!=null){
                Pair<Integer,Integer> p = caseDecrementGodel(basica.decremento());
                b = p.a;
                c = p.b;

            }else if(basica.condicional()!=null){
                Pair<Integer,Integer> p = caseConditionalGodel(basica.condicional());
                b = p.a;
                c = p.b;
            }else if(basica.salto_incondicional()!=null){
                error(ErrorType.GODEL, "Godel codification can not process macros [UNCONDITIONAL JUMP]. Your given program must contain only Skip,Increment,Decrement or Conditional");
                b = -1;
            }
            //If the b is set to -1, means the instruction is wrong (contains macro or godel), so triplet is set to null
            if (b==-1){
                triplets.add(null);
            }else{
                InstructionTriplet triplet = new InstructionTriplet(a,b,c);
                triplets.add(triplet);
            }
        }
        return triplets;
    }

    public Pair<Integer,Integer> caseAssignGodel(Anasint.AsignacionContext ctx){
        int b = 0;
        int c = 0;
        String var0 = (String) visit(ctx.variable(0));
        if (ctx.macro()!=null || ctx.godel()!=null){
            //If assign instruction contains a macro or godel in the right part
            error(ErrorType.GODEL, "Godel codification can not process macros [MACRO FUNCTION]. Your given program must contain only Skip,Increment,Decrement or Conditional");
            b = -1;
        }else {
            String var1 = (String) visit(ctx.variable(1));
            if(!var0.equals(var1)) {
                //If assign instruction is a variable assignment, print error, forbidden macros
                error(ErrorType.GODEL, "Godel codification can not process macros [VARIABLE ASSIGNMENT]. Your given program must contain only Skip,Increment,Decrement or Conditional");
                b = -1;
            }else {
                //If assign instruction is a Skip, b=0
                c = codifyVariable(var0)-1;
            }
        }
        return new Pair<>(b,c);
    }

    public Pair<Integer,Integer> caseIncrementGodel(Anasint.IncrementoContext ctx){
        int b = 1;
        String var = (String) visit(ctx.variable(0));
        int c = codifyVariable(var)-1;
        return new Pair<>(b,c);
    }

    public Pair<Integer,Integer> caseDecrementGodel(Anasint.DecrementoContext ctx){
        int b = 2;
        String var = (String) visit(ctx.variable(0));
        int c = codifyVariable(var)-1;
        return new Pair<>(b,c);
    }

    public Pair<Integer,Integer> caseConditionalGodel(Anasint.CondicionalContext ctx){
        int b;
        int c = 0;
        if(ctx.condicion().macro()!=null){
            //If conditional instruction contains a macro as condition, print error, forbidden macros
            error(ErrorType.GODEL, "Godel codification can not process macros [MACRO CONDITION]. Your given program must contain only Skip,Increment,Decrement or Conditional");
            b = -1;
        }else{
            //If it is a basic conditional, b will be destination label codified + 2
            String following_label = (String) visit(ctx.etiqueta());
            int codified_following_label = codifyLabel(following_label);
            b = 2 + codified_following_label;
            String var = (String) visit(ctx.condicion().variable());
            c = codifyVariable(var)-1;
        }
        return new Pair<>(b,c);
    }

    public int codifyLabel(String label){
        char letter = label.charAt(0);
        int i = Integer.parseInt(label.substring(1, 2));
        return switch (letter) {
            case 'A' -> 5 * (i - 1) + 1;
            case 'B' -> 5 * (i - 1) + 2;
            case 'C' -> 5 * (i - 1) + 3;
            case 'D' -> 5 * (i - 1) + 4;
            case 'E' -> 5 * i;
            default -> 0;
        };
    }

    public int codifyVariable(String var){
        char letter = var.charAt(0);
        if (letter=='Y'){
            return 1;
        }
        int i = Integer.parseInt(var.substring(1, 2));
        return switch (letter) {
            case 'X' -> 2*i;
            case 'Z' -> (2*i)+1;
            default -> 0;
        };
    }
}
