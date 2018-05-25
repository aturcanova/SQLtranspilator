grammar Parser;

main returns [String code = null]
    : statement { $code = $statement.code; }
    ;

statement returns [String code=null]
    : statement_type WS? SEMICOLON WS? { $code = $statement_type.code + ";"; }
    | statement_type WS? SEMICOLON WS? statement { $code = $statement_type.code + ";\n\n" + $statement.code; }
    ;

statement_type returns [String code=null]
    : select_statement { $code = $select_statement.code; }
    | insert_into_statement { $code = $insert_into_statement.code; }
    | update_statement { $code = $update_statement.code; }
    | delete_statement { $code = $delete_statement.code; }
    | create_statement { $code = $create_statement.code; }
    | alter_statement { $code = $alter_statement.code; }
    | drop_statement { $code = $drop_statement.code; }
    ;

select_statement returns [String code=null]
    : (SEL | SELECT) WS select_parameters WS from_statement
        { $code = "SELECT " + $select_parameters.code + "\n" + $from_statement.code; }
    | (SEL | SELECT) WS select_parameters WS from_statement WS select_stmnt
        { $code = "SELECT " + $select_parameters.code + "\n" + $from_statement.code + "\n" + $select_stmnt.code; }
    ;

select_stmnt returns [String code=null]
    : where_statement
        { $code = $where_statement.code; }
    | where_statement WS order_by_statement
        { $code = $where_statement.code + " " + $order_by_statement.code; }
    | where_statement WS group_by_statment WS order_by_statement
         { $code = $where_statement.code + " " + $order_by_statement.code + " " + $order_by_statement.code; }
    ;

select_parameters returns [String code=null]
    : ASTERISK { $code = "*"; }
    | select_distinct_all WS select_params
        { $code = $select_distinct_all.code + " " + $select_params.code; }
    | select_distinct_all WS select_params WS? COMMA WS? select_parameters
        { $code = $select_distinct_all.code + " " + $select_params.code + ", " + " " + $select_parameters.code; }
    | select_params
        { $code = $select_params.code; }
    | select_params WS? COMMA WS? select_parameters
        { $code = $select_params.code + ", " + $select_parameters.code; }
    ;

select_distinct_all returns [String code=null]
    : DISTINCT { $code = "DISTINCT"; }
    | ALL { $code = "ALL"; }
    ;

select_params returns [String code=null]
    : aggregation_function { $code = $aggregation_function.code; }
    | column { $code = $column.code; }
    ;

column returns [String code=null]
    : column_name { $code = $column_name.code; }
    | table_name DOT column_name { $code = $table_name.code + "." + $column_name.code; }
    ;

column_name returns [String code=null] : name { $code = $name.code; };

from_statement returns [String code=null] : FROM WS tables  { $code = "FROM " + $tables.code; };

where_statement returns [String code=null] : WHERE WS conditions  { $code = "WHERE " + $conditions.code; };

conditions returns [String code=null]
    : condition
        { $code = $condition.code; }
    | condition WS logical_ops WS conditions
        { $code = $condition.code + " " + $logical_ops.code + " " + $conditions.code; }
    ;

condition returns [String code=null]
    : column WS? equality_ops WS? value { $code = $column.code + $equality_ops.code + $value.code; }
    ;

equality_ops returns [String code=null]
    : EQUALITY { $code = "="; }
    | LT { $code = "<"; }
    | LE { $code = "<="; }
    | GT { $code = ">"; }
    | GE { $code = ">="; }
    | NE { $code = "!="; }
    | NEQL { $code = "<>"; }
    ;

logical_ops returns [String code=null]
    : AND { $code = "AND"; }
    | OR { $code = "OR"; }
    ;

group_by_statment returns [String code=null]
    : GROUP WS BY WS columns { $code = "GROUP BY " + $columns.code; }
    | GROUP WS BY WS columns WS having_statement { $code = "GROUP BY " + $columns.code + " " + $having_statement.code; }
    ;

having_statement returns [String code=null] : HAVING WS conditions { $code = "HAVING " + $conditions.code; };

order_by_statement returns [String code=null] : ORDER WS BY WS columns_sorted
        { $code = "ORDER BY " + $columns_sorted.code; }
    ;

columns_sorted returns [String code=null]
    : column asc_desc WS? COMMA WS? columns_sorted
        { $code = $column.code + $asc_desc.code + ", " + $columns_sorted.code; }
    ;

asc_desc returns [String code=null]
    : WS ASC { $code = " ASC"; }
    | WS DESC { $code = " DESC"; }
    ;

tables returns [String code=null]
    : table { $code = $table.code; }
    | table WS join WS tables{ $code = $table.code + " " + $join.code + " " + $tables.code; }
    ;

table returns [String code=null]
    : table_name { $code = $table_name.code; }
    | LEFT_BRACKET WS? select_statement WS? RIGHT_BRACKET { $code = "(" + $select_statement.code + ")"; }
    ;

table_name returns [String code=null] : name { $code = $name.code; };

join returns [String code=null]
    : COMMA { $code = ","; }
    | JOIN { $code = "JOIN"; }
    | NATURAL WS JOIN { $code = "NATURAL JOIN"; }
    | CROSS WS JOIN { $code = "CROSS JOIN"; }
    | INNER WS JOIN { $code = "INNER JOIN"; }
    | full_right_left WS OUTER WS JOIN { $code = $full_right_left.code + " OUTER JOIN"; }
    ;

full_right_left returns [String code=null]
    : FULL { $code = "FULL"; }
    | RIGHT { $code = "RIGHT"; }
    | LEFT { $code = "LEFT"; }
    ;

columns returns [String code=null]
    : column { $code = $column.code; }
    | column WS? COMMA WS? columns { $code = $column.code + ", " + $columns.code; }
    ;

insert_into_statement returns [String code=null] : INSERT WS INTO WS table_name WS insert_into_stmnt
        { $code = "INSERT INTO " + $table_name.code + " " + $insert_into_stmnt.code; }
    ;

insert_into_stmnt returns [String code=null]
    : instert_values { $code = $instert_values.code; }
    | select_statement { $code = $select_statement.code; }
    | insert_columns WS instert_values { $code = $insert_columns.code + " " + $instert_values.code; }
    | insert_columns WS select_statement { $code = $insert_columns.code + " " + $select_statement.code; }
    ;

insert_columns returns [String code=null] :  LEFT_BRACKET WS? columns WS? RIGHT_BRACKET
         { $code = "(" + $columns.code + ")"; }
    ;

instert_values returns [String code=null] : VALUES WS LEFT_BRACKET WS? values WS? RIGHT_BRACKET
        { $code = "VALUES (" + $values.code + ")"; }
    ;

values returns [String code=null]
    : value { $code = $value.code; }
    | value WS? COMMA WS? values { $code = $value.code + ", " + $values.code; }
    ;

update_statement returns [String code=null] : UPDATE WS table_name WS SET WS update_stmnt
        { $code = "UPDATE " + $table_name.code + " SET " + $update_stmnt.code; }
    ;

update_stmnt returns [String code=null]
    : update_columns { $code = $update_columns.code; }
    | update_columns WS where_statement { $code = $update_columns.code + " " + $where_statement.code; }
    ;

update_columns returns [String code=null]
    : column_name WS? EQUALITY WS? value
        { $code = $column_name.code + "=" + $value.code; }
    | column_name WS? EQUALITY WS? value WS? COMMA WS update_columns
        { $code = $column_name.code + "=" + $value.code + ", " + $update_columns.code; }
    ;

delete_statement returns [String code=null] : (DEL|DELETE) WS delete_stmnt { $code = "DELETE " + $delete_stmnt.code; };

delete_stmnt returns [String code=null]
    : delete_database { $code = $delete_database.code; }
    | delete_from { $code = $delete_from.code; }
    ;

delete_database returns [String code=null] : DATABASE WS database_name { $code = "DATABASE " + $database_name.code; };

delete_from returns [String code=null]
    : FROM WS table_name { $code = "FROM " + $table_name.code; }
    | FROM WS table_name WS where_statement { $code = "FROM " + $table_name.code + " " + $where_statement.code; }
    ;

database_name returns [String code=null] : name { $code = $name.code; };

create_statement returns [String code=null] : CREATE WS create_stmnt { $code = "CREATE " + $create_stmnt.code; };

create_stmnt returns [String code=null]
    : create_table { $code = $create_table.code; }
    | create_view { $code = $create_view.code; }
    ;

create_table returns [String code=null] : TABLE WS table_name WS? LEFT_BRACKET WS? columns_definition WS? RIGHT_BRACKET
        { $code = "TABLE " + $table_name.code + "(" + $columns_definition.code + ")"; }
    ;

create_view returns [String code=null]
    : VIEW WS table_name WS AS WS select_statement
        { $code = "VIEW " + $table_name.code + " AS " + $select_statement.code; }
    | VIEW WS table_name WS create_view_columns WS AS WS select_statement
        { $code = "VIEW " + $table_name.code + " " + $create_view_columns.code + " AS " + $select_statement.code; }
    ;

create_view_columns returns [String code=null] : columns { $code = $columns.code; };

columns_definition returns [String code=null]
    : column_definition { $code = $column_definition.code; }
    | column_definition WS? COMMA WS? columns_definition
        { $code = $column_definition.code + ", " + $columns_definition.code; }
    ;

alter_statement returns [String code=null] : ALTER WS alter_stmnt{ $code = "ALTER " + $alter_stmnt.code; };

alter_stmnt returns [String code=null] : alter_table { $code = $alter_table.code; };

alter_table returns [String code=null] : TABLE WS table_name WS alter_tab
         { $code = "TABLE " + $table_name.code + " " + $alter_tab.code; }
    ;

alter_tab returns [String code=null]
    : rename_statement { $code = $rename_statement.code; }
    | rename_statement WS alter_tab { $code = $rename_statement.code + " " + $alter_tab.code; }
    | add_statement { $code = $add_statement.code; }
    | add_statement WS alter_tab { $code = $add_statement.code + " " + $alter_tab.code; }
    | drop_columns { $code = $drop_columns.code; }
    | drop_columns WS alter_tab { $code = $drop_columns.code + " " + $alter_tab.code; }
    ;

rename_statement returns [String code=null] : RENAME WS column_name WS TO WS column_name
         { $code = "RENAME " + $column_name.code + " TO " + $column_name.code; }
    ;

add_statement returns [String code=null] : ADD WS column_definition { $code = "ADD " + $column_definition.code; };

drop_columns returns [String code=null]
    : DROP WS column_name { $code = "DROP " + $column_name.code; }
    | DROP WS column_name WS drop_columns { $code = "DROP " + $column_name.code + " " + $drop_columns.code; }
    ;

drop_statement returns [String code=null] : DROP WS drop_stmnt
        { $code = "DROP " + $drop_stmnt.code; }
    ;

drop_stmnt returns [String code=null]
    : DATABASE database_name { $code = "DATABASE " + $database_name.code; }
    | TABLE WS table_name { $code = "TABLE " + $table_name.code; }
    | VIEW WS view_name { $code = "VIEW " + $view_name.code; }
    | COLUMN WS column_name { $code = "COLUMN " + $column_name.code; }
    ;

view_name returns [String code=null] : name { $code = $name.code; };

aggregation_function returns [String code=null]
    : COUNT aggregation_fnc { $code = "COUNT" + $aggregation_fnc.code; }
    | SUM aggregation_fnc { $code = "SUM" + $aggregation_fnc.code; }
    | MAX aggregation_fnc { $code = "MAX" + $aggregation_fnc.code; }
    | MIN aggregation_fnc { $code = "MIN" + $aggregation_fnc.code; }
    | AVG aggregation_fnc { $code = "AVG" + $aggregation_fnc.code; }
    ;

aggregation_fnc returns [String code=null] : LEFT_BRACKET agreggation_parameter RIGHT_BRACKET
        { $code = "(" + $agreggation_parameter.code + ")"; }
    ;

agreggation_parameter returns [String code=null]
    : ASTERISK { $code = "*"; }
    | column { $code = $column.code; }
    ;

column_definition returns [String code=null] : column_name WS column_type
    { $code = $column_name.code + " " + $column_type.code; }
    ;

column_type returns [String code=null] : type { $code = $type.code; };

name returns [String code=null] : NAME { $code = $NAME.text.toString(); };

type returns [String code=null]
    : BYTEINT { $code = "TINYINT"; }
    | SMALLINT { $code = "SMALLINT"; }
    | INTEGER { $code = "INT"; }
    | BIGINT { $code = "BIGINT"; }
    | DECIMAL { $code = "DOUBLE"; }
    | NUMERIC { $code = "DOUBLE"; }
    | FLOAT { $code = "FLOAT"; }
    | CHAR { $code = "CHAR"; }
    | CHAR LEFT_BRACKET INT RIGHT_BRACKET { $code = "CHAR(" + Integer.toString(INT) + ")"; }
    | VARCHAR { $code = "STRING"; }
    | VARCHAR LEFT_BRACKET INT RIGHT_BRACKET { $code = "STRING(" + Integer.toString(INT) + ")"; }
    | DATE { $code = "TIMESTAMP"; }
    | TIME { $code = "TIMESTAMP"; }
    | TIMESTAMP { $code = "TIMESTAMP"; }
    ;

value returns [String code=null]
    : val { $code = $val.code; }
    | APOSTROF value APOSTROF { $code = "'" + $value.code + "'"; }
    ;

val returns [String code=null] : NAME { $code = $NAME.text.toString(); };

// key words
SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
GROUP: 'GROUP';
HAVING: 'HAVING';
ORDER: 'ORDER';
DISTINCT: 'DISTINCT';
ALL: 'ALL';
AND: 'AND';
OR: 'OR';
NOT: 'NOT';
ADD: 'ADD';
ALTER: 'ALTER';
ASC: 'ASC';
DESC: 'DESC';
CREATE: 'CREATE';
SCHEMA: 'SCHEMA';
DATABASE: 'DATABASE';
TABLE: 'TABLE';
VIEW: 'VIEW';
COLUMN: 'COLUMN';
DROP: 'DROP';
SET: 'SET';
BY: 'BY';
PRIMARY: 'PRIMARY';
KEY: 'KEY';
UNIQUE: 'UNIQUE';
RENAME: 'RENAME';
TO: 'TO';
AS: 'AS';
DEL: 'DEL';
DELETE: 'DELETE';
SEL:'SEL';
INSERT: 'INSERT';
INTO: 'INTO';
VALUES: 'VALUES';
UPDATE: 'UPDATE';
JOIN: 'JOIN';
NATURAL: 'NATURAL';
CROSS: 'CROSS';
INNER: 'INNER';
FULL: 'FULL';
RIGHT: 'RIGHT';
LEFT: 'LEFT';
OUTER: 'OUTER';
COUNT: 'COUNT';
SUM: 'SUM';
MAX: 'MAX';
MIN: 'MIN';
AVG: 'AVG';

// data types
BYTEINT: 'BYTEINT';
SMALLINT: 'SMALLINT';
INTEGER: 'INTEGER';
BIGINT: 'BIGINT';
DECIMAL: 'DECIMAL';
NUMERIC: 'NUMERIC';
FLOAT: 'FLOAT';
CHAR: 'CHAR';
VARCHAR: 'VARCHAR';
DATE: 'DATE';
TIME: 'TIME';
TIMESTAMP: 'TIMESTAMP';

// special characters
LEFT_BRACKET: '(';
RIGHT_BRACKET: ')';
EQUALITY: '=';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';
NE: '!=';
NEQL: '<>';
QUOT_MARKS: '"';
APOSTROF: '\'';
SEMICOLON: ';';
COMMA: ',';
DOT: '.';
ASTERISK: '*';

// regular expressions
NAME: [a-zA-Z_$] [a-zA-Z_$0-9]* ;
INT: ('1'..'9')('0'..'9')* ;
WS: (' ' | '\t' | '\n' |'\r')+ ; //{ $channel = HIDDEN; } ;

//TODO: indices
//TODO: INSERT INTO DATETAB VALUES (DATE '2001-12-20');
//TODO: dates
//TODO: special chars in strings
//TODO: advanced where conditions with brackets