grammar Parser;

main: statement;

statement:
    statement_type WS SEMICOLON |
    statement_type WS SEMICOLON WS statement
    ;

statement_type:
    select_statement |
    insert_into_statement |
    update_statement |
    delete_statement |
    create_statement |
    alter_statement |
    drop_statement
    ;

select_statement:
    (SEL | SELECT) WS select_parameters WS from_statement |
    (SEL | SELECT) WS par=select_parameters WS from_statement WS select_stmnt { System.out.println("Here is select statement!"); }
    ;

select_stmnt:
    where_statement |
    where_statement WS order_by_statement |
    where_statement WS group_by_statment WS order_by_statement
    ;

select_parameters:
    ASTERISK |
    select_distinct_all WS select_params |
    select_distinct_all WS select_params WS COMMA WS select_parameters |
    select_params |
    select_params  WS COMMA WS select_parameters
    ;

select_distinct_all:
    DISTINCT |
    ALL
    ;

select_params:
    aggregation_function |
    column
    ;

column:
    column_name |
    table_name DOT column_name
    ;

column_name: name ;

from_statement: FROM WS tables ;

where_statement: WHERE WS conditions ;

conditions:
    (NOT WS)? condition |
    (NOT WS)? condition WS logical_ops WS conditions
    ;

condition:
    column equality_ops value |
    column equality_ops WS value |
    column WS equality_ops value |
    column WS equality_ops WS value |
    ;

equality_ops:
    EQUALITY |
    LT |
    LE |
    GT |
    GE |
    NE |
    NEQL
    ;

logical_ops:
    AND |
    OR
    ;

group_by_statment:
    GROUP WS BY WS columns WS having_statement |
    GROUP WS BY WS columns
    ;

having_statement: HAVING WS conditions ;

order_by_statement: ORDER WS BY WS columns_sorted ;

columns_sorted:
    column WS ASC |
    column WS DESC |
    column WS COMMA columns_sorted
    ;

tables:
    table |
    table WS join WS tables
    ;

table:
    table_name |
    LEFT_BRACKET select_statement RIGHT_BRACKET
    ;

table_name: name;

join:
    COMMA |
    JOIN |
    NATURAL WS JOIN |
    CROSS WS JOIN |
    INNER WS JOIN |
    (FULL | RIGHT | LEFT) WS OUTER WS JOIN
    ;

columns:
    column |
    column WS COMMA columns
    ;

insert_into_statement: INSERT WS INTO WS table_name WS insert_into_stmnt;

insert_into_stmnt:
    instert_values |
    select_statement |
    insert_columns WS instert_values |
    insert_columns WS select_statement
    ;

insert_columns:  LEFT_BRACKET columns RIGHT_BRACKET ;

instert_values: VALUES WS LEFT_BRACKET values RIGHT_BRACKET ;

values:
    value |
    value COMMA WS values
    ;

update_statement: UPDATE WS table_name WS SET WS update_stmnt ;

update_stmnt:
    update_columns |
    update_columns WS where_statement
    ;

update_columns:
    column_name EQUALITY value |
    column_name EQUALITY value COMMA WS update_columns
    ;

delete_statement: (DEL|DELETE) WS delete_stmnt ;

delete_stmnt:
    delete_database |
    delete_from
    ;

delete_database: DATABASE WS database_name ;

delete_from:
    FROM WS table_name |
    FROM WS table_name WS where_statement
    ;

database_name: name ;

create_statement: CREATE WS create_stmnt ;

create_stmnt:
    create_table |
    create_view
    ;

create_table: TABLE WS table_name WS LEFT_BRACKET WS columns_definition WS RIGHT_BRACKET ;

create_view:
    VIEW WS table_name WS AS WS select_statement |
    VIEW WS table_name WS create_view_columns WS AS WS select_statement
    ;

create_view_columns: columns ;

columns_definition:
    column_definition |
    column_definition COMMA WS columns_definition
    ;

alter_statement: ALTER WS alter_stmnt;

alter_stmnt: alter_table ;

alter_table: TABLE WS table_name WS alter_tab ;

alter_tab:
    rename_statement |
    rename_statement WS alter_tab |
    add_statement |
    add_statement WS alter_tab |
    drop_columns |
    drop_columns WS alter_tab
    ;

rename_statement: RENAME WS column_name WS TO WS column_name ;

add_statement: ADD WS column_definition ;

drop_columns:
    DROP WS column_name |
    DROP WS column_name WS drop_columns
    ;

drop_statement: DROP WS drop_stmnt ;

drop_stmnt:
    DATABASE database_name |
    TABLE WS table_name |
    VIEW WS view_name |
    COLUMN WS column_name
    ;

view_name: name ;

aggregation_function:
    COUNT aggregation_fnc |
    SUM aggregation_fnc |
    MAX aggregation_fnc |
    MIN aggregation_fnc |
    AVG aggregation_fnc
    ;

aggregation_fnc: LEFT_BRACKET agreggation_parameter RIGHT_BRACKET ;

agreggation_parameter:
    ASTERISK |
    column
    ;

column_definition: column_name WS column_type ;

column_type: type ;

name: NAME ;

type:
    BYTEINT |
    SMALLINT |
    INTEGER |
    BIGINT |
    DECIMAL |
    NUMERIC |
    FLOAT |
    CHAR |
    CHAR LEFT_BRACKET INT RIGHT_BRACKET |
    VARCHAR |
    VARCHAR LEFT_BRACKET INT RIGHT_BRACKET |
    DATE |
    TIME |
    TIMESTAMP
    ;

value:
    NAME |
    APOSTROF value APOSTROF
    ;

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
TOKEN: ('a'..'z'|'A'..'Z')+ ;
INT: ('1'..'9')('0'..'9')* ;

WS: (' ' | '\t' | '\n' )+ ; //{ $channel = HIDDEN; } ;
ANY: .;

//TODO: indices
//TODO: INSERT INTO DATETAB VALUES (DATE '2001-12-20');
//TODO: dates
//TODO: special chars in strings
//TODO: advanced where conditions with brackets