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
    column_name |
    column_name WS COMMA WS select_params
    ;

column_name: TOKEN ; //TODO

from_statement: FROM WS tables ; //TODO

where_statement: WHERE WS conditions ;

conditions: //TODO
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

order_by_statement: ORDER WS BY WS columns ; //TODO ASC DES

tables: table_name ; //TODO: more table_names

table_name: TOKEN;

columns:
    column_name WS COMMA columns |
    column_name
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

value: TOKEN ; //TODO int float varchar or w/e

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

database_name: TOKEN ; //TODO

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

columns_definition: //TODO: check
    column_definition |
    column_definition COMMA WS columns_definition
    ;

alter_statement: ALTER WS alter_stmnt;

alter_stmnt: alter_table ; //TODO: TYPE

alter_table: TABLE WS table_name WS alter_tab ;

alter_tab:
    rename_statement |
    add_statement
    ;

rename_statement: RENAME WS column_name WS TO WS column_name ;

add_statement: ADD WS column_definition ; //TODO: check column deinition 'column_name WS datatype'

drop_statement: DROP WS drop_stmnt ;

drop_stmnt:
    TABLE WS table_name |
    VIEW WS view_name | //TODO
    COLUMN WS column_name //TODO: indices
    ;

view_name: TOKEN; //TODO

column_definition: TOKEN ; //TODO: column definition

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


LEFT_BRACKET: '(';
RIGHT_BRACKET: ')';
EQUALITY: '=';

SEMICOLON: ';';
COMMA: ',';
WS: (' ' | '\t' | '\n' )+ ; //{ $channel = HIDDEN; } ;

TOKEN: ('a'..'z'|'A'..'Z')+;

ANY: .;
