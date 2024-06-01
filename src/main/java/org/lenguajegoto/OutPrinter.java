package org.lenguajegoto;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutPrinter {

    private static BufferedWriter writer;

    public static void print(String filename, String value) {
        try {
            if (writer == null) {
                writer = new BufferedWriter(new FileWriter(filename, true));
            }
            writer.write(value);
            writer.newLine();
            writer.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clear(String filename) {
        try (BufferedWriter clearWriter = new BufferedWriter(new FileWriter(filename))) {
            // Opening the file in write mode without append will clear the file content
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
