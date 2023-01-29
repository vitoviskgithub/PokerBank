package VIEW;

import DTO.BankUserDTO;
import com.sun.jdi.connect.spi.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import DAO.BancoDAO;
import DAO.ContaPokerDAO;
import DTO.PesquisaDateDTO;
import DTO.UsuarioDTO;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Vector;

public class frmListarDatas extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pstm;

    public frmListarDatas() {
        initComponents();
          
        restaurarDadosComboBoxAppDate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paineGeral = new javax.swing.JPanel();
        paineTopo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paneMainDate = new javax.swing.JTabbedPane();
        paineGain = new javax.swing.JPanel();
        dateBeginGanhos = new com.toedter.calendar.JDateChooser();
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
        tagUsuario = new javax.swing.JLabel();
        labeNome = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        paineLost = new javax.swing.JPanel();
        dateBeginGanhosP = new com.toedter.calendar.JDateChooser();
        dateEndGanhosP = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labQtdDaysP = new javax.swing.JLabel();
        labEndGainRecieveP = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tagUsuarioP = new javax.swing.JLabel();
        labDateBeginRecebeP = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        labeNomeP = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cbxAppDateP = new javax.swing.JComboBox<>();
        userIdDateP = new javax.swing.JTextField();
        txtDateTotalGainP = new javax.swing.JTextField();
        btnGainAppP = new javax.swing.JButton();
        btnGainDateP = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        paineBalance = new javax.swing.JPanel();
        dateEndGanhosS = new com.toedter.calendar.JDateChooser();
        dateBeginGanhosS = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        labQtdDaysS = new javax.swing.JLabel();
        tagUsuarioS = new javax.swing.JLabel();
        labEndGainRecieveS = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        labeNomeS = new javax.swing.JLabel();
        labDateBeginRecebeS = new javax.swing.JLabel();
        txtDateTotalGainS = new javax.swing.JTextField();
        userIdDateS = new javax.swing.JTextField();
        cbxAppDateS = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        btnGainAppS = new javax.swing.JButton();
        btnGainDateS = new javax.swing.JButton();
        paineTourn = new javax.swing.JPanel();
        dateBeginGanhosT = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        labDateBeginRecebeT = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        tagUsuarioT = new javax.swing.JLabel();
        labeNomeT = new javax.swing.JLabel();
        cbxAppDateT = new javax.swing.JComboBox<>();
        userIdDateT = new javax.swing.JTextField();
        txtDateTotalGainT = new javax.swing.JTextField();
        btnGainAppT = new javax.swing.JButton();
        btnGainDateT = new javax.swing.JButton();
        dateEndGanhosT = new com.toedter.calendar.JDateChooser();
        labEndGainRecieveT = new javax.swing.JLabel();
        labQtdDaysT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        paineSaque = new javax.swing.JPanel();
        dateEndGanhosSQ = new com.toedter.calendar.JDateChooser();
        dateBeginGanhosSQ = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        labDateBeginRecebeSQ = new javax.swing.JLabel();
        labeNomeSQ = new javax.swing.JLabel();
        labQtdDaysSQ = new javax.swing.JLabel();
        labEndGainRecieveSQ = new javax.swing.JLabel();
        tagUsuarioSQ = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        userIdDateSQ = new javax.swing.JTextField();
        txtDateTotalGainSQ = new javax.swing.JTextField();
        cbxAppDateSQ = new javax.swing.JComboBox<>();
        btnGainAppSQ = new javax.swing.JButton();
        btnGainDateSQ = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
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
                .addGap(221, 221, 221))
        );
        paineTopoLayout.setVerticalGroup(
            paineTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneMainDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("ID DO USUÁRIO :");

        userIdDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnGainDate.setText("PESQUISA POR USUÁRIO");
        btnGainDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGainDateMousePressed(evt);
            }
        });
        btnGainDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainDateActionPerformed(evt);
            }
        });

        cbxAppDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxAppDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAppDateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("APLICATIVO :");

        btnGainApp.setText("PESQUISA POR APLICATIVO");
        btnGainApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGainAppMousePressed(evt);
            }
        });
        btnGainApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainAppActionPerformed(evt);
            }
        });

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

        labEndGainRecieve.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labEndGainRecieve.setForeground(new java.awt.Color(255, 0, 0));
        labEndGainRecieve.setText("0000-00-00");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("QUANTIDADE DE DIAS DESSE INTERVALO :");

        labQtdDays.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labQtdDays.setForeground(new java.awt.Color(0, 125, 208));
        labQtdDays.setText("0000 dias");

        tagUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tagUsuario.setText("USUÁRIO : ");

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
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineGainLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineGainLayout.createSequentialGroup()
                                .addComponent(dateBeginGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(dateEndGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paineGainLayout.createSequentialGroup()
                                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paineGainLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userIdDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGainDate))
                                    .addGroup(paineGainLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(4, 4, 4)
                                        .addComponent(cbxAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnGainApp))
                                    .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineGainLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(labQtdDays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineGainLayout.createSequentialGroup()
                                            .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineGainLayout.createSequentialGroup()
                                                    .addComponent(tagUsuario)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(labeNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                            .addComponent(labEndGainRecieve))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(paineGainLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );
        paineGainLayout.setVerticalGroup(
            paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineGainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateBeginGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateEndGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
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
                    .addComponent(tagUsuario)
                    .addComponent(labeNome))
                .addGap(21, 21, 21)
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDateTotalGain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(labDateBeginRecebe)
                    .addComponent(jLabel8)
                    .addComponent(labEndGainRecieve))
                .addGap(18, 18, 18)
                .addGroup(paineGainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labQtdDays))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel5.getAccessibleContext().setAccessibleDescription("");

        paneMainDate.addTab("GANHOS", paineGain);

        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText("SELECIONE O INTERVALO DAS DATAS PARA EXECUTAR SUA PESQUISA DE FORMA CORRETA");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("ID DO USUÁRIO :");

        labQtdDaysP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labQtdDaysP.setForeground(new java.awt.Color(0, 125, 208));
        labQtdDaysP.setText("0000 dias");

        labEndGainRecieveP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labEndGainRecieveP.setForeground(new java.awt.Color(255, 0, 0));
        labEndGainRecieveP.setText("0000-00-00");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("APLICATIVO : ");

        tagUsuarioP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tagUsuarioP.setText("USUÁRIO : ");

        labDateBeginRecebeP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labDateBeginRecebeP.setForeground(new java.awt.Color(255, 0, 0));
        labDateBeginRecebeP.setText("0000-00-00");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("ENTRE");

        labeNomeP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labeNomeP.setForeground(new java.awt.Color(0, 125, 208));
        labeNomeP.setText("nome usuário");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("E");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("TOTAL DE PERDAS : ");

        cbxAppDateP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        userIdDateP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtDateTotalGainP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDateTotalGainP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(63, 149, 255)));

        btnGainAppP.setText("PESQUISA POR APLICATIVO");
        btnGainAppP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGainAppPMousePressed(evt);
            }
        });
        btnGainAppP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainAppPActionPerformed(evt);
            }
        });

        btnGainDateP.setText("PESQUISA POR USUÁRIO");
        btnGainDateP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGainDatePMousePressed(evt);
            }
        });
        btnGainDateP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainDatePActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setText("QUANTIDADE DE DIAS DESSE INTERVALO :");

        javax.swing.GroupLayout paineLostLayout = new javax.swing.GroupLayout(paineLost);
        paineLost.setLayout(paineLostLayout);
        paineLostLayout.setHorizontalGroup(
            paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineLostLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(paineLostLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineLostLayout.createSequentialGroup()
                        .addGroup(paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paineLostLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labQtdDaysP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(paineLostLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateTotalGainP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labDateBeginRecebeP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labEndGainRecieveP))
                            .addGroup(paineLostLayout.createSequentialGroup()
                                .addComponent(tagUsuarioP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labeNomeP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(paineLostLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userIdDateP, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGainDateP)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(paineLostLayout.createSequentialGroup()
                        .addGroup(paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineLostLayout.createSequentialGroup()
                                .addComponent(dateBeginGanhosP, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(dateEndGanhosP, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paineLostLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(2, 2, 2)
                                .addComponent(cbxAppDateP, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGainAppP)))
                        .addContainerGap())))
        );
        paineLostLayout.setVerticalGroup(
            paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineLostLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(16, 16, 16)
                .addGroup(paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateEndGanhosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateBeginGanhosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbxAppDateP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGainAppP))
                .addGap(18, 18, 18)
                .addGroup(paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(userIdDateP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGainDateP))
                .addGap(18, 18, 18)
                .addGroup(paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tagUsuarioP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labeNomeP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtDateTotalGainP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(labDateBeginRecebeP)
                    .addComponent(jLabel25)
                    .addComponent(labEndGainRecieveP))
                .addGap(18, 18, 18)
                .addGroup(paineLostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labQtdDaysP)
                    .addComponent(jLabel30))
                .addContainerGap())
        );

        paneMainDate.addTab("PERDAS", paineLost);

        jLabel13.setForeground(new java.awt.Color(153, 0, 153));
        jLabel13.setText("SELECIONE O INTERVALO DAS DATAS PARA EXECUTAR SUA PESQUISA DE FORMA CORRETA");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("E");

        labQtdDaysS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labQtdDaysS.setForeground(new java.awt.Color(0, 125, 208));
        labQtdDaysS.setText("0000 dias");

        tagUsuarioS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tagUsuarioS.setText("USUÁRIO :");

        labEndGainRecieveS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labEndGainRecieveS.setForeground(new java.awt.Color(255, 0, 0));
        labEndGainRecieveS.setText("0000-00-00");

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setText("APLICATIVO : ");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setText("ID DO USUÁRIO : ");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("SALDO TOTAL :");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("ENTRE");

        labeNomeS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labeNomeS.setForeground(new java.awt.Color(0, 125, 208));
        labeNomeS.setText("nome usuário");

        labDateBeginRecebeS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labDateBeginRecebeS.setForeground(new java.awt.Color(255, 0, 0));
        labDateBeginRecebeS.setText("0000-00-00");

        txtDateTotalGainS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDateTotalGainS.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(63, 149, 255)));

        userIdDateS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cbxAppDateS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel63.setText("QUANTIDADE DE DIAS DESSE INTERVALO :");

        btnGainAppS.setText("PESQUISA POR APLICATIVO");
        btnGainAppS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGainAppSMousePressed(evt);
            }
        });
        btnGainAppS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainAppSActionPerformed(evt);
            }
        });

        btnGainDateS.setText("PESQUISA POR USUÁRIO");
        btnGainDateS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGainDateSMousePressed(evt);
            }
        });
        btnGainDateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainDateSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paineBalanceLayout = new javax.swing.GroupLayout(paineBalance);
        paineBalance.setLayout(paineBalanceLayout);
        paineBalanceLayout.setHorizontalGroup(
            paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineBalanceLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineBalanceLayout.createSequentialGroup()
                        .addComponent(dateBeginGanhosS, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(dateEndGanhosS, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paineBalanceLayout.createSequentialGroup()
                        .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineBalanceLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(2, 2, 2)
                                .addComponent(cbxAppDateS, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGainAppS))
                            .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(paineBalanceLayout.createSequentialGroup()
                                    .addComponent(jLabel63)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labQtdDaysS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineBalanceLayout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDateTotalGainS, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel36)
                                    .addGap(6, 6, 6)
                                    .addComponent(labDateBeginRecebeS)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labEndGainRecieveS)))
                            .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineBalanceLayout.createSequentialGroup()
                                    .addComponent(tagUsuarioS)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labeNomeS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineBalanceLayout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(userIdDateS, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnGainDateS))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(paineBalanceLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paineBalanceLayout.setVerticalGroup(
            paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineBalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(17, 17, 17)
                .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateEndGanhosS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateBeginGanhosS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(cbxAppDateS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGainAppS))
                .addGap(18, 18, 18)
                .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdDateS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGainDateS)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeNomeS)
                    .addComponent(tagUsuarioS))
                .addGap(18, 18, 18)
                .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateTotalGainS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36)
                    .addComponent(labDateBeginRecebeS)
                    .addComponent(jLabel27)
                    .addComponent(labEndGainRecieveS))
                .addGap(23, 23, 23)
                .addGroup(paineBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(labQtdDaysS))
                .addContainerGap())
        );

        paneMainDate.addTab("SALDOS", paineBalance);

        jLabel14.setForeground(new java.awt.Color(153, 0, 153));
        jLabel14.setText("SELECIONE O INTERVALO DAS DATAS PARA EXECUTAR SUA PESQUISA DE FORMA CORRETA");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel41.setText("APLICATIVO : ");

        labDateBeginRecebeT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labDateBeginRecebeT.setForeground(new java.awt.Color(255, 0, 0));
        labDateBeginRecebeT.setText("0000-00-00");

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel43.setText("ID DO USUÁRIO : ");

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel44.setText("TOTAL DE TORNEIOS :");

        tagUsuarioT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tagUsuarioT.setText("USUÁRIO :");

        labeNomeT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labeNomeT.setForeground(new java.awt.Color(0, 125, 208));
        labeNomeT.setText("nome usuário");

        cbxAppDateT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        userIdDateT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtDateTotalGainT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDateTotalGainT.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(63, 149, 255)));

        btnGainAppT.setText("PESQUISA POR APLICATIVO");
        btnGainAppT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGainAppTMousePressed(evt);
            }
        });
        btnGainAppT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainAppTActionPerformed(evt);
            }
        });

        btnGainDateT.setText("PESQUISAR POR USUÁRIO");
        btnGainDateT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGainDateTMousePressed(evt);
            }
        });
        btnGainDateT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainDateTActionPerformed(evt);
            }
        });

        labEndGainRecieveT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labEndGainRecieveT.setForeground(new java.awt.Color(255, 0, 0));
        labEndGainRecieveT.setText("0000-00-00");

        labQtdDaysT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labQtdDaysT.setForeground(new java.awt.Color(0, 125, 208));
        labQtdDaysT.setText("0000 dias");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("QUANTIDADE DE DIAS DESSE INTERVALO :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ENTRE");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("E");

        javax.swing.GroupLayout paineTournLayout = new javax.swing.GroupLayout(paineTourn);
        paineTourn.setLayout(paineTournLayout);
        paineTournLayout.setHorizontalGroup(
            paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineTournLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel14))
            .addGroup(paineTournLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineTournLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userIdDateT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGainDateT)
                        .addGap(277, 277, 277))
                    .addGroup(paineTournLayout.createSequentialGroup()
                        .addGroup(paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineTournLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(4, 4, 4)
                                .addComponent(cbxAppDateT, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGainAppT))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineTournLayout.createSequentialGroup()
                                .addComponent(dateBeginGanhosT, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(dateEndGanhosT, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paineTournLayout.createSequentialGroup()
                        .addGroup(paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paineTournLayout.createSequentialGroup()
                                .addComponent(tagUsuarioT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labeNomeT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(90, 90, 90))
                            .addGroup(paineTournLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateTotalGainT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labDateBeginRecebeT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labEndGainRecieveT))
                            .addGroup(paineTournLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(labQtdDaysT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        paineTournLayout.setVerticalGroup(
            paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineTournLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateBeginGanhosT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateEndGanhosT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(cbxAppDateT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGainAppT))
                .addGap(19, 19, 19)
                .addGroup(paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(userIdDateT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGainDateT))
                .addGap(18, 18, 18)
                .addGroup(paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagUsuarioT)
                    .addComponent(labeNomeT))
                .addGap(18, 18, 18)
                .addGroup(paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtDateTotalGainT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labDateBeginRecebeT)
                    .addComponent(labEndGainRecieveT)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(paineTournLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labQtdDaysT)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        paneMainDate.addTab("TORNEIOS", paineTourn);

        jLabel15.setForeground(new java.awt.Color(153, 0, 153));
        jLabel15.setText("SELECIONE O INTERVALO DAS DATAS PARA EXECUTAR SUA PESQUISA DE FORMA CORRETA");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setText("TOTAL SAQUES :");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setText("E");

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel53.setText("APLICATIVO : ");

        labDateBeginRecebeSQ.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labDateBeginRecebeSQ.setForeground(new java.awt.Color(255, 0, 0));
        labDateBeginRecebeSQ.setText("0000-00-00");

        labeNomeSQ.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labeNomeSQ.setForeground(new java.awt.Color(0, 125, 208));
        labeNomeSQ.setText("nome usuário");

        labQtdDaysSQ.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labQtdDaysSQ.setForeground(new java.awt.Color(0, 125, 208));
        labQtdDaysSQ.setText("0000 dias");

        labEndGainRecieveSQ.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labEndGainRecieveSQ.setForeground(new java.awt.Color(255, 0, 0));
        labEndGainRecieveSQ.setText("0000-00-00");

        tagUsuarioSQ.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tagUsuarioSQ.setText("USUÁRIO :");

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel61.setText("ID DO USUÁRIO : ");

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel62.setText("ENTRE");

        userIdDateSQ.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtDateTotalGainSQ.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDateTotalGainSQ.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(63, 149, 255)));

        cbxAppDateSQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        btnGainAppSQ.setText("PESQUISA POR APLICATIVO");
        btnGainAppSQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGainAppSQMousePressed(evt);
            }
        });
        btnGainAppSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainAppSQActionPerformed(evt);
            }
        });

        btnGainDateSQ.setText("PESQUISA PRO USUÁRIO");
        btnGainDateSQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGainDateSQMousePressed(evt);
            }
        });
        btnGainDateSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainDateSQActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("QUANTIDADE DE DIAS DESSE INTERVALO :");

        javax.swing.GroupLayout paineSaqueLayout = new javax.swing.GroupLayout(paineSaque);
        paineSaque.setLayout(paineSaqueLayout);
        paineSaqueLayout.setHorizontalGroup(
            paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineSaqueLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineSaqueLayout.createSequentialGroup()
                        .addComponent(dateBeginGanhosSQ, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(dateEndGanhosSQ, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paineSaqueLayout.createSequentialGroup()
                        .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineSaqueLayout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addGap(4, 4, 4)
                                .addComponent(cbxAppDateSQ, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGainAppSQ))
                            .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(paineSaqueLayout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labQtdDaysSQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineSaqueLayout.createSequentialGroup()
                                    .addComponent(jLabel51)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDateTotalGainSQ, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel62)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labDateBeginRecebeSQ)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel52)
                                    .addGap(8, 8, 8)
                                    .addComponent(labEndGainRecieveSQ)))
                            .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(paineSaqueLayout.createSequentialGroup()
                                    .addComponent(tagUsuarioSQ)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labeNomeSQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineSaqueLayout.createSequentialGroup()
                                    .addComponent(jLabel61)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(userIdDateSQ, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnGainDateSQ))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(paineSaqueLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paineSaqueLayout.setVerticalGroup(
            paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineSaqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineSaqueLayout.createSequentialGroup()
                        .addComponent(dateBeginGanhosSQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(cbxAppDateSQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGainAppSQ)))
                    .addComponent(dateEndGanhosSQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(userIdDateSQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGainDateSQ))
                .addGap(18, 18, 18)
                .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagUsuarioSQ)
                    .addComponent(labeNomeSQ))
                .addGap(18, 18, 18)
                .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtDateTotalGainSQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(labDateBeginRecebeSQ)
                    .addComponent(jLabel52)
                    .addComponent(labEndGainRecieveSQ))
                .addGap(21, 21, 21)
                .addGroup(paineSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labQtdDaysSQ)
                    .addComponent(jLabel28))
                .addContainerGap())
        );

        paneMainDate.addTab("SAQUES", paineSaque);

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
                    .addComponent(paneMainDate, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paineGeralLayout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paineGeralLayout.setVerticalGroup(
            paineGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineGeralLayout.createSequentialGroup()
                .addComponent(paineTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneMainDate, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paineGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnClose))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnGainAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainAppActionPerformed

        Date teste, teste2 = new Date();
        int teste3;
        //Pegando parte de um String e usando no IF
        String valcomp = "";
        String valcomp_part = "";

        valcomp = String.valueOf(cbxAppDate.getModel().getSelectedItem());
        valcomp_part = valcomp.substring(0, 4);

        teste = dateBeginGanhos.getDate();
        teste2 = dateEndGanhos.getDate();
        teste3 = cbxAppDate.getSelectedIndex();

        if (teste == null || teste2 == null || teste3 <= 0) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {

            if (valcomp_part.contains("**")) {

                JOptionPane.showMessageDialog(null, "Selecione uma opção que seja somente um usuário e um aplicativo\n(que não tenham **)");

            } else {
                pesquisaAppGainDate();
                LimparCamposDatas();
            }

        }

    }//GEN-LAST:event_btnGainAppActionPerformed

    private void btnGainAppMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGainAppMousePressed
        labeNome.setText("");
        tagUsuario.setText("APLICATIVO (CONTA) : ");
    }//GEN-LAST:event_btnGainAppMousePressed

    private void cbxAppDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAppDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAppDateActionPerformed

    private void btnGainDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainDateActionPerformed

        Date teste, teste2 = new Date();
        String teste3;

        teste = dateBeginGanhos.getDate();
        teste2 = dateEndGanhos.getDate();
        teste3 = userIdDate.getText();

        if (teste == null || teste2 == null || teste3.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {
            pesquisaUserGainDate();
            LimparCamposDatas();

        }

    }//GEN-LAST:event_btnGainDateActionPerformed

    private void btnGainDateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGainDateMousePressed
        labeNomeP.setText("");
        tagUsuario.setText("USUÁRIO : ");
    }//GEN-LAST:event_btnGainDateMousePressed

    private void btnGainAppPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainAppPActionPerformed
        Date teste, teste2 = new Date();
        int teste3;
        //Pegando parte de um String e usando no IF
        String valcomp = "";
        String valcomp_part = "";

        valcomp = String.valueOf(cbxAppDateP.getModel().getSelectedItem());
        valcomp_part = valcomp.substring(0, 4);

        teste = dateBeginGanhosP.getDate();
        teste2 = dateEndGanhosP.getDate();
        teste3 = cbxAppDateP.getSelectedIndex();

        if (teste == null || teste2 == null || teste3 <= 0) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {

            if (valcomp_part.contains("**")) {

                JOptionPane.showMessageDialog(null, "Selecione uma opção que seja somente um usuário e um aplicativo\n(que não tenham **)");

            } else {
                pesquisaAppLostDate();
                LimparCamposDatas();
            }

        }


    }//GEN-LAST:event_btnGainAppPActionPerformed

    private void btnGainAppSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainAppSActionPerformed
          
    Date teste, teste2 = new Date();
        int teste3;
        //Pegando parte de um String e usando no IF
        String valcomp = "";
        String valcomp_part = "";

        valcomp = String.valueOf(cbxAppDateS.getModel().getSelectedItem());
        valcomp_part = valcomp.substring(0, 4);

        teste = dateBeginGanhosS.getDate();
        teste2 = dateEndGanhosS.getDate();
        teste3 = cbxAppDateS.getSelectedIndex();

        if (teste == null || teste2 == null || teste3 <= 0) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {

            if (valcomp_part.contains("**")) {

                JOptionPane.showMessageDialog(null, "Selecione uma opção que seja somente um usuário e um aplicativo\n(que não tenham **)");

            } else {
                pesquisaAppSaldtDate();
                LimparCamposDatas();
            }

        }
    }//GEN-LAST:event_btnGainAppSActionPerformed

    private void btnGainDatePMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGainDatePMousePressed
        labeNomeP.setText("");
        tagUsuarioP.setText("USUÁRIO : ");
    }//GEN-LAST:event_btnGainDatePMousePressed

    private void btnGainAppPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGainAppPMousePressed
        labeNomeP.setText("");
        tagUsuarioP.setText("APLICATIVO (CONTA) : ");
    }//GEN-LAST:event_btnGainAppPMousePressed

    private void btnGainDatePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainDatePActionPerformed
      Date teste, teste2 = new Date();
        String teste3;

        teste = dateBeginGanhosP.getDate();
        teste2 = dateEndGanhosP.getDate();
        teste3 = userIdDateP.getText();

        if (teste == null || teste2 == null || teste3.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {
            pesquisaUserLostDate();
            LimparCamposDatas();

        }
    }//GEN-LAST:event_btnGainDatePActionPerformed

    private void btnGainAppSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGainAppSMousePressed
        labeNomeS.setText("");
        tagUsuarioS.setText("APLICATIVO (CONTA) : ");
    }//GEN-LAST:event_btnGainAppSMousePressed

    private void btnGainDateSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGainDateSMousePressed
        labeNomeS.setText("");
        tagUsuarioS.setText("USUÁRIO : ");
    }//GEN-LAST:event_btnGainDateSMousePressed

    private void btnGainDateSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainDateSActionPerformed
         Date teste, teste2 = new Date();
        String teste3;

        teste = dateBeginGanhosS.getDate();
        teste2 = dateEndGanhosS.getDate();
        teste3 = userIdDateS.getText();

        if (teste == null || teste2 == null || teste3.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {
            pesquisaUserSaldDate();
            LimparCamposDatas();

        }
    }//GEN-LAST:event_btnGainDateSActionPerformed

    private void btnGainAppSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainAppSQActionPerformed
       
       
    Date teste, teste2 = new Date();
        int teste3;
        //Pegando parte de um String e usando no IF
        String valcomp = "";
        String valcomp_part = "";

        valcomp = String.valueOf(cbxAppDateSQ.getModel().getSelectedItem());
        valcomp_part = valcomp.substring(0, 4);

        teste = dateBeginGanhosSQ.getDate();
        teste2 = dateEndGanhosSQ.getDate();
        teste3 = cbxAppDateSQ.getSelectedIndex();

        if (teste == null || teste2 == null || teste3 <= 0) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {

            if (valcomp_part.contains("**")) {

                JOptionPane.showMessageDialog(null, "Selecione uma opção que seja somente um usuário e um aplicativo\n(que não tenham **)");

            } else {
                pesquisaAppSQDate();
                LimparCamposDatas();
            }

        }
    }//GEN-LAST:event_btnGainAppSQActionPerformed

    private void btnGainAppSQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGainAppSQMousePressed
        labeNomeSQ.setText("");
        tagUsuarioSQ.setText("APLICATIVO (CONTA) : ");
    }//GEN-LAST:event_btnGainAppSQMousePressed

    private void btnGainDateSQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGainDateSQMousePressed
        labeNomeSQ.setText("");
        tagUsuarioSQ.setText("USUÁRIO : ");
    }//GEN-LAST:event_btnGainDateSQMousePressed

    private void btnGainDateSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainDateSQActionPerformed
        Date teste, teste2 = new Date();
        String teste3;

        teste = dateBeginGanhosSQ.getDate();
        teste2 = dateEndGanhosSQ.getDate();
        teste3 = userIdDateSQ.getText();

        if (teste == null || teste2 == null || teste3.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {
            pesquisaUserSQDate();
            LimparCamposDatas();

        }
    }//GEN-LAST:event_btnGainDateSQActionPerformed

    private void btnGainAppTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainAppTActionPerformed
              
    Date teste, teste2 = new Date();
        int teste3;
        //Pegando parte de um String e usando no IF
        String valcomp = "";
        String valcomp_part = "";

        valcomp = String.valueOf(cbxAppDateT.getModel().getSelectedItem());
        valcomp_part = valcomp.substring(0, 4);

        teste = dateBeginGanhosT.getDate();
        teste2 = dateEndGanhosT.getDate();
       
        teste3 = cbxAppDateT.getSelectedIndex();
        

        if (teste == null || teste2 == null || teste3 <= 0) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {

            if (valcomp_part.contains("**")) {

                JOptionPane.showMessageDialog(null, "Selecione uma opção que seja somente um usuário e um aplicativo\n(que não tenham **)");

            } else {
                pesquisaAppTDate();
                LimparCamposDatas();
            }

        }
    }//GEN-LAST:event_btnGainAppTActionPerformed

    private void btnGainAppTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGainAppTMousePressed
        labeNomeT.setText("");
        tagUsuarioT.setText("APLICATIVO (CONTA) : ");
    }//GEN-LAST:event_btnGainAppTMousePressed

    private void btnGainDateTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGainDateTMousePressed
        labeNomeT.setText("");
        tagUsuarioT.setText("USUÁRIO : ");
    }//GEN-LAST:event_btnGainDateTMousePressed

    private void btnGainDateTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainDateTActionPerformed
         Date teste, teste2 = new Date();
        String teste3;

        teste = dateBeginGanhosT.getDate();
        teste2 = dateEndGanhosT.getDate();
        teste3 = userIdDateT.getText();

        if (teste == null || teste2 == null || teste3.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha todos corretamente");
            LimparCamposDatas();

        } else {
            pesquisaUserTDate();
            LimparCamposDatas();

        }

    }//GEN-LAST:event_btnGainDateTActionPerformed

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
    private javax.swing.JButton btnGainAppP;
    private javax.swing.JButton btnGainAppS;
    private javax.swing.JButton btnGainAppSQ;
    private javax.swing.JButton btnGainAppT;
    private javax.swing.JButton btnGainDate;
    private javax.swing.JButton btnGainDateP;
    private javax.swing.JButton btnGainDateS;
    private javax.swing.JButton btnGainDateSQ;
    private javax.swing.JButton btnGainDateT;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxAppDate;
    private javax.swing.JComboBox<String> cbxAppDateP;
    private javax.swing.JComboBox<String> cbxAppDateS;
    private javax.swing.JComboBox<String> cbxAppDateSQ;
    private javax.swing.JComboBox<String> cbxAppDateT;
    public com.toedter.calendar.JDateChooser dateBeginGanhos;
    private com.toedter.calendar.JDateChooser dateBeginGanhosP;
    private com.toedter.calendar.JDateChooser dateBeginGanhosS;
    private com.toedter.calendar.JDateChooser dateBeginGanhosSQ;
    private com.toedter.calendar.JDateChooser dateBeginGanhosT;
    public com.toedter.calendar.JDateChooser dateEndGanhos;
    private com.toedter.calendar.JDateChooser dateEndGanhosP;
    private com.toedter.calendar.JDateChooser dateEndGanhosS;
    private com.toedter.calendar.JDateChooser dateEndGanhosSQ;
    private com.toedter.calendar.JDateChooser dateEndGanhosT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel labDateBeginRecebe;
    private javax.swing.JLabel labDateBeginRecebeP;
    private javax.swing.JLabel labDateBeginRecebeS;
    private javax.swing.JLabel labDateBeginRecebeSQ;
    private javax.swing.JLabel labDateBeginRecebeT;
    public javax.swing.JLabel labEndGainRecieve;
    private javax.swing.JLabel labEndGainRecieveP;
    private javax.swing.JLabel labEndGainRecieveS;
    private javax.swing.JLabel labEndGainRecieveSQ;
    private javax.swing.JLabel labEndGainRecieveT;
    public javax.swing.JLabel labQtdDays;
    private javax.swing.JLabel labQtdDaysP;
    private javax.swing.JLabel labQtdDaysS;
    private javax.swing.JLabel labQtdDaysSQ;
    private javax.swing.JLabel labQtdDaysT;
    private javax.swing.JLabel labeNome;
    private javax.swing.JLabel labeNomeP;
    private javax.swing.JLabel labeNomeS;
    private javax.swing.JLabel labeNomeSQ;
    private javax.swing.JLabel labeNomeT;
    public javax.swing.JPanel paineBalance;
    public javax.swing.JPanel paineGain;
    private javax.swing.JPanel paineGeral;
    public javax.swing.JPanel paineLost;
    public javax.swing.JPanel paineSaque;
    private javax.swing.JPanel paineTopo;
    public javax.swing.JPanel paineTourn;
    public javax.swing.JTabbedPane paneMainDate;
    public javax.swing.JLabel tagUsuario;
    private javax.swing.JLabel tagUsuarioP;
    private javax.swing.JLabel tagUsuarioS;
    private javax.swing.JLabel tagUsuarioSQ;
    private javax.swing.JLabel tagUsuarioT;
    public javax.swing.JTextField txtDateTotalGain;
    private javax.swing.JTextField txtDateTotalGainP;
    private javax.swing.JTextField txtDateTotalGainS;
    private javax.swing.JTextField txtDateTotalGainSQ;
    private javax.swing.JTextField txtDateTotalGainT;
    private javax.swing.JTextField userIdDate;
    private javax.swing.JTextField userIdDateP;
    private javax.swing.JTextField userIdDateS;
    private javax.swing.JTextField userIdDateSQ;
    private javax.swing.JTextField userIdDateT;
    // End of variables declaration//GEN-END:variables

    private void pesquisaUserGainDate() {
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

                    //IMPRIMINDO NA LABEL
                    qtdDias = Long.toString(days);
                        // quando seleciona um dia somente
                    //a função ChronoUnit retorna 0
                    //o if deve considerar string, pois a variável long foi convertida em string
                    if(qtdDias.equals("0")){
                        labQtdDays.setText("sem intervalos");   
                        
                    }else if(qtdDias.equals("1")){
                    
                        labQtdDays.setText(qtdDias + " dia");   
                    }else{
                        labQtdDays.setText(qtdDias + " dias");                        
                    }

                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro: " + errochro);
                }

              } catch (Exception errotime) {
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

    //APP PESQUISA GAIN
    private void pesquisaAppGainDate() {
        Date beginGainRec = new Date();
        Date endGainRec = new Date();

        int id_app_pesq = 0;
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

            labDateBeginRecebe.setText(dataBeginFormatada);

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

                    //IMPRIMINDO NA LABEL
                    qtdDias = Long.toString(days);
                     // quando seleciona um dia somente
                    //a função ChronoUnit retorna 0
                    //o if deve considerar string, pois a variável long foi convertida em string
                    if(qtdDias.equals("0")){
                        labQtdDays.setText("sem intervalos");   
                        
                    }else if(qtdDias.equals("1")){
                    
                        labQtdDays.setText(qtdDias + " dia");   
                    }else{
                        labQtdDays.setText(qtdDias + " dias");                        
                    }

                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro ListarDatas: " + errochro);
                }

            } catch (Exception errotime) {
                JOptionPane.showMessageDialog(null, "Tempo erro ListarDatas: " + errotime);
            }

            labDateBeginRecebe.setText(dataBeginFormatada);
            labEndGainRecieve.setText(dataEndFormatada);

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaGanhos no frmListarDatas:" + erro);
        }

        BancoDAO objbancodao = new BancoDAO();
        //imprimindo na Label valor da DTO            
        objbancodao.appParaListarDatas(objpesqdatedto);
        String setandoAppName = objpesqdatedto.getNome_app();
        labeNome.setText(setandoAppName);

        objbancodao.pesquisaDateAppGainDAO(objpesqdatedto);

        somaGainStr = String.valueOf(objpesqdatedto.getSoma());
        txtDateTotalGain.setText(somaGainStr);

    }

    public void LimparCamposDatas() {

        cbxAppDate.getModel().setSelectedItem("Selecione");
        cbxAppDateP.getModel().setSelectedItem("Selecione");
        cbxAppDateS.getModel().setSelectedItem("Selecione");
        cbxAppDateT.getModel().setSelectedItem("Selecione");
        cbxAppDateSQ.getModel().setSelectedItem("Selecione");
        
        userIdDate.setText("");
        userIdDateP.setText("");
        userIdDateS.setText("");
        userIdDateT.setText("");
        userIdDateSQ.setText("");
        
        dateBeginGanhos.setDate(null);
        dateBeginGanhosP.setDate(null);
        dateBeginGanhosS.setDate(null);
        dateBeginGanhosT.setDate(null);
        dateBeginGanhosSQ.setDate(null);
        
        dateEndGanhos.setDate(null);
        dateEndGanhosP.setDate(null);
        dateEndGanhosS.setDate(null);
        dateEndGanhosT.setDate(null);
        dateEndGanhosSQ.setDate(null);

    }

    PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();

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
                cbxAppDateP.addItem(idPoker.lastElement() + rs.getString(2));
                cbxAppDateS.addItem(idPoker.lastElement() + rs.getString(2));
                cbxAppDateT.addItem(idPoker.lastElement() + rs.getString(2));
                cbxAppDateSQ.addItem(idPoker.lastElement() + rs.getString(2));

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "frmListarDatas comboBoxApp: " + erro);

        }

    }

    
       //APP PESQUISA LOST
    private void pesquisaAppLostDate() {
        Date beginLostRec = new Date();
        Date endLostRec = new Date();

        int id_app_pesq = 0;
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

        beginLostRec = dateBeginGanhosP.getDate();
        endLostRec = dateEndGanhosP.getDate();

        //SETANDO O ID NA DTO PELA COMBOBOX
        id_app_pesq = cbxAppDateP.getSelectedIndex();

        //INSTANCIANDO E SETANDO
        PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();
        objpesqdatedto.setDatainicio(beginLostRec);
        objpesqdatedto.setDatafim(endLostRec);
        objpesqdatedto.setId_app(id_app_pesq);

        try {
            //convertendo a Date em String
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            //pegando da DTO e terminando a conversão da Date
            dataBeginFormatada = dateFormat.format(objpesqdatedto.getDatainicio());

            labDateBeginRecebeP.setText(dataBeginFormatada);

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

                    //IMPRIMINDO NA LABEL
                    qtdDias = Long.toString(days);
                    // quando seleciona um dia somente
                    //a função ChronoUnit retorna 0
                    //o if deve considerar string, pois a variável long foi convertida em string
                    if(qtdDias.equals("0")){
                        labQtdDaysP.setText("sem intervalos");   
                        
                    }else if(qtdDias.equals("1")){
                    
                        labQtdDaysP.setText(qtdDias + " dia");   
                    }else{
                        labQtdDaysP.setText(qtdDias + " dias");                        
                    }


                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro ListarDatas: " + errochro);
                }

            } catch (Exception errotime) {
                JOptionPane.showMessageDialog(null, "Tempo erro ListarDatas: " + errotime);
            }

            labDateBeginRecebeP.setText(dataBeginFormatada);
            labEndGainRecieveP.setText(dataEndFormatada);

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaLost no frmListarDatas:" + erro);
        }

        BancoDAO objbancodao = new BancoDAO();
        //imprimindo na Label valor da DTO            
        objbancodao.appParaListarDatas(objpesqdatedto);
        String setandoAppName = objpesqdatedto.getNome_app();
        labeNomeP.setText(setandoAppName);

        objbancodao.pesquisaDateAppLostDAO(objpesqdatedto);

        somaGainStr = String.valueOf(objpesqdatedto.getSoma());
        txtDateTotalGainP.setText(somaGainStr);

    }

        
    private void pesquisaUserLostDate() {
        Date beginLostRec = new Date();
        Date endLostRec = new Date();
        int id_user_pesq = 0;
        String somaLostStr = "";
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

        beginLostRec = dateBeginGanhosP.getDate();
        endLostRec = dateEndGanhosP.getDate();

        id_user_pesq = Integer.parseInt(userIdDateP.getText());
        //INSTANCIANDO E SETANDO
        PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();
        objpesqdatedto.setDatainicio(beginLostRec);
        objpesqdatedto.setDatafim(endLostRec);
        objpesqdatedto.setIduser(id_user_pesq);

        try {
            //convertendo a Date em String
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            //pegando da DTO e terminando a conversão da Date
            dataBeginFormatada = dateFormat.format(objpesqdatedto.getDatainicio());

            labDateBeginRecebeP.setText(dataBeginFormatada);

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

                    //IMPRIMINDO NA LABEL
                    qtdDias = Long.toString(days);
                     // quando seleciona um dia somente
                    //a função ChronoUnit retorna 0
                    //o if deve considerar string, pois a variável long foi convertida em string
                    if(qtdDias.equals("0")){
                        labQtdDaysP.setText("sem intervalos");   
                        
                    }else if(qtdDias.equals("1")){
                    
                        labQtdDaysP.setText(qtdDias + " dia");   
                    }else{
                        labQtdDaysP.setText(qtdDias + " dias");                        
                    }

                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro: " + errochro);
                }

                
            } catch (Exception errotime) {
                JOptionPane.showMessageDialog(null, "Tempo erro: " + errotime);
            }

            labDateBeginRecebeP.setText(dataBeginFormatada);
            labEndGainRecieveP.setText(dataEndFormatada);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaLost no frmListarDatas:" + e);
        }
        BancoDAO objbancodao = new BancoDAO();
        objbancodao.pesquisaDateUserLostDAO(objpesqdatedto);

        somaLostStr = String.valueOf(objpesqdatedto.getSoma());
        txtDateTotalGainP.setText(somaLostStr);

        //pegando o nome executando o método
        objbancodao.nomeParaListarDatas(objpesqdatedto);

        nome_paraimp = objpesqdatedto.getNome_user();
        labeNomeP.setText(nome_paraimp);
    }
    
    
    
    private void pesquisaAppSaldtDate() {
        Date beginSaldRec = new Date();
        Date endSaldRec = new Date();

        int id_app_pesq = 0;
        String somaSaldStr = "";
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

        beginSaldRec = dateBeginGanhosS.getDate();
        endSaldRec = dateEndGanhosS.getDate();

        //SETANDO O ID NA DTO PELA COMBOBOX
        id_app_pesq = cbxAppDateS.getSelectedIndex();

        //INSTANCIANDO E SETANDO
        PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();
        objpesqdatedto.setDatainicio(beginSaldRec);
        objpesqdatedto.setDatafim(endSaldRec);
        objpesqdatedto.setId_app(id_app_pesq);

        try {
            //convertendo a Date em String
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            //pegando da DTO e terminando a conversão da Date
            dataBeginFormatada = dateFormat.format(objpesqdatedto.getDatainicio());

            labDateBeginRecebeS.setText(dataBeginFormatada);

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

                    //IMPRIMINDO NA LABEL
                    qtdDias = Long.toString(days);
                       // quando seleciona um dia somente
                    //a função ChronoUnit retorna 0
                    //o if deve considerar string, pois a variável long foi convertida em string
                    if(qtdDias.equals("0")){
                        labQtdDaysS.setText("sem intervalos");   
                        
                    }else if(qtdDias.equals("1")){
                    
                        labQtdDaysS.setText(qtdDias + " dia");   
                    }else{
                        labQtdDaysS.setText(qtdDias + " dias");                        
                    }
                    
                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro ListarDatas: " + errochro);
                }

            } catch (Exception errotime) {
                JOptionPane.showMessageDialog(null, "Tempo erro ListarDatas: " + errotime);
            }

            labDateBeginRecebeS.setText(dataBeginFormatada);
            labEndGainRecieveS.setText(dataEndFormatada);

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaSald no frmListarDatas:" + erro);
        }

        BancoDAO objbancodao = new BancoDAO();
        //imprimindo na Label valor da DTO            
        objbancodao.appParaListarDatas(objpesqdatedto);
        String setandoAppName = objpesqdatedto.getNome_app();
        labeNomeS.setText(setandoAppName);

        objbancodao.pesquisaDateAppSaldDAO(objpesqdatedto);

        somaSaldStr = String.valueOf(objpesqdatedto.getSoma());
        txtDateTotalGainS.setText(somaSaldStr);

    }
    
    
        private void pesquisaUserSaldDate() {
        Date beginSaldRec = new Date();
        Date endSaldRec = new Date();
        int id_user_pesq = 0;
        String somaSaldStr = "";
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

        beginSaldRec = dateBeginGanhosS.getDate();
        endSaldRec = dateEndGanhosS.getDate();

        id_user_pesq = Integer.parseInt(userIdDateS.getText());
        //INSTANCIANDO E SETANDO
        PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();
        objpesqdatedto.setDatainicio(beginSaldRec);
        objpesqdatedto.setDatafim(endSaldRec);
        objpesqdatedto.setIduser(id_user_pesq);

        try {
            //convertendo a Date em String
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            //pegando da DTO e terminando a conversão da Date
            dataBeginFormatada = dateFormat.format(objpesqdatedto.getDatainicio());

            labDateBeginRecebeS.setText(dataBeginFormatada);

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

                    //IMPRIMINDO NA LABEL
                    qtdDias = Long.toString(days);
                      // quando seleciona um dia somente
                    //a função ChronoUnit retorna 0
                    //o if deve considerar string, pois a variável long foi convertida em string
                    if(qtdDias.equals("0")){
                        labQtdDaysS.setText("sem intervalos");   
                        
                    }else if(qtdDias.equals("1")){
                    
                        labQtdDaysS.setText(qtdDias + " dia");   
                    }else{
                        labQtdDaysS.setText(qtdDias + " dias");                        
                    }


                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro: " + errochro);
                }

                
            } catch (Exception errotime) {
                JOptionPane.showMessageDialog(null, "Tempo erro: " + errotime);
            }

            labDateBeginRecebeS.setText(dataBeginFormatada);
            labEndGainRecieveS.setText(dataEndFormatada);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaSald no frmListarDatas:" + e);
        }
        BancoDAO objbancodao = new BancoDAO();
        objbancodao.pesquisaDateUserSaldDAO(objpesqdatedto);

        somaSaldStr = String.valueOf(objpesqdatedto.getSoma());
        txtDateTotalGainS.setText(somaSaldStr);

        //pegando o nome executando o método
        objbancodao.nomeParaListarDatas(objpesqdatedto);

        nome_paraimp = objpesqdatedto.getNome_user();
        labeNomeS.setText(nome_paraimp);
       
       
}
        
   private void pesquisaAppSQDate() {
        Date beginSQdRec = new Date();
        Date endSQRec = new Date();

        int id_app_pesq = 0;
        String somaSQStr = "";
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

        beginSQdRec = dateBeginGanhosSQ.getDate();
        endSQRec = dateEndGanhosSQ.getDate();

        //SETANDO O ID NA DTO PELA COMBOBOX
        id_app_pesq = cbxAppDateSQ.getSelectedIndex();

        //INSTANCIANDO E SETANDO
        PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();
        objpesqdatedto.setDatainicio(beginSQdRec);
        objpesqdatedto.setDatafim(endSQRec);
        objpesqdatedto.setId_app(id_app_pesq);

        try {
            //convertendo a Date em String
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            //pegando da DTO e terminando a conversão da Date
            dataBeginFormatada = dateFormat.format(objpesqdatedto.getDatainicio());

            labDateBeginRecebeSQ.setText(dataBeginFormatada);

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

                    //IMPRIMINDO NA LABEL
                    qtdDias = Long.toString(days);
                       // quando seleciona um dia somente
                    //a função ChronoUnit retorna 0
                    //o if deve considerar string, pois a variável long foi convertida em string
                    if(qtdDias.equals("0")){
                        labQtdDaysSQ.setText("sem intervalos");   
                        
                    }else if(qtdDias.equals("1")){
                    
                        labQtdDaysSQ.setText(qtdDias + " dia");   
                    }else{
                        labQtdDaysSQ.setText(qtdDias + " dias");                        
                    }


                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro ListarDatas: " + errochro);
                }

            } catch (Exception errotime) {
                JOptionPane.showMessageDialog(null, "Tempo erro ListarDatas: " + errotime);
            }

            labDateBeginRecebeSQ.setText(dataBeginFormatada);
            labEndGainRecieveSQ.setText(dataEndFormatada);

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaSald no frmListarDatas:" + erro);
        }

        BancoDAO objbancodao = new BancoDAO();
        //imprimindo na Label valor da DTO            
        objbancodao.appParaListarDatas(objpesqdatedto);
        String setandoAppName = objpesqdatedto.getNome_app();
        labeNomeSQ.setText(setandoAppName);

        objbancodao.pesquisaDateAppSQDAO(objpesqdatedto);

        somaSQStr = String.valueOf(objpesqdatedto.getSoma());
        txtDateTotalGainSQ.setText(somaSQStr);

    }
      
   
      private void pesquisaUserSQDate() {
        Date beginSQRec = new Date();
        Date endSQRec = new Date();
        int id_user_pesq = 0;
        String somaSQStr = "";
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

        beginSQRec = dateBeginGanhosSQ.getDate();
        endSQRec = dateEndGanhosSQ.getDate();

        id_user_pesq = Integer.parseInt(userIdDateSQ.getText());
        //INSTANCIANDO E SETANDO
        PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();
        objpesqdatedto.setDatainicio(beginSQRec);
        objpesqdatedto.setDatafim(endSQRec);
        objpesqdatedto.setIduser(id_user_pesq);

        try {
            //convertendo a Date em String
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            //pegando da DTO e terminando a conversão da Date
            dataBeginFormatada = dateFormat.format(objpesqdatedto.getDatainicio());

            labDateBeginRecebeSQ.setText(dataBeginFormatada);

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

                    //IMPRIMINDO NA LABEL
                    qtdDias = Long.toString(days);
                        // quando seleciona um dia somente
                    //a função ChronoUnit retorna 0
                    //o if deve considerar string, pois a variável long foi convertida em string
                    if(qtdDias.equals("0")){
                        labQtdDaysSQ.setText("sem intervalos");   
                        
                    }else if(qtdDias.equals("1")){
                    
                        labQtdDaysSQ.setText(qtdDias + " dia");   
                    }else{
                        labQtdDaysSQ.setText(qtdDias + " dias");                        
                    }


                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro: " + errochro);
                }

                
            } catch (Exception errotime) {
                JOptionPane.showMessageDialog(null, "Tempo erro: " + errotime);
            }

            labDateBeginRecebeSQ.setText(dataBeginFormatada);
            labEndGainRecieveSQ.setText(dataEndFormatada);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaSQ no frmListarDatas:" + e);
        }
        BancoDAO objbancodao = new BancoDAO();
        objbancodao.pesquisaDateUserSQDAO(objpesqdatedto);

        somaSQStr = String.valueOf(objpesqdatedto.getSoma());
        txtDateTotalGainSQ.setText(somaSQStr);

        //pegando o nome executando o método
        objbancodao.nomeParaListarDatas(objpesqdatedto);

        nome_paraimp = objpesqdatedto.getNome_user();
        labeNomeSQ.setText(nome_paraimp);
       
      }
      
        private void pesquisaAppTDate() {
        Date beginTdRec = new Date();
        Date endTRec = new Date();

        int id_app_pesq = 0;
        String somaTStr = "";
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

        beginTdRec = dateBeginGanhosT.getDate();
        endTRec = dateEndGanhosT.getDate();

        //SETANDO O ID NA DTO PELA COMBOBOX
        id_app_pesq = cbxAppDateT.getSelectedIndex();

        //INSTANCIANDO E SETANDO
        PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();
        objpesqdatedto.setDatainicio(beginTdRec);
        objpesqdatedto.setDatafim(endTRec);
        objpesqdatedto.setId_app(id_app_pesq);

        try {
            //convertendo a Date em String
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            //pegando da DTO e terminando a conversão da Date
            dataBeginFormatada = dateFormat.format(objpesqdatedto.getDatainicio());

            labDateBeginRecebeT.setText(dataBeginFormatada);

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

                    //IMPRIMINDO NA LABEL                   
                    qtdDias = Long.toString(days);
                       // quando seleciona um dia somente
                    //a função ChronoUnit retorna 0
                    //o if deve considerar string, pois a variável long foi convertida em string
                    if(qtdDias.equals("0")){
                        labQtdDaysT.setText("sem intervalos");   
                        
                    }else if(qtdDias.equals("1")){
                    
                        labQtdDaysT.setText(qtdDias + " dia");   
                    }else{
                        labQtdDaysT.setText(qtdDias + " dias");                        
                    }
                    
                    
                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro ListarDatas: " + errochro);
                }

            } catch (Exception errotime) {
                JOptionPane.showMessageDialog(null, "Tempo erro ListarDatas: " + errotime);
            }

            labDateBeginRecebeT.setText(dataBeginFormatada);
            labEndGainRecieveT.setText(dataEndFormatada);

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaSald no frmListarDatas:" + erro);
        }

        BancoDAO objbancodao = new BancoDAO();
        //imprimindo na Label valor da DTO            
        objbancodao.appParaListarDatas(objpesqdatedto);
        String setandoAppName = objpesqdatedto.getNome_app();
        labeNomeT.setText(setandoAppName);

        objbancodao.pesquisaDateAppTDAO(objpesqdatedto);

        somaTStr = String.valueOf(objpesqdatedto.getSoma());
        txtDateTotalGainT.setText(somaTStr);

    }
      

    private void pesquisaUserTDate() {
        Date beginTRec = new Date();
        Date endTRec = new Date();
        int id_user_pesq = 0;
        String somaTStr = "";
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

        beginTRec = dateBeginGanhosT.getDate();
        endTRec = dateEndGanhosT.getDate();

        id_user_pesq = Integer.parseInt(userIdDateT.getText());
        //INSTANCIANDO E SETANDO
        PesquisaDateDTO objpesqdatedto = new PesquisaDateDTO();
        objpesqdatedto.setDatainicio(beginTRec);
        objpesqdatedto.setDatafim(endTRec);
        objpesqdatedto.setIduser(id_user_pesq);

        try {
            //convertendo a Date em String
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            //pegando da DTO e terminando a conversão da Date
            dataBeginFormatada = dateFormat.format(objpesqdatedto.getDatainicio());

            labDateBeginRecebeT.setText(dataBeginFormatada);

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

                    //IMPRIMINDO NA LABEL
                    qtdDias = Long.toString(days);
                        // quando seleciona um dia somente
                    //a função ChronoUnit retorna 0
                    //o if deve considerar string, pois a variável long foi convertida em string
                    if(qtdDias.equals("0")){
                        labQtdDaysT.setText("sem intervalos");   
                        
                    }else if(qtdDias.equals("1")){
                    
                        labQtdDaysT.setText(qtdDias + " dia");   
                    }else{
                        labQtdDaysT.setText(qtdDias + " dias");                        
                    }

                } catch (Exception errochro) {
                    JOptionPane.showMessageDialog(null, "Tempo erroChro: " + errochro);
                }

                
            } catch (Exception errotime) {
                JOptionPane.showMessageDialog(null, "Tempo erro: " + errotime);
            }

            labDateBeginRecebeT.setText(dataBeginFormatada);
            labEndGainRecieveT.setText(dataEndFormatada);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Tratamento método PesquisaT no frmListarDatas:" + e);
        }
        BancoDAO objbancodao = new BancoDAO();
        objbancodao.pesquisaDateUserTDAO(objpesqdatedto);

        somaTStr = String.valueOf(objpesqdatedto.getSoma());
        txtDateTotalGainT.setText(somaTStr);

        //pegando o nome executando o método
        objbancodao.nomeParaListarDatas(objpesqdatedto);

        nome_paraimp = objpesqdatedto.getNome_user();
        labeNomeT.setText(nome_paraimp);
       
       
}
           
        

}
