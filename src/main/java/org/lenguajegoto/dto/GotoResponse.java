package org.lenguajegoto.dto;

import lombok.Data;
import org.lenguajegoto.enums.ErrorType;

import java.util.List;

@Data
public class GotoResponse {

    private boolean success;
    private List<InstructionExecution> executions;
    private int result;
    private GotoError error;

    public GotoResponse(boolean success, List<InstructionExecution> executions, int result, GotoError error) {
        this.success = success;
        this.executions = executions;
        this.result = result;
        this.error = error;
    }

    public void addInstruction(InstructionExecution instruction){
        List<InstructionExecution> currentExecution = this.executions;
        currentExecution.add(instruction);
        this.executions = currentExecution;
    }

    public void setNestedExecutionLastInstruction(List<InstructionExecution> sublist){
        int num_exec = executions.size();
        if (num_exec == 0){
            this.executions = sublist;
        }else{
            executions.get(executions.size()-1).setNestedExecutions(sublist);
        }
    }

    public static class GotoError {
        public ErrorType type;
        public String message;
        public String programName;
        public int instruction;

        public GotoError(ErrorType type, String message, String programName, int instruction){
            this.type = type;
            this.message = message;
            this.programName = programName;
            this.instruction = instruction;
        }
    }
}
