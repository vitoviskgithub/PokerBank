package VIEW;

import DAO.ConexaoDAO;
import DAO.UsuarioDAO;
import DTO.BankUserDTO;
import DTO.TournamentsDTO;
import DTO.UsuarioDTO;
import java.awt.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import javax.swing.JFrame;

public class frmPrincipalVIEW extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public frmPrincipalVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jLabel5 = new javax.swing.JLabel();
        txtbemvindo = new javax.swing.JLabel();
        txtNomeRecebe = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalSaldo = new javax.swing.JTextField();
        btnAtualizarSaldo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAdm = new javax.swing.JMenu();
        menuAdm1 = new javax.swing.JMenuItem();
        menuAdm2 = new javax.swing.JMenuItem();
        menuAdm3 = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenu();
        menuUser1 = new javax.swing.JMenuItem();
        menuList = new javax.swing.JMenu();
        menuList1 = new javax.swing.JMenuItem();
        menuList2 = new javax.swing.JMenuItem();
        menuList3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jMenu1.setText("jMenu1");

        jMenuItem3.setText("jMenuItem3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtbemvindo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtbemvindo.setText("Bem vindo ");

        txtNomeRecebe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNomeRecebe.setForeground(new java.awt.Color(255, 0, 0));
        txtNomeRecebe.setText("name");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cartas_pokerbank.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("POKER BANK");

        txtTotalSaldo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTotalSaldo.setEnabled(false);

        btnAtualizarSaldo.setText("SALDO TOTAL (ID)");
        btnAtualizarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarSaldoActionPerformed(evt);
            }
        });

        menuAdm.setText("ADMINISTRADOR");
        menuAdm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        menuAdm1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuAdm1.setText("ALTERAR DADOS CADASTRAIS");
        menuAdm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdm1ActionPerformed(evt);
            }
        });
        menuAdm.add(menuAdm1);

        menuAdm2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuAdm2.setText("ACESSAR O BANCO");
        menuAdm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdm2ActionPerformed(evt);
            }
        });
        menuAdm.add(menuAdm2);

        menuAdm3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuAdm3.setText("ACESSAR OS TORNEIOS");
        menuAdm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdm3ActionPerformed(evt);
            }
        });
        menuAdm.add(menuAdm3);

        jMenuBar1.add(menuAdm);

        menuUser.setText("USUÁRIO");
        menuUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        menuUser1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuUser1.setText("ALTERAR DADOS CADASTRAIS");
        menuUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUser1ActionPerformed(evt);
            }
        });
        menuUser.add(menuUser1);

        jMenuBar1.add(menuUser);

        menuList.setText("LISTAR");
        menuList.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        menuList1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuList1.setText("TORNEIOS");
        menuList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuList1ActionPerformed(evt);
            }
        });
        menuList.add(menuList1);

        menuList2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuList2.setText("GANHOS");
        menuList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuList2ActionPerformed(evt);
            }
        });
        menuList.add(menuList2);

        menuList3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuList3.setText("PERDAS");
        menuList3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuList3ActionPerformed(evt);
            }
        });
        menuList.add(menuList3);

        jMenuBar1.add(menuList);

        jMenu2.setText("OUTROS");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem1.setText("TELA DE LOGIN");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("CADASTRO USUÁRIO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu11.setText("AJUDA");
        jMenu11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu11);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeRecebe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTotalSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizarSaldo))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbemvindo)
                            .addComponent(txtNomeRecebe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarSaldo))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSaldoActionPerformed

        String login_recebe_id_string = JOptionPane.showInputDialog("Insira novamente seu ID de usuário, por seguranaça");
        String senha2_recebe = JOptionPane.showInputDialog("Insira sua senha novamente");
        //inicialmente não usaremos a senha
        
          if (login_recebe_id_string.isEmpty() && senha2_recebe.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha seu id e senha de usuário");
                }else if (login_recebe_id_string.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Preencha seu id de usuário");
                }

        int id_login_recebe = Integer.parseInt(login_recebe_id_string);//converte o string recebido para inteiro

//instanciando a DTO e passando os valores das variáveis para a DTO
//essa mesma variável será setada em duas DTO
        BankUserDTO objbankdto = new BankUserDTO();
        objbankdto.setId_user_bank(id_login_recebe);

        //para autenticacao na DAO Usuario
        String senha_usuario;
        int id_usuario;

        id_usuario = id_login_recebe;
        senha_usuario = senha2_recebe;

        //instanciando outra DTO,  para fazer o teste de autenticação
        UsuarioDTO objusuariodto = new UsuarioDTO();

        //e setando denovo o id, para uma DTO diferente
        objusuariodto.setId_usuario(id_usuario);
        objusuariodto.setSenha_usuario(senha_usuario);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        //teste de autenticação que me retorna uma variável tipo ResultSet
        ResultSet rusuariodao = objusuariodao.autenticacaoUsuario2(objusuariodto);

        //aconselhável fazer dentro de um TRY a comparação IF nessa caso por causa do SQLException
        try {

            if (rusuariodao.next()) {
                somarValoresSaldo(objbankdto);
            } else {

              if(senha2_recebe.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha sua senha de usuário");

                }else{

                JOptionPane.showMessageDialog(null, "Erro em algum dado para a verificação de usuário");
            
                }
                }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no frmPrincipalVIEW BTN SALDO TOTAL :" + erro);

        }

    }//GEN-LAST:event_btnAtualizarSaldoActionPerformed

    private void menuAdm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdm2ActionPerformed

        String senha3_recebe = JOptionPane.showInputDialog("Digite a senha do administrador");

        UsuarioDTO objusuariodto = new UsuarioDTO();

        objusuariodto.setSenha_usuario(senha3_recebe);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        //teste de autenticação que me retorna uma variável tipo ResultSet
        ResultSet rusuariodao = objusuariodao.autenticacaoUsuario3(objusuariodto);

        try {

            if (rusuariodao.next()) {

                frmBanco objbanco = new frmBanco();
                objbanco.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "É preciso ter a senha do administrador para usar esse formulário");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no frmPrincipalVIEW BANCO ADM:" + erro);

        }

    }//GEN-LAST:event_menuAdm2ActionPerformed

    private void menuAdm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdm1ActionPerformed

        String senha3_recebe = JOptionPane.showInputDialog("Digite a senha do administrador");

        UsuarioDTO objusuariodto = new UsuarioDTO();

        objusuariodto.setSenha_usuario(senha3_recebe);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        //teste de autenticação que me retorna uma variável tipo ResultSet
        ResultSet rusuariodao = objusuariodao.autenticacaoUsuario3(objusuariodto);

        try {

            if (rusuariodao.next()) {

                frmPesquisaUsuario objpesquisa = new frmPesquisaUsuario();

                objpesquisa.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "É preciso ter a senha do administrador para usar esse formulário");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no frmPrincipalVIEW USUÁRIO ADM:" + erro);

        }


    }//GEN-LAST:event_menuAdm1ActionPerformed

    private void menuAdm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdm3ActionPerformed

        String senha3_recebe = JOptionPane.showInputDialog("Digite a senha do administrador");

        UsuarioDTO objusuariodto = new UsuarioDTO();

        objusuariodto.setSenha_usuario(senha3_recebe);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        //teste de autenticação que me retorna uma variável tipo ResultSet
        ResultSet rusuariodao = objusuariodao.autenticacaoUsuario3(objusuariodto);

        try {

            if (rusuariodao.next()) {

                frmTorneios objtorneios = new frmTorneios();
                objtorneios.setVisible(rootPaneCheckingEnabled);

            } else {
                JOptionPane.showMessageDialog(null, "É preciso ter a senha do administrador para usar esse formulário");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no frmPrincipalVIEW TORNEIO ADM:" + erro);

        }


    }//GEN-LAST:event_menuAdm3ActionPerformed

    private void menuUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUser1ActionPerformed

        String login_recebe = JOptionPane.showInputDialog("Insira novamente seu nome como cadastrou, por seguranaça");
        String senha1_recebe = JOptionPane.showInputDialog("Insira sua senha novamente");

//instanciando a DTO e passando os valores das variáveis para a DTO
        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setNome_usuario(login_recebe);
        objusuariodto.setSenha_usuario(senha1_recebe);

//acessando a DAO e passando valores para usar o método que acessa o banco de dados pega os valores e carrega nas TextField
        UsuarioDAO objusuariodao = new UsuarioDAO();

        objusuariodao.DadosCadastrais(objusuariodto);

        frmUsuarioVIEW objusuarioview = new frmUsuarioVIEW();

        String id_dados_user = new Integer(objusuariodto.getId_usuario()).toString();

        //AUTENTICAR
        try {

//pegando os valores da linha da tabela que já estão setados na DTO
            objusuarioview.txtIdUser.setText(id_dados_user);
            objusuarioview.txtNome.setText(objusuariodto.getNome_usuario());
            objusuarioview.txtEmail.setText(objusuariodto.getEmail_usuario());
            objusuarioview.txtTelefone.setText(objusuariodto.getTelefone_usuario());
            objusuarioview.txtSenha.setText(objusuariodto.getSenha_usuario());
            objusuarioview.cbxContaPoker.getModel().setSelectedItem(objusuariodto.getCod_contapoker());

            objusuarioview.avisoID.setVisible(false);//texto de aviso desaparece

            objusuarioview.btnAlterarUserView.setEnabled(true);
            objusuarioview.btnCadastrar.setEnabled(false);

            objusuarioview.btnLogin.setVisible(false);

            /**
             * botão que voltava para tela principal, não existe mais
             * objusuarioview.btnTelaPrincipal.setVisible(true);
             */
            //AUTENTICAR
            ResultSet rusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);

            if (rusuariodao.next()) {

                objusuarioview.avisoID.setVisible(true);
                objusuarioview.setVisible(true);

            } else {

                //enviar mensagem dizendo incorreto
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválida");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "frmPrincipalVIEW: " + erro);
        }//FIM AUTENTICAR


    }//GEN-LAST:event_menuUser1ActionPerformed

    private void menuList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuList2ActionPerformed
        frmListarGanhos objlistaganho = new frmListarGanhos();
        objlistaganho.setVisible(true);


    }//GEN-LAST:event_menuList2ActionPerformed

    private void menuList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuList1ActionPerformed
        frmListaTourn objlistatourn = new frmListaTourn();
        //ver o JForm
        objlistatourn.setVisible(true);


    }//GEN-LAST:event_menuList1ActionPerformed

    private void menuList3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuList3ActionPerformed
        frmListarPerdas objlistaperdas = new frmListarPerdas();
        objlistaperdas.setVisible(true);


    }//GEN-LAST:event_menuList3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        frmUsuarioVIEW objusuarioview = new frmUsuarioVIEW();

        objusuarioview.avisoID.setVisible(false);
        objusuarioview.setVisible(true);

        dispose();


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmLogin objlogin = new frmLogin();

        objlogin.btnGoFrmUsuario.setVisible(false);

        objlogin.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
                new frmPrincipalVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenu menuAdm;
    private javax.swing.JMenuItem menuAdm1;
    private javax.swing.JMenuItem menuAdm2;
    private javax.swing.JMenuItem menuAdm3;
    private javax.swing.JMenu menuList;
    private javax.swing.JMenuItem menuList1;
    private javax.swing.JMenuItem menuList2;
    private javax.swing.JMenuItem menuList3;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenuItem menuUser1;
    public javax.swing.JLabel txtNomeRecebe;
    private javax.swing.JTextField txtTotalSaldo;
    public javax.swing.JLabel txtbemvindo;
    // End of variables declaration//GEN-END:variables

    public int somaSaldos;

    private void somarValoresSaldo(BankUserDTO objbankdto) {

        String sql = "SELECT SUM(saldo_bank) AS Total FROM tablebankuser WHERE fk_id_user_bank = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objbankdto.getId_user_bank());

            rs = pstm.executeQuery();

            if (rs.next()) {

                // para pegar o valor de da variável ResultSet pegou no BD, tem que estar 
                //dentro de uma CONDICIONAL IF ou LOOP como WHILE, com o compartaivo se ela está vazia ou não rs.next()
                somaSaldos = rs.getInt(1);
                String textoSoma = String.valueOf(somaSaldos);
                txtTotalSaldo.setText(textoSoma);

            } else {

                JOptionPane.showMessageDialog(null, "Erro na soma dos saldos no frmPrincipal");
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "frmPrincipal método listarSaldos: " + erro);
        }

    }

}
