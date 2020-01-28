/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnaliseLexica;


import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.net.URL;
import javax.swing.ImageIcon;

import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Interface extends javax.swing.JFrame {
    int var = 0;  /**
     * Creates new form Inteface
     */



    public javax.swing.JTextArea jText;
    File file;
    int num_linha=1; 
      public void executar()throws Exception{
        
      
       
       
       jText = jTextArea1;
       String expr;
       expr = (String)jText.getText();
        
       AnaliseLexica.Lexer lexer = new AnaliseLexica.Lexer(new StringReader(expr));
       
       String resultado="";
       
       
       
       while(true){
           Token token = lexer.yylex(); 
      
                   
           if(token == null){
              
                jTextArea2.setText(resultado);
                return;
           }      
           System.out.println(token.toString());
           if (token.toString().equals("quebradelinha")){
               num_linha++;
           }else{
           
               switch(token){
                   
                 case algoritmo:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case inicio:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case fim:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case var:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
                 case declaravari:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case atribui:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
                case entrada:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
                case abrepar:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case fechapar:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                 case igual:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case relaciona:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case operaciona:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
                 case valor:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
                 case quebradelinha:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
                case fimdelinha:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case pontofinal:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
                case se:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
                case entao:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case para:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case enquanto:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case faca:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case senao:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
                case ate:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
                case caso:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case saida:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                     
                case repita:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                
               case p_int:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case p_str:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case p_real:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case p_bool:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case p_delesq:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case p_delest:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case virgula:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                    
                case doispontos:
                    resultado = resultado + "Linha " + num_linha + ": " + "Token: "+token+ " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                     
                case erro:
                    resultado = resultado + "Linha " + num_linha + ": " + "Erro!! " + "'" +lexer.lexeme + "'"+ " não faz parte da linguagem.\n"  ;
                    var = 1;
                    break;
               
                                          
           
           }
               
           }
      
       
        }
    }
    

    /**
     * Creates new form Interface
     */
    public Interface() {
        
        
        
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
         
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botao = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PascalBR- Widi Gabriel Huds");

        jPanel1.setBackground(new java.awt.Color(54, 158, 73));
        jPanel1.setForeground(new java.awt.Color(54, 158, 73));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(242, 226, 2));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new NumeredBorder());
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(242, 226, 2));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 42, 86));
        jLabel1.setText("Código Fonte");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 42, 86));
        jLabel2.setText("Análise Léxica");
        jLabel2.setToolTipText("");

        botao.setBackground(new java.awt.Color(38, 42, 86));
        botao.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        botao.setForeground(new java.awt.Color(242, 226, 2));
        botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/icons8-pesquisar-48.png"))); // NOI18N
        botao.setText("Analisar");
        botao.setToolTipText("");
        botao.setAlignmentY(0.0F);
        botao.setBorder(null);
        botao.setBorderPainted(false);
        botao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(38, 42, 86));
        jButton3.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(242, 226, 2));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/icons8-brocha-de-pintura-48.png"))); // NOI18N
        jButton3.setText("Limpar");
        jButton3.setToolTipText("");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(botao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenu4.setText("Arquivo");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/icons8-visualizar-arquivo-24.png"))); // NOI18N
        jMenuItem2.setText("Abrir arquivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/icons8-salvar-24.png"))); // NOI18N
        jMenuItem8.setText("Salvar arquivo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/icons8-informações-24.png"))); // NOI18N
        jMenuItem6.setText("Sobre");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/icons8-sair-24.png"))); // NOI18N
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Tabela de Tokens");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/icons8-tabela-24.png"))); // NOI18N
        jMenuItem7.setText("Visualizar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("PascalBR - Widi Gabriel Huds");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoActionPerformed
                                                
        // TODO add your handling code here:
        try{
           // System.out.println("passou");
            executar();
            var = 0;
            num_linha=1;
            if(file != null){
                
                PrintStream ps = new PrintStream(file.getAbsolutePath());
                ps.println(jText.getText()); 
                ps.close();
            } 
            
        }catch(Exception e){
        
        }
       
    }//GEN-LAST:event_botaoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea2.setText("");
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // FUNÇÃO DE ABRIR SCRIPT 
        JFileChooser fileChooser = new JFileChooser();
          int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            try {
              // What to do with the file, e.g. display it in a TextArea
              jTextArea1.read( new FileReader( file.getAbsolutePath() ), null ); 

            } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "Problema ao acessar o arquivo: "+file.getAbsolutePath(), "Erro", JOptionPane.ERROR_MESSAGE); 
              //System.out.println("problem accessing file"+file.getAbsolutePath());
            }
        } else {
            //System.out.println("File access cancelled by user.");
        } 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
          JPanel panel = new JPanel();  
        panel.setLayout(null);  
        Object source;  
        source = evt.getSource();  
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        sobre s = new sobre();
 s.setVisible(true);// TODO add your handling code here:
    
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
         Tabela s = new Tabela();
            s.setVisible(true);  
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
                JFileChooser file = new JFileChooser();
        file.setFileFilter(new javax.swing.filechooser.FileFilter() {
                public boolean accept(File f) {
                    return (f.getName().endsWith(".pasc")) || f.isDirectory();
                }

                public String getDescription() {
                    return "*.pasc";
                }
            });
        file.showSaveDialog(this);
        File f = new File(file.getSelectedFile() + ".txt");     
        
        try {
            FileWriter fw = new FileWriter(f);
            String texto = jTextArea1.getText();
            fw.write(texto);
            fw.close();
            
            JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!","Salvar", WIDTH);
        } catch (Exception e) {
            
        }
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    /**
     * @param args the command line arguments
     *  private javax.swing.JFileChooser
     */
   
 
      public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
   
      
       private javax.swing.JFileChooser fileChooser;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
