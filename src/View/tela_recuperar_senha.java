package View;

import CTR.UsuarioCTR;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tela_Recuperar_Senha extends javax.swing.JDialog {

    public TelaRecuperarSenha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
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
        mostrarSenhaButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(535, 300));
        setMinimumSize(new java.awt.Dimension(535, 300));
        setPreferredSize(new java.awt.Dimension(535, 300));
        setSize(new java.awt.Dimension(535, 300));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24));
        jLabel1.setText("Recuperar senha");

        jToolBar8.setRollover(true);
        jToolBar8.setBorderPainted(false);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-exit-64.png")));
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
        jPanel1.setBounds(-10, 0, 554, 74);
        getContentPane().add(email);
        email.setBounds(178, 157, 201, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 160, 60, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 190, 60, 14);
        getContentPane().add(telefone);
        telefone.setBounds(199, 191, 201, 20);

        mostrarSenhaButton.setText("Mostrar senha");
        mostrarSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarSenhaButton);
        mostrarSenhaButton.setBounds(208, 231, 101, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thumb2-program-code-black-backgrounds-programming-background-with-program-code-code.jpg")));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 74, 540, 226);

        setSize(new java.awt.Dimension(487, 308));
        setLocationRelativeTo(null);
    }

    private void mostrarSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        UsuarioCTR objusu = new UsuarioCTR();
        try {
            objusu.senhaUsuarioCTR(email.getText(), telefone.getText());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaRecuperarSenha.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        UsuarioLoginVIEW objlogin = new UsuarioLoginVIEW(null, true);
        objlogin.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaRecuperarSenha dialog = new TelaRecuperarSenha(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton mostrarSenhaButton;
    private javax.swing.JTextField telefone;
}
