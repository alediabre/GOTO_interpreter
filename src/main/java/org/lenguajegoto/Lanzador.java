package org.lenguajegoto;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import javax.swing.*;
import java.util.Arrays;


public class Lanzador {
    public static void main(String[] args) throws Exception{
        CharStream input = CharStreams.fromFileName("src/main/resources/programa.txt");
        Analex analex = new Analex(input);
        CommonTokenStream tokens = new CommonTokenStream(analex);

        Anasint anasint = new Anasint(tokens);
        ParseTree tree = anasint.programa();

        JFrame frame = new JFrame("Árbol de Análisis");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(anasint.getRuleNames()),tree);
        viewer.setScale(1);
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setVisible(true);

        //RECORRIDO CON VISITOR

        Visitor visitor= new Visitor();
        visitor.visit(tree);
    }
}