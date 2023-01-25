package VIEW;

import DAO.BancoDAO;
import DAO.ConexaoDAO;
import DAO.TorneiosDAO;
import DTO.TournamentsDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DTO.BankUserDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class frmListarGanhos extends javax.swing.JFrame {
    
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;


    public frmListarGanhos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtusuarioListarGanhos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListarGanhos = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnListarGanhos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTotalGanhos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("USUÁRIO :");

        txtusuarioListarGanhos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tabelaListarGanhos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DATA", "APLICATIVO", "GANHO"
            }
        ));
        jScrollPane1.setViewportView(tabelaListarGanhos);

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnListarGanhos.setText("LISTAR GANHOS");
        btnListarGanhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarGanhosActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Digite seu ID de usuário e clique em LISTAR GANHOS");

        btnFechar.setText("FECHAR");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("TOTAL: ");

        txtTotalGanhos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTotalGanhos.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtusuarioListarGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarGanhos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(txtTotalGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusuarioListarGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnListarGanhos)
                    .addComponent(btnFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnListarGanhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarGanhosActionPerformed

        BankUserDTO objbankdto = new BankUserDTO();
        /**
         * objbankdto.setNome_user_bank(txtusuarioListarGanhos.getText());
         *///espaço para setar o id do usuário da comboBox

         somarValoresBD(objbankdto);
        listarGanhosTableTourn(objbankdto);

    }//GEN-LAST:event_btnListarGanhosActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

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
                new frmListarGanhos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnListarGanhos;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaListarGanhos;
    private javax.swing.JTextField txtTotalGanhos;
    private javax.swing.JTextField txtusuarioListarGanhos;
    // End of variables declaration//GEN-END:variables

    private void listarGanhosTableTourn(BankUserDTO objbankdto) {

        //setando na DTO o valor digitado na TextField
        int teste = Integer.parseInt(txtusuarioListarGanhos.getText());
        objbankdto.setId_user_bank(teste);

        try {

            BancoDAO objbancodao = new BancoDAO();//instanciando a classe

//montar esse modo de tabela no Array tabelaUsuario
            DefaultTableModel model = (DefaultTableModel) tabelaListarGanhos.getModel();
            model.setNumRows(0);

//pega as informações da DAO e monta o ArrayList lista
            ArrayList<BankUserDTO> lista = objbancodao.PesquisarGanhosLista(objbankdto);

//estrutura de repetição for (inicia, até onde vai, acrescentando)
            for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                model.addRow(new Object[]{
                    lista.get(num).getData_bank(),
                    lista.get(num).getApp_id_bank(),
                    lista.get(num).getGanho_bank()

                });
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Listar Valores Ganhos VIEW: " + erro);

        }

    }

    ConexaoDAO objconndao = new ConexaoDAO();
    public int somaGanhos;

    private void somarValoresBD(BankUserDTO objbankdto) {

        //setando na DTO o valor digitado na TextField
        int teste = Integer.parseInt(txtusuarioListarGanhos.getText());
        objbankdto.setId_user_bank(teste);

        String sql = "SELECT SUM(ganho_bank) AS Total FROM tablebankuser WHERE fk_id_user_bank = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objbankdto.getId_user_bank());

            rs = pstm.executeQuery();

            if (rs.next()) {

                // para pegar o valor de da variável ResultSet pegou no BD, tem que estar 
                //dentro de uma CONDICIONAL IF ou LOOP como WHILE, com o compartaivo se ela está vazia ou não rs.next()
                somaGanhos = rs.getInt(1);
                String textoSoma = String.valueOf(somaGanhos);
                txtTotalGanhos.setText(textoSoma);

            } else {

                JOptionPane.showMessageDialog(null, "Erro na soma dos ganhos no frmListarGanhos");
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "frmListarGanhos método somarValoresBD: " + erro);
        }

    }

}
