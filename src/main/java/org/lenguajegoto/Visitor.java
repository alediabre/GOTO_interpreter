package org.lenguajegoto;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class Visitor extends AnasintBaseVisitor<Object>{

    public Map<String, Integer> variables = new HashMap<>();
    public Map<Integer, Anasint.InstruccionContext> instrucciones = new HashMap<>(); //Correspondencia num. instruccion con el contexto de la instruccion
    public Map<String, Integer> etiquetas = new HashMap<>(); //Correspondencia etiqueta con el num. instrucción
    public Integer instr = 0; //Numero de instruccion actual
    public Integer max_instr; //Numero total de instrucciones (longitud del programa)


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
        initializeVars();
        max_instr = ctx.getChildCount();
        controller();
        System.out.println("Resultado: Y = "+ variables.get("Y"));
        return null;
    }


    public void controller(){
        while (instr < max_instr) {
            System.out.println(variables + " | instr:"+instr+ " ("+instrucciones.get(instr).getText()+")");
            visitInstruccion(instrucciones.get(instr));
        }
    }
    public void initializeVars(){
        variables.put("Y", 0);
        variables.put("X1", 4);
    }

    public Object visitEtiqueta(Anasint.EtiquetaContext ctx) {
        //Si la etiqueta es solo una letra L, le añade el subíndice 1 (L1)
        String etiq = ctx.getText();
        if (etiq.length() == 1){
            etiq += '1';
        }
        return etiq;
    }

    public Object visitInstruccion(Anasint.InstruccionContext ctx) {
        if (ctx != null){
            visit(ctx.instruccion_basica());
        }
        return null;
    }

    public Object visitCondicional(Anasint.CondicionalContext ctx) {
        String etiq = (String) visitEtiqueta(ctx.etiqueta());
        String var = (String) visit(ctx.variable());
        if (!variables.containsKey(var)){ //Se añade la variable a "variables" si no existía
            variables.put(var,0);
        }
        if (etiq.equals("E1")){ //La etiqueta E lleva a la terminación del programa
            instr = max_instr;

        } else if (!etiquetas.containsKey(etiq)){ //Si no existe la etiqueta
            System.out.println("La etiqueta "+etiq+" no existe en este programa");

        }else if (variables.get(var) != 0){ //Si se cumple la condición
            instr = etiquetas.get(etiq);

        }else{ //Si no se cumple la condición
            instr += 1;
        }
        return null;
    }

    public Object visitIncremento(Anasint.IncrementoContext ctx) {
        String var0 = (String) visit(ctx.variable(0));
        String var1 = (String) visit(ctx.variable(1));
        if (!var0.equals(var1)){
            System.out.println("Las variables "+var0+" y "+var1+" no coinciden");
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
            System.out.println("Las variables "+var0+" y "+var1+" no coinciden");
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


}