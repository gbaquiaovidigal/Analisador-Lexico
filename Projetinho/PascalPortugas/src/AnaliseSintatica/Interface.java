/**
 * @author Eduardo Novais, Ricardo Remédio
 * IF Sul de Minas
 */
package AnaliseSintatica;

import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 12141001468
 */
public class Interface extends javax.swing.JFrame {

    public JTextArea jText;
    public String rLex = "";

    public void setRetornoLexico(String retorno) {
        rLex = rLex.concat(retorno);
//        jTextArea2.setText(rLex);
    }

    public boolean executar() throws Exception {
        //Atribuindo o valor de entrada numa variavel
        jText = jTextField1;
        //Criação e atribuição das variáveis
        int cont = 1;
        String expr = (String) jText.getText();
        boolean retorno = false;

        //Chamando a classe Lexer
        Lexer lexer = new Lexer(new StringReader(expr));

        //Iniciando a variavel resultado
        String resultado = "";

        while (true) {
            //salvando na variavel token o retorno da classe lexer
            Token token = lexer.yylex();
            //Se o token for nul seta o textarea como vazio
            if (token == null) {
                RespostaLexico.setText(resultado);
                return retorno;
            }
            //laço de repetição do token
            switch (token) {
                //Encontrando qual for o retorno irá salvar na variável resultado.
                case algoritmo:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case inicio:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case fim:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case var:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case declaravari:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case atribui:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case entrada:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case abrepar:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case fechapar:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case igual:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case relaciona:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case operaciona:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case valor:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case quebradelinha:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case fimdelinha:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case pontofinal:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case se:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case entao:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case enquanto:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case faca:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case senao:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case ate:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case saida:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case repita:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case p_int:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case p_str:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case p_real:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case virgula:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;

                case doispontos:
                    resultado = resultado + "Token: " + token + " / " + " Lexema: " + lexer.lexeme + "\n";
                    break;
                default:
                    resultado = resultado + "<DESCHONHECIDO> " + lexer.lexeme + "\n";
                    retorno = true;
            }
        }
    }

    public void sintatica() {
        //Atribuindo o valor de entrada numa variavel
        jText = jTextField1;
        //Criação e atribuição das variáveis
        int cont = 1;
        String expr = (String) jText.getText();
        try {
            parser p = new parser(new AnaliseSintatica.Yylex(new StringReader(expr)), Interface.this);
            p.parse();

            parser parse = new parser();
//            jTextArea1.setText(parse.getRetorno());
//            JOptionPane.showMessageDialog(null, parse.getRetorno());
            console.setText("SUCESSO");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Analise sintatica nao realizada!" + e);
        }
    }

    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Analisar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RespostaLexico = new javax.swing.JTextArea();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SuccessPiler");
        setBackground(new java.awt.Color(255, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Analisador Léxico e Sintático");
        jLabel1.setToolTipText("");

        Analisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/successpiler/img/icons8-próximo-48.png"))); // NOI18N
        Analisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalisarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/successpiler/img/icons8-lixo-48.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        RespostaLexico.setColumns(20);
        RespostaLexico.setRows(5);
        jScrollPane1.setViewportView(RespostaLexico);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        jTextField1.setColumns(20);
        jTextField1.setRows(5);
        jScrollPane2.setViewportView(jTextField1);
        jTextField1.setBorder(new NumeredBorder());

        jTextField1.setBackground(new java.awt.Color(153, 204, 50));

        RespostaLexico.setBackground(new java.awt.Color(242, 226, 2));

        console.setBackground(new java.awt.Color(242, 226, 2));

        console.setColumns(20);
        console.setRows(5);
        jScrollPane3.setViewportView(console);

        jMenu1.setText("Arquivo");

        jMenuItem1.setLabel("Salvar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Analisar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Analisar)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Analisador Léxico/Sintático");

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(1342, 666));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        RespostaLexico.setText("");
        console.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalisarActionPerformed
        boolean retorno;
        RespostaLexico.setText("");
        console.setText("");
        try {
            retorno = executar();
            if (retorno == false) {
                this.rLex = "";
                sintatica();
                console.setText(rLex);
                if (this.rLex == "") {
                    console.setText("COMPILADO COM SUCESSO !");
                    console.setForeground(Color.GREEN);

                }
            } else {

                JOptionPane.showMessageDialog(this, "Análise Sintática não realizada por erro Léxico.");
                console.setText("Análise Sintática não realizada por erro Léxico.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AnalisarActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        //Quando um caminho for escolhido pela janela de escolha de arquivos.
        String name = jFileChooser1.getSelectedFile().getAbsolutePath();

        try {
            //A partir do caminho le o arquivo
            FileReader arq = new FileReader(name);
            //Salva na variavel lerArq todo o conteudo
            BufferedReader lerArq = new BufferedReader(arq);
            //Salva em linha a primeira linha
            String linha = lerArq.readLine();
            //Inicializa a variavel texto assim como o textfield.
            String texto = "";
            jTextField1.setText("");
            //Laço de repetição
            while (linha != null) {
                //Salva na variavel texto a linha e pula uma linha
                texto += linha + "\n";
                //Le a próxima linha
                linha = lerArq.readLine();
            }
            //seta o que foi lido no textfield e fecha o arquivo
            jTextField1.setText(texto);
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo", e.getMessage());
        }


    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
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
            String texto = RespostaLexico.getText();
            fw.write(texto);
            fw.close();

            JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!", "Salvar", WIDTH);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
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
            String texto = RespostaLexico.getText();
            fw.write(texto);
            fw.close();

            JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!", "Salvar", WIDTH);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Analisar;
    private javax.swing.JTextArea RespostaLexico;
    private javax.swing.JTextArea console;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextField1;
    // End of variables declaration//GEN-END:variables
}
