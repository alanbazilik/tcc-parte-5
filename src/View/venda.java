/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.FuncionarioModel;
import Model.ClienteModel;
import Model.ProdutoModel;
import CTR.vendaCTR;
import Sistemas_login.utilitarios;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
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
public class venda extends javax.swing.JDialog {

    /**
     * Creates new form cidade
     */
    public static int id_venda;
    public static int fkcod_cidade;
    ResultSet rsfunc;
    String opcao;
    List<FuncionarioModel> listfFuncionarioModels;
    List<ClienteModel> listcClienteModels;
    List<ProdutoModel> listpProdutoModels;
    static boolean button;

    public venda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
           Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        
        this.setBounds(0, 0, d.width = 800, d.height  = 600);
        desativarBotoes();
        pesquisarvenda();
        carregaclintecmb();
        carregafuncionariocmb();
        carregaprodutocmb();
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
        jLabel6 = new javax.swing.JLabel();
        funcionario = new javax.swing.JComboBox<String>();
        clientes = new javax.swing.JComboBox<String>();
        atualizar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        produto = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        Quantv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Valorv = new javax.swing.JTextField();
        date = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendaTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE VENDAS");

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
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(tela_princial)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
            .addComponent(tela_princial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 813, 59);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Data:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 70, 50, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Cliente:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 110, 70, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Quantv:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 190, 80, 30);

        funcionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioActionPerformed(evt);
            }
        });
        getContentPane().add(funcionario);
        funcionario.setBounds(80, 140, 90, 20);

        clientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        getContentPane().add(clientes);
        clientes.setBounds(50, 110, 120, 20);

        atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        atualizar.setText("Atualizar dados");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(atualizar);
        atualizar.setBounds(0, 500, 170, 40);

        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar (1).png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar);
        alterar.setBounds(0, 460, 170, 40);

        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar (1).png"))); // NOI18N
        deletar.setText("Excluir");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });
        getContentPane().add(deletar);
        deletar.setBounds(0, 420, 170, 40);

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addition.png"))); // NOI18N
        cadastrar.setText("Novo");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(0, 340, 170, 40);

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(0, 380, 170, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Funcionário:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 140, 110, 20);

        produto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(produto);
        produto.setBounds(60, 170, 90, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Produto:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 165, 80, 30);
        getContentPane().add(Quantv);
        Quantv.setBounds(60, 200, 90, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Valorv:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 220, 80, 30);
        getContentPane().add(Valorv);
        Valorv.setBounds(50, 230, 100, 20);

        try {
            date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(date);
        date.setBounds(40, 70, 80, 20);

        vendaTable.setAutoCreateRowSorter(true);
        vendaTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        vendaTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        vendaTable.setColumnSelectionAllowed(true);
        vendaTable.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        vendaTable.setEditingColumn(1);
        vendaTable.setEditingRow(1);
        vendaTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        vendaTable.setRowHeight(12);
        vendaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendaTableMouseClicked(evt);
            }
        });
        vendaTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vendaTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(vendaTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 60, 630, 540);

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tela_princialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tela_princialMouseClicked
        // TODO add your handling code here:
        Tela_principal objtel = new Tela_principal(null,true);
        objtel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tela_princialMouseClicked

    private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionarioActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        ativarBotoes();
        limparCampos();
        pesquisarvenda();
        opcao = "Inserir";
        button = true;
    }//GEN-LAST:event_cadastrarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        String[] options = new String[]{"Sim", "Não"};
           LocalDate localDate = LocalDate.now();
        date.setText("" + localDate); 
        Object ret = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir: "
                + date.getText() + "?", "AVISO", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (options[Integer.valueOf(ret.toString())].equals("Sim")) {
            excluirvenda();
            limparCampos();
            desativarBotoes();
            pesquisarvenda();
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        alterarvenda();
        limparCampos();
        pesquisarvenda();
    }//GEN-LAST:event_alterarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
        inserevenda();
        limparCampos();
        desativarBotoes();
        pesquisarvenda();

    }//GEN-LAST:event_salvarActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        // TODO add your handling code here:
        pesquisarvenda();
    }//GEN-LAST:event_atualizarActionPerformed

    private void vendaTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendaTableKeyPressed
        int linha = vendaTable.getSelectedRow();
         this.date.setText((String) vendaTable.getValueAt(linha, 1));
       Quantv.setText(vendaTable.getModel().getValueAt(linha, 5).toString());
       Valorv.setText(vendaTable.getModel().getValueAt(linha, 6).toString());
        id_venda = (int) vendaTable.getValueAt(linha, 0);

        opcao = "Alterar";
        ativarBotoes();
    }//GEN-LAST:event_vendaTableKeyPressed

    private void vendaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendaTableMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = vendaTable.getSelectedRow();

                this.date.setText((String) vendaTable.getValueAt(linha, 1));
                  Quantv.setText(vendaTable.getModel().getValueAt(linha, 5).toString());
       Valorv.setText(vendaTable.getModel().getValueAt(linha, 6).toString());
            tela_Cliente.button
                    = (boolean) vendaTable.getValueAt(linha, 0);

            this.dispose();
        }
    }//GEN-LAST:event_vendaTableMouseClicked

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
            java.util.logging.Logger.getLogger(venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                venda dialog = new venda(new javax.swing.JFrame(), true);
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

    public void desativarBotoes() {
        salvar.setEnabled(false);
        deletar.setEnabled(false);
        date.setEnabled(false);
        funcionario.setEnabled(false);
        clientes.setEnabled(false);
        produto.setEnabled(false);
        Quantv.setEnabled(false);
        Valorv.setEnabled(false);

    }

    public void ativarBotoes() {
        salvar.setEnabled(true);
        deletar.setEnabled(true);
        date.setEnabled(true);
        funcionario.setEnabled(true);
        clientes.setEnabled(true);
        produto.setEnabled(true);
        Quantv.setEnabled(true);
        Valorv.setEnabled(true);

    }

    public void limparCampos() {
        date.setText("");
        Quantv.setText("");
        Valorv.setText("");

    }

    public void carregaclintecmb() {
        vendaCTR objtel = new vendaCTR();
        listcClienteModels = objtel.carregaCombocliente();

        clientes.removeAllItems();
        int i = 0;

        while (i < listcClienteModels.size()) {
            clientes.addItem(listcClienteModels.get(i).getNome_Cliente());
            i++;
        }

    }

    public void carregafuncionariocmb() {
        vendaCTR objtel = new vendaCTR();
        listfFuncionarioModels = objtel.carregaCombofuncionario();

        funcionario.removeAllItems();
        int i = 0;

        while (i < listfFuncionarioModels.size()) {
            funcionario.addItem(listfFuncionarioModels.get(i).getNome_funcionario());
            i++;
        }

    }

    public void carregaprodutocmb() {
        vendaCTR objtel = new vendaCTR();
        listpProdutoModels = objtel.carregaComboProduto();

        produto.removeAllItems();
        int i = 0;

        while (i < listpProdutoModels.size()) {
            produto.addItem(listpProdutoModels.get(i).getProduto());
            i++;
        }

    }

    public void inserevenda() {

        vendaCTR objtel1 = new vendaCTR();
        objtel1.InserevendaCTR(
                date.getText(),
                listcClienteModels.get(clientes.getSelectedIndex()).getCod_Cliente(),
                listfFuncionarioModels.get(funcionario.getSelectedIndex()).getCod_funcionario(),
                listpProdutoModels.get(produto.getSelectedIndex()).getCodigo_barras(),
                Float.parseFloat(Quantv.getText()),
                Float.parseFloat(Valorv.getText())
        );
    }

    public void alterarvenda() {

        vendaCTR objtel1 = new vendaCTR();
        objtel1.AlteracidadeCTR(
                date.getText(),
                listcClienteModels.get(clientes.getSelectedIndex()).getCod_Cliente(),
                listfFuncionarioModels.get(funcionario.getSelectedIndex()).getCod_funcionario(),
                listpProdutoModels.get(produto.getSelectedIndex()).getCodigo_barras(),
                Float.parseFloat(Quantv.getText()),
                Float.parseFloat(Valorv.getText()), id_venda
        );
    }

    public void excluirvenda() {
        int linha = vendaTable.getSelectedRow();
        
        vendaCTR objcli = new vendaCTR();

        objcli.ExcluitelCTR(id_venda);
    }

    public void pesquisarvenda() {
        vendaCTR objfunc = new vendaCTR();
        rsfunc = objfunc.PesquisartelCTR(Quantv.getText());

        preenche_item();

    }

    public void preenche_item() {
        String[] colunas = {"Codigo","Data","Funcionario","Cliente","Produto","Quantv","Valor"};

        String[][] linhas = {};
       
        DefaultTableModel tablemodel = new DefaultTableModel(linhas, colunas) {
            public boolean CelulaEditavel(int rowIndex, int mColIndex) {
                return true;
            }
            
        };

        Vector<Vector> dados = new Vector();

        try {
            while (rsfunc.next()) {
                Vector regVetor = new Vector();

                regVetor.add(rsfunc.getInt("codvenda"));
                regVetor.add(rsfunc.getString("datavenda"));
                regVetor.add(rsfunc.getString("nome_funcionario"));
                regVetor.add(rsfunc.getString("nome_cliente"));
                regVetor.add(rsfunc.getString("produto"));
                regVetor.add(rsfunc.getFloat("quantv"));
                regVetor.add(rsfunc.getFloat("valorv"));
                dados.add(regVetor);
                tablemodel.addRow(regVetor);
            }
            vendaTable.setModel(tablemodel);

        } catch (SQLException ex) {
            Logger.getLogger(venda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Quantv;
    private javax.swing.JTextField Valorv;
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JComboBox<String> clientes;
    private javax.swing.JFormattedTextField date;
    private javax.swing.JButton deletar;
    private javax.swing.JComboBox<String> funcionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> produto;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel tela_princial;
    private javax.swing.JTable vendaTable;
    // End of variables declaration//GEN-END:variables
}
