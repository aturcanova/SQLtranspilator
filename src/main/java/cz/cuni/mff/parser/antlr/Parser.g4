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
    where_statement WS group_by_statment WS order_by_statement |
    ;

select_parameters:
    select_params |
    select_distinct_all WS select_params
    ;

select_distinct_all:
    DISTINCT |
    ALL |
    ;

select_params:
    column |
    column WS COMMA WS select_params
    ;

column:
    column_name |
    table_name DOT column_name
    ;

column_name: name ;

from_statement: FROM WS tables ;

where_statement: WHERE WS conditions ;

conditions: //TODO: where conditions
    TOKEN
    ;

logical_ops: //TODO
    AND |
    OR
    ;

group_by_statment: GROUP WS BY WS columns WS having_statement |
    GROUP WS BY WS columns
    ;

having_statement: HAVING WS conditions;

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

add_statement: ADD WS column_definition ; //TODO: check column definition 'column_name WS datatype'

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

column_definition: column_name WS column_type ;

column_type: TOKEN ; //TODO

name: NAME ;

value: TOKEN ; //TODO int float varchar or w/e

//TODO: aggregations
//TODO: db name
//TODO: indices

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

LEFT_BRACKET: '(';
RIGHT_BRACKET: ')';
EQUALITY: '=';

SEMICOLON: ';';
COMMA: ',';
DOT: '.';
WS: (' ' | '\t' | '\n' )+ ; //{ $channel = HIDDEN; } ;

TOKEN: ('a'..'z'|'A'..'Z')+;
NAME: ('a'..'z'|'A'..'Z'| '_' | '$')('a'..'z'|'A'..'Z'| '0'..'9' | '_' | '$')*;

ANY: .;
