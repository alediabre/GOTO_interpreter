package org.lenguajegoto.rest;

import lombok.Getter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.lenguajegoto.dto.GotoResponse;
import org.lenguajegoto.util.InputUtils;
import org.lenguajegoto.Visitor;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping("/api/goto")
public class GotoInterpreterController {

    @PostMapping("/read")
    @ResponseBody
    public GotoResponse read(@RequestBody CodeRequest request) {

        Visitor visitor = new Visitor();

        visitor.setExecution_level(1);
        visitor.setProgramName(request.getProgramName());

        visitor.setVariable("Y", 0);
        for (int i=1; i<request.getArgs().size()+1; i++){
            visitor.setVariable("X"+i, request.getArgs().get(i-1));
        }

        InputStream stream = new ByteArrayInputStream(request.getCode().getBytes(StandardCharsets.UTF_8));
        ParseTree tree = InputUtils.subProgramTree(stream);
        return (GotoResponse) visitor.visit(tree);
    }

    @Getter
    public static class CodeRequest {
        private String programName;
        private String code;
        private List<Integer> args;
    }
}

