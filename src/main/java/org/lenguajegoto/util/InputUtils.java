package org.lenguajegoto.util;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.lenguajegoto.Analex;
import org.lenguajegoto.Anasint;

import java.io.IOException;
import java.io.InputStream;

public class InputUtils {

    public static ParseTree subProgramTree(InputStream inputStream){
        ParseTree tree = null;
        //Create a new tree for the program defined for the macro
        try {
            CharStream input = CharStreams.fromStream(inputStream);
            Analex analex = new Analex(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            Anasint anasint = new Anasint(tokens);
            tree = anasint.programa();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return tree;
    }

}
