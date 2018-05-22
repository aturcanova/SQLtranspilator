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
    SELECT WS select_parameters WS from_statement |
    SELECT WS par=select_parameters WS from_statement WS select_stmnt { System.out.println("Here is select statement!"); }
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

tables: table ; //TODO: more tables

table: TOKEN;

columns:
    column_name WS COMMA columns |
    column_name
    ;

insert_into_statement: ;
update_statement: ;
delete_statement: ;
create_statement: ;

alter_statement: ALTER WS alter_stmnt;

alter_stmnt: alter_table ; //TODO: TYPE

alter_table: TABLE WS table WS alter_tab ;

alter_tab:
    rename_statement |
    add_statement
    ;

rename_statement: RENAME WS column_name WS TO WS column_name ;

add_statement: ADD WS column_definition ; //TODO: check column deinition 'column_name WS datatype'

drop_statement: DROP WS drop_stmnt ;

drop_stmnt:
    TABLE WS table |
    VIEW WS table | //TODO
    COLUMN WS column_name //TODO: indices
    ;

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

LEFT_BRACKET: '(';
RIGHT_BRACKET: ')';

SEMICOLON: ';';
COMMA: ',';
WS: (' ' | '\t' | '\n' )+ ; //{ $channel = HIDDEN; } ;

TOKEN: ('a'..'z'|'A'..'Z')+;

ANY: .;
