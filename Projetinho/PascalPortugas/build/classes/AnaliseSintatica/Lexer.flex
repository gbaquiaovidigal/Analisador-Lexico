package AnaliseSintatica;

import static AnaliseSintatica.Token.*;

%%
%class Lexer
%type Token

numeros = [0-9]
letras = [a-z]
%{
public String lexeme;
%}
WHITE=[ \n\t\r]

%%

{WHITE} {/*Ignore*/}

/* Palavras reservadas*/
("INICIO_PROGRAMA") {lexeme = yytext(); return algoritmo;}
("INICIO") {lexeme = yytext(); return inicio;}
("FIM") {lexeme = yytext(); return fim;}
("VARIAVEL") {lexeme = yytext(); return declaravari;} 
({letras}*) {lexeme = yytext(); return var;}
({numeros}*) {lexeme = yytext(); return valor;}
(":=") {lexeme = yytext(); return atribui;}
("ENTRADA") {lexeme = yytext(); return entrada;}
("(") {lexeme = yytext(); return abrepar;}
(")") {lexeme = yytext(); return fechapar;}
("=") {lexeme = yytext(); return igual;}
("+") {lexeme = yytext(); return operaciona;}
("-") {lexeme = yytext(); return operaciona;}
("*") {lexeme = yytext(); return operaciona;}
("/") {lexeme = yytext(); return operaciona;}
("^") {lexeme = yytext(); return operaciona;}
("<") {lexeme = yytext(); return relaciona;}
(">") {lexeme = yytext(); return relaciona;}
("==") {lexeme = yytext(); return relaciona;}
("!") {lexeme = yytext(); return relaciona;}
(">=") {lexeme = yytext(); return relaciona;}
("<=") {lexeme = yytext(); return relaciona;}
(";") {lexeme = yytext(); return fimdelinha;}
(".") {lexeme = yytext(); return pontofinal;}
("SE") {lexeme = yytext(); return se;}
("ENTAO") {lexeme = yytext(); return entao;}
("ENQUANTO") {lexeme = yytext(); return enquanto;}
("FACA") {lexeme = yytext(); return faca;}
("SENAO") {lexeme = yytext(); return senao;}
("ATE") {lexeme = yytext(); return ate;}
("SAIDA") {lexeme = yytext(); return saida;}
("REPITA") {lexeme = yytext(); return repita;}
("INTEIRO") {lexeme = yytext(); return p_int;}
("LITERAL") {lexeme = yytext(); return p_str;}
(",") {lexeme = yytext(); return virgula;}
(":") {lexeme = yytext(); return doispontos;}

. {lexeme = yytext(); return erro;}