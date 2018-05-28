package cz.cuni.mff.parser;

import cz.cuni.mff.parser.antlr.ParserLexer;
import cz.cuni.mff.parser.antlr.ParserParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Application {

    private static String translate(String query) {
        ParserLexer lexer = new ParserLexer(CharStreams.fromString(query));
        ParserParser parser = new ParserParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();

        //TODO: replace nulls
        //TODO: uppercase lowercase

        return parser.main().code;
    }

    public static void main(String[] args) {
//TODO: sql na vstupe
        if (args.length == 1 && args[0].equals("-h")) {
            System.out.println("Params:");
            System.out.println("-h                   Help");
            System.out.println("-i [inputFile]       Read query from input file");
            System.out.println("-o [outputFile]      Write result to output file");
            System.out.println("-q \"[sql_query]\"   Set query as input param");
            //System.out.println("-s                   Write result to standard output");
            System.exit(0);
        }

        if (args.length % 2 != 0) {
            System.out.println("Wrong number of parameters");
            System.out.println("Use -h for help");
            System.exit(0);
        }

        String inputFile = null;
        String outputFile = null;
        String sqlQuery = null;


        for (int i = 0; i < args.length; i = i + 2) {
            switch (args[i]) {
                case "-i":
                    inputFile = args[i + 1];
                    break;
                case "-q":
                    sqlQuery = args[i + 1];
                    break;
                case "-o":
                    outputFile = args[i + 1];
                    break;
                default:
                    System.out.println("Wrong number of parameters");
                    System.out.println("Use -h for help");
                    System.exit(0);
            }
        }

        ReadWrite read = new ReadWrite();

        String result = null;

        if (inputFile != null) {
            String query = read.readFile(inputFile);

            result = translate(query);

            if (outputFile != null && result != null) {
                read.writeToFile(result, outputFile);
            } else {
                System.out.print(result);
            }
        }

        if (sqlQuery != null) {
            result = translate(sqlQuery);

            if (outputFile != null && result != null) {
                read.writeToFile(result, outputFile);
            } else {
                System.out.print(result);
            }
        }
    }
}
