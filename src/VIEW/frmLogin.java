package VIEW;

import DTO.UsuarioDTO;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;

import VIEW.frmPrincipalVIEW;
import VIEW.frmUsuarioVIEW;
import DAO.UsuarioDAO;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeUsuario = new javax.swing.JLabel();
        lblSenhaUsuario = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        btnEntrarSistema = new javax.swing.JButton();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        btnGoFrmUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNomeUsuario.setText("NOME DE USUÁRIO:");

        lblSenhaUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSenhaUsuario.setText("SENHA DO USUÁRIO:");

        txtNomeUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnEntrarSistema.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEntrarSistema.setText("ENTRAR");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });

        txtSenhaUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnGoFrmUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGoFrmUsuario.setText("CADASTRO");
        btnGoFrmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoFrmUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadeadojava.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("POKER BANK");

        btnSair.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSenhaUsuario)
                            .addGap(235, 235, 235)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeUsuario)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGoFrmUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEntrarSistema))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1)))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenhaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoFrmUsuario)
                    .addComponent(btnSair)
                    .addComponent(btnEntrarSistema))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
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
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblSenhaUsuario;
    public javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
}
