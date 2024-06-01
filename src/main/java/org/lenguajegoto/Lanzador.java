package org.lenguajegoto;

//import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
//import javax.swing.*;
//import java.util.Arrays;
//import java.nio.file.Paths;

public class Lanzador {
    public static void main(String[] args) throws Exception{
        if (args.length < 1) {
            System.err.println("No se ha proporcionado un fichero de entrada");
            System.exit(1);
        }
        try{
            CharStream input = CharStreams.fromFileName(args[0]);
            Analex analex = new Analex(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);

            Anasint anasint = new Anasint(tokens);
            ParseTree tree = anasint.programa();

            /*
            JFrame frame = new JFrame("Árbol de Análisis");
            JPanel panel = new JPanel();
            TreeViewer viewer = new TreeViewer(Arrays.asList(anasint.getRuleNames()),tree);
            viewer.setScale(1);
            panel.add(viewer);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,400);
            frame.setVisible(true);
            */

            //RECORRIDO CON VISITOR
            Visitor visitor= new Visitor();

            //Set new output file and clear old one if it is the same
            String outputName = "output.txt";
            OutPrinter.clear(outputName);
            visitor.setOutputFile(outputName);

            //Set program name
            String[] programRoute = args[0].split("/");
            visitor.setProgramName(programRoute[programRoute.length-1]+" (MAIN)");

            //Set variables
            visitor.setVariable("Y", 0);
            for (int i=1; i<args.length; i++){
                visitor.setVariable("X"+i, Integer.parseInt(args[i]));
            }

            Integer result = (Integer) visitor.visit(tree);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}