package cz.cuni.mff.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWrite {

    public String readFile(String inputFile){
        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader fr = new FileReader(inputFile); BufferedReader br = new BufferedReader(fr)) {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                stringBuilder.append(sCurrentLine);
            }
        } catch (IOException e) {
            System.out.println("Could not read from input file");
        }
        return stringBuilder.toString();
    }

    public void writeToFile(String query, String outputFile){
        try (PrintWriter writer = new PrintWriter(outputFile, "UTF-8");) {
            writer.println(query);
        } catch (IOException e) {
            System.out.println("Could not write to output file");
        }
    }
}
