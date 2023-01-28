
package VIEW;

import DTO.BankUserDTO;
import com.sun.jdi.connect.spi.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import DAO.BancoDAO;
import DTO.PesquisaDateDTO;
import DTO.UsuarioDTO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class frmListarDatas extends javax.swing.JFrame {
    
    Connection conn;
    ResultSet rs;
    PreparedStatement pstm;
    

  
    public frmListarDatas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paineGeral = new javax.swing.JPanel();
        paineTopo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paneMainDate = new javax.swing.JTabbedPane();
        paineGain = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dateBeginGanhos = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        dateEndGanhos = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        userIdDate = new javax.swing.JTextField();
        btnGainDate = new javax.swing.JButton();
        cbxAppDate = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnGainApp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labDateBeginRecebe = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDateTotalGain = new javax.swing.JTextField();
        labEndGainRecieve = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labQtdDays = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labeNome = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        paineLost = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        paineBalance = new javax.swing.JPanel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        paineSaque = new javax.swing.JPanel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        paineTourn = new javax.swing.JPanel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        btnSair = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        paineGeral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 149, 255), 4));

        paineTopo.setBackground(new java.awt.Color(63, 149, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PESQUISA POR DATAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout paineTopoLayout = new javax.swing.GroupLayout(paineTopo);
        paineTopo.setLayout(paineTopoLayout);
        paineTopoLayout.setHorizontalGroup(
            paineTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineTopoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(201, 201, 201))
        );
        paineTopoLayout.setVerticalGroup(
            paineTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneMainDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("DATA INICIAL :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("DATA FINAL :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("ID DO USUÁRIO :");

        userIdDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnGainDate.setText("PESQUISA POR USUÁRIO");
        btnGainDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainDateActionPerformed(evt);
            }
        });

        cbxAppDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("APLICATIVO :");

        btnGainApp.setText("PESQUISA POR APLICATIVO");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("TOTAL DE GANHOS : ");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("ENTRE ");

        labDateBeginRecebe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labDateBeginRecebe.setForeground(new java.awt.Color(255, 0, 0));
        labDateBeginRecebe.setText("0000-00-00");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("E");

        txtDateTotalGain.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDateTotalGain.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(63, 149, 255)));
        txtDateTotalGain.setEnabled(false);

        labEndGainRecieve.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labEndGainRecieve.setForeground(new java.awt.Color(255, 0, 0));
        labEndGainRecieve.setText("0000-00-00");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("QUANTIDADE DE DIAS DESSE INTERVALO :");

        labQtdDays.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labQtdDays.setForeground(new java.awt.Color(0, 125, 208));
        labQtdDays.setText("0000 dias");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("USUÁRIO : ");

        labeNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labeNome.setForeground(new java.awt.Color(0, 125, 208));
        labeNome.setText("nome usuário");

        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText("SELECIONE O INTERVALO DAS DATAS PARA EXECUTAR SUA PESQUISA DE FORMA CORRETA");

        javax.swing.GroupLayout paineGainLayout = new javax.swing.GroupLayout(paineGain);
        paineGain.setLayout(paineGainLayout);
        paineGainLayout.setHorizontalGroup(
            paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineGainLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(paineGainLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineGainLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(dateBeginGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(dateEndGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paineGainLayout.createSequentialGroup()
                        .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineGainLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userIdDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGainDate))
                            .addGroup(paineGainLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labQtdDays, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paineGainLayout.createSequentialGroup()
                                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineGainLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labeNome))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineGainLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(3, 3, 3)
                                        .addComponent(txtDateTotalGain, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labDateBeginRecebe)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labEndGainRecieve))
                            .addGroup(paineGainLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGainApp)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paineGainLayout.setVerticalGroup(
            paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineGainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(22, 22, 22)
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dateEndGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateBeginGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGainApp))
                .addGap(13, 13, 13)
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userIdDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGainDate))
                .addGap(18, 18, 18)
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labeNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDateTotalGain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(labDateBeginRecebe)
                    .addComponent(jLabel8)
                    .addComponent(labEndGainRecieve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labQtdDays))
                .addGap(21, 21, 21))
        );

        paneMainDate.addTab("GANHOS", paineGain);

        javax.swing.GroupLayout paineLostLayout = new javax.swing.GroupLayout(paineLost);
        paineLost.setLayout(paineLostLayout);
        paineLostLayout.setHorizontalGroup(
            paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineLostLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        paineLostLayout.setVerticalGroup(
            paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineLostLayout.createSequentialGroup()
                .addGroup(paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineLostLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paineLostLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        paneMainDate.addTab("PERDAS", paineLost);

        javax.swing.GroupLayout paineBalanceLayout = new javax.swing.GroupLayout(paineBalance);
        paineBalance.setLayout(paineBalanceLayout);
        paineBalanceLayout.setHorizontalGroup(
            paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineBalanceLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        paineBalanceLayout.setVerticalGroup(
            paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineBalanceLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        paneMainDate.addTab("SALDOS", paineBalance);

        javax.swing.GroupLayout paineSaqueLayout = new javax.swing.GroupLayout(paineSaque);
        paineSaque.setLayout(paineSaqueLayout);
        paineSaqueLayout.setHorizontalGroup(
            paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineSaqueLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        paineSaqueLayout.setVerticalGroup(
            paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineSaqueLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        paneMainDate.addTab("SAQUES", paineSaque);

        javax.swing.GroupLayout paineTournLayout = new javax.swing.GroupLayout(paineTourn);
        paineTourn.setLayout(paineTournLayout);
        paineTournLayout.setHorizontalGroup(
            paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineTournLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        paineTournLayout.setVerticalGroup(
            paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineTournLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        paneMainDate.addTab("TORNEIOS", paineTourn);

        btnSair.setText("SAIR ");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnClose.setText("FECHAR");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paineGeralLayout = new javax.swing.GroupLayout(paineGeral);
        paineGeral.setLayout(paineGeralLayout);
        paineGeralLayout.setHorizontalGroup(
            paineGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paineGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneMainDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paineGeralLayout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paineGeralLayout.setVerticalGroup(
            paineGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineGeralLayout.createSequentialGroup()
                .addComponent(paineTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneMainDate, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paineGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnClose))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paineGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGainDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainDateActionPerformed
        pesquisaUserGainDate();
        LimparCamposDatas();

        
    }//GEN-LAST:event_btnGainDateActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmListarDatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListarDatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListarDatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListarDatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListarDatas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGainApp;
    private javax.swing.JButton btnGainDate;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxAppDate;
    public com.toedter.calendar.JDateChooser dateBeginGanhos;
    public com.toedter.calendar.JDateChooser dateEndGanhos;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel labDateBeginRecebe;
    public javax.swing.JLabel labEndGainRecieve;
    public javax.swing.JLabel labQtdDays;
    private javax.swing.JLabel labeNome;
    public javax.swing.JPanel paineBalance;
    public javax.swing.JPanel paineGain;
    private javax.swing.JPanel paineGeral;
    public javax.swing.JPanel paineLost;
    public javax.swing.JPanel paineSaque;
    private javax.swing.JPanel paineTopo;
    public javax.swing.JPanel paineTourn;
    public javax.swing.JTabbedPane paneMainDate;
    public javax.swing.JTextField txtDateTotalGain;
    private javax.swing.JTextField userIdDate;
    // End of variables declaration//GEN-END:variables

  
    private void pesquisaUserGainDate(){
        Date beginGainRec = new Date();
        Date endGainRec = new Date();
        int id_user_pesq = 0;
        String somaGainStr = "";
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
        
        String qtdDias = "";
                
                
        
        beginGainRec = dateBeginGanhos.getDate();
        endGainRec = dateEndGanhos.getDate();
        
        id_user_pesq = Integer.parseInt(userIdDate.getText());
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
       
        labDateBeginRecebe.setText(dataBeginFormatada);
        
          //convertendo a Date em String
        DateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
        
        //pegando da DTO e terminando a conversão da Date
        dataEndFormatada = dateFormat1.format(objpesqdatedto.getDatafim());
       
         try{
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
        LocalDate startDate = LocalDate.of(yearIn,monthIn,dayIn);
        LocalDate endDate = LocalDate.of(yearEn,monthEn,dayEn);

        days = ChronoUnit.DAYS.between(startDate, endDate);
                 
        //IMPRIMINDO NA LABEL
        qtdDias = Long.toString(days);
        labQtdDays.setText(qtdDias + " dias");
                 
             } catch (Exception errochro) {
                 JOptionPane.showMessageDialog(null, "Tempo erroChro: " + errochro);
             }

        }catch(Exception errotime){
            JOptionPane.showMessageDialog(null, "Tempo erro: " + errotime);
        }
             
        
        labDateBeginRecebe.setText(dataBeginFormatada);
        labEndGainRecieve.setText(dataEndFormatada);       
                      
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaGanhos no frmListarDatas:" + e);
        }       
        
        BancoDAO objbancodao = new BancoDAO();
        objbancodao.pesquisaDateUserGainDAO(objpesqdatedto);
        
        somaGainStr = String.valueOf(objpesqdatedto.getSoma());
        txtDateTotalGain.setText(somaGainStr);
        
        //pegando o nome executando o método
        objbancodao.nomeParaListarDatas(objpesqdatedto);
        
        nome_paraimp = objpesqdatedto.getNome_user();
        labeNome.setText(nome_paraimp);
    }

    public void LimparCamposDatas(){
       
        cbxAppDate.getModel().setSelectedItem("Selecione");
        userIdDate.setText("");
        dateBeginGanhos.setDate(null);
        dateEndGanhos.setDate(null);
              
    }  
    
}
