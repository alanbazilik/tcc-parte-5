/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import CTR.ruaCTR;
import Model.RuaModel;
import Sistemas_login.utilitarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alanbazilio
 */
public class rua extends javax.swing.JFrame {

    /**
     * Creates new form cidade
     */
     ResultSet rsfunc;
   marca objmar;
       public static int id_rua;
    String opcao;
     public static boolean button;
     int a = 1;
    RuaModel objestado = new RuaModel();
    public rua() {
        
        initComponents();
         pesquisarrua();       
         desativarBotoes();
         utilitarios u = new utilitarios();
    u.inserirIcone(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ruas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cradastrar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRua = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(510, 269));
        setMinimumSize(new java.awt.Dimension(510, 269));
        setPreferredSize(new java.awt.Dimension(510, 269));
        setSize(new java.awt.Dimension(510, 269));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE RUAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 813, 59);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rua:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 100, 25);

        ruas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruasActionPerformed(evt);
            }
        });
        getContentPane().add(ruas);
        ruas.setBounds(10, 100, 200, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "ações"));

        cradastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addition.png"))); // NOI18N
        cradastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cradastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cradastrarActionPerformed(evt);
            }
        });

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        salvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar (1).png"))); // NOI18N
        alterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar (1).png"))); // NOI18N
        Excluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alterar)
                    .addComponent(cradastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cradastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 140, 170, 120);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thumb2-program-code-black-backgrounds-programming-background-with-program-code-code.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 60, 230, 240);

        jtRua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtRua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtRuaMouseClicked(evt);
            }
        });
        jtRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtRuaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtRua);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 60, 280, 210);

        setSize(new java.awt.Dimension(526, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ruasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruasActionPerformed

    private void cradastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cradastrarActionPerformed
        ativarBotoes();
        limparCampos();
         opcao = "Inserir";
        button = true;
    }//GEN-LAST:event_cradastrarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if(opcao.equals("Inserir")){
          Inserirrua();
           pesquisarrua();
          limparCampos();
        }
     desativarBotoes();
    }//GEN-LAST:event_salvarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
    pesquisarrua();
    }//GEN-LAST:event_buscarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
           Alterarua();
            pesquisarrua();
         limparCampos();
    }//GEN-LAST:event_alterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        // TODO add your handling code here:
        String [] options = new String[] {"Sim","Não"};
        
        Object ret = JOptionPane.showOptionDialog
    (null, "Tem certeza que deseja excluir: " 
            + ruas.getText() + "?","AVISO", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if(options[Integer.valueOf(ret.toString())].equals("Sim"))
        {
            Excluirua();
            limparCampos();
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void jtRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRuaKeyPressed
        // TODO add your handling code here:
        int linha = jtRua.getSelectedRow();
            
           
            this.ruas.setText((String) jtRua.getValueAt(linha, 1));
            id_rua = (int) jtRua.getValueAt(linha, 0);
            opcao="Alterar";
            ativarBotoes();
    }//GEN-LAST:event_jtRuaKeyPressed

    private void jtRuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRuaMouseClicked
        // TODO add your handling code here:
         if(evt.getClickCount() == 2)
        {
            int linha = jtRua.getSelectedRow();
            
       
            this.ruas.setText((String) jtRua.getValueAt(linha, 0));
           
            
            rua.button = 
           (boolean) jtRua.getValueAt(linha, 0);
                    
            this.dispose();
        }
    }//GEN-LAST:event_jtRuaMouseClicked

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
            java.util.logging.Logger.getLogger(rua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rua().setVisible(true);
            }
        });
    }
  public void desativarBotoes()
    {
        salvar.setEnabled(false);
        ruas.setEnabled(false);
    }
    
    public void ativarBotoes()
    {
        salvar.setEnabled(true);
        ruas.setEnabled(true);
    }
    
 public void Inserirrua()
    {
        ruaCTR objfunc = new ruaCTR();
        
        objfunc.InsereruaCTR(ruas.getText());
    }
  public void limparCampos()
    {
    ruas.setText("");
    }
  
  public void pesquisarrua()
    {
        ruaCTR objmarca = new ruaCTR();
        
        rsfunc = objmarca.PesquisarruaCTR(ruas.getText());
        
        preenche_item();
        
    }
  public void Alterarua()
    {
        int linha = jtRua.getSelectedRow();
        
        ruaCTR objcli = new ruaCTR();
        
        objcli.AlteraruaCTR(ruas.getText(),id_rua);
       
        
    }      
  
  public void preenche_item()
    {
     String [] colunas = {"Codigo","Nome"};
        
        String [][] linhas ={};
        
        DefaultTableModel tablemodel = new DefaultTableModel(linhas,colunas)
        {
            public boolean CelulaEditavel(int rowIndex, int mColIndex)
            {
                return true;
            }
        };
        
        Vector <Vector> dados = new Vector();
        
        try {
            while(rsfunc.next())
            {
                Vector regVetor = new Vector();
                
                regVetor.add(rsfunc.getInt("codrua"));
                regVetor.add(rsfunc.getString("nomerua"));
                dados.add(regVetor);
                tablemodel.addRow(regVetor);
            }
            jtRua.setModel(tablemodel);
            
        } catch (SQLException ex) {
            Logger.getLogger(rua.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }
      public void Excluirua()
    {
        int linha = jtRua.getSelectedRow();
        
        ruaCTR objcli = new ruaCTR();
        
        objcli.ExcluiruaCTR(id_rua);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Excluir;
    private javax.swing.JButton alterar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cradastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtRua;
    private javax.swing.JTextField ruas;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
