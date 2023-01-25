package VIEW;

import DAO.ContaPokerDAO;
import DAO.TorneiosDAO;
import DAO.UsuarioDAO;
import DTO.TournamentsDTO;
import DTO.UsuarioDTO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;
import java.util.Vector;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class frmTorneios extends javax.swing.JFrame {

    public frmTorneios() {
        initComponents();

        listarValoresTorneio();
        restaurarDadosComboBoxAppTourn();
        restaurarDadosComboBoxUserTourn();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTypeTourn = new javax.swing.JTextField();
        txtValBuyinTourn = new javax.swing.JTextField();
        txtValTourItm = new javax.swing.JTextField();
        txtCodTourn = new javax.swing.JTextField();
        btnRegistrarTourn = new javax.swing.JButton();
        btnAlterarTourn = new javax.swing.JButton();
        btnLimparTourn = new javax.swing.JButton();
        btnExcluirTourn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTourn = new javax.swing.JTable();
        btnCarregarTourn = new javax.swing.JButton();
        btSairTourn = new javax.swing.JButton();
        btnBanco = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btnListarPerdas = new javax.swing.JButton();
        btnListarGanhos = new javax.swing.JButton();
        btnListarTroneios = new javax.swing.JButton();
        cbxAppTourn = new javax.swing.JComboBox<>();
        cbxUsuarioTourn = new javax.swing.JComboBox<>();
        btnUsuarios = new javax.swing.JButton();
        jcaDataTourn = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("TORNEIOS");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Tipo do torneio :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Aplicativo :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Usuário : ");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Valor ITM :");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Valor buy in :");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Data : ");

        txtTypeTourn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtValBuyinTourn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtValTourItm.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtCodTourn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCodTourn.setEnabled(false);

        btnRegistrarTourn.setText("REGISTRAR");
        btnRegistrarTourn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTournActionPerformed(evt);
            }
        });

        btnAlterarTourn.setText("ALTERAR");
        btnAlterarTourn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarTournActionPerformed(evt);
            }
        });

        btnLimparTourn.setText("LIMPAR");
        btnLimparTourn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTournActionPerformed(evt);
            }
        });

        btnExcluirTourn.setText("EXCLUIR");
        btnExcluirTourn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTournActionPerformed(evt);
            }
        });

        tableTourn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "TORNEIO", "APLICATIVO", "USUÁRIO", "BUY IN", "ITM", "DATA"
            }
        ));
        jScrollPane1.setViewportView(tableTourn);

        btnCarregarTourn.setText("CARREGAR CAMPOS");
        btnCarregarTourn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarTournActionPerformed(evt);
            }
        });

        btSairTourn.setText("SAIR");
        btSairTourn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairTournActionPerformed(evt);
            }
        });

        btnBanco.setText("BANCO");
        btnBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBancoActionPerformed(evt);
            }
        });

        btFechar.setText("FECHAR");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btnListarPerdas.setText("LISTAR PERDAS");
        btnListarPerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPerdasActionPerformed(evt);
            }
        });

        btnListarGanhos.setText("LISTAR GANHOS");
        btnListarGanhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarGanhosActionPerformed(evt);
            }
        });

        btnListarTroneios.setText("LISTAR TORNEIOS");
        btnListarTroneios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTroneiosActionPerformed(evt);
            }
        });

        cbxAppTourn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        cbxUsuarioTourn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        btnUsuarios.setText("USUÁRIOS");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(7, 7, 7)
                                .addComponent(txtTypeTourn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxAppTourn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxUsuarioTourn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValTourItm)
                                    .addComponent(txtValBuyinTourn, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(1, 1, 1)
                                .addComponent(jcaDataTourn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btFechar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtCodTourn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparTourn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirTourn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarTourn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarTourn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCarregarTourn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btSairTourn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarTroneios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarPerdas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarGanhos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btFechar)
                    .addComponent(btnUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txtTypeTourn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValBuyinTourn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtValTourItm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxAppTourn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel9)
                        .addComponent(cbxUsuarioTourn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcaDataTourn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodTourn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparTourn)
                    .addComponent(btnRegistrarTourn)
                    .addComponent(btnCarregarTourn)
                    .addComponent(btnExcluirTourn)
                    .addComponent(btnAlterarTourn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarPerdas)
                    .addComponent(btnListarGanhos)
                    .addComponent(btnListarTroneios)
                    .addComponent(btnBanco)
                    .addComponent(btSairTourn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarTournActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTournActionPerformed
        int teste;
        teste = cbxAppTourn.getSelectedIndex();
        int teste1 = cbxUsuarioTourn.getSelectedIndex();
        // se não selecionar nada na combobox o valor é -1

        if (txtTypeTourn.getText().equals("")
                || teste == -1
                || teste1 == -1
                || txtValBuyinTourn.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha antes de registrar");
        } else {

            CadastrarTorneio();
            listarValoresTorneio();
            LimparCamposTorneio();

        }

    }//GEN-LAST:event_btnRegistrarTournActionPerformed

    private void btnAlterarTournActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarTournActionPerformed

        int teste;
        teste = cbxAppTourn.getSelectedIndex();
        int teste1 = cbxUsuarioTourn.getSelectedIndex();
        //se não selecionar nada na comboBox o valor é -1

        //comparando se os campos estão vazios
        if (txtCodTourn.getText().equals("")
                || teste == -1
                || teste1 == -1
                || txtTypeTourn.getText().equals("")
                || txtValBuyinTourn.getText().equals("")
                || txtValTourItm.getText().equals("")
                || jcaDataTourn.getDate().equals("")) {
            JOptionPane.showMessageDialog(null, "Há algum campo vazio, preencha para atlerar as inforamções");
        } else {

            AlterarTorneio();//altera
            listarValoresTorneio();//carrega no visual da tabela
            LimparCamposTorneio();

        }


    }//GEN-LAST:event_btnAlterarTournActionPerformed

    private void btnExcluirTournActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTournActionPerformed
        ExcluirTorneio();
        listarValoresTorneio();
        LimparCamposTorneio();

    }//GEN-LAST:event_btnExcluirTournActionPerformed

    private void btnLimparTournActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTournActionPerformed
        LimparCamposTorneio();

    }//GEN-LAST:event_btnLimparTournActionPerformed

    private void btnCarregarTournActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarTournActionPerformed
        CarregarCamposTorneio();
        listarValoresTorneio();

    }//GEN-LAST:event_btnCarregarTournActionPerformed

    private void btSairTournActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairTournActionPerformed

        System.exit(0);

    }//GEN-LAST:event_btSairTournActionPerformed

    private void btnBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBancoActionPerformed

        frmBanco objbanco = new frmBanco();
        objbanco.setVisible(true);

    }//GEN-LAST:event_btnBancoActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btnListarTroneiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTroneiosActionPerformed

        frmListaTourn objlistatourn = new frmListaTourn();
        //ver o JForm
        objlistatourn.setVisible(true);
    }//GEN-LAST:event_btnListarTroneiosActionPerformed

    private void btnListarGanhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarGanhosActionPerformed
        frmListarGanhos objlistaganho = new frmListarGanhos();
        objlistaganho.setVisible(true);

    }//GEN-LAST:event_btnListarGanhosActionPerformed

    private void btnListarPerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPerdasActionPerformed
        frmListarPerdas objlistaperdas = new frmListarPerdas();
        objlistaperdas.setVisible(true);

    }//GEN-LAST:event_btnListarPerdasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed

        frmPesquisaUsuario objpesquisa = new frmPesquisaUsuario();

        objpesquisa.setVisible(true);

    }//GEN-LAST:event_btnUsuariosActionPerformed

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
                new frmTorneios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btSairTourn;
    private javax.swing.JButton btnAlterarTourn;
    private javax.swing.JButton btnBanco;
    private javax.swing.JButton btnCarregarTourn;
    private javax.swing.JButton btnExcluirTourn;
    private javax.swing.JButton btnLimparTourn;
    private javax.swing.JButton btnListarGanhos;
    private javax.swing.JButton btnListarPerdas;
    private javax.swing.JButton btnListarTroneios;
    private javax.swing.JButton btnRegistrarTourn;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JComboBox<String> cbxAppTourn;
    private javax.swing.JComboBox<String> cbxUsuarioTourn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jcaDataTourn;
    private javax.swing.JTable tableTourn;
    private javax.swing.JTextField txtCodTourn;
    private javax.swing.JTextField txtTypeTourn;
    private javax.swing.JTextField txtValBuyinTourn;
    private javax.swing.JTextField txtValTourItm;
    // End of variables declaration//GEN-END:variables

    private void CadastrarTorneio() {

        int app_tourn, usuario_tourn, val_buyin_tourn, val_itm_tourn, codigo_tourn;
        String tipo_tourn;
        Date data_tourn = new Date();

        tipo_tourn = txtTypeTourn.getText();

        //NÃO precisar USAR O VETOR para selecionar da combobox e passar para o SQL
        //Usar o Vetor para mostar na ComboBox dois valores é necessário, mas para passar um valor não
        app_tourn = cbxAppTourn.getSelectedIndex();
        usuario_tourn = cbxUsuarioTourn.getSelectedIndex();

        val_buyin_tourn = Integer.parseInt(txtValBuyinTourn.getText());//corrigir pois é inteiro
        val_itm_tourn = Integer.parseInt(txtValTourItm.getText());
        data_tourn = jcaDataTourn.getDate();

        //setando os valores dos campos da VIEW para a DTO
        TournamentsDTO objtorunamentsdto = new TournamentsDTO();

        objtorunamentsdto.setType_tourn(tipo_tourn);
        objtorunamentsdto.setApp_id_tourn(app_tourn);
        objtorunamentsdto.setId_user_tourn(usuario_tourn);
        objtorunamentsdto.setValue_tourn(val_buyin_tourn);
        objtorunamentsdto.setItm_val_tourn(val_itm_tourn);
        objtorunamentsdto.setDate_tourn(data_tourn);

        //acessando o método cadastroUsuario na DAO
        TorneiosDAO objtorneiosdao = new TorneiosDAO();
        objtorneiosdao.cadastrarTorneioDAO(objtorunamentsdto);//passando as informações da DTO para o método

    }

    private void ExcluirTorneio() {
        int codigo_tourn;

        codigo_tourn = Integer.parseInt(txtCodTourn.getText());

        TournamentsDTO objtournamentsdto = new TournamentsDTO();
        objtournamentsdto.setId_tourn(codigo_tourn);

        TorneiosDAO objtorneiosdao = new TorneiosDAO();
        objtorneiosdao.excluirTorneioDAO(objtournamentsdto);

    }

    private void AlterarTorneio() {

        String tipo_tourn;
        Date data_tourn = new Date();
        //declarando variável
        int val_buyin_tourn, val_itm_tourn, codigo_tourn, app_tourn, usuario_tourn;

        codigo_tourn = Integer.parseInt(txtCodTourn.getText());
        tipo_tourn = txtTypeTourn.getText();

        //NÃO precisar USAR O VETOR para selecionar da combobox e passar para o SQL
        //Usar o Vetor para mostar na ComboBox dois valores é necessário, mas para passar um valor não
        app_tourn = cbxAppTourn.getSelectedIndex();
        usuario_tourn = cbxUsuarioTourn.getSelectedIndex();

        val_buyin_tourn = Integer.parseInt(txtValBuyinTourn.getText());//corrigir pois é inteiro
        val_itm_tourn = Integer.parseInt(txtValTourItm.getText());
        data_tourn = jcaDataTourn.getDate();

//setando os valores dos campos da VIEW para a DTO
        TournamentsDTO objtorunamentsdto = new TournamentsDTO();
        objtorunamentsdto.setId_tourn(codigo_tourn);
        objtorunamentsdto.setType_tourn(tipo_tourn);
        objtorunamentsdto.setApp_id_tourn(app_tourn);
        objtorunamentsdto.setId_user_tourn(usuario_tourn);
        objtorunamentsdto.setValue_tourn(val_buyin_tourn);
        objtorunamentsdto.setItm_val_tourn(val_itm_tourn);
        objtorunamentsdto.setDate_tourn(data_tourn);

        //acessando o método cadastroUsuario na DAO
        TorneiosDAO objtorneiosdao = new TorneiosDAO();
        objtorneiosdao.alterarTorneioDAO(objtorunamentsdto);//passando as informações da DTO para o método

    }

    private void CarregarCamposTorneio() {

        int setar = tableTourn.getSelectedRow();//serve para designar a linha que será setada, através da seleção feita pelo usuário

//pegar um campo de texto e setando = qual o texto? -> pegar do modelo da tabela, pegando o valor
//o getValue pega qual a linha e qual a coluna
//pega na tabela e seta no campo
        txtCodTourn.setText(tableTourn.getModel().getValueAt(setar, 0).toString());
        txtTypeTourn.setText(tableTourn.getModel().getValueAt(setar, 1).toString());
        cbxAppTourn.getModel().setSelectedItem(tableTourn.getModel().getValueAt(setar, 2).toString());
        cbxUsuarioTourn.getModel().setSelectedItem(tableTourn.getModel().getValueAt(setar, 3).toString());
        txtValBuyinTourn.setText(tableTourn.getModel().getValueAt(setar, 4).toString());
        txtValTourItm.setText(tableTourn.getModel().getValueAt(setar, 5).toString());//MOSTRANDO O VALOR NA COMBOBOX
            
     
          //para converter o String para Date, o método PARSE exige tratamento de Exception
        try {

            String teste;//declaro a string
            teste = tableTourn.getModel().getValueAt(setar, 6).toString();//pego a string da tabela

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");//declaro o formato da data 
            Date dataFormatada = formato.parse(teste);//converto a string para data
            jcaDataTourn.setDate(dataFormatada);//seto a data no campo JCalendar

        } catch (ParseException erro) {
            erro.printStackTrace();
        }
        
    }

    private void listarValoresTorneio() {

        try {

            TorneiosDAO objtorneiosdao = new TorneiosDAO();

//montar esse modo de tabela no Array tabelaUsuario
            DefaultTableModel model = (DefaultTableModel) tableTourn.getModel();
            model.setNumRows(0);

//pega as informações da DAO e monta o ArrayList lista
            ArrayList<TournamentsDTO> lista = objtorneiosdao.PesquisarTorneioDAO();

//estrutura de repetição for (inicia, até onde vai, acrescentando)
            for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                model.addRow(new Object[]{
                    lista.get(num).getId_tourn(),
                    lista.get(num).getType_tourn(),
                    lista.get(num).getApp_id_tourn(),
                    lista.get(num).getId_user_tourn(),
                    lista.get(num).getValue_tourn(),
                    lista.get(num).getItm_val_tourn(),
                    lista.get(num).getDate_tourn()
                });
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Listar Valores Tourn VIEW: " + erro);

        }

    }

    private void LimparCamposTorneio() {

        txtCodTourn.setText("");
        txtTypeTourn.setText("");
        cbxAppTourn.getModel().setSelectedItem("Selecione");
        cbxUsuarioTourn.getModel().setSelectedItem("Selecione");
        txtValBuyinTourn.setText("");
        txtValTourItm.setText("");
        jcaDataTourn.setDate(null);

    }

    public void restaurarDadosComboBoxAppTourn() {
        //Vetor usado para passar dois valores para comboBox
        Vector<Integer> idPoker = new Vector<Integer>();

        try {

            cbxAppTourn.removeAllItems();
            cbxAppTourn.addItem("Selecione");

            ContaPokerDAO objcontapokerdao = new ContaPokerDAO();
            ResultSet rs = objcontapokerdao.listarAppCombo();

            while (rs.next()) {

                idPoker.addElement(rs.getInt(1));//o elemento faz parte do Vector, e também é importante pois será chave estrangeira
                //concatenei o id mais o valor da coluna selecionada no banco de dados na visualização do usuário
                //também usei o método do Vetor id_contapoker que me retorna o valor somente do último elemento, e não de todo valor
                cbxAppTourn.addItem(idPoker.lastElement() + rs.getString(2));// o Item é o que aparece para usuário visualizar

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "frmTorneios comboBoxApp: " + erro);

        }

    }

    public void restaurarDadosComboBoxUserTourn() {
        //Vetor usado para passar dois valores para comboBox
        Vector<Integer> idPoker = new Vector<Integer>();

        try {

            cbxUsuarioTourn.removeAllItems();//limpa a comboBox
            cbxUsuarioTourn.addItem("Selecione");//inicializa o primeiro item, e não o elemento, com essa string Selecione

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rs = objusuariodao.listarUsuarioCombo();

            while (rs.next()) {

                idPoker.addElement(rs.getInt(1));//o elemento faz parte do Vector, e também é importante pois será chave estrangeira
                //concatenei o id mais o valor da coluna selecionada no banco de dados na visualização do usuário
                //também usei o método do Vetor id_contapoker que me retorna o valor somente do último elemento, e não de todo valor
                cbxUsuarioTourn.addItem(idPoker.lastElement() + rs.getString(2));// o Item é o que aparece para usuário visualizar

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "frmTorneios comboBoxUser: " + erro);

        }

    }

}
