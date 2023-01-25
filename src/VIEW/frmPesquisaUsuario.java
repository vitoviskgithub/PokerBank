package VIEW;

import DAO.ContaPokerDAO;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.Vector;

public class frmPesquisaUsuario extends javax.swing.JFrame {

    //inicializador da classe, QUANDO ARBRIR A TELA O QUE ACONTECERÁ
    public frmPesquisaUsuario() {
        initComponents();

        listarValoresUsuario();//método 
        restaurarDadosComboBoxContaPoker();//método para comboBox

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        btnCarregarCampos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeTable = new javax.swing.JTextField();
        txtSenhaTable = new javax.swing.JTextField();
        txtEmailTable = new javax.swing.JTextField();
        txtTelefoneTable = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdTable = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrarUser = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbxContaPoker = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnContas = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtAtivo = new javax.swing.JTextField();
        btnFehcar = new javax.swing.JButton();
        btnBanco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null,null,null},
                {null, null, null, null, null,null,null},
                {null, null, null, null, null,null,null},
                {null, null, null, null, null,null,null}
            },
            new String [] {
                "ID", "NOME", "EMAIL", "TELEFONE", "SENHA", "CONTA_POKER", "ATIVO"
            }
        ));
        jScrollPane1.setViewportView(tabelaUsuario);
        tabelaUsuario.getAccessibleContext().setAccessibleDescription("");

        btnCarregarCampos.setText("CARREGAR CAMPOS");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Tabela de informações do Usuário");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("NOME");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("EMAIL");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("TELEFONE");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("SENHA");

        txtNomeTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtSenhaTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtEmailTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtTelefoneTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("ID:");

        txtIdTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIdTable.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Selecione o campo na tabela e carregue, antes de Cadastrar ou Excluir ou Voltar");

        btnAlterar.setText("ALTERAR INFORMAÇÕES");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCadastrarUser.setText("CADASTRAR");
        btnCadastrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUserActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("CONTA POKER");

        cbxContaPoker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("SELECIONE sua CONTA POKER antes de CADASTRAR ou ALTERAR");

        btnContas.setText("CONTAS ");
        btnContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContasActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("ATIVO : ");

        txtAtivo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnFehcar.setText("FECHAR");
        btnFehcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFehcarActionPerformed(evt);
            }
        });

        btnBanco.setText("BANCO");
        btnBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrarUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarregarCampos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbxContaPoker, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txtNomeTable, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addGap(2, 2, 2)
                                    .addComponent(txtIdTable, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmailTable, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaTable)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTelefoneTable)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnLimpar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAlterar))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFehcar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(txtIdTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(btnFehcar))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenhaTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbxContaPoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterar)
                            .addComponent(btnLimpar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarCampos)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir)
                    .addComponent(btnCadastrarUser)
                    .addComponent(btnContas)
                    .addComponent(btnBanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed

        CarregarCampos();//método interno
        listarValoresUsuario();//método 

    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        //comparando se os campos estão vazios
        if (txtIdTable.getText().equals("")
                || txtNomeTable.getText().equals("")
                || txtEmailTable.getText().equals("")
                || txtTelefoneTable.getText().equals("")
                || txtAtivo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Há algum campo vazio, preencha para atlerar as inforamções");
        } else {
            AlterarUsuario();//altera
            listarValoresUsuario();//carrega no visual da tabela
            LimparCampos();
        }


    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        LimparCampos();

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        ExcluirUsuario();
        listarValoresUsuario();
        LimparCampos();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUserActionPerformed

        if (txtNomeTable.getText().equals("")
                || txtEmailTable.getText().equals("")
                || txtTelefoneTable.getText().equals("")
                || txtAtivo.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha antes de cadastrar");
        } else {

            CadastrarUsuario();

            String nomeResp = txtNomeTable.getText();
            JOptionPane.showMessageDialog(null, nomeResp + " se cadastrou no banco de dados");

            listarValoresUsuario();
            LimparCampos();
        }

    }//GEN-LAST:event_btnCadastrarUserActionPerformed

    private void btnContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContasActionPerformed

        frmContaPokerVIEW objcontapoker = new frmContaPokerVIEW();
        objcontapoker.setVisible(true);


    }//GEN-LAST:event_btnContasActionPerformed

    private void btnFehcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFehcarActionPerformed
        dispose();
    }//GEN-LAST:event_btnFehcarActionPerformed

    private void btnBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBancoActionPerformed
        frmBanco objbanco = new frmBanco();
        objbanco.setVisible(true);

    }//GEN-LAST:event_btnBancoActionPerformed

    public static void main(String args[]) {

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
                new frmPesquisaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBanco;
    private javax.swing.JButton btnCadastrarUser;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnContas;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFehcar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxContaPoker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField txtAtivo;
    private javax.swing.JTextField txtEmailTable;
    private javax.swing.JTextField txtIdTable;
    private javax.swing.JTextField txtNomeTable;
    private javax.swing.JTextField txtSenhaTable;
    private javax.swing.JTextField txtTelefoneTable;
    // End of variables declaration//GEN-END:variables

    private void listarValoresUsuario() {

        try {

            UsuarioDAO objusuariodao = new UsuarioDAO();//instanciando a classe

//montar esse modo de tabela no Array tabelaUsuario
            DefaultTableModel model = (DefaultTableModel) tabelaUsuario.getModel();
            model.setNumRows(0);

//pega as informações da DAO e monta o ArrayList lista
            ArrayList<UsuarioDTO> lista = objusuariodao.PesquisarUsuario();

//estrutura de repetição for (inicia, até onde vai, acrescentando)
            for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                model.addRow(new Object[]{
                    lista.get(num).getId_usuario(),
                    lista.get(num).getNome_usuario(),
                    lista.get(num).getEmail_usuario(),
                    lista.get(num).getTelefone_usuario(),
                    lista.get(num).getSenha_usuario(),
                    lista.get(num).getCod_contapoker(),
                    lista.get(num).getUsuario_ativo()
                });
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Listar Valores VIEW: " + erro);

        }

    }

    private void CarregarCampos() {

        int setar = tabelaUsuario.getSelectedRow();//serve para designar a linha que será setada, através da seleção feita pelo usuário

//pegar um campo de texto e setando = qual o texto? -> pegar do modelo da tabela, pegando o valor
//o getValue pega qual a linha e qual a coluna
//pega na tabela e seta no campo
        txtIdTable.setText(tabelaUsuario.getModel().getValueAt(setar, 0).toString());
        txtNomeTable.setText(tabelaUsuario.getModel().getValueAt(setar, 1).toString());
        txtEmailTable.setText(tabelaUsuario.getModel().getValueAt(setar, 2).toString());
        txtTelefoneTable.setText(tabelaUsuario.getModel().getValueAt(setar, 3).toString());
        txtSenhaTable.setText(tabelaUsuario.getModel().getValueAt(setar, 4).toString());
        cbxContaPoker.getModel().setSelectedItem(tabelaUsuario.getModel().getValueAt(setar, 5).toString());//MOSTRANDO O VALOR NA COMBOBOX
        txtAtivo.setText(tabelaUsuario.getModel().getValueAt(setar, 6).toString());

    }

    private void AlterarUsuario() {
        int id_usuario, cod_contapk;
        String nome_usuario, email_usuario, telefone_usuario, senha_usuario, usuario_ativo;

        id_usuario = Integer.parseInt(txtIdTable.getText());//o método Integer.parseInt() pega o conteúdo texto e converte para inteiro
        cod_contapk = id_contapoker.get(cbxContaPoker.getSelectedIndex() - 1);// id_contapoker é um VETOR declarado
        nome_usuario = txtNomeTable.getText();
        email_usuario = txtEmailTable.getText();
        telefone_usuario = txtTelefoneTable.getText();
        senha_usuario = txtSenhaTable.getText();
        usuario_ativo = txtAtivo.getText();

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

    private void LimparCampos() {

        txtIdTable.setText("");
        txtNomeTable.setText("");
        txtEmailTable.setText("");
        txtTelefoneTable.setText("");
        txtSenhaTable.setText("");
        cbxContaPoker.getModel().setSelectedItem("Selecione");
        txtAtivo.setText("");

    }

    private void ExcluirUsuario() {
        int id_usuario;

        id_usuario = Integer.parseInt(txtIdTable.getText());

        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setId_usuario(id_usuario);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.excluirUsuario(objusuariodto);

    }

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

    private void CadastrarUsuario() {

        String nome, email, telefone, senha, usuario_ativo;
        //declarando variável
        int codcontapk;

        nome = txtNomeTable.getText();
        email = txtEmailTable.getText();
        telefone = txtTelefoneTable.getText();
        senha = txtSenhaTable.getText();
        usuario_ativo = txtAtivo.getText();
        //pegando valor e armazenando na variável para passar para DTO
        codcontapk = id_contapoker.get(cbxContaPoker.getSelectedIndex() - 1);// IMPORTANTÍSSIMO : getSelected -1 é o elemento selecionado

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

}
