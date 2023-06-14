package io.codelex.testCodelex.exercise4;

import java.io.*;

public class FileReader {
    private static final String PATH = "C:/Users/gusta/codelex JAVA/homeworks/src/main/java/io/codelex/";

    public static void main(String[] args) throws IOException {
        String oldTextLoc = "fileToRead.txt";
        String newTextLoc = "newBMW.txt";
        BufferedReader in = new BufferedReader(new java.io.FileReader(PATH + oldTextLoc));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH + newTextLoc));

        StringBuilder content = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) {
            content.append(line).append(System.lineSeparator());
        }
        in.close();
        content.reverse();
        out.write(content.toString());
        out.close();

    }
}