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
	 * Enter a parse tree produced by {@link ParserParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(ParserParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(ParserParser.ColumnContext ctx);
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
	 * Enter a parse tree produced by {@link ParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ParserParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ParserParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#equality_ops}.
	 * @param ctx the parse tree
	 */
	void enterEquality_ops(ParserParser.Equality_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#equality_ops}.
	 * @param ctx the parse tree
	 */
	void exitEquality_ops(ParserParser.Equality_opsContext ctx);
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
	 * Enter a parse tree produced by {@link ParserParser#columns_sorted}.
	 * @param ctx the parse tree
	 */
	void enterColumns_sorted(ParserParser.Columns_sortedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#columns_sorted}.
	 * @param ctx the parse tree
	 */
	void exitColumns_sorted(ParserParser.Columns_sortedContext ctx);
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
	 * Enter a parse tree produced by {@link ParserParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(ParserParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(ParserParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(ParserParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(ParserParser.JoinContext ctx);
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
	 * Enter a parse tree produced by {@link ParserParser#insert_into_stmnt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_stmnt(ParserParser.Insert_into_stmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#insert_into_stmnt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_stmnt(ParserParser.Insert_into_stmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#insert_columns}.
	 * @param ctx the parse tree
	 */
	void enterInsert_columns(ParserParser.Insert_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#insert_columns}.
	 * @param ctx the parse tree
	 */
	void exitInsert_columns(ParserParser.Insert_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#instert_values}.
	 * @param ctx the parse tree
	 */
	void enterInstert_values(ParserParser.Instert_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#instert_values}.
	 * @param ctx the parse tree
	 */
	void exitInstert_values(ParserParser.Instert_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(ParserParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(ParserParser.ValuesContext ctx);
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
	 * Enter a parse tree produced by {@link ParserParser#update_stmnt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmnt(ParserParser.Update_stmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#update_stmnt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmnt(ParserParser.Update_stmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#update_columns}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_columns(ParserParser.Update_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#update_columns}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_columns(ParserParser.Update_columnsContext ctx);
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
	 * Enter a parse tree produced by {@link ParserParser#delete_stmnt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmnt(ParserParser.Delete_stmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#delete_stmnt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmnt(ParserParser.Delete_stmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#delete_database}.
	 * @param ctx the parse tree
	 */
	void enterDelete_database(ParserParser.Delete_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#delete_database}.
	 * @param ctx the parse tree
	 */
	void exitDelete_database(ParserParser.Delete_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#delete_from}.
	 * @param ctx the parse tree
	 */
	void enterDelete_from(ParserParser.Delete_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#delete_from}.
	 * @param ctx the parse tree
	 */
	void exitDelete_from(ParserParser.Delete_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(ParserParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(ParserParser.Database_nameContext ctx);
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
	 * Enter a parse tree produced by {@link ParserParser#create_stmnt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_stmnt(ParserParser.Create_stmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#create_stmnt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_stmnt(ParserParser.Create_stmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(ParserParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(ParserParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(ParserParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(ParserParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#create_view_columns}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_columns(ParserParser.Create_view_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#create_view_columns}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_columns(ParserParser.Create_view_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#columns_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumns_definition(ParserParser.Columns_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#columns_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumns_definition(ParserParser.Columns_definitionContext ctx);
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
	 * Enter a parse tree produced by {@link ParserParser#drop_columns}.
	 * @param ctx the parse tree
	 */
	void enterDrop_columns(ParserParser.Drop_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#drop_columns}.
	 * @param ctx the parse tree
	 */
	void exitDrop_columns(ParserParser.Drop_columnsContext ctx);
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
	 * Enter a parse tree produced by {@link ParserParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(ParserParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(ParserParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#aggregation_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_function(ParserParser.Aggregation_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#aggregation_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_function(ParserParser.Aggregation_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#aggregation_fnc}.
	 * @param ctx the parse tree
	 */
	void enterAggregation_fnc(ParserParser.Aggregation_fncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#aggregation_fnc}.
	 * @param ctx the parse tree
	 */
	void exitAggregation_fnc(ParserParser.Aggregation_fncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#agreggation_parameter}.
	 * @param ctx the parse tree
	 */
	void enterAgreggation_parameter(ParserParser.Agreggation_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#agreggation_parameter}.
	 * @param ctx the parse tree
	 */
	void exitAgreggation_parameter(ParserParser.Agreggation_parameterContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ParserParser#column_type}.
	 * @param ctx the parse tree
	 */
	void enterColumn_type(ParserParser.Column_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#column_type}.
	 * @param ctx the parse tree
	 */
	void exitColumn_type(ParserParser.Column_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ParserParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ParserParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ParserParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ParserParser.ValueContext ctx);
}