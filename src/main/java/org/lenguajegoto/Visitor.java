package org.lenguajegoto;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Visitor extends BaseVisitor {
    List<String> macroVars; //Input variables for the macro function are held temporally in this list for their assignment


    public Object visitMacro(Anasint.MacroContext ctx) {
        //Get macro file for the function found by the parser
        Integer result = null;
        String directory_name = null;
        String functionFile = null;
        String function_name = ctx.ID_FUNCION().getText().toLowerCase();

        directory_name = propertyLoader.getProperty("app.function."+function_name+".type");
        functionFile = propertyLoader.getProperty("app.function."+function_name);
        if(directory_name==null || functionFile==null){
            //If macro is not defined in config.properties, notify user and go to program end
            print("ERROR[Instr: "+instr+"]: Function "+function_name+" not defined in macros");
        }

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("macros/"+directory_name+"/"+functionFile)){
            if (inputStream != null) {
                //Create a new tree for the program defined for the macro
                CharStream input = CharStreams.fromStream(inputStream);
                Analex analex = new Analex(input);
                CommonTokenStream tokens = new CommonTokenStream(analex);
                Anasint anasint = new Anasint(tokens);
                ParseTree tree = anasint.programa();

                //Create macro Visitor and set basic properties
                Visitor visitor_macro= new Visitor();
                visitor_macro.setProgramName(function_name);
                visitor_macro.setExecution_level(execution_level+1);
                visitor_macro.setVerbose_level(verbose_level);
                visitor_macro.setOutputFile(outputFile);

                //Create new variable space (macroVars) and set to Visitor
                macroVars = new ArrayList<>();
                visitor_macro.setVariable("Y", 0);
                visit(ctx.variables());
                for (int i=1; i<=macroVars.size(); i++){
                    visitor_macro.setVariable("X"+i, variables.get(macroVars.get(i-1)));
                }

                //Visit tree and save the result (Y value)
                result = (Integer) visitor_macro.visit(tree);
            }else{
                //If macro is not defined or misspelled, notify user and go to program end
                print("ERROR[Instr: "+instr+"]: Function "+function_name+" program not found in macros");
                instr = max_instr;
            }
        }catch (IOException ex){
            ex.printStackTrace();
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
        }else{
            //If it is a variable, the value of that variable is assigned to the first one
            String var1 = (String) visit(ctx.variable(1));
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
            print("WARNING[Instr: "+instr+"]: Label "+etiq+" does not exist in this program. Execution ends");
            instr = max_instr;
        }else{
            //In other case, goes to the instruction the label points
            instr = etiquetas.get(etiq);
        }
        return null;
    }
}
