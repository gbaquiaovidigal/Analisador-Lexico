/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnaliseLexica;

import JFlex.Main;
import java.io.File;

/**
 *

 */
public class gerarlexer {
    
    public static void gerarLexer(String path){
        File file = new File(path);
        JFlex.Main.generate(file);
    }
    
    public static void main(String[] args){
        String  path = "C:\\Users\\widim\\Desktop\\7° Periodo IFSUL\\Compiladores\\Projetinho\\PascalPortugas\\src\\AnaliseLexica\\Lexer.flex";
        gerarLexer(path);
                
    }
    
}
