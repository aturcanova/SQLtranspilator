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
	 * Enter a parse tree produced by {@link ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#statement_type}.
	 * @param ctx the parse tree
	 */
	void enterStatement_type(ParserParser.Statement_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#statement_type}.
	 * @param ctx the parse tree
	 */
	void exitStatement_type(ParserParser.Statement_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(ParserParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(ParserParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#select_stmnt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmnt(ParserParser.Select_stmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#select_stmnt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmnt(ParserParser.Select_stmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#select_parameters}.
	 * @param ctx the parse tree
	 */
	void enterSelect_parameters(ParserParser.Select_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#select_parameters}.
	 * @param ctx the parse tree
	 */
	void exitSelect_parameters(ParserParser.Select_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#select_distinct_all}.
	 * @param ctx the parse tree
	 */
	void enterSelect_distinct_all(ParserParser.Select_distinct_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#select_distinct_all}.
	 * @param ctx the parse tree
	 */
	void exitSelect_distinct_all(ParserParser.Select_distinct_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#select_params}.
	 * @param ctx the parse tree
	 */
	void enterSelect_params(ParserParser.Select_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#select_params}.
	 * @param ctx the parse tree
	 */
	void exitSelect_params(ParserParser.Select_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(ParserParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(ParserParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#from_statement}.
	 * @param ctx the parse tree
	 */
	void enterFrom_statement(ParserParser.From_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#from_statement}.
	 * @param ctx the parse tree
	 */
	void exitFrom_statement(ParserParser.From_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhere_statement(ParserParser.Where_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhere_statement(ParserParser.Where_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(ParserParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(ParserParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#logical_ops}.
	 * @param ctx the parse tree
	 */
	void enterLogical_ops(ParserParser.Logical_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#logical_ops}.
	 * @param ctx the parse tree
	 */
	void exitLogical_ops(ParserParser.Logical_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#group_by_statment}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_statment(ParserParser.Group_by_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#group_by_statment}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_statment(ParserParser.Group_by_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#having_statement}.
	 * @param ctx the parse tree
	 */
	void enterHaving_statement(ParserParser.Having_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#having_statement}.
	 * @param ctx the parse tree
	 */
	void exitHaving_statement(ParserParser.Having_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#order_by_statement}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_statement(ParserParser.Order_by_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#order_by_statement}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_statement(ParserParser.Order_by_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(ParserParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(ParserParser.TablesContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ParserParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(ParserParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(ParserParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#insert_into_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_statement(ParserParser.Insert_into_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#insert_into_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_statement(ParserParser.Insert_into_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(ParserParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(ParserParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(ParserParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(ParserParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statement(ParserParser.Create_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statement(ParserParser.Create_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#alter_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_statement(ParserParser.Alter_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#alter_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_statement(ParserParser.Alter_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#alter_stmnt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_stmnt(ParserParser.Alter_stmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#alter_stmnt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_stmnt(ParserParser.Alter_stmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(ParserParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(ParserParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#alter_tab}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tab(ParserParser.Alter_tabContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#alter_tab}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tab(ParserParser.Alter_tabContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#rename_statement}.
	 * @param ctx the parse tree
	 */
	void enterRename_statement(ParserParser.Rename_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#rename_statement}.
	 * @param ctx the parse tree
	 */
	void exitRename_statement(ParserParser.Rename_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#add_statement}.
	 * @param ctx the parse tree
	 */
	void enterAdd_statement(ParserParser.Add_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#add_statement}.
	 * @param ctx the parse tree
	 */
	void exitAdd_statement(ParserParser.Add_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#drop_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statement(ParserParser.Drop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#drop_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statement(ParserParser.Drop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#drop_stmnt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmnt(ParserParser.Drop_stmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#drop_stmnt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmnt(ParserParser.Drop_stmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(ParserParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(ParserParser.Column_definitionContext ctx);
}