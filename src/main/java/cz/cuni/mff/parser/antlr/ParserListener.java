// Generated from C:/Users/andre_000/Desktop/SQLTranspilator/src/main/java/cz/cuni/mff/parser/antlr\Parser.g4 by ANTLR 4.7
package cz.cuni.mff.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserParser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ParserParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ParserParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#statement_keyword}.
	 * @param ctx the parse tree
	 */
	void enterStatement_keyword(ParserParser.Statement_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#statement_keyword}.
	 * @param ctx the parse tree
	 */
	void exitStatement_keyword(ParserParser.Statement_keywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code params}
	 * labeled alternative in {@link ParserParser#select_params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ParserParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code params}
	 * labeled alternative in {@link ParserParser#select_params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ParserParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(ParserParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(ParserParser.TableContext ctx);
}