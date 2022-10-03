/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import CTR.produto_CTR;
import Model.marca_model;
import Model.tipoModel;
import Sistemas_login.utilitarios;
import static View.tela_telefone.button;
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
public class Produto extends javax.swing.JFrame {

    /**
     * Creates new form cidade
     */
         public static int id_produto;
    public static int fkmarca;
    ResultSet rsfunc;
    String opcao;
    List<tipoModel> liatipo;
    List<marca_model> liamarca;
    public Produto() {
        initComponents();
        desativarBotoes();
        carregamarca();
        carregatipo();
        pesquisarproduto();
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
        tela_princial = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipos1 = new javax.swing.JLabel();
        tipos = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<String>();
        marca = new javax.swing.JComboBox<String>();
        deletar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        cadastrar2 = new javax.swing.JButton();
        salvar1 = new javax.swing.JButton();
        refesh = new javax.swing.JButton();
        Produto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(645, 380));
        setMinimumSize(new java.awt.Dimension(645, 380));
        setPreferredSize(new java.awt.Dimension(645, 380));
        setSize(new java.awt.Dimension(645, 380));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE PRODUTOS");

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
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121)
                .addComponent(tela_princial)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tela_princial, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(4, 4, 4))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 813, 59);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Produto:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 70, 80, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 100, 120, 25);

        tipos1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tipos1.setForeground(new java.awt.Color(255, 255, 255));
        tipos1.setText("Marca:");
        getContentPane().add(tipos1);
        tipos1.setBounds(0, 160, 70, 25);

        tipos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tipos.setForeground(new java.awt.Color(255, 255, 255));
        tipos.setText("Tipo:");
        getContentPane().add(tipos);
        tipos.setBounds(0, 130, 60, 25);
        getContentPane().add(quantidade);
        quantidade.setBounds(110, 100, 110, 20);

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(tipo);
        tipo.setBounds(70, 130, 150, 20);

        marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(marca);
        marca.setBounds(70, 160, 150, 20);

        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar (1).png"))); // NOI18N
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });
        getContentPane().add(deletar);
        deletar.setBounds(0, 290, 40, 40);

        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar (1).png"))); // NOI18N
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar);
        alterar.setBounds(40, 290, 40, 40);

        cadastrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addition.png"))); // NOI18N
        cadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar2ActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar2);
        cadastrar2.setBounds(0, 250, 40, 40);

        salvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar1ActionPerformed(evt);
            }
        });
        getContentPane().add(salvar1);
        salvar1.setBounds(40, 250, 40, 40);

        refesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        refesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refeshActionPerformed(evt);
            }
        });
        getContentPane().add(refesh);
        refesh.setBounds(170, 290, 50, 41);
        getContentPane().add(Produto);
        Produto.setBounds(80, 70, 140, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thumb2-program-code-black-backgrounds-programming-background-with-program-code-code.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 60, 220, 280);

        produtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        produtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtableMouseClicked(evt);
            }
        });
        produtable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                produtableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(produtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 60, 410, 280);

        setSize(new java.awt.Dimension(645, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tela_princialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tela_princialMouseClicked
        // TODO add your handling code here:
        Tela_principal objtel = new Tela_principal();
        objtel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tela_princialMouseClicked

    private void salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar1ActionPerformed
        // TODO add your handling code here:
       Inseriproduto();
         limparCampos();
          pesquisarproduto();
    }//GEN-LAST:event_salvar1ActionPerformed

    private void cadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar2ActionPerformed
        // TODO add your handling code here:
              ativarBotoes();
        limparCampos();
        opcao = "Inserir";
        button = true;
    }//GEN-LAST:event_cadastrar2ActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        // TODO add your handling code here:
                   String [] options = new String[] {"Sim","Não"};

        Object ret = JOptionPane.showOptionDialog
        (null, "Tem certeza que deseja excluir: "
            + Produto.getText() + "?","AVISO", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if(options[Integer.valueOf(ret.toString())].equals("Sim"))
        {
            excluirproduto();
            limparCampos();
              pesquisarproduto();
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        // TODO add your handling code here:
                alterarproduto();
         limparCampos();
        pesquisarproduto();
    }//GEN-LAST:event_alterarActionPerformed

    private void refeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refeshActionPerformed
        // TODO add your handling code here:
        pesquisarproduto();
    }//GEN-LAST:event_refeshActionPerformed

    private void produtableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtableKeyPressed
        // TODO add your handling code here:
             int linha = produtable.getSelectedRow();
            
           
               this.Produto.setText((String) produtable.getValueAt(linha, 1));
         quantidade.setText(""+produtable.getValueAt(produtable.getSelectedRow(), 2));
            id_produto= (int) produtable.getValueAt(linha, 0);
   
            opcao="Alterar";
            ativarBotoes();
    }//GEN-LAST:event_produtableKeyPressed

    private void produtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtableMouseClicked
        // TODO add your handling code here:
             if(evt.getClickCount() == 2)
        {
            int linha = produtable.getSelectedRow();
            
       
            this.Produto.setText((String) produtable.getValueAt(linha, 1));
         quantidade.setText(""+produtable.getValueAt(produtable.getSelectedRow(), 2));
            
            tela_tipotelefone.button = 
           (boolean) produtable.getValueAt(linha, 0);
                    
            this.dispose();
    }//GEN-LAST:event_produtableMouseClicked
    }
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
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Produto().setVisible(true);
            }
        });
    }
 public void desativarBotoes()
    {
        deletar.setEnabled(false);
        Produto.setEnabled(false);
      quantidade.setEnabled(false);
      tipo.setEnabled(false);
      marca.setEnabled(false);
    }
    
    public void ativarBotoes()
    {
             deletar.setEnabled(true);
        Produto.setEnabled(true);
      quantidade.setEnabled(true);
      tipo.setEnabled(true);
      marca.setEnabled(true);
    }
      public void limparCampos()
    {
          Produto.setText("");
             quantidade.setText("");
    }
      public void carregamarca()
    {
        produto_CTR objtel = new produto_CTR();
        liamarca = objtel.carregaCombomarcaproduto();
        
        marca.removeAllItems();
        int i = 0;
        
        while(i < liamarca.size())
        {
            marca.addItem(liamarca.get(i).getMarca_produto());
            i++;
        }
       
    }
        public void carregatipo()
    {
        produto_CTR objtel = new produto_CTR();
        liatipo = objtel.carregaCombotipoproduto();
        
        tipo.removeAllItems();
        int i = 0;
        
        while(i < liatipo.size())
        {
            tipo.addItem(liatipo.get(i).getTipo());
            i++;
        }

    }
        public void Inseriproduto()
    {
        produto_CTR objcli = new  produto_CTR();
        
        objcli.InsereprodutoCTR(
       Produto.getText(),Integer.parseInt(quantidade.getText()),
               liatipo.get(tipo.getSelectedIndex()).getCod_tipo(),
                liamarca.get(marca.getSelectedIndex()).getCod_marca_produto()); 
    }
                public void alterarproduto()
    {
        produto_CTR objcli = new  produto_CTR();
        
        objcli.AlteraprodutoCTR(
       Produto.getText(),Integer.parseInt(quantidade.getText()),
               liatipo.get(tipo.getSelectedIndex()).getCod_tipo(),
                liamarca.get(marca.getSelectedIndex()).getCod_marca_produto(),id_produto); 
    }
                  public  void excluirproduto(){
      int linha = produtable.getSelectedRow();
        
        produto_CTR objcli = new produto_CTR();
        
        objcli.ExcluiprodutoCTR(id_produto);
    }
          public void pesquisarproduto()
    {
         produto_CTR objfunc = new produto_CTR();
        rsfunc = objfunc.PesquisarprodutoCTR(Produto.getText());
        
        preenche_item();
        
    }
          public void preenche_item()
    {
     String [] colunas = {"Codigo de barras","Produto","quantidade","tipo","marca"};
        
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
                
                regVetor.add(rsfunc.getInt("codigo_barras"));
                regVetor.add(rsfunc.getString("produto"));
                regVetor.add(rsfunc.getInt("quantidade"));
                regVetor.add(rsfunc.getString("tipo"));
                regVetor.add(rsfunc.getString("marca_produto"));
                
                dados.add(regVetor);
                tablemodel.addRow(regVetor);
            }
            produtable.setModel(tablemodel);
            
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Produto;
    private javax.swing.JButton alterar;
    private javax.swing.JButton cadastrar2;
    private javax.swing.JButton deletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> marca;
    private javax.swing.JTable produtable;
    private javax.swing.JTextField quantidade;
    private javax.swing.JButton refesh;
    private javax.swing.JButton salvar1;
    private javax.swing.JLabel tela_princial;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JLabel tipos;
    private javax.swing.JLabel tipos1;
    // End of variables declaration//GEN-END:variables
}
