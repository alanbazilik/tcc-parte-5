/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import CTR.TelefoneCTR;
import CTR.TelefoneTipoCTR;
import Model.TelefoneTipomodel;
import Model.telefoneModel;
import Sistemas_login.utilitarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alanbazilio
 */
public class tela_telefone extends javax.swing.JFrame {

    /**
     * Creates new form tela_telefone
     */
    public static int id_tel;
    public static int fkcod_tel;
    ResultSet rsfunc;
    String opcao;
    List<TelefoneTipomodel> listtipotelefone;
    public static boolean button;
    public tela_telefone() {
        initComponents();
        carregatelefonecmb();
        pesquisartel();
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
        jToolBar8 = new javax.swing.JToolBar();
        tela_princial = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jcomboxtel = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtalbetel = new javax.swing.JTable();
        buscar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        cradastrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(651, 325));
        setMinimumSize(new java.awt.Dimension(651, 325));
        setPreferredSize(new java.awt.Dimension(651, 325));
        setSize(new java.awt.Dimension(651, 325));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("cradastro telefone");

        jToolBar8.setRollover(true);
        jToolBar8.setBorderPainted(false);

        tela_princial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-reserva-64.png"))); // NOI18N
        tela_princial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tela_princial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tela_princialMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277)
                .addComponent(tela_princial)
                .addGap(156, 156, 156)
                .addComponent(jToolBar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jToolBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tela_princial, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 826, 59);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de telefone:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 150, 220, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero telefone:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 110, 160, 25);

        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });
        getContentPane().add(telefone);
        telefone.setBounds(180, 110, 160, 20);

        jcomboxtel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcomboxtel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboxtelItemStateChanged(evt);
            }
        });
        getContentPane().add(jcomboxtel);
        jcomboxtel.setBounds(230, 150, 120, 20);

        jtalbetel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtalbetel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtalbetelMouseClicked(evt);
            }
        });
        jtalbetel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtalbetelKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtalbetel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 60, 290, 240);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        getContentPane().add(buscar);
        buscar.setBounds(130, 180, 40, 40);

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(80, 180, 40, 40);

        cradastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addition.png"))); // NOI18N
        cradastrar.setToolTipText("");
        cradastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cradastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cradastrar);
        cradastrar.setBounds(30, 180, 40, 40);

        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar (1).png"))); // NOI18N
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        getContentPane().add(excluir);
        excluir.setBounds(30, 230, 40, 40);

        Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar (1).png"))); // NOI18N
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });
        getContentPane().add(Alterar);
        Alterar.setBounds(80, 230, 40, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thumb2-program-code-black-backgrounds-programming-background-with-program-code-code.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(2, 58, 360, 240);

        setSize(new java.awt.Dimension(667, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tela_princialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tela_princialMouseClicked
        // TODO add your handling code here:
        Tela_principal objtel = new Tela_principal();
        objtel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tela_princialMouseClicked

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void jcomboxtelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboxtelItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboxtelItemStateChanged

    private void cradastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cradastrarActionPerformed
          ativarBotoes();
        limparCampos();
        opcao = "Inserir";
        button = true;
    }//GEN-LAST:event_cradastrarActionPerformed

    private void jtalbetelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtalbetelKeyPressed
             int linha = jtalbetel.getSelectedRow();
            
           
            this.telefone.setText((String) jtalbetel.getValueAt(linha, 1));
            id_tel = (int) jtalbetel.getValueAt(linha, 0);
   
            opcao="Alterar";
            ativarBotoes();
    }//GEN-LAST:event_jtalbetelKeyPressed

    private void jtalbetelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtalbetelMouseClicked
      if(evt.getClickCount() == 2)
        {
            int linha = jtalbetel.getSelectedRow();
            
       
            this.telefone.setText((String) jtalbetel.getValueAt(linha, 0));
          
            
            tela_tipotelefone.button = 
           (boolean) jtalbetel.getValueAt(linha, 0);
                    
            this.dispose();
        }
    }//GEN-LAST:event_jtalbetelMouseClicked

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        InserirCliente();
          pesquisartel();
    }//GEN-LAST:event_salvarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        String [] options = new String[] {"Sim","Não"};

        Object ret = JOptionPane.showOptionDialog
        (null, "Tem certeza que deseja excluir: "
            + telefone.getText() + "?","AVISO", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if(options[Integer.valueOf(ret.toString())].equals("Sim"))
        {
            excluirtelefone();
            limparCampos();
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        // TODO add your handling code here:]
        alterarTelefone();
        pesquisartel();
    }//GEN-LAST:event_AlterarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_telefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_telefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_telefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_telefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_telefone().setVisible(true);
            }
        });
    }
public void carregatelefonecmb()
    {
        TelefoneTipoCTR objtel = new TelefoneTipoCTR();
        listtipotelefone = objtel.carregaCombo();
        
        jcomboxtel.removeAllItems();
        int i = 0;
        
        while(i < listtipotelefone.size())
        {
            jcomboxtel.addItem(listtipotelefone.get(i).getNometipotel());
            i++;
        }
       
    }
    
    public void preenche_item()
    {
     String [] colunas = {"Codigo","Numero","TipoTelefone"};
        
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
                
                regVetor.add(rsfunc.getInt("codtelefone"));
                regVetor.add(rsfunc.getString("numerotel"));
                regVetor.add(rsfunc.getInt("fk_codtipotel"));
                dados.add(regVetor);
                tablemodel.addRow(regVetor);
            }
            jtalbetel.setModel(tablemodel);
            
        } catch (SQLException ex) {
            Logger.getLogger(Bairros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desativarBotoes()
    {
        salvar.setEnabled(false);
        telefone.setEnabled(false);
    }
    
    public void ativarBotoes()
    {
        salvar.setEnabled(true);
        telefone.setEnabled(true);
    }
      public void limparCampos()
    {
    telefone.setText("");
    }
    public void InserirCliente()
    {
        TelefoneCTR objcli = new  TelefoneCTR();
        
        objcli.InseretelefoneCTR(
                telefone.getText(), 
            listtipotelefone.get(jcomboxtel.getSelectedIndex()).getCodtipotel());
    }
     public void alterarTelefone()
    {
        int linha = jtalbetel.getSelectedRow();
        TelefoneCTR objcli = new  TelefoneCTR();
        objcli.AlteratelCTR(
                telefone.getText(), 
            listtipotelefone.get(jcomboxtel.getSelectedIndex()).getCodtipotel(),id_tel);
    }  
      public void excluirtelefone()
    {
        int linha = jtalbetel.getSelectedRow();
        
        TelefoneCTR objcli = new TelefoneCTR();
        
        objcli.ExcluitelCTR(id_tel);
    }  
      public void pesquisartel()
    {
         TelefoneCTR objfunc = new TelefoneCTR();
        rsfunc = objfunc.PesquisartelCTR(telefone.getText());
        
        preenche_item();
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cradastrar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar8;
    private javax.swing.JComboBox<String> jcomboxtel;
    private javax.swing.JTable jtalbetel;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel tela_princial;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
