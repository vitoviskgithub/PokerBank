package VIEW;

import DAO.ConexaoDAO;
import DAO.TorneiosDAO;
import DTO.TournamentsDTO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class frmListaTourn extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pstm, pstm1;
    ResultSet rs, rs1;

    public frmListaTourn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTotalGanhosTourn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        txtUsuarioListaTourn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListarTorneios = new javax.swing.JTable();
        btnListarTourn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxTypeTourn = new javax.swing.JComboBox<>();
        btnListarTournType = new javax.swing.JButton();
        txtQtdTourn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(63, 149, 255), 4, true));

        btnFechar.setText("FECHAR");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Digite seu ID de usuário e clique em LISTAR TORNEIOS");

        txtTotalGanhosTourn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTotalGanhosTourn.setForeground(new java.awt.Color(0, 51, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("(ITM-BY):");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("USUÁRIO :");

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtUsuarioListaTourn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUsuarioListaTourn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioListaTournActionPerformed(evt);
            }
        });

        tabelaListarTorneios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DATA", "APLICATIVO", "TORNEIO", "BUY IN", "ITM"
            }
        ));
        jScrollPane1.setViewportView(tabelaListarTorneios);

        btnListarTourn.setText("LISTAR TORNEIOS");
        btnListarTourn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTournActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("TIPO TORNEIO:");

        cbxTypeTourn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "NLH (NO LIMIT HOLDEN / 2CARTAS)", "PLO5 (OMAHA POT LIMIT / 5 CARTAS)", "PLO4 (OMAHA POT LIMIT / 4 CARTAS)", "CASH (CASH DE PLO OU NLH)", "SNG (SIT AND GO DE PLO OU NLH)", " " }));

        btnListarTournType.setText("LISTAR TORNEIOS");
        btnListarTournType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTournTypeActionPerformed(evt);
            }
        });

        txtQtdTourn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("QUANTIDADE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdTourn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalGanhosTourn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuarioListaTourn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarTourn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTypeTourn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListarTournType)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuarioListaTourn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarTourn)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxTypeTourn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarTournType))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalGanhosTourn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair)
                    .addComponent(btnFechar)
                    .addComponent(txtQtdTourn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarTournActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTournActionPerformed

        TournamentsDTO objtourndto = new TournamentsDTO();
        /**
         * objtourndto.setId_user_tourn(txtUsuarioListaTourn.getText());
         */// espaço para setar valor do comboBox id do usuario
        somarValoresBD(objtourndto);
        listarValoresTableTourn(objtourndto);
        limparCampos();


    }//GEN-LAST:event_btnListarTournActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnListarTournTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTournTypeActionPerformed

        TournamentsDTO objtourndto = new TournamentsDTO();
        somarValoresBDType(objtourndto);
        listarValoresTableTournType(objtourndto);
        limparCampos();

    }//GEN-LAST:event_btnListarTournTypeActionPerformed

    private void txtUsuarioListaTournActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioListaTournActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioListaTournActionPerformed

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListaTourn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnListarTourn;
    private javax.swing.JButton btnListarTournType;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxTypeTourn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabelaListarTorneios;
    private javax.swing.JTextField txtQtdTourn;
    private javax.swing.JTextField txtTotalGanhosTourn;
    private javax.swing.JTextField txtUsuarioListaTourn;
    // End of variables declaration//GEN-END:variables

    private void listarValoresTableTourn(TournamentsDTO objtourndto) {

        //setando na DTO o valor digitado na TextField
        int teste = Integer.parseInt(txtUsuarioListaTourn.getText());
        objtourndto.setId_user_tourn(teste);

        try {

            TorneiosDAO objtorneiosdao = new TorneiosDAO();//instanciando a classe

//montar esse modo de tabela no Array tabelaUsuario
            DefaultTableModel model = (DefaultTableModel) tabelaListarTorneios.getModel();
            model.setNumRows(0);
            
             int qtdTourn = 0;
//pega as informações da DAO e monta o ArrayList lista
            ArrayList<TournamentsDTO> lista = objtorneiosdao.PesquisarTorneiosLista(objtourndto);
            
           //estrutura de repetição for (inicia, até onde vai, acrescentando)
            for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                model.addRow(new Object[]{
                    lista.get(num).getDate_tourn(),
                    lista.get(num).getApp_id_tourn(),
                    lista.get(num).getType_tourn(),
                    lista.get(num).getValue_tourn(),
                    lista.get(num).getItm_val_tourn()
                      
                 });
                qtdTourn++;
            }
            String qtdTournStr = String.valueOf(qtdTourn);
            txtQtdTourn.setText(qtdTournStr);
            
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Listar Valores Torneios VIEW: " + erro);

        }

    }

    ConexaoDAO objconndao = new ConexaoDAO();
    public int somaGanhosTorneios, somaBuyinMaisItm, somaBuyin;

    private void somarValoresBD(TournamentsDTO objtournaments) {

        //setando na DTO o valor digitado na TextField
        int teste = Integer.parseInt(txtUsuarioListaTourn.getText());
        objtournaments.setId_user_tourn(teste);

        String sql = "SELECT SUM(itm_val_tourn) AS Total FROM tabletournaments WHERE fk_id_user_tourn = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objtournaments.getId_user_tourn());

            rs = pstm.executeQuery();

            if (rs.next()) {

                // para pegar o valor de da variável ResultSet pegou no BD, tem que estar 
                //dentro de uma CONDICIONAL IF ou LOOP como WHILE, com o compartaivo se ela está vazia ou não rs.next()
                //acessando o primeiro índice da ResultSet
                somaGanhosTorneios = rs.getInt(1);

                /**
                 * DIVISOR DE VALORES
                 *
                 * if (txtQtdPagaram.getText().equals("")){ somaGanhosTorneios =
                 * somaGanhosTorneios * 1; }else if
                 * (txtQtdPagaram.getText().equals("1")) { somaGanhosTorneios =
                 * somaGanhosTorneios * 1; } else if
                 * (txtQtdPagaram.getText().equals("2")) { somaGanhosTorneios =
                 * somaGanhosTorneios / 2; } else if
                 * (txtQtdPagaram.getText().equals("3")) { somaGanhosTorneios =
                 * somaGanhosTorneios / 3; } else { somaGanhosTorneios =
                 * somaGanhosTorneios / 4; }
                 *
                 */
                somarValoresBDBuyinType(objtournaments);
                somaBuyinMaisItm = somaGanhosTorneios - somaBuyin;//tirando o valor do buy in na soma

                if (somaBuyinMaisItm<=0) {

                    String textoSoma = String.valueOf(somaBuyinMaisItm);

                    txtTotalGanhosTourn.setForeground(Color.red);
                    txtTotalGanhosTourn.setText(textoSoma);

                } else {
                    String textoSoma = String.valueOf(somaBuyinMaisItm);

                    txtTotalGanhosTourn.setForeground(Color.blue);
                    txtTotalGanhosTourn.setText(textoSoma);
                }
            } else {

                JOptionPane.showMessageDialog(null, "Erro na soma das perdas no frmListarTourn");
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "frmListarTourn método somarValoresBD: " + erro);
        }

    }

    private void somarValoresBDBuyin(TournamentsDTO objtournaments) {

        //setando na DTO o valor digitado na TextField
        int teste = Integer.parseInt(txtUsuarioListaTourn.getText());
        objtournaments.setId_user_tourn(teste);

        String sql = "SELECT SUM(value_tourn) AS Total FROM tabletournaments WHERE fk_id_user_tourn = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objtournaments.getId_user_tourn());

            rs = pstm.executeQuery();

            if (rs.next()) {

                //retorna o valor da soma dos buyin para essa variável
                somaBuyin = rs.getInt(1);

            } else {

                JOptionPane.showMessageDialog(null, "Erro na soma dos buyin no frmListarTourn");
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "frmListarTourn método somarValoresBD: " + erro);
        }

    }

    public void limparCampos() {
        txtUsuarioListaTourn.setText("");
        cbxTypeTourn.getModel().setSelectedItem("Selecione");
    }

    private void somarValoresBDType(TournamentsDTO objtournaments) {

        filtroTypeTourn(objtournaments);

        String sql = "SELECT SUM(itm_val_tourn) AS Total FROM tabletournaments WHERE type_tourn = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objtournaments.getType_tourn());

            rs = pstm.executeQuery();

            if (rs.next()) {

                // para pegar o valor de da variável ResultSet pegou no BD, tem que estar 
                //dentro de uma CONDICIONAL IF ou LOOP como WHILE, com o compartaivo se ela está vazia ou não rs.next()
                //acessando o primeiro índice da ResultSet
                somaGanhosTorneios = rs.getInt(1);

                /**
                 * DIVISOR DE VALORES
                 *
                 * if (txtQtdPagaram.getText().equals("")){ somaGanhosTorneios =
                 * somaGanhosTorneios * 1; }else if
                 * (txtQtdPagaram.getText().equals("1")) { somaGanhosTorneios =
                 * somaGanhosTorneios * 1; } else if
                 * (txtQtdPagaram.getText().equals("2")) { somaGanhosTorneios =
                 * somaGanhosTorneios / 2; } else if
                 * (txtQtdPagaram.getText().equals("3")) { somaGanhosTorneios =
                 * somaGanhosTorneios / 3; } else { somaGanhosTorneios =
                 * somaGanhosTorneios / 4; }
                 *
                 */
                somarValoresBDBuyinType(objtournaments);
                somaBuyinMaisItm = somaGanhosTorneios - somaBuyin;//tirando o valor do buy in na soma

                if (somaBuyinMaisItm<=0) {

                    String textoSoma = String.valueOf(somaBuyinMaisItm);

                    txtTotalGanhosTourn.setForeground(Color.red);
                    txtTotalGanhosTourn.setText(textoSoma);

                } else {
                    String textoSoma = String.valueOf(somaBuyinMaisItm);

                    txtTotalGanhosTourn.setForeground(Color.blue);
                    txtTotalGanhosTourn.setText(textoSoma);
                }

            } else {

                JOptionPane.showMessageDialog(null, "Erro na soma das perdas no frmListarTourn");
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "frmListarTourn método somarValoresBD: " + erro);
        }

    }

    private void listarValoresTableTournType(TournamentsDTO objtourndto) {

        //setando na DTO o valor digitado na TextField
        String teste = cbxTypeTourn.getModel().getSelectedItem().toString();
        objtourndto.setType_tourn(teste);

        try {

            TorneiosDAO objtorneiosdao = new TorneiosDAO();//instanciando a classe

//montar esse modo de tabela no Array tabelaUsuario
            DefaultTableModel model = (DefaultTableModel) tabelaListarTorneios.getModel();
            model.setNumRows(0);

            String typeTournRes = "";
            String typeTournPart = "";

            typeTournRes = cbxTypeTourn.getModel().getSelectedItem().toString();
            typeTournPart = typeTournRes.substring(0, 4);

            if (typeTournPart.contains("NLH")) {
                typeTournRes = "NLH";
//pega as informações da DAO e monta o ArrayList lista
                ArrayList<TournamentsDTO> lista = objtorneiosdao.PesquisarTorneiosListaType(typeTournRes);

                int querecebenum = 0;
                for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                    model.addRow(new Object[]{
                        lista.get(num).getDate_tourn(),
                        lista.get(num).getApp_id_tourn(),
                        lista.get(num).getType_tourn(),
                        lista.get(num).getValue_tourn(),
                        lista.get(num).getItm_val_tourn()
                    });
                    querecebenum++;
                }
                String tete = String.valueOf(querecebenum);
                txtQtdTourn.setText(tete);

            } else if (typeTournPart.contains("PLO5")) {
                typeTournRes = "PLO5";
//pega as informações da DAO e monta o ArrayList lista
                ArrayList<TournamentsDTO> lista = objtorneiosdao.PesquisarTorneiosListaType(typeTournRes);
                int querecebenum = 0;
                for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                    model.addRow(new Object[]{
                        lista.get(num).getDate_tourn(),
                        lista.get(num).getApp_id_tourn(),
                        lista.get(num).getType_tourn(),
                        lista.get(num).getValue_tourn(),
                        lista.get(num).getItm_val_tourn()
                    });
                    querecebenum++;
                }
                String tete = String.valueOf(querecebenum);
                txtQtdTourn.setText(tete);
            } else if (typeTournPart.contains("PLO4")) {
                typeTournRes = "PLO4";
//pega as informações da DAO e monta o ArrayList lista
                ArrayList<TournamentsDTO> lista = objtorneiosdao.PesquisarTorneiosListaType(typeTournRes);
                int querecebenum = 0;
                for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                    model.addRow(new Object[]{
                        lista.get(num).getDate_tourn(),
                        lista.get(num).getApp_id_tourn(),
                        lista.get(num).getType_tourn(),
                        lista.get(num).getValue_tourn(),
                        lista.get(num).getItm_val_tourn()
                    });
                    querecebenum++;
                }
                String tete = String.valueOf(querecebenum);
                txtQtdTourn.setText(tete);
            } else if (typeTournPart.contains("CASH")) {
                typeTournRes = "CASH";
//pega as informações da DAO e monta o ArrayList lista
                ArrayList<TournamentsDTO> lista = objtorneiosdao.PesquisarTorneiosListaType(typeTournRes);
                int querecebenum = 0;
                for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                    model.addRow(new Object[]{
                        lista.get(num).getDate_tourn(),
                        lista.get(num).getApp_id_tourn(),
                        lista.get(num).getType_tourn(),
                        lista.get(num).getValue_tourn(),
                        lista.get(num).getItm_val_tourn()
                    });
                    querecebenum++;
                }
                String tete = String.valueOf(querecebenum);
                txtQtdTourn.setText(tete);
            } else if (typeTournPart.contains("SNG")) {
                typeTournRes = "SNG";
//pega as informações da DAO e monta o ArrayList lista
                ArrayList<TournamentsDTO> lista = objtorneiosdao.PesquisarTorneiosListaType(typeTournRes);
                int querecebenum = 0;
                for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                    model.addRow(new Object[]{
                        lista.get(num).getDate_tourn(),
                        lista.get(num).getApp_id_tourn(),
                        lista.get(num).getType_tourn(),
                        lista.get(num).getValue_tourn(),
                        lista.get(num).getItm_val_tourn()
                    });
                    querecebenum++;
                }
                String tete = String.valueOf(querecebenum);
                txtQtdTourn.setText(tete);
            }

//estrutura de repetição for (inicia, até onde vai, acrescentando)
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Listar Valores Torneios VIEW: " + erro);

        }

    }

    private void filtroTypeTourn(TournamentsDTO objtournaments) {

        String typeTournRes = "";
        String typeTournPart = "";

        typeTournRes = cbxTypeTourn.getModel().getSelectedItem().toString();
        typeTournPart = typeTournRes.substring(0, 7);

        if (typeTournPart.contains("NLH")) {
            typeTournRes = "NLH";
            objtournaments.setType_tourn(typeTournRes);
        } else if (typeTournPart.contains("PLO5")) {
            typeTournRes = "PLO5";
            objtournaments.setType_tourn(typeTournRes);
        } else if (typeTournPart.contains("PLO4")) {
            typeTournRes = "PLO4";
            objtournaments.setType_tourn(typeTournRes);
        } else if (typeTournPart.contains("CASH P")) {
            typeTournRes = "CASH P";
            objtournaments.setType_tourn(typeTournRes);
        } else if (typeTournPart.contains("CASH N")) {
            typeTournRes = "CASH N";
            objtournaments.setType_tourn(typeTournRes);
        } else if (typeTournPart.contains("SNG N")) {
            typeTournRes = "SNG N";
            objtournaments.setType_tourn(typeTournRes);
        } else if (typeTournPart.contains("SNG P")) {
            typeTournRes = "SNG P";
            objtournaments.setType_tourn(typeTournRes);
        }
    }

    private void somarValoresBDBuyinType(TournamentsDTO objtournaments) {

        filtroTypeTourn(objtournaments);

        String sql = "SELECT SUM(value_tourn) AS Total FROM tabletournaments WHERE type_tourn = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objtournaments.getType_tourn());

            rs = pstm.executeQuery();

            if (rs.next()) {

                //retorna o valor da soma dos buyin para essa variável
                somaBuyin = rs.getInt(1);

            } else {

                JOptionPane.showMessageDialog(null, "Erro na soma dos buyin no frmListarTourn");
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "frmListarTourn método somarValoresBD: " + erro);
        }

    }

}
