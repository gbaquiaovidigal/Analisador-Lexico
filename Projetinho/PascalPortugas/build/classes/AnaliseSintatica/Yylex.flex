package AnaliseSintatica;

import java_cup.runtime.Symbol;
import AnaliseSintatica.sym;
//import static lexico.Tokens.*;
%%
%class Yylex
%public
%unicode
%cup 
//%full
%column
%line
//%char
//%ignorecase
%eofval{
    return new Symbol(sym.EOF, new String("Fim do Arquivo"));
%eofval}
//%class Lexer
//%type Token
WHITE = [ \n|\t|\r|\f]
/*%{
public String lexeme;
/*public int ContaToken;*/
%}*/

letras = [a-z]
numeros = [0-9]

%%

{WHITE} {/*Ignore*/}

/* Palavras reservadas*/

("INICIO_PROGRAMA") {return new Symbol (sym.algoritmo, yychar, yyline, yytext());}
("INICIO")  {return new Symbol (sym.inicio, yychar, yyline, yytext());}
("FIM")  {return new Symbol (sym.fim, yychar, yyline, yytext());}
("VARIAVEL")  {return new Symbol (sym.declaravari, yychar, yyline, yytext());}
({letras}*)  {return new Symbol (sym.var, yychar, yyline, yytext());}
({numeros}*)  {return new Symbol (sym.valor, yychar, yyline, yytext());}
(":=")  {return new Symbol (sym.atribui, yychar, yyline, yytext());}
("ENTRADA")  {return new Symbol (sym.entrada, yychar, yyline, yytext());}
("(")  {return new Symbol (sym.abrepar, yychar, yyline, yytext());}
(")")  {return new Symbol (sym.fechapar, yychar, yyline, yytext());}
("=")  {return new Symbol (sym.igual, yychar, yyline, yytext());}
("+")  {return new Symbol (sym.operaciona, yychar, yyline, yytext());}
("-") {return new Symbol (sym.operaciona, yychar, yyline, yytext());}
("*") {return new Symbol (sym.operaciona, yychar, yyline, yytext());}
("/") {return new Symbol (sym.operaciona, yychar, yyline, yytext());}
("^") {return new Symbol (sym.operaciona, yychar, yyline, yytext());}
("<") {return new Symbol (sym.relaciona, yychar, yyline, yytext());}
(">") {return new Symbol (sym.relaciona, yychar, yyline, yytext());}
("==") {return new Symbol (sym.relaciona, yychar, yyline, yytext());}
("!") {return new Symbol (sym.relaciona, yychar, yyline, yytext());}
(">=") {return new Symbol (sym.relaciona, yychar, yyline, yytext());}
("<=") {return new Symbol (sym.relaciona, yychar, yyline, yytext());}
("\n") {return new Symbol (sym.quebradelinha, yychar, yyline, yytext());}
(";") {return new Symbol (sym.fimdelinha, yychar, yyline, yytext());}
(".") {return new Symbol (sym.pontofinal, yychar, yyline, yytext());}
("SE") {return new Symbol (sym.se, yychar, yyline, yytext());}
("ENTAO") {return new Symbol (sym.entao, yychar, yyline, yytext());}
("ENQUANTO") {return new Symbol (sym.enquanto, yychar, yyline, yytext());}
("FACA") {return new Symbol (sym.faca, yychar, yyline, yytext());}
("SENAO") {return new Symbol (sym.senao, yychar, yyline, yytext());}
("ATE") {return new Symbol (sym.ate, yychar, yyline, yytext());}
("SAIDA") {return new Symbol (sym.saida, yychar, yyline, yytext());}
("REPITA") {return new Symbol (sym.repita, yychar, yyline, yytext());}
("INTEIRO") {return new Symbol (sym.p_int, yychar, yyline, yytext());}
("LITERAL") {return new Symbol (sym.p_str, yychar, yyline, yytext());}
("REAL") {return new Symbol (sym.p_real, yychar, yyline, yytext());}
(",") {return new Symbol (sym.virgula, yychar, yyline, yytext());}
(":") {return new Symbol (sym.doispontos, yychar, yyline, yytext());}

. {System.err.println("Caractere Ilegal: " +yytext());}


