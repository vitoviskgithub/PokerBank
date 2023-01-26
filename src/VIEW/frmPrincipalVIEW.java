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

        panelMeio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelBaixo = new javax.swing.JPanel();
        txtNomeRecebe = new javax.swing.JLabel();
        txtbemvindo = new javax.swing.JLabel();
        txtTotalSaldo = new javax.swing.JTextField();
        btnAtualizarSaldo = new javax.swing.JButton();
        menuTopo = new javax.swing.JMenuBar();
        menuAdm = new javax.swing.JMenu();
        menuAdm1 = new javax.swing.JMenuItem();
        menuAdm2 = new javax.swing.JMenuItem();
        menuAdm3 = new javax.swing.JMenuItem();
        menuAdm4 = new javax.swing.JMenu();
        menuAdm4Puser = new javax.swing.JMenuItem();
        menuAdm4Pdate = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenu();
        menuUser1 = new javax.swing.JMenuItem();
        menuUser2 = new javax.swing.JMenu();
        menuUserGra1 = new javax.swing.JMenuItem();
        menuUserGra2 = new javax.swing.JMenuItem();
        menuUserGra3 = new javax.swing.JMenuItem();
        menuList = new javax.swing.JMenu();
        menuList1 = new javax.swing.JMenuItem();
        menuList2 = new javax.swing.JMenuItem();
        menuList3 = new javax.swing.JMenuItem();
        menuList4 = new javax.swing.JMenuItem();
        menuList5 = new javax.swing.JMenuItem();
        menuOutros = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuAjuda1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelMeio.setBackground(new java.awt.Color(63, 149, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("POKER BANK");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cartas_pokerbank.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LET'S PLAY");

        javax.swing.GroupLayout panelMeioLayout = new javax.swing.GroupLayout(panelMeio);
        panelMeio.setLayout(panelMeioLayout);
        panelMeioLayout.setHorizontalGroup(
            panelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMeioLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(panelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMeioLayout.setVerticalGroup(
            panelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelMeioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        panelBaixo.setBackground(new java.awt.Color(51, 51, 51));
        panelBaixo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4));

        txtNomeRecebe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNomeRecebe.setForeground(new java.awt.Color(255, 255, 255));

        txtbemvindo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtbemvindo.setForeground(new java.awt.Color(204, 204, 204));
        txtbemvindo.setText("Bem vindo ");

        txtTotalSaldo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTotalSaldo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(63, 149, 255)));
        txtTotalSaldo.setEnabled(false);

        btnAtualizarSaldo.setText("SALDO TOTAL (ID)");
        btnAtualizarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBaixoLayout = new javax.swing.GroupLayout(panelBaixo);
        panelBaixo.setLayout(panelBaixoLayout);
        panelBaixoLayout.setHorizontalGroup(
            panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaixoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeRecebe, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaixoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTotalSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarSaldo)
                .addContainerGap())
        );
        panelBaixoLayout.setVerticalGroup(
            panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaixoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbemvindo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeRecebe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarSaldo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuTopo.setBorder(null);

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

        menuAdm4.setText("GRÁFICOS");

        menuAdm4Puser.setText("POR USUÁRIO");
        menuAdm4.add(menuAdm4Puser);

        menuAdm4Pdate.setText("POR DATA");
        menuAdm4.add(menuAdm4Pdate);

        menuAdm.add(menuAdm4);

        menuTopo.add(menuAdm);

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

        menuUser2.setText("GRÁFICOS");

        menuUserGra1.setText("GANHOS E PERDAS");
        menuUser2.add(menuUserGra1);

        menuUserGra2.setText("TORNEIOS (QTD.)");
        menuUser2.add(menuUserGra2);

        menuUserGra3.setText("POR DATA");
        menuUser2.add(menuUserGra3);

        menuUser.add(menuUser2);

        menuTopo.add(menuUser);

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

        menuList4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuList4.setText("SAQUES");
        menuList4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuList4ActionPerformed(evt);
            }
        });
        menuList.add(menuList4);

        menuList5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuList5.setText("POR DATA");
        menuList.add(menuList5);

        menuTopo.add(menuList);

        menuOutros.setText("OUTROS");
        menuOutros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem1.setText("TELA DE LOGIN");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuOutros.add(jMenuItem1);

        jMenuItem2.setText("CADASTRO USUÁRIO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuOutros.add(jMenuItem2);

        menuTopo.add(menuOutros);

        menuAjuda.setText("AJUDA");
        menuAjuda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        menuAjuda1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuAjuda1.setText("SAIR");
        menuAjuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjuda1ActionPerformed(evt);
            }
        });
        menuAjuda.add(menuAjuda1);

        menuTopo.add(menuAjuda);

        setJMenuBar(menuTopo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBaixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSaldoActionPerformed

        String login_recebe_id_string = JOptionPane.showInputDialog("Insira novamente seu ID de usuário, por seguranaça");
        String senha2_recebe = JOptionPane.showInputDialog("Insira sua senha novamente");
        //inicialmente não usaremos a senha

        if (login_recebe_id_string.isEmpty() && senha2_recebe.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha seu id e senha de usuário");
        } else if (login_recebe_id_string.isEmpty()) {
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

                if (senha2_recebe.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha sua senha de usuário");

                } else {

                    JOptionPane.showMessageDialog(null, "Erro em algum dado para a verificação de usuário");

                }
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no frmPrincipalVIEW BTN SALDO TOTAL :" + erro);

        }

    }//GEN-LAST:event_btnAtualizarSaldoActionPerformed

    private void menuAdm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdm2ActionPerformed

        String senha3_recebe = JOptionPane.showInputDialog("Digite a senha do administrador");
        
        if(senha3_recebe.equals("")){
            
            JOptionPane.showMessageDialog(null, "Insira a senha do administrador para prosseguir");
            
        }else{
        
        UsuarioDTO objusuariodto = new UsuarioDTO();

        objusuariodto.setSenha_usuario(senha3_recebe);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        //teste de autenticação que me retorna uma variável tipo ResultSet
       ResultSet rusuariodao = objusuariodao.autenticacaoUsuario3Web(objusuariodto);

        try {

            if (rusuariodao.next()) {
                
                
                 //início do comando que verificar se usuário existe no banco local
                UsuarioDAO objusuariodaoLocal = new UsuarioDAO();
                //teste de autenticação que me retorna uma variável tipo ResultSet
                ResultSet rusuariodaoLocal = objusuariodaoLocal.autenticacaoUsuario3(objusuariodto);
                //variável retorna se o usuário existe no banco local
                if(rusuariodaoLocal.next()){
                
                //AGORA VERIFICADO SE O USUÁRIO CONSTA NO LOCAL E WEB
                //ABRE ESSA JFORM
               
                frmBanco objbanco = new frmBanco();
                objbanco.setVisible(true);

                
                }else{
                    
                }
             
            } else {
                JOptionPane.showMessageDialog(null, "É preciso ter a senha do administrador para usar esse formulário");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no frmPrincipalVIEW BANCO ADM:" + erro);

        }
        }
    }//GEN-LAST:event_menuAdm2ActionPerformed

    private void menuAdm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdm1ActionPerformed

        String senha3_recebe = JOptionPane.showInputDialog("Digite a senha do administrador");
        
        //se não preencheu os dados retorna mensagem
        if(senha3_recebe.equals("")){
            JOptionPane.showMessageDialog(null, "Insira a senha do administrador para prosseguir");
        }else{
        
        UsuarioDTO objusuariodto = new UsuarioDTO();

        objusuariodto.setSenha_usuario(senha3_recebe);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        //teste de autenticação que me retorna uma variável tipo ResultSet
        ResultSet rusuariodao = objusuariodao.autenticacaoUsuario3Web(objusuariodto);

        try {
            //se tem no bd da web o usuário contiua
            if (rusuariodao.next()) {

                //início do comando que verificar se usuário existe no banco local
                UsuarioDAO objusuariodaoLocal = new UsuarioDAO();
                //teste de autenticação que me retorna uma variável tipo ResultSet
                ResultSet rusuariodaoLocal = objusuariodaoLocal.autenticacaoUsuario3(objusuariodto);
                //variável retorna se o usuário existe no banco local
                if(rusuariodaoLocal.next()){
                
                //AGORA VERIFICADO SE O USUÁRIO CONSTA NO LOCAL E WEB
                //ABRE ESSA JFORM
                frmPesquisaUsuario objpesquisa = new frmPesquisaUsuario();

                objpesquisa.setVisible(true);
                
                }else{
                    
                }

            } else {
                JOptionPane.showMessageDialog(null, "É preciso ter a senha do administrador para usar esse formulário");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no frmPrincipalVIEW USUÁRIO ADM:" + erro);

        }
        }

    }//GEN-LAST:event_menuAdm1ActionPerformed

    private void menuAdm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdm3ActionPerformed

        String senha3_recebe = JOptionPane.showInputDialog("Digite a senha do administrador");

        if(senha3_recebe.equals("")){
            JOptionPane.showMessageDialog(null, "Insira a senha do administrador para prosseguir");
        }else{
        
        UsuarioDTO objusuariodto = new UsuarioDTO();

        objusuariodto.setSenha_usuario(senha3_recebe);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        //teste de autenticação que me retorna uma variável tipo ResultSet
        ResultSet rusuariodao = objusuariodao.autenticacaoUsuario3Web(objusuariodto);

        try {

            if (rusuariodao.next()) {
                
                
                 //início do comando que verificar se usuário existe no banco local
                UsuarioDAO objusuariodaoLocal = new UsuarioDAO();
                //teste de autenticação que me retorna uma variável tipo ResultSet
                ResultSet rusuariodaoLocal = objusuariodaoLocal.autenticacaoUsuario3(objusuariodto);
                //variável retorna se o usuário existe no banco local
                if(rusuariodaoLocal.next()){
                
                //AGORA VERIFICADO SE O USUÁRIO CONSTA NO LOCAL E WEB
                //ABRE ESSA JFORM
                             
                frmTorneios objtorneios = new frmTorneios();
                objtorneios.setVisible(rootPaneCheckingEnabled);
                
                }else{
                    
                }
                


            } else {
                JOptionPane.showMessageDialog(null, "É preciso ter a senha do administrador para usar esse formulário");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no frmPrincipalVIEW TORNEIO ADM:" + erro);

        }

        }//fim do primeiro else
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

        objusuarioview.setVisible(true);

        dispose();


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmLogin objlogin = new frmLogin();
        
        objlogin.btnGoFrmUsuario.setVisible(false);
        
        objlogin.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuList4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuList4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuList4ActionPerformed

    private void menuAjuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjuda1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuAjuda1ActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuAdm;
    private javax.swing.JMenuItem menuAdm1;
    private javax.swing.JMenuItem menuAdm2;
    private javax.swing.JMenuItem menuAdm3;
    private javax.swing.JMenu menuAdm4;
    private javax.swing.JMenuItem menuAdm4Pdate;
    private javax.swing.JMenuItem menuAdm4Puser;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjuda1;
    private javax.swing.JMenu menuList;
    private javax.swing.JMenuItem menuList1;
    private javax.swing.JMenuItem menuList2;
    private javax.swing.JMenuItem menuList3;
    private javax.swing.JMenuItem menuList4;
    private javax.swing.JMenuItem menuList5;
    private javax.swing.JMenu menuOutros;
    private javax.swing.JMenuBar menuTopo;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenuItem menuUser1;
    private javax.swing.JMenu menuUser2;
    private javax.swing.JMenuItem menuUserGra1;
    private javax.swing.JMenuItem menuUserGra2;
    private javax.swing.JMenuItem menuUserGra3;
    private javax.swing.JPanel panelBaixo;
    private javax.swing.JPanel panelMeio;
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
