package cz.cuni.mff.parser;

import cz.cuni.mff.parser.antlr.ParserLexer;
import cz.cuni.mff.parser.antlr.ParserParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Application {

    public static void main(String[] args) {
        ParserLexer lexer = new ParserLexer(CharStreams.fromString("SELECT deptno, employee.salary FROM employee; \n" +
                "SELECT * FROM employee WHERE name='John' AND employed=true;\n" +
                "CREATE TABLE salary( weight BYTEINT, salary DECIMAL );\n" +
                "INSERT INTO employee ( name , employed ) VALUES ('Many', false);\n" +
                "DEL FROM Salary WHERE city='Huston' AND employer='KHJ';\n" +
                "CREATE VIEW Overall AS SELECT * FROM salary JOIN emloyee;\n" +
                "CREATE TABLE House (owner VARCHAR, ADDRESS VARCHAR, number INTEGER) ;\n"));
        ParserParser parser = new ParserParser(new CommonTokenStream(lexer));
        System.out.print(parser.main().code);
    }
}
