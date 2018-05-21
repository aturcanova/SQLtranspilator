package cz.cuni.mff.parser;

import cz.cuni.mff.parser.antlr.ParserLexer;
import cz.cuni.mff.parser.antlr.ParserParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Application {

    public static void main(String[] args){
        ParserLexer lexer = new ParserLexer(CharStreams.fromString("SELECT deptno FROM employee ;"));
        ParserParser parser = new ParserParser(new CommonTokenStream(lexer));
        parser.main();
        //String name = parser.main().name().getText();
    }
}
