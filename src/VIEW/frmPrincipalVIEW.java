package VIEW;

import DAO.ConexaoDAO;
import DAO.ContaPokerDAO;
import DAO.UsuarioDAO;
import DTO.BankUserDTO;
import DTO.TournamentsDTO;
import DTO.UsuarioDTO;
import CONTROL.controlUrl;


import java.awt.List;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;

public class frmPrincipalVIEW extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public frmPrincipalVIEW() {
        initComponents();
        
        restaurarDadosComboBoxApppPrincipal();
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
        jButton1 = new javax.swing.JButton();
        cbxContaPrincipal = new javax.swing.JComboBox<>();
        txtTotalContaApp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGanhosConta = new javax.swing.JButton();
        btnPedasConta = new javax.swing.JButton();
        menuTopo = new javax.swing.JMenuBar();
        menuAdm = new javax.swing.JMenu();
        menuAdm1 = new javax.swing.JMenuItem();
        menuAdm2 = new javax.swing.JMenuItem();
        menuAdm3 = new javax.swing.JMenuItem();
        menuAdm4 = new javax.swing.JMenu();
        menuAdm4AppDate = new javax.swing.JMenuItem();
        menuUser = new javax.swing.JMenu();
        menuUser1 = new javax.swing.JMenuItem();
        menuUser2 = new javax.swing.JMenuItem();
        menuUser3 = new javax.swing.JMenu();
        menuUserGra1 = new javax.swing.JMenuItem();
        menuList = new javax.swing.JMenu();
        menuList1 = new javax.swing.JMenuItem();
        menuList2 = new javax.swing.JMenuItem();
        menuList3 = new javax.swing.JMenuItem();
        menuList4 = new javax.swing.JMenuItem();
        menuOutros = new javax.swing.JMenu();
        menuOutros1 = new javax.swing.JMenuItem();
        menuOutros2 = new javax.swing.JMenuItem();
        menuOutros3 = new javax.swing.JMenuItem();
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jButton1.setText("SALDO P/ CONTA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbxContaPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        txtTotalContaApp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTotalContaApp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(63, 149, 255)));
        txtTotalContaApp.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 51));
        jLabel1.setText("RESULTADO :");

        jLabel5.setForeground(new java.awt.Color(63, 149, 255));
        jLabel5.setText("Antes de clicar em SALDO P/ CONTA, selecione um APLICATIVO/CONTA");

        btnGanhosConta.setText("GANHOS P/ CONTA");
        btnGanhosConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGanhosContaActionPerformed(evt);
            }
        });

        btnPedasConta.setText("PERDAS P/ CONTA");
        btnPedasConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedasContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBaixoLayout = new javax.swing.GroupLayout(panelBaixo);
        panelBaixo.setLayout(panelBaixoLayout);
        panelBaixoLayout.setHorizontalGroup(
            panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaixoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaixoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTotalSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelBaixoLayout.createSequentialGroup()
                        .addComponent(txtbemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeRecebe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaixoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBaixoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotalContaApp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaixoLayout.createSequentialGroup()
                        .addComponent(cbxContaPrincipal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPedasConta)
                            .addGroup(panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnGanhosConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cbxContaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGanhosConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedasConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalContaApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
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

        menuAdm4AppDate.setText("POR DATA (APP / USER)");
        menuAdm4AppDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdm4AppDateActionPerformed(evt);
            }
        });
        menuAdm4.add(menuAdm4AppDate);

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

        menuUser2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuUser2.setText("PESQUISA POR DATA");
        menuUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUser2ActionPerformed(evt);
            }
        });
        menuUser.add(menuUser2);

        menuUser3.setText("GRÁFICOS");

        menuUserGra1.setText("POR DATA");
        menuUserGra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserGra1ActionPerformed(evt);
            }
        });
        menuUser3.add(menuUserGra1);

        menuUser.add(menuUser3);

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

        menuTopo.add(menuList);

        menuOutros.setText("OUTROS");
        menuOutros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        menuOutros1.setText("TELA DE LOGIN");
        menuOutros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOutros1ActionPerformed(evt);
            }
        });
        menuOutros.add(menuOutros1);

        menuOutros2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuOutros2.setText("CADASTRO USUÁRIO");
        menuOutros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOutros2ActionPerformed(evt);
            }
        });
        menuOutros.add(menuOutros2);

        menuOutros3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuOutros3.setText("POKERBANK WEB");
        menuOutros3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOutros3ActionPerformed(evt);
            }
        });
        menuOutros.add(menuOutros3);

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

        if (senha3_recebe.equals("")) {

            JOptionPane.showMessageDialog(null, "Insira a senha do administrador para prosseguir");

        } else {

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
                    if (rusuariodaoLocal.next()) {

                        //AGORA VERIFICADO SE O USUÁRIO CONSTA NO LOCAL E WEB
                        //ABRE ESSA JFORM
                        frmBanco objbanco = new frmBanco();
                        objbanco.setVisible(true);

                    } else {

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
        if (senha3_recebe.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira a senha do administrador para prosseguir");
        } else {

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
                    if (rusuariodaoLocal.next()) {

                        //AGORA VERIFICADO SE O USUÁRIO CONSTA NO LOCAL E WEB
                        //ABRE ESSA JFORM
                        frmPesquisaUsuario objpesquisa = new frmPesquisaUsuario();

                        objpesquisa.setVisible(true);

                    } else {

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

        if (senha3_recebe.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira a senha do administrador para prosseguir");
        } else {

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
                    if (rusuariodaoLocal.next()) {

                        //AGORA VERIFICADO SE O USUÁRIO CONSTA NO LOCAL E WEB
                        //ABRE ESSA JFORM
                        frmTorneios objtorneios = new frmTorneios();
                        objtorneios.setVisible(rootPaneCheckingEnabled);

                    } else {

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

    private void menuOutros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOutros2ActionPerformed

        frmUsuarioVIEW objusuarioview = new frmUsuarioVIEW();

        objusuarioview.setVisible(true);

        dispose();


    }//GEN-LAST:event_menuOutros2ActionPerformed

    private void menuOutros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOutros1ActionPerformed
        frmLogin objlogin = new frmLogin();

        objlogin.btnGoFrmUsuario.setVisible(false);

        objlogin.setVisible(true);
        dispose();

    }//GEN-LAST:event_menuOutros1ActionPerformed

    private void menuList4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuList4ActionPerformed

        frmListarSaques objlistasaques = new frmListarSaques();
        objlistasaques.setVisible(true);


    }//GEN-LAST:event_menuList4ActionPerformed

    private void menuAjuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjuda1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuAjuda1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BankUserDTO objbankdto = new BankUserDTO();
        somarValoresContaApp(objbankdto);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGanhosContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGanhosContaActionPerformed
        BankUserDTO objbankdto = new BankUserDTO();
        somarGanhosContaApp(objbankdto);
    }//GEN-LAST:event_btnGanhosContaActionPerformed

    private void btnPedasContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedasContaActionPerformed
        BankUserDTO objbankdto = new BankUserDTO();
        somarPerdasContaApp(objbankdto);
    }//GEN-LAST:event_btnPedasContaActionPerformed

    private void menuUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUser2ActionPerformed
       
        frmListarDatas objlistardatas = new frmListarDatas();
        objlistardatas.setVisible(true);
    }//GEN-LAST:event_menuUser2ActionPerformed

    private void menuAdm4AppDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdm4AppDateActionPerformed
       String senha3_recebe = JOptionPane.showInputDialog("Digite a senha do administrador");

        if (senha3_recebe.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira a senha do administrador para prosseguir");
        } else {

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
                    if (rusuariodaoLocal.next()) {

                        //AGORA VERIFICADO SE O USUÁRIO CONSTA NO LOCAL E WEB
                        //ABRE ESSA JFORM
                        frmGraphicAdm objtorneios = new frmGraphicAdm();
                        objtorneios.setVisible(rootPaneCheckingEnabled);

                    } else {

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "É preciso ter a senha do administrador para usar esse formulário");
                }

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro no frmPrincipalVIEW TORNEIO ADM:" + erro);

            }

        }
    }//GEN-LAST:event_menuAdm4AppDateActionPerformed

    private void menuUserGra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserGra1ActionPerformed
       frmGraphicUser objgraphicuser = new frmGraphicUser();
       objgraphicuser.setVisible(true);
       
    }//GEN-LAST:event_menuUserGra1ActionPerformed

    private void menuOutros3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOutros3ActionPerformed
controlUrl objctrurl = new controlUrl();
objctrurl.open();

    }//GEN-LAST:event_menuOutros3ActionPerformed

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
    private javax.swing.JButton btnGanhosConta;
    private javax.swing.JButton btnPedasConta;
    private javax.swing.JComboBox<String> cbxContaPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu menuAdm;
    private javax.swing.JMenuItem menuAdm1;
    private javax.swing.JMenuItem menuAdm2;
    private javax.swing.JMenuItem menuAdm3;
    private javax.swing.JMenu menuAdm4;
    private javax.swing.JMenuItem menuAdm4AppDate;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjuda1;
    private javax.swing.JMenu menuList;
    private javax.swing.JMenuItem menuList1;
    private javax.swing.JMenuItem menuList2;
    private javax.swing.JMenuItem menuList3;
    private javax.swing.JMenuItem menuList4;
    private javax.swing.JMenu menuOutros;
    private javax.swing.JMenuItem menuOutros1;
    private javax.swing.JMenuItem menuOutros2;
    private javax.swing.JMenuItem menuOutros3;
    private javax.swing.JMenuBar menuTopo;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenuItem menuUser1;
    private javax.swing.JMenuItem menuUser2;
    private javax.swing.JMenu menuUser3;
    private javax.swing.JMenuItem menuUserGra1;
    private javax.swing.JPanel panelBaixo;
    private javax.swing.JPanel panelMeio;
    public javax.swing.JLabel txtNomeRecebe;
    private javax.swing.JTextField txtTotalContaApp;
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
    
       public void restaurarDadosComboBoxApppPrincipal() {
        //Vetor usado para passar dois valores para comboBox
        Vector<Integer> idPoker = new Vector<Integer>();

        try {

            cbxContaPrincipal.removeAllItems();
            cbxContaPrincipal.addItem("Selecione");

            ContaPokerDAO objcontapokerdao = new ContaPokerDAO();
            ResultSet rs = objcontapokerdao.listarAppCombo();

            while (rs.next()) {

                idPoker.addElement(rs.getInt(1));//o elemento faz parte do Vector, e também é importante pois será chave estrangeira
                //concatenei o id mais o valor da coluna selecionada no banco de dados na visualização do usuário
                //também usei o método do Vetor id_contapoker que me retorna o valor somente do último elemento, e não de todo valor
                cbxContaPrincipal.addItem(idPoker.lastElement() + rs.getString(2));// o Item é o que aparece para usuário visualizar

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "frmTorneios comboBoxApp: " + erro);

        }

    }
       
    //instanciando e criando o objeto dessa classe   
    ConexaoDAO objconndao = new ConexaoDAO();
    //variável usada no método somarValoresContaApp
    public int somaSaldoContaApp, part1_soma_app, part2_soma_app, somaGanhosContaApp, somaPerdasContaApp;
    
    private void somarValoresContaApp(BankUserDTO objbankdto){
        
        //pegando o item selecionado na comboBox e passando para uma variável
        int id_conta_app = cbxContaPrincipal.getSelectedIndex();
        
        //setando esse valor na DTO
        objbankdto.setApp_id_bank(id_conta_app);
        
        
        if(id_conta_app==3){
            
            
            //SOMANDO PARTE 1
              String sql1 = "SELECT SUM(saldo_bank) AS Total FROM tablebankuser WHERE fk_app_id_bank = 1";
        
               //conectando ao banco
               // tem que usar o new para criar essa NOVA CONEXÃO, e por instanciar outra classe
               conn = new ConexaoDAO().conectaBD();
            
            try {
            
                 //armezando a string
                 pstm = conn.prepareStatement(sql1);
                 //a variável tipo ResultSet RECEBE o resultado do comando SQL executado
                 rs = pstm.executeQuery();
                                             
                //pegando o retorno e comparando se ele volta vazio do que foi pedido
              if(rs.next()){
                //pegando o inteiro que retorna do resultado da soma feita pela sql
                part1_soma_app = rs.getInt(1);
              
               }else{
                //mensagem caso haja erro
                JOptionPane.showMessageDialog(null, "Erro na soma do saldo das Contas no frmpPrincipalVIEW");
                
                    }
         
              
             }catch(SQLException erro){
            //tratamento de exceção(erro)
             JOptionPane.showMessageDialog(null, "frmPrincipalVIEW método somarValoresContaApp: " + erro);
            
                 }           
                 //FIM SOMA PARTE 1
              
              //SOMA PARTE 2
              String sql2 = "SELECT SUM(saldo_bank) AS Total FROM tablebankuser WHERE fk_app_id_bank = 2";
              
              conn = new ConexaoDAO().conectaBD();
              
              try{
                  
                  pstm = conn.prepareStatement(sql2);
                  rs = pstm.executeQuery();
                  
                   if(rs.next()){
                        part2_soma_app = rs.getInt(1);
                   }else{
                       JOptionPane.showMessageDialog(null, "Erro na soma do saldo das Contas no frmpPrincipalVIEW");
                   }
                  
                  
              }catch(SQLException erro){
                  
                   JOptionPane.showMessageDialog(null, "frmPrincipalVIEW método somarValoresContaApp: " + erro);
              }
            
            //FIM DA SOMA PARTE 2
            
            somaSaldoContaApp = part1_soma_app + part2_soma_app;
            String imp_result_soma = String.valueOf(somaSaldoContaApp);
            
            txtTotalContaApp.setText(imp_result_soma);
            
            
             }else{
            
               //string para o sql
               String sql = "SELECT SUM(saldo_bank) AS Total FROM tablebankuser WHERE fk_app_id_bank = ?";
        
               //conectando ao banco
               conn = new ConexaoDAO().conectaBD();
            
            try {
            
                 //armezando a string
                 pstm = conn.prepareStatement(sql);
                 //usando a string no comando sql que vai ser executado
                 pstm.setInt(1, objbankdto.getApp_id_bank());
                 //executando todo esses comandos
                 //a variável tipo ResultSet RECEBE o resultado do comando SQL executado
                 rs = pstm.executeQuery();
            
                //pegando o retorno e comparando se ele volta vazio do que foi pedido
              if(rs.next()){
                //pegando o inteiro que retorna do resultado da soma feita pela sql
                somaSaldoContaApp = rs.getInt(1);
                //convertendo em string e passando para uma variável
                String resultadoSaldoConta = String.valueOf(somaSaldoContaApp);
                //imprimindo ele na TexField
                txtTotalContaApp.setText(resultadoSaldoConta);
                
                //deixando a comboBox com o valor Selecione
                cbxContaPrincipal.getModel().setSelectedItem("Selecione");
                
               }else{
                //mensagem caso haja erro
                JOptionPane.showMessageDialog(null, "Erro na soma do saldo das Contas no frmpPrincipalVIEW");
                
                    }
             }catch(SQLException erro){
            //tratamento de exceção(erro)
             JOptionPane.showMessageDialog(null, "frmPrincipalVIEW método somarValoresContaApp: " + erro);
            
                 }
        }  
            
    }   
       
    private void somarGanhosContaApp(BankUserDTO objbankuserdto){
        
         //pegando o item selecionado na comboBox e passando para uma variável
        int id_conta_app = cbxContaPrincipal.getSelectedIndex();
        
        //setando esse valor na DTO
        objbankuserdto.setApp_id_bank(id_conta_app);
        
        
               //string para o sql
               String sql5 = "SELECT SUM(ganho_bank) AS Total FROM tablebankuser WHERE fk_app_id_bank = ?";
        
               //conectando ao banco
               conn = new ConexaoDAO().conectaBD();
               
               
                     try {
            
                 //armezando a string
                 pstm = conn.prepareStatement(sql5);
                 //usando a string no comando sql que vai ser executado
                 pstm.setInt(1, objbankuserdto.getApp_id_bank());
                 //executando todo esses comandos
                 //a variável tipo ResultSet RECEBE o resultado do comando SQL executado
                 rs = pstm.executeQuery();
            
                //pegando o retorno e comparando se ele volta vazio do que foi pedido
              if(rs.next()){
                //pegando o inteiro que retorna do resultado da soma feita pela sql
                somaGanhosContaApp = rs.getInt(1);
                //convertendo em string e passando para uma variável
                String resultadoGanhosConta = String.valueOf(somaGanhosContaApp);
                //imprimindo ele na TexField
                txtTotalContaApp.setText(resultadoGanhosConta);
                
                //deixando a comboBox com o valor Selecione
                cbxContaPrincipal.getModel().setSelectedItem("Selecione");
                
               }else{
                //mensagem caso haja erro
                JOptionPane.showMessageDialog(null, "Erro na soma dos ganhos das Contas no frmpPrincipalVIEW");
                
                    }
             }catch(SQLException erro){
            //tratamento de exceção(erro)
             JOptionPane.showMessageDialog(null, "frmPrincipalVIEW método somarGanhosContaApp: " + erro);
            
                 }
               
    }
    
    private void somarPerdasContaApp(BankUserDTO objbankuserdto){
        
         //pegando o item selecionado na comboBox e passando para uma variável
        int id_conta_app = cbxContaPrincipal.getSelectedIndex();
        
        //setando esse valor na DTO
        objbankuserdto.setApp_id_bank(id_conta_app);
        
        
               //string para o sql
               String sql6 = "SELECT SUM(perda_bank) AS Total FROM tablebankuser WHERE fk_app_id_bank = ?";
        
               //conectando ao banco
               conn = new ConexaoDAO().conectaBD();
               
               
                     try {
            
                 //armezando a string
                 pstm = conn.prepareStatement(sql6);
                 //usando a string no comando sql que vai ser executado
                 pstm.setInt(1, objbankuserdto.getApp_id_bank());
                 //executando todo esses comandos
                 //a variável tipo ResultSet RECEBE o resultado do comando SQL executado
                 rs = pstm.executeQuery();
            
                //pegando o retorno e comparando se ele volta vazio do que foi pedido
              if(rs.next()){
                //pegando o inteiro que retorna do resultado da soma feita pela sql
                somaPerdasContaApp = rs.getInt(1);
                //convertendo em string e passando para uma variável
                String resultadoPerdasConta = String.valueOf(somaPerdasContaApp);
                //imprimindo ele na TexField
                txtTotalContaApp.setText(resultadoPerdasConta);
                
                //deixando a comboBox com o valor Selecione
                cbxContaPrincipal.getModel().setSelectedItem("Selecione");
                
               }else{
                //mensagem caso haja erro
                JOptionPane.showMessageDialog(null, "Erro na soma das perdas das Contas no frmpPrincipalVIEW");
                
                    }
             }catch(SQLException erro){
            //tratamento de exceção(erro)
             JOptionPane.showMessageDialog(null, "frmPrincipalVIEW método somarPerdasContaApp: " + erro);
            
                 }
               
    }
    
}
