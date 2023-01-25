package VIEW;

import DAO.ContaPokerDAO;
import DTO.ContaPokerDTO;
import VIEW.frmPrincipalVIEW;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmContaPokerVIEW extends javax.swing.JFrame {

    public frmContaPokerVIEW() {
        initComponents();

        listarContaPoker();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdContaPoker = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAppContaPoker = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUserContaPoker = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableValoresContaPoker = new javax.swing.JTable();
        btnCarregar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnLoginBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ID  ");

        txtIdContaPoker.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIdContaPoker.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("APLICATIVO");

        txtAppContaPoker.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("USUÁRIO DO APLICATIVO");

        txtUserContaPoker.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tableValoresContaPoker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "APLICATIVO", "USER",
            }
        ));
        jScrollPane1.setViewportView(tableValoresContaPoker);

        btnCarregar.setText("CARREGAR");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

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

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Selecione o campo que deseja carregar na tabela, antes de cadastrar ou excluir");

        btnLoginBack.setText("LOGIN");
        btnLoginBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginBackActionPerformed(evt);
            }
        });

        jButton1.setText("FECHAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAppContaPoker, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(txtIdContaPoker, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUserContaPoker, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoginBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarregar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdContaPoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtAppContaPoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserContaPoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCadastrar)
                    .addComponent(btnSair)
                    .addComponent(btnLoginBack)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        //comparando se os campos estão vazios
        if (txtIdContaPoker.getText().equals("")
                || txtAppContaPoker.getText().equals("")
                || txtUserContaPoker.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Há algum campo vazio, preencha para atlerar as inforamções");
        } else {
            AlterarContaPoker();//altera
            listarContaPoker();//carrega no visual da tabela
            LimparCampos();
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed

        CarregarCampos();
        listarContaPoker();

    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        ExcluirContaPoker();
        listarContaPoker();
        LimparCampos();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        CadastrarContaPoker();
        listarContaPoker();
        LimparCampos();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLoginBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginBackActionPerformed

        frmLogin objloginback = new frmLogin();

        objloginback.btnGoFrmUsuario.setVisible(false);

        objloginback.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnLoginBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new frmContaPokerVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLoginBack;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableValoresContaPoker;
    private javax.swing.JTextField txtAppContaPoker;
    private javax.swing.JTextField txtIdContaPoker;
    private javax.swing.JTextField txtUserContaPoker;
    // End of variables declaration//GEN-END:variables

    private void LimparCampos() {

        txtIdContaPoker.setText("");
        txtAppContaPoker.setText("");
        txtUserContaPoker.setText("");

    }

    private void CadastrarContaPoker() {

        String app, user;

        app = txtAppContaPoker.getText();
        user = txtUserContaPoker.getText();

//setando os valores dos campos da VIEW para a DTO
        ContaPokerDTO objcontapokerdto = new ContaPokerDTO();
        objcontapokerdto.setApp_contapoker(app);
        objcontapokerdto.setUser_contapoker(user);

//acessando o método cadastroUsuario na DAO
        ContaPokerDAO objpokerdao = new ContaPokerDAO();
        objpokerdao.cadastrarContaPoker(objcontapokerdto);//passando as informações da DTO para o método

    }

    private void listarContaPoker() {

        try {

            ContaPokerDAO objcontapokerdao = new ContaPokerDAO();//instanciando a classe

//montar esse modo de tabela no Array tabelaUsuario
            DefaultTableModel model = (DefaultTableModel) tableValoresContaPoker.getModel();
            model.setNumRows(0);

//pega as informações da DAO e monta o ArrayList lista
            ArrayList<ContaPokerDTO> lista = objcontapokerdao.PesquisarContaPoker();

//estrutura de repetição for (inicia, até onde vai, acrescentando)
            for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                model.addRow(new Object[]{
                    lista.get(num).getId_contapoker(),
                    lista.get(num).getApp_contapoker(),
                    lista.get(num).getUser_contapoker()
                });
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Listar Valores ContaPoker VIEW: " + erro);

        }

    }

    private void CarregarCampos() {

        int setar = tableValoresContaPoker.getSelectedRow();//serve para designar a linha que será setada, através da seleção feita pelo usuário

//pegar um campo de texto e setando = qual o texto? -> pegar do modelo da tabela, pegando o valor
//o getValue pega qual a linha e qual a coluna
//pega na tabela e seta no campo
        txtIdContaPoker.setText(tableValoresContaPoker.getModel().getValueAt(setar, 0).toString());
        txtAppContaPoker.setText(tableValoresContaPoker.getModel().getValueAt(setar, 1).toString());
        txtUserContaPoker.setText(tableValoresContaPoker.getModel().getValueAt(setar, 2).toString());

    }

    private void AlterarContaPoker() {
        int id_contapoker;
        String app_contapoker, user_contapoker;

        id_contapoker = Integer.parseInt(txtIdContaPoker.getText());//o método Integer.parseInt() pega o conteúdo texto e converte para inteiro
        app_contapoker = txtAppContaPoker.getText();
        user_contapoker = txtUserContaPoker.getText();

//mesmo que o usuário digite algum valor nos campos TextField, esse valores serão setados na DTO
        ContaPokerDTO objcontapokerdto = new ContaPokerDTO();
        objcontapokerdto.setId_contapoker(id_contapoker);
        objcontapokerdto.setApp_contapoker(app_contapoker);
        objcontapokerdto.setUser_contapoker(user_contapoker);

//instanciando a classe DAO
        ContaPokerDAO objcontapokerdao = new ContaPokerDAO();
        objcontapokerdao.alterarContaPoker(objcontapokerdto);

    }

    private void ExcluirContaPoker() {
        int id_contapoker;

        id_contapoker = Integer.parseInt(txtIdContaPoker.getText());

        ContaPokerDTO objpokerdto = new ContaPokerDTO();
        objpokerdto.setId_contapoker(id_contapoker);

        ContaPokerDAO objusuariodao = new ContaPokerDAO();
        objusuariodao.excluirContaPoker(objpokerdto);

    }

}
