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
import java.awt.Dimension;
import java.awt.Toolkit;
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
public class tela_telefone extends javax.swing.JDialog {

    /**
     * Creates new form tela_telefone
     */
    public static int id_tel;
    public static int fkcod_tel;
    ResultSet rsfunc;
    String opcao;
    List<TelefoneTipomodel> listtipotelefone;
    public static boolean button;
    boolean tipotel;
    public tela_telefone(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        tipotel = false;
        initComponents();
            Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        
        this.setBounds(0, 0, d.width = 800, d.height  = 600);
            setResizable(false);
        setFocusable(true);
         setLocationRelativeTo(null);
        pesquisartel();
        carregatelefonecmb();
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
        jcomboxtel = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtalbetel = new javax.swing.JTable();
        buscar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        cradastrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE TELEFONE");

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
                .addGap(136, 136, 136)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(tela_princial)
                .addGap(18, 18, 18)
                .addComponent(jToolBar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tela_princial, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 813, 59);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel3.setText("Tipo de telefone:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 100, 90, 14);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setText("Numero telefone:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 70, 160, 14);

        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });
        getContentPane().add(telefone);
        telefone.setBounds(100, 60, 120, 22);

        jcomboxtel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboxtelItemStateChanged(evt);
            }
        });
        getContentPane().add(jcomboxtel);
        jcomboxtel.setBounds(100, 100, 120, 22);

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
        jScrollPane1.setBounds(220, 60, 580, 540);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        buscar.setText("Atualizar dados");
        getContentPane().add(buscar);
        buscar.setBounds(0, 510, 150, 40);

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(0, 390, 150, 40);

        cradastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addition.png"))); // NOI18N
        cradastrar.setText("Novo");
        cradastrar.setToolTipText("");
        cradastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cradastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cradastrar);
        cradastrar.setBounds(0, 350, 150, 40);

        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar (1).png"))); // NOI18N
        excluir.setText("excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        getContentPane().add(excluir);
        excluir.setBounds(0, 470, 150, 40);

        Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar (1).png"))); // NOI18N
        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });
        getContentPane().add(Alterar);
        Alterar.setBounds(0, 430, 150, 40);

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 80, 23, 20);

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tela_princialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tela_princialMouseClicked
        // TODO add your handling code here:
        Tela_principal objtel = new Tela_principal(null,true);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tipotel = true; 
        tela_tipotelefone objtel = new tela_tipotelefone(null,true);
        objtel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
         if(tipotel==true){
            carregatelefonecmb();
            tipotel = false;
        }
    }//GEN-LAST:event_formWindowActivated

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
                tela_telefone dialog = new tela_telefone(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
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
     String [] colunas = {"Codigo","Numero","Tipo_Telefone"};
        
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
                regVetor.add(rsfunc.getString("nometipotel"));
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
