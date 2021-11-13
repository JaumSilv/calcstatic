/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pief;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vitor
 */
public class JFmain extends javax.swing.JFrame {

    /**
     * Creates new form JFmain
     */
    public JFmain() {
        initComponents();
        jTPmain.setEnabledAt(1, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPmain = new javax.swing.JTabbedPane();
        jPanelDados = new javax.swing.JPanel();
        jLarquivo = new javax.swing.JLabel();
        jTFnomeArquivo = new javax.swing.JTextField();
        jBprocurar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jBcarregar = new javax.swing.JButton();
        jBcriarCalculos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLarquivo1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLamostras = new javax.swing.JLabel();
        jPanelAnalise = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTPmain.setBackground(new java.awt.Color(0, 102, 102));
        jTPmain.setFocusable(false);
        jTPmain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTPmain.setMinimumSize(new java.awt.Dimension(76, 50));

        jPanelDados.setBackground(new java.awt.Color(0, 102, 102));

        jLarquivo.setBackground(new java.awt.Color(255, 255, 255));
        jLarquivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLarquivo.setForeground(new java.awt.Color(255, 255, 255));
        jLarquivo.setText("Arquivo CSV:");

        jTFnomeArquivo.setEditable(false);

        jBprocurar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBprocurar.setText("Procurar");
        jBprocurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprocurarActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jComboBox1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Parametro de Calculo(Coluna):");

        jBcarregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBcarregar.setText("Carregar");
        jBcarregar.setEnabled(false);
        jBcarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcarregarActionPerformed(evt);
            }
        });

        jBcriarCalculos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBcriarCalculos.setText("Criar Calculos");
        jBcriarCalculos.setEnabled(false);
        jBcriarCalculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcriarCalculosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLarquivo1.setBackground(new java.awt.Color(255, 255, 255));
        jLarquivo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLarquivo1.setForeground(new java.awt.Color(255, 255, 255));
        jLarquivo1.setText("Delimitador");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(";");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero de Amostras: ");

        jLamostras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLamostras.setForeground(new java.awt.Color(255, 255, 255));
        jLamostras.setText("0");

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBcriarCalculos))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLarquivo1)
                                    .addComponent(jLarquivo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jTFnomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jBprocurar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBcarregar))
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLamostras)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLarquivo)
                    .addComponent(jTFnomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBprocurar)
                    .addComponent(jBcarregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLarquivo1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLamostras, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jBcriarCalculos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPmain.addTab("Dados", jPanelDados);

        jPanelAnalise.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanelAnaliseLayout = new javax.swing.GroupLayout(jPanelAnalise);
        jPanelAnalise.setLayout(jPanelAnaliseLayout);
        jPanelAnaliseLayout.setHorizontalGroup(
            jPanelAnaliseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1195, Short.MAX_VALUE)
        );
        jPanelAnaliseLayout.setVerticalGroup(
            jPanelAnaliseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );

        jTPmain.addTab("Calculos", jPanelAnalise);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTPmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTPmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcriarCalculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcriarCalculosActionPerformed
        jTPmain.setSelectedIndex(1);
    }//GEN-LAST:event_jBcriarCalculosActionPerformed

    private void jBcarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcarregarActionPerformed
        FileReader reader = null;
        tabela = ((DefaultTableModel) jTable1.getModel());
        boolean first = true;
        int cT = 0;
        String token  = "";
        String delim = jTextField1.getText();
        int amost = 0;

        try {

            if (jTextField1.getText().length() != 1) {
                throw new Exception("Digite um delimitador válido!");
            }

            reader = new FileReader(arquivo);
            BufferedReader bf = new BufferedReader(reader);
            String linha = bf.readLine();

            while (linha != null) {

                StringTokenizer st = new StringTokenizer(linha, delim);

                if (first) {
                    while (st.hasMoreTokens()) {
                        token = st.nextToken();
                        tabela.addColumn(token);
                        jComboBox1.addItem(token);
                    }
                    first = false;
                }else{
                    String[] row = new String[st.countTokens()];
                    amost++;
                    while(st.hasMoreTokens()){
                        row[cT] = st.nextToken();
                        cT++;
                    }
                    tabela.addRow(row);
                    cT=0;
                }
                
                jComboBox1.setEnabled(true);
                linha = bf.readLine();
                jLamostras.setText(String.valueOf(amost));
                jLamostras.setForeground(Color.red);
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        jBcriarCalculos.setEnabled(true);
    }//GEN-LAST:event_jBcarregarActionPerformed

    File arquivo = null;
    DefaultTableModel tabela = null;
    private void jBprocurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprocurarActionPerformed

        JFileChooser fc = new JFileChooser("c:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV files", "csv");
        fc.setFileFilter(filter);

        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            arquivo = fc.getSelectedFile();
            jTFnomeArquivo.setText(arquivo.getAbsolutePath());
            jBcarregar.setEnabled(true);
        } else {
            jTFnomeArquivo.setText("");
            jBcarregar.setEnabled(false);
        }
    }//GEN-LAST:event_jBprocurarActionPerformed

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
            java.util.logging.Logger.getLogger(JFmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcarregar;
    private javax.swing.JButton jBcriarCalculos;
    private javax.swing.JButton jBprocurar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLamostras;
    private javax.swing.JLabel jLarquivo;
    private javax.swing.JLabel jLarquivo1;
    private javax.swing.JPanel jPanelAnalise;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFnomeArquivo;
    private javax.swing.JTabbedPane jTPmain;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
