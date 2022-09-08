/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import CTR.UsuarioCTR;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alanbazilio
 */
public class tela_recuperar_senha extends javax.swing.JFrame {

    /**
     * Creates new form tela_recuperar_senha
     */
    public tela_recuperar_senha() {
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

        jPanel1 = new javax.swing.JPanel();
        jl_usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar8 = new javax.swing.JToolBar();
        jb_fotos = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        mostar_a_senha = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(535, 300));
        setMinimumSize(new java.awt.Dimension(535, 300));
        setPreferredSize(new java.awt.Dimension(535, 300));
        setSize(new java.awt.Dimension(535, 300));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Recuperar senha");

        jToolBar8.setRollover(true);
        jToolBar8.setBorderPainted(false);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-exit-64.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_fotos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jToolBar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jb_fotos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 541, 69);
        getContentPane().add(email);
        email.setBounds(178, 157, 201, 22);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E_mail:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 160, 60, 16);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 190, 60, 16);
        getContentPane().add(telefone);
        telefone.setBounds(199, 191, 201, 22);

        mostar_a_senha.setText("mostar senha ");
        mostar_a_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostar_a_senhaActionPerformed(evt);
            }
        });
        getContentPane().add(mostar_a_senha);
        mostar_a_senha.setBounds(208, 231, 104, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thumb2-program-code-black-backgrounds-programming-background-with-program-code-code.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 70, 540, 230);

        setSize(new java.awt.Dimension(487, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mostar_a_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostar_a_senhaActionPerformed
        // TODO add your handling code here:
           UsuarioCTR objusu = new UsuarioCTR();
        try {
            objusu.senhaUsuarioCTR(email.getText(),telefone.getText());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(tela_recuperar_senha.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.dispose();
    }//GEN-LAST:event_mostar_a_senhaActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        UsuarioLoginVIEW objlogin = new UsuarioLoginVIEW();
        objlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(tela_recuperar_senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_recuperar_senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_recuperar_senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_recuperar_senha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_recuperar_senha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar8;
    private javax.swing.JLabel jb_fotos;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JButton mostar_a_senha;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
