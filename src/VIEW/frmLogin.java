package VIEW;

import DTO.UsuarioDTO;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;

import VIEW.frmPrincipalVIEW;
import VIEW.frmUsuarioVIEW;
import DAO.UsuarioDAO;
import java.awt.event.KeyEvent;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGoFrmUsuario = new javax.swing.JButton();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        btnEntrarSistema = new javax.swing.JButton();
        txtNomeUsuario = new javax.swing.JTextField();
        lblSenhaUsuario = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 149, 255), 4));

        jPanel1.setBackground(new java.awt.Color(63, 149, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadeadojava.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("POKER BANK");

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LET'S PLAY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnGoFrmUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGoFrmUsuario.setText("CADASTRO");
        btnGoFrmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoFrmUsuarioActionPerformed(evt);
            }
        });

        txtSenhaUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtSenhaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaUsuarioKeyPressed(evt);
            }
        });

        btnEntrarSistema.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEntrarSistema.setText("ENTRAR");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });
        btnEntrarSistema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarSistemaKeyPressed(evt);
            }
        });

        txtNomeUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });
        txtNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeUsuarioKeyTyped(evt);
            }
        });

        lblSenhaUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSenhaUsuario.setText("SENHA DO USUÁRIO:");

        lblNomeUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNomeUsuario.setText("NOME DE USUÁRIO:");

        btnSair.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblSenhaUsuario)
                            .addGap(235, 235, 235)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeUsuario)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnGoFrmUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSair)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntrarSistema))))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNomeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenhaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrarSistema)
                    .addComponent(btnGoFrmUsuario)
                    .addComponent(btnSair))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed

        try {

            String nome_usuario, senha_usuario;

            nome_usuario = txtNomeUsuario.getText();
            senha_usuario = txtSenhaUsuario.getText();

            //instanciando a DTO
            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setNome_usuario(nome_usuario);
            objusuariodto.setSenha_usuario(senha_usuario);

            UsuarioDAO objusuariodao = new UsuarioDAO();

            //PELA WEB PLANETSCALE
            ResultSet rusuariodaoweb = objusuariodao.autenticacaoUsuarioWeb(objusuariodto);
            //resposta se conectou ao banco pela web
            if (rusuariodaoweb.next()) {
               
                JOptionPane.showMessageDialog(null, "Banco de Dados ONLINE");
                
                
            //ENTRA NO BD LOCAL
            ResultSet rusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);
                JOptionPane.showMessageDialog(null, "Também conectado ao Banco de Dados LOCAL");
            
            //VAI PARA A PÁGINA PRINCIPAL
            if (rusuariodao.next()) {
                //chamar tela que quero abrir
                frmPrincipalVIEW objfrmprincipalview = new frmPrincipalVIEW();//instanciando Jform frmPrincipal

                String nomeResposta = txtNomeUsuario.getText();//pegando o texto do TextField

                objfrmprincipalview.txtNomeRecebe.setText(nomeResposta);//setando o TextField do VIEW frmPrincipalVIEW

                objfrmprincipalview.setVisible(true);

                dispose();

            } else {
                //enviar mensagem dizendo incorreto

                JOptionPane.showMessageDialog(null, "Usuário ou senha inválida");
            }
                
            } else {
                JOptionPane.showMessageDialog(null, "Banco de Dados OFFLINE\nVerifique se digitou seus dados corretamente e tente novamente");
                
            }
            

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "FRMLOGINVIEW" + erro);

        }

    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

    private void btnGoFrmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoFrmUsuarioActionPerformed
        frmUsuarioVIEW objusuarioview = new frmUsuarioVIEW();

        objusuarioview.avisoID.setVisible(true);
        objusuarioview.setVisible(true);

        dispose();

    }//GEN-LAST:event_btnGoFrmUsuarioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        System.exit(0);//ENCERRAR O APLICATIVO

    }//GEN-LAST:event_btnSairActionPerformed

    private void txtNomeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeUsuarioKeyPressed

        int tecla = evt.getKeyCode();//recebendo o valor digitado no teclado
        //comparando se a tecla digitada é ENTER
        if (tecla == KeyEvent.VK_ENTER) {
            txtSenhaUsuario.requestFocus();// ao cliclar no enter dentro da TextField vai para outra
        } else {

        }


    }//GEN-LAST:event_txtNomeUsuarioKeyPressed

    private void txtSenhaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioKeyPressed

        int tecla = evt.getKeyCode();//recebendo o valor digitado no teclado
        //comparando se a tecla digitada é ENTER
        if (tecla == KeyEvent.VK_ENTER) {
            btnEntrarSistema.requestFocus();// ao clilcar no enter vai para o botão
        } else {
        }

    }//GEN-LAST:event_txtSenhaUsuarioKeyPressed

    private void btnEntrarSistemaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarSistemaKeyPressed
        int tecla = evt.getKeyCode();//recebendo o valor digitado no teclado
        //comparando se a tecla digitada é ENTER
        if (tecla == KeyEvent.VK_ENTER) {
            try {

                String nome_usuario, senha_usuario;

                nome_usuario = txtNomeUsuario.getText();
                senha_usuario = txtSenhaUsuario.getText();

                //instanciando a DTO
                UsuarioDTO objusuariodto = new UsuarioDTO();
                objusuariodto.setNome_usuario(nome_usuario);
                objusuariodto.setSenha_usuario(senha_usuario);

                UsuarioDAO objusuariodao = new UsuarioDAO();
                ResultSet rusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);

                if (rusuariodao.next()) {
                    //chamar tela que quero abrir
                    frmPrincipalVIEW objfrmprincipalview = new frmPrincipalVIEW();//instanciando Jform frmPrincipal

                    String nomeResposta = txtNomeUsuario.getText();//pegando o texto do TextField

                    objfrmprincipalview.txtNomeRecebe.setText(nomeResposta);//setando o TextField do VIEW frmPrincipalVIEW

                    objfrmprincipalview.setVisible(true);

                    dispose();

                } else {
                    //enviar mensagem dizendo incorreto

                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválida");
                }

            } catch (SQLException erro) {

                JOptionPane.showMessageDialog(null, "FRMLOGINVIEW" + erro);

            }
        } else {

        }

    }//GEN-LAST:event_btnEntrarSistemaKeyPressed

    private void txtNomeUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioKeyTyped

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    public static void main(String args[]) {

        //ALTERA O VISUAL DO VIEW
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
            java.util.logging.Logger.getLogger(frmListarPerdas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListarPerdas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListarPerdas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListarPerdas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarSistema;
    public javax.swing.JButton btnGoFrmUsuario;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblSenhaUsuario;
    public javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
}
