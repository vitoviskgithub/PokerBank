package VIEW;

import DAO.ContaPokerDAO;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;

import java.sql.ResultSet;
import java.util.Vector;
import java.sql.SQLException;


public class frmUsuarioVIEW extends javax.swing.JFrame {
  
          //quando a classe inicializa
    public frmUsuarioVIEW() {
        initComponents();
        
        if (txtIdUser.getText().equals("")) {

        } else {
            avisoID.setVisible(true);
        }

        btnAlterarUserView.setEnabled(false);
        /** botão para tela principal, deixava ele invisível, ele não existe mais
         btnTelaPrincipal.setVisible(false);*/

        restaurarDadosComboBoxContaPoker();//método para comboBox

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        limparDadosCampos = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbxContaPoker = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        btnAlterarUserView = new javax.swing.JButton();
        avisoID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("NOME");

        txtNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("EMAIL");

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("TELEFONE");

        txtTelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("SENHA");

        txtSenha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        limparDadosCampos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        limparDadosCampos.setText("LIMPAR");
        limparDadosCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparDadosCamposActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSair.setText("FECHAR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("CONTA POKER");

        cbxContaPoker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("ID");

        txtIdUser.setEnabled(false);

        btnAlterarUserView.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterarUserView.setText("ALTERAR");
        btnAlterarUserView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUserViewActionPerformed(evt);
            }
        });

        avisoID.setForeground(new java.awt.Color(255, 0, 0));
        avisoID.setText("Não esqueça de selecionar sua CONTA POKER antes de CADASTRAR ou ALTERAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(11, 11, 11)
                                .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarUserView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparDadosCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxContaPoker, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(avisoID))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(txtNome))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxContaPoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avisoID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnCadastrar)
                    .addComponent(limparDadosCampos)
                    .addComponent(btnAlterarUserView)
                    .addComponent(btnLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if (txtNome.getText().equals("")
                || txtEmail.getText().equals("")
                || txtTelefone.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha antes de cadastrar");

        } else {

            CadastrarUsuario();//método Cadastrar interno

            String nomeResposta = txtNome.getText();

            frmLogin objfrmlogin = new frmLogin();//instanciando Jform frmLogin
            objfrmlogin.setVisible(true);

            objfrmlogin.btnGoFrmUsuario.setVisible(false);

            dispose();

            JOptionPane.showMessageDialog(null, nomeResposta + " se cadastrou no banco de dados, faça seu login");

            dispose();

        }


    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        frmLogin objfrmlogin = new frmLogin();
        objfrmlogin.setVisible(true);

        dispose();

    }//GEN-LAST:event_btnLoginActionPerformed

    private void limparDadosCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparDadosCamposActionPerformed

        LimparCamposVIEW();

    }//GEN-LAST:event_limparDadosCamposActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAlterarUserViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUserViewActionPerformed

        //comparando se os campos estão vazios
        if (txtIdUser.getText().equals("")
                || txtNome.getText().equals("")
                || txtEmail.getText().equals("")
                || txtTelefone.getText().equals("")
                || txtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Há algum campo vazio, preencha para atlerar as inforamções");
        } else {
            AlterarUsuarioVIEW();//altera
            LimparCamposVIEW();
            dispose();
            }

    }//GEN-LAST:event_btnAlterarUserViewActionPerformed

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
                new frmUsuarioVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel avisoID;
    public javax.swing.JButton btnAlterarUserView;
    public javax.swing.JButton btnCadastrar;
    public javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSair;
    public javax.swing.JComboBox<String> cbxContaPoker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton limparDadosCampos;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtIdUser;
    public javax.swing.JTextField txtNome;
    public javax.swing.JTextField txtSenha;
    public javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void CadastrarUsuario() {

        String nome, email, telefone, senha, usuario_ativo;
        //declarando variável
        int codcontapk;

        nome = txtNome.getText();
        email = txtEmail.getText();
        telefone = txtTelefone.getText();
        senha = txtSenha.getText();
        //pegando valor e armazenando na variável para passar para DTO
        codcontapk = id_contapoker.get(cbxContaPoker.getSelectedIndex() - 1);// IMPORTANTÍSSIMO : getSelected -1 é o elemento selecionado
        usuario_ativo = "Sim";

//setando os valores dos campos da VIEW para a DTO
        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setNome_usuario(nome);
        objusuariodto.setEmail_usuario(email);
        objusuariodto.setTelefone_usuario(telefone);
        objusuariodto.setSenha_usuario(senha);
        //setando DTO
        objusuariodto.setCod_contapoker(codcontapk);
        objusuariodto.setUsuario_ativo(usuario_ativo);

//acessando o método cadastroUsuario na DAO
        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.cadastrarUsuario(objusuariodto);//passando as informações da DTO para o método

    }

//Essa variável Vector armazena os valores da comboBox
    Vector<Integer> id_contapoker = new Vector<Integer>();// declarando o vector necesário para comboBox

    public void restaurarDadosComboBoxContaPoker() {

        try {

            ContaPokerDAO objcontapoker = new ContaPokerDAO();
            ResultSet rs = objcontapoker.listarContaPokerCombo();

            while (rs.next()) {
                id_contapoker.addElement(rs.getInt(1));//o elemento faz parte do Vector, e também é importante pois será chave estrangeira
                //concatenei o id mais o valor da coluna selecionada no banco de dados na visualização do usuário
                //também usei o método do Vetor id_contapoker que me retorna o valor somente do último elemento, e não de todo valor
                cbxContaPoker.addItem(id_contapoker.lastElement() + rs.getString(2));// o Item é o que aparece para usuário visualizar
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "frmPesquisarUsuario: " + erro);

        }

    }

    private void AlterarUsuarioVIEW() {
        int id_usuario, cod_contapk;
        String nome_usuario, email_usuario, telefone_usuario, senha_usuario, usuario_ativo;

        id_usuario = Integer.parseInt(txtIdUser.getText());//o método Integer.parseInt() pega o conteúdo texto e converte para inteiro

        nome_usuario = txtNome.getText();
        email_usuario = txtEmail.getText();
        telefone_usuario = txtTelefone.getText();
        senha_usuario = txtSenha.getText();

        cod_contapk = id_contapoker.get(cbxContaPoker.getSelectedIndex() - 1);//pega o selecionado na comboBox
        usuario_ativo = "Sim";

//mesmo que o usuário digite algum valor nos campos TextField, esse valores serão setados na DTO
        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setId_usuario(id_usuario);
        objusuariodto.setNome_usuario(nome_usuario);
        objusuariodto.setEmail_usuario(email_usuario);
        objusuariodto.setTelefone_usuario(telefone_usuario);
        objusuariodto.setSenha_usuario(senha_usuario);
        objusuariodto.setCod_contapoker(cod_contapk);
        objusuariodto.setUsuario_ativo(usuario_ativo);

//instanciando a classe DAO
        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.alterarUsuario(objusuariodto);

    }

    public void LimparCamposVIEW() {

        txtIdUser.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtSenha.setText("");
        cbxContaPoker.getModel().setSelectedItem("Selecione");

    }

             
}
