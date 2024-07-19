package org.lenguajegoto.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InstructionExecution {

    private String functionName;
    private int instruction;
    private Map<String,Integer> state;
    private List<InstructionExecution> nestedExecutions;

    public InstructionExecution(String functionName, int instruction, Map<String,Integer> state){
        this.functionName = functionName;
        this.instruction = instruction;
        this.state = state;
        this.nestedExecutions = new ArrayList<>();
    }


    public String getFunctionName(){ return  functionName; }

    public void setFunctionName(){ this.functionName = functionName; }

    public int getInstruction() {
        return instruction;
    }

    public void setInstruction(int instruction) {
        this.instruction = instruction;
    }

    public Map<String,Integer> getState() {
        return state;
    }

    public void setState(Map<String,Integer> state) {
        this.state = state;
    }

    public List<InstructionExecution> getNestedExecutions() {
        return nestedExecutions;
    }

    public void setNestedExecutions(List<InstructionExecution> nestedExecutions) {
        this.nestedExecutions = nestedExecutions;
    }
}
