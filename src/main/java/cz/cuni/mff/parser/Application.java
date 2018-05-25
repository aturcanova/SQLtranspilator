package cz.cuni.mff.parser;

import cz.cuni.mff.parser.antlr.ParserLexer;
import cz.cuni.mff.parser.antlr.ParserParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Application {

    public static void main(String[] args) {

        if (args.length == 1 && args[0].equals("-h")) {
            System.out.println("Params: [inputFile] [outputFile]");
            System.exit(0);
        }

        if (args.length != 2) {
            System.out.println("Wrong number of parameters");
            System.exit(0);
        }

        String inputFile = args[0];
        String outputFile = args[1];

        StringBuilder stringBuilder = new StringBuilder();

        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(inputFile);
            br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                stringBuilder.append(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        ParserLexer lexer = new ParserLexer(CharStreams.fromString(stringBuilder.toString()));
        ParserParser parser = new ParserParser(new CommonTokenStream(lexer));
        System.out.print(parser.main().code);

        PrintWriter writer = null;

        try {
            writer = new PrintWriter(outputFile, "UTF-8");
            writer.println(parser.main().code);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
