package org.lenguajegoto;


import java.util.*;


public class BaseVisitor extends AnasintBaseVisitor<Object> {

    PropertyLoader propertyLoader = new PropertyLoader("config.properties");
    String outputFile;
    String programName;
    int execution_level;
    int verbose_level;
    public Map<String, Integer> variables = new HashMap<>();
    public Map<Integer, Anasint.InstruccionContext> instrucciones = new HashMap<>(); //Correspondencia num. instruccion con el contexto de la instruccion
    public Map<String, Integer> etiquetas = new HashMap<>(); //Correspondencia etiqueta con el num. instrucción
    public Integer instr = 0; //Numero de instruccion actual
    public Integer max_instr; //Numero total de instrucciones (longitud del programa)


    public void setProgramName(String name){
        this.programName = name;
    }
    public void setOutputFile(String output){ this.outputFile = output; }
    public void setVerbose_level(int value){ this.verbose_level = value; }
    public void setVariable(String varName, int value) {
        this.variables.put(varName, value);
    }
    public void setExecution_level(int value){ this.execution_level = value; }

    public void print(String value){
        if (verbose_level>=execution_level){
            OutPrinter.print(outputFile, value);
        }
    }

    public Object visitPrograma(Anasint.ProgramaContext ctx) {
        //Recorre todas las instrucciones para indexarlas en "instrucciones" y guardar los índices de las etiquetas en "etiquetas"
        for (int i=0; i<ctx.getChildCount(); i++){
            Anasint.InstruccionContext hijo = (Anasint.InstruccionContext) ctx.getChild(i);
            if (hijo.etiqueta() != null){
                String etiq = (String) visitEtiqueta(hijo.etiqueta());
                etiquetas.put(etiq, i);
            }
            instrucciones.put(i, hijo);
        }
        max_instr = ctx.getChildCount();
        controller();
        return variables.get("Y");
    }

    public void controller() {
        print("---------------"+programName+"---------------");
        while (instr < max_instr) {
            print(variables + " | instr:" + instr + " (" + instrucciones.get(instr).getText() + ")");
            visitInstruccion(instrucciones.get(instr));
        }
        print("Resultado: Y = "+ variables.get("Y"));
        print("---------------FIN "+programName+"---------------");
    }

    public Object visitInstruccion(Anasint.InstruccionContext ctx) {
        visit(ctx.instruccion_basica());
        return null;
    }

    public Object visitEtiqueta(Anasint.EtiquetaContext ctx) {
        String etiq = ctx.getText();
        if (etiq.length() == 1) {
            etiq += '1';
        }
        return etiq;
    }

    public Object visitVar_entrada(Anasint.Var_entradaContext ctx) {
        String var = ctx.getText();
        if (var.length() == 1){
            var += '1';
        }
        return var;
    }

    public Object visitVar_trabajo(Anasint.Var_trabajoContext ctx) {
        String var = ctx.getText();
        if (var.length() == 1){
            var += '1';
        }
        return var;
    }

    public Object visitVar_salida(Anasint.Var_salidaContext ctx) {
        return ctx.getText();
    }

    public Object visitCondicion(Anasint.CondicionContext ctx){
        if (ctx.macro()!=null){
            //If there is a macro, evaluates macro. It must be a boolean macro
            String function_name = ctx.macro().ID_FUNCION().getText().toLowerCase();
            String isBooleanMacro = propertyLoader.getProperty("app.function."+function_name+".bool");

            if (isBooleanMacro!=null && isBooleanMacro.equals("true")){
                Integer c = (Integer) visit(ctx.macro());
                if (c == 1){
                    return true;
                }else{
                    return false;
                }
            }else{
                //A boolean macro is pretended to return Boolean value (0,1), a NOT boolean macro returns Integer value (0,1,2...)
                print("ERROR[Instr: "+instr+"]: Function "+function_name+" can not be used as a boolean condition");
                instr = max_instr;
                return null;
            }
        }else{
            //If it is GOTO basic conditional: IF var != 0 GOTO L
            String var = (String) visit(ctx.variable());
            if (variables.get(var)!=0){
                return true;
            }else {
                return false;
            }
        }
    }

    public Object visitCondicional(Anasint.CondicionalContext ctx) {
        String etiq = (String) visitEtiqueta(ctx.etiqueta());
        Object condicion = visit(ctx.condicion());

        if (condicion!=null && (Boolean)condicion){
            //Checks if condition is met

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
        }else{
            //If condition in not met, just goes to next instruction
            instr += 1;
        }
        return null;
    }

    public Object visitIncremento(Anasint.IncrementoContext ctx) {
        String var0 = (String) visit(ctx.variable(0));
        String var1 = (String) visit(ctx.variable(1));
        if (!var0.equals(var1)){
            print("ERROR[Instr: "+instr+"]: Las variables "+var0+" y "+var1+" no coinciden");
            instr = max_instr;
        }else{
            if (!variables.containsKey(var0)){
                variables.put(var0,1);
            }else {
                Integer valor = variables.get(var0);
                variables.put(var0, valor+1);
            }
        }
        instr += 1;
        return null;
    }

    public Object visitDecremento(Anasint.DecrementoContext ctx) {
        String var0 = (String) visit(ctx.variable(0));
        String var1 = (String) visit(ctx.variable(1));
        if (!var0.equals(var1)){
            print("ERROR[Instr: "+instr+"]: Las variables "+var0+" y "+var1+" no coinciden");
            instr = max_instr;
        }else{
            if (!variables.containsKey(var0)){
                variables.put(var0,0);
            }else {
                Integer valor = variables.get(var0);
                variables.put(var0, Math.max(0,(valor-1)));
            }
        }
        instr += 1;
        return null;
    }
}