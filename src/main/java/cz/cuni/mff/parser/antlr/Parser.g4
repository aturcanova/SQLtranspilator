grammar Parser;
//main: 'Hello ' name '!';
//name: ANY+;
//ANY: .;

main: statement_keyword;

statement_keyword: 'SELECT ' par=select_params ' FROM ' table ' ;' { System.out.println("Here is select statement!"); } ;

select_params: ANY+ # params ;

table: ANY+;

ANY: .;


