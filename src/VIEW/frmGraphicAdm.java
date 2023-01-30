package VIEW;

import DAO.BancoDAO;
import DAO.ContaPokerDAO;
import DAO.GeraGraphicDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

import DTO.PesquisaDateDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;

public class frmGraphicAdm extends javax.swing.JFrame {

    public frmGraphicAdm() {
        initComponents();

        restaurarDadosComboBoxAppDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGeraGraphicApp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dateBeginGraph = new com.toedter.calendar.JDateChooser();
        dateEndGraph = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        cbxAppDate = new javax.swing.JComboBox<>();
        btnSair = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnShowGraphic = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        btnGeraGraphicUser = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 149, 255), 4));

        btnGeraGraphicApp.setText("GERAR GRÁFICO (APP)");
        btnGeraGraphicApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeraGraphicAppActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(63, 149, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GERADOR E VISUALIZADOR DE GRÁFICO (POR APP E USUÁRIO)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("APLICATIVO :");

        cbxAppDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnFechar.setText("FEHCAR");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnShowGraphic.setText("VISUALIZAR GRÁFICO (APP)");
        btnShowGraphic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowGraphicActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ID DO USUÁRIO :");

        txtIdUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnGeraGraphicUser.setText("GERAR GRÁFICO");
        btnGeraGraphicUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeraGraphicUserActionPerformed(evt);
            }
        });

        jButton1.setText("VISUALIZAR GRÁFICO (USUÁRIO)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("SELECIONE O INTERVALO DAS DATAS PARA EXECUTAR SUA PESQUISA DE FORMA CORRETA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnShowGraphic))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(txtIdUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGeraGraphicUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGeraGraphicApp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateBeginGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateEndGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateBeginGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateEndGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeraGraphicUser)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeraGraphicApp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowGraphic)
                    .addComponent(btnFechar)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeraGraphicAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeraGraphicAppActionPerformed

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        Date teste, teste2 = new Date();
        int teste3;
        //Pegando parte de um String e usando no IF
        String valcomp = "";
        String valcomp_part = "";

        valcomp = String.valueOf(cbxAppDate.getModel().getSelectedItem());
        valcomp_part = valcomp.substring(0, 4);

        teste = dateBeginGraph.getDate();
        teste2 = dateEndGraph.getDate();
        teste3 = cbxAppDate.getSelectedIndex();

        if (teste == null || teste2 == null || teste3 <= 0) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {

            if (valcomp_part.contains("**")) {

                JOptionPane.showMessageDialog(null, "Selecione uma opção que seja somente um usuário e um aplicativo\n(que não tenham **)");

            } else {
                pesquisaAppGraphDate();
                LimparCamposDatas();

            }

        }

    }//GEN-LAST:event_btnGeraGraphicAppActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnShowGraphicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowGraphicActionPerformed
        GeraGraphicDAO objgradao = new GeraGraphicDAO();
        objgradao.janelaNovaImagemApp();

    }//GEN-LAST:event_btnShowGraphicActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        GeraGraphicDAO objgradao = new GeraGraphicDAO();
        objgradao.janelaNovaImagemUser();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmGraphicAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGraphicAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGraphicAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGraphicAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGraphicAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnGeraGraphicApp;
    private javax.swing.JButton btnGeraGraphicUser;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnShowGraphic;
    private javax.swing.JComboBox<String> cbxAppDate;
    private com.toedter.calendar.JDateChooser dateBeginGraph;
    private com.toedter.calendar.JDateChooser dateEndGraph;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtIdUser;
    // End of variables declaration//GEN-END:variables

    private void pesquisaAppGraphDate() {
        Date beginGainRec = new Date();
        Date endGainRec = new Date();

        int id_app_pesq = 0;

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
        id_app_pesq = cbxAppDate.getSelectedIndex();

        //INSTANCIANDO E SETANDO
        PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();
        objpesqdatedto.setDatainicio(beginGainRec);
        objpesqdatedto.setDatafim(endGainRec);
        objpesqdatedto.setId_app(id_app_pesq);

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

            JOptionPane.showMessageDialog(null, "Tratamento método no frmGraphicAdmDatas:" + erro);
        }

        //istanciando a DAO para executar o método que pega os valores
        //do banco de dados e atribui a variável DefaultCategoryDataset
        // que vai passar os valores para gerar o gráfico posteriormente
        GeraGraphicDAO objgraphdao = new GeraGraphicDAO();
        objgraphdao.gerandoGraphicLoopCalc(objpesqdatedto);

    }

    public void LimparCamposDatas() {

        cbxAppDate.getModel().setSelectedItem("Selecione");

        dateBeginGraph.setDate(null);

        dateEndGraph.setDate(null);

    }

    public void restaurarDadosComboBoxAppDate() {
        //Vetor usado para passar dois valores para comboBox
        Vector<Integer> idPoker = new Vector<Integer>();

        try {
            //removendo os itens da ComboBox primeiro antes de encher denovo
            cbxAppDate.removeAllItems();
            cbxAppDate.addItem("Selecione");

            ContaPokerDAO objcontapokerdao = new ContaPokerDAO();
            ResultSet rs = objcontapokerdao.listarAppCombo();

            while (rs.next()) {

                idPoker.addElement(rs.getInt(1));//o elemento faz parte do Vector, e também é importante pois será chave estrangeira
                //concatenei o id mais o valor da coluna selecionada no banco de dados na visualização do usuário
                //também usei o método do Vetor id_contapoker que me retorna o valor somente do último elemento, e não de todo valor
                cbxAppDate.addItem(idPoker.lastElement() + rs.getString(2));// o Item é o que aparece para usuário visualizar

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "frmGraphicAdm comboBoxApp: " + erro);

        }

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
