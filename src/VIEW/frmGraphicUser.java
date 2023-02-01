
package VIEW;

import DAO.GeraGraphicDAO;
import DTO.PesquisaDateDTO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;

public class frmGraphicUser extends javax.swing.JFrame {

    public frmGraphicUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnGeraGraphicUser = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateBeginGraph = new com.toedter.calendar.JDateChooser();
        dateEndGraph = new com.toedter.calendar.JDateChooser();
        btnSair = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 149, 255), 4));

        btnGeraGraphicUser.setText("GERAR GRÁFICO");
        btnGeraGraphicUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeraGraphicUserActionPerformed(evt);
            }
        });

        btnFechar.setText("FECHAR");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ID DO USUÁRIO:");

        txtIdUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(63, 149, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GERADOR E VISUALIZADOR DE GRÁFICO ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("SELECIONE O INTERVALO DAS DATAS PARA EXECUTAR SUA PESQUISA DE FORMA CORRETA");

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jButton3.setText("VISUALIZAR GRÁFICO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnGeraGraphicUser)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnSair)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFechar)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dateBeginGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(dateEndGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateEndGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateBeginGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGeraGraphicUser)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeraGraphicUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeraGraphicUserActionPerformed
        
        Date teste, teste2 = new Date();
        String teste3;

        teste = dateBeginGraph.getDate();
        teste2 = dateEndGraph.getDate();
        teste3 = txtIdUser.getText();

        if (teste == null || teste2 == null || teste3.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {
            pesquisaUserGraphDate();
            LimparCamposDatas();
        }
    }//GEN-LAST:event_btnGeraGraphicUserActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        GeraGraphicDAO objgradao = new GeraGraphicDAO();
        objgradao.janelaNovaImagemUser();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
      dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

   
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmGraphicUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGraphicUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGraphicUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGraphicUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGraphicUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGeraGraphicUser;
    private javax.swing.JButton btnSair;
    private com.toedter.calendar.JDateChooser dateBeginGraph;
    private com.toedter.calendar.JDateChooser dateEndGraph;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtIdUser;
    // End of variables declaration//GEN-END:variables

 public void LimparCamposDatas() {

        dateBeginGraph.setDate(null);

        dateEndGraph.setDate(null);

    }
 
  private void pesquisaUserGraphDate() {
        Date beginGainRec = new Date();
        Date endGainRec = new Date();

        int id_user_pesq = 0;

        String dataEndFormatada = "";
        String dataBeginFormatada = "";
        String nome_paraimp = "";

        Date date_in_chro = new Date();
        Date date_en_chro = new Date();

        int yearIn = 0;
        int monthIn = 0;
        int dayIn = 0;
        int yearEn = 0;
        int monthEn = 0;
        int dayEn = 0;

        long days = 0;

        beginGainRec = dateBeginGraph.getDate();
        endGainRec = dateEndGraph.getDate();

        //SETANDO O ID NA DTO PELA COMBOBOX
        id_user_pesq = Integer.parseInt(txtIdUser.getText());

        //INSTANCIANDO E SETANDO
        PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();
        objpesqdatedto.setDatainicio(beginGainRec);
        objpesqdatedto.setDatafim(endGainRec);
        objpesqdatedto.setIduser(id_user_pesq);

        try {
            //convertendo a Date em String
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            //pegando da DTO e terminando a conversão da Date
            dataBeginFormatada = dateFormat.format(objpesqdatedto.getDatainicio());

            //convertendo a Date em String
            DateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");

            //pegando da DTO e terminando a conversão da Date
            dataEndFormatada = dateFormat1.format(objpesqdatedto.getDatafim());

            try {
                //COMEÇO PARA CALCULAR QUANTIDADE DE DIAS 
                date_in_chro = objpesqdatedto.getDatainicio();
                date_en_chro = objpesqdatedto.getDatafim();

                //PEGANDO VALORES DO INICIO
                DateFormat dateFormatchroinyear = new SimpleDateFormat("y");
                yearIn = Integer.parseInt(dateFormatchroinyear.format(date_in_chro));
                DateFormat dateFormatchroinmot = new SimpleDateFormat("M");
                monthIn = Integer.parseInt(dateFormatchroinmot.format(date_in_chro));
                DateFormat dateFormatchroinday = new SimpleDateFormat("d");
                dayIn = Integer.parseInt(dateFormatchroinday.format(date_in_chro));
                //PEGANDO VALORES DO FIM
                DateFormat dateFormatchroenyear = new SimpleDateFormat("y");
                yearEn = Integer.parseInt(dateFormatchroenyear.format(date_en_chro));
                DateFormat dateFormatchroenmot = new SimpleDateFormat("M");
                monthEn = Integer.parseInt(dateFormatchroenmot.format(date_en_chro));
                DateFormat dateFormatchroenday = new SimpleDateFormat("d");
                dayEn = Integer.parseInt(dateFormatchroenday.format(date_en_chro));

                try {

                    //USANDO O MÉTODO CHRONO E LOCALDATE
                    LocalDate startDate = LocalDate.of(yearIn, monthIn, dayIn);
                    LocalDate endDate = LocalDate.of(yearEn, monthEn, dayEn);

                    days = ChronoUnit.DAYS.between(startDate, endDate);

                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro ListarDatas: " + errochro);
                }

            } catch (Exception errotime) {
                JOptionPane.showMessageDialog(null, "Tempo erro ListarDatas: " + errotime);
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaGanhos no frmGraphicAdmDatas:" + erro);
        }

        //istanciando a DAO para executar o método que pega os valores
        //do banco de dados e atribui a variável DefaultCategoryDataset
        // que vai passar os valores para gerar o gráfico posteriormente
        GeraGraphicDAO objgraphdao = new GeraGraphicDAO();
        objgraphdao.gerandoGraphicLoopCalcUser(objpesqdatedto);

    }

}
