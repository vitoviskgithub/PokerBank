package VIEW;

import DAO.BancoDAO;
import DAO.ConexaoDAO;
import DTO.BankUserDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

public class frmListarPerdas extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public frmListarPerdas() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsuarioListarPerdas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListarPerdas = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnListarPerdas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTotalPerdas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("USUÁRIO : ");

        txtUsuarioListarPerdas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tableListarPerdas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DATA", "APLICATIVO", "PERDA"
            }
        ));
        jScrollPane1.setViewportView(tableListarPerdas);

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnListarPerdas.setText("LISTAR PERDAS");
        btnListarPerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPerdasActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Digite seu ID de usuário e clique em LISTAR PERDAS");

        btnFechar.setText("FECHAR");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("TOTAL: ");

        txtTotalPerdas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTotalPerdas.setForeground(new java.awt.Color(255, 51, 51));

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
                        .addComponent(txtUsuarioListarPerdas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarPerdas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(txtTotalPerdas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuarioListarPerdas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnListarPerdas)
                    .addComponent(btnFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalPerdas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnListarPerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPerdasActionPerformed

        BankUserDTO objbankdto = new BankUserDTO();
        /**
         * objbankdto.setNome_user_bank(txtUsuarioListarPerdas.getText());
         *///espaço para setaro id do usuário da comboBox

        somarValoresBD(objbankdto);
        listarPerdasTableTourn(objbankdto);


    }//GEN-LAST:event_btnListarPerdasActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    public static void main(String args[]) {

        //ALTERA O VISUAL DO VIEW
        /* Set the Nimbus look and feel */
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
                new frmListarPerdas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnListarPerdas;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListarPerdas;
    private javax.swing.JTextField txtTotalPerdas;
    private javax.swing.JTextField txtUsuarioListarPerdas;
    // End of variables declaration//GEN-END:variables

    private void listarPerdasTableTourn(BankUserDTO objbankdto) {

        //setando na DTO o valor digitado na TextField
        int teste = Integer.parseInt(txtUsuarioListarPerdas.getText());
        objbankdto.setId_user_bank(teste);

        try {

            BancoDAO objbancodao = new BancoDAO();//instanciando a classe

//montar esse modo de tabela no Array tabelaUsuario
            DefaultTableModel model = (DefaultTableModel) tableListarPerdas.getModel();
            model.setNumRows(0);

//pega as informações da DAO e monta o ArrayList lista
            ArrayList<BankUserDTO> lista = objbancodao.PesquisarPerdasLista(objbankdto);

//estrutura de repetição for (inicia, até onde vai, acrescentando)
            for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                model.addRow(new Object[]{
                    lista.get(num).getData_bank(),
                    lista.get(num).getApp_id_bank(),
                    lista.get(num).getPerda_bank()

                });

            }
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Listar Valores Perdas VIEW: " + erro);

        }

    }

    ConexaoDAO objconndao = new ConexaoDAO();
    public int somaPerdas;

    private void somarValoresBD(BankUserDTO objbankdto) {

        //setando na DTO o valor digitado na TextField
        int teste = Integer.parseInt(txtUsuarioListarPerdas.getText());
        objbankdto.setId_user_bank(teste);

        String sql = "SELECT SUM(perda_bank) AS Total FROM tablebankuser WHERE fk_id_user_bank = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objbankdto.getId_user_bank());
                        
            rs = pstm.executeQuery();
            
            if(rs.next()){
                
                // para pegar o valor de da variável ResultSet pegou no BD, tem que estar 
                //dentro de uma CONDICIONAL IF ou LOOP como WHILE, com o compartaivo se ela está vazia ou não rs.next()
                somaPerdas = rs.getInt(1);
                String textoSoma = String.valueOf(somaPerdas);
                txtTotalPerdas.setText(textoSoma);
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Erro na soma das perdas no frmListarPerdas");
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "frmListarPerdas método somarValoresBD: " + erro);
        }

  
    }

}
