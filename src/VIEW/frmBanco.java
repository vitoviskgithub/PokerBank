package VIEW;

import DAO.BancoDAO;
import DAO.ContaPokerDAO;
import DAO.TorneiosDAO;
import DAO.UsuarioDAO;
import DTO.BankUserDTO;
import DTO.TournamentsDTO;
import DTO.UsuarioDTO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;
import java.util.Vector;

import java.text.ParseException;

import java.sql.SQLException;

import DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class frmBanco extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public frmBanco() {
        initComponents();

        listarValoresBanco();
        restaurarDadosComboBoxAppTourn();
        restaurarDadosComboBoxUserTourn();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigoBanco = new javax.swing.JTextField();
        txtEntradaBanco = new javax.swing.JTextField();
        txtPerdaBanco = new javax.swing.JTextField();
        txtGanhoBanco = new javax.swing.JTextField();
        txtSaldoBanco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBanco = new javax.swing.JTable();
        btnRegistrarBanco = new javax.swing.JButton();
        btnAlterarBanco = new javax.swing.JButton();
        btnLimparBanco = new javax.swing.JButton();
        btnCarregarBanco = new javax.swing.JButton();
        btnExcluirBanco = new javax.swing.JButton();
        btnSairBanco = new javax.swing.JButton();
        btnTorneios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSaqueBank = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btFechar = new javax.swing.JButton();
        btnLstPerdas = new javax.swing.JButton();
        btnLstGanhos = new javax.swing.JButton();
        btnLstTourn = new javax.swing.JButton();
        cbxUserBank = new javax.swing.JComboBox<>();
        cbxAppBank = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnAtualizarSaldo = new javax.swing.JButton();
        txtTotalSaldo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        jcaDataBanco = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("BANCO POKER");

        txtCodigoBanco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCodigoBanco.setText("CODIGO");
        txtCodigoBanco.setEnabled(false);

        txtEntradaBanco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtPerdaBanco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtGanhoBanco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtSaldoBanco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSaldoBanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularSaldo(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Usuário : ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Aplicativo : ");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Entrada :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 255));
        jLabel6.setText("Ganho :");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Perda : ");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("SALDO : ");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Data :");

        tableBanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "USUÁRIO", "APLICATIVO", "ENTRADA", "PERDA", "GANHO", "SALDO", "SAQUE", "DATA"
            }
        ));
        jScrollPane1.setViewportView(tableBanco);

        btnRegistrarBanco.setText("REGISTRAR");
        btnRegistrarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarBancoActionPerformed(evt);
            }
        });

        btnAlterarBanco.setText("ALTERAR");
        btnAlterarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarBancoActionPerformed(evt);
            }
        });

        btnLimparBanco.setText("LIMPAR");
        btnLimparBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBancoActionPerformed(evt);
            }
        });

        btnCarregarBanco.setText("CARREGAR CAMPOS");
        btnCarregarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarBancoActionPerformed(evt);
            }
        });

        btnExcluirBanco.setText("EXCLUIR");
        btnExcluirBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirBancoActionPerformed(evt);
            }
        });

        btnSairBanco.setText("SAIR");
        btnSairBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairBancoActionPerformed(evt);
            }
        });

        btnTorneios.setText("TORNEIOS");
        btnTorneios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorneiosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("SAQUE :");

        txtSaqueBank.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 9)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setText("CLIQUE no campo para calcular");

        btFechar.setText("FECHAR");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btnLstPerdas.setText("LISTAR PERDAS");
        btnLstPerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLstPerdasActionPerformed(evt);
            }
        });

        btnLstGanhos.setText("LISTAR GANHOS");
        btnLstGanhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLstGanhosActionPerformed(evt);
            }
        });

        btnLstTourn.setText("LISTAR TORNEIOS");
        btnLstTourn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLstTournActionPerformed(evt);
            }
        });

        cbxUserBank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        cbxAppBank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Preencha todos os campos antes de REGISTRAR ou ALTERAR");

        btnAtualizarSaldo.setText("ATUALIZAR SALDO T.  (ID)");
        btnAtualizarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarSaldoActionPerformed(evt);
            }
        });

        txtTotalSaldo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTotalSaldo.setForeground(new java.awt.Color(0, 51, 51));
        txtTotalSaldo.setEnabled(false);

        jLabel12.setText("SALDO TOTAL :");

        btnUsuarios.setText("USUÁRIOS");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        jcaDataBanco.setDateFormatString("dd 'de' MMM 'de' yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTorneios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLstTourn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLstPerdas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLstGanhos))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxUserBank, 0, 286, Short.MAX_VALUE)
                                    .addComponent(cbxAppBank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEntradaBanco)
                                    .addComponent(jcaDataBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGanhoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel7)
                                        .addGap(3, 3, 3)
                                        .addComponent(txtPerdaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtSaldoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTotalSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(txtCodigoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSaqueBank, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSairBanco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimparBanco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExcluirBanco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRegistrarBanco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAlterarBanco)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnCarregarBanco))
                                    .addComponent(btnAtualizarSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUsuarios)
                            .addComponent(btFechar))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbxUserBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcaDataBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cbxAppBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntradaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGanhoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPerdaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSaldoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSaqueBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarSaldo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarBanco)
                    .addComponent(btnRegistrarBanco)
                    .addComponent(btnSairBanco)
                    .addComponent(btnExcluirBanco)
                    .addComponent(btnLimparBanco)
                    .addComponent(btnAlterarBanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTorneios)
                    .addComponent(btnLstTourn)
                    .addComponent(btnLstGanhos)
                    .addComponent(btnLstPerdas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairBancoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairBancoActionPerformed

    private void btnCarregarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarBancoActionPerformed

        CarregarCamposBanco();
        listarValoresBanco();

    }//GEN-LAST:event_btnCarregarBancoActionPerformed

    private void btnRegistrarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarBancoActionPerformed

        int teste;
        teste = cbxAppBank.getSelectedIndex();
        int teste1 = cbxUserBank.getSelectedIndex();

        CalcularSaldoGeral();

        if (teste == -1
                || teste1 == -1
                || jcaDataBanco.getDate().equals("")
                || txtEntradaBanco.getText().equals("")
                || txtGanhoBanco.getText().equals("")
                || txtPerdaBanco.getText().equals("")
                || txtSaldoBanco.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio, preencha antes de registrar");
        } else {

            CadastrarBanco();
            listarValoresBanco();
            LimparCamposBanco();
        }

    }//GEN-LAST:event_btnRegistrarBancoActionPerformed

    private void btnAlterarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarBancoActionPerformed

        int teste;
        teste = cbxAppBank.getSelectedIndex();
        int teste1 = cbxUserBank.getSelectedIndex();

        CalcularSaldoGeral();

        if (txtCodigoBanco.getText().equals("")
                || teste == -1
                || teste1 == -1
                || txtEntradaBanco.getText().equals("")
                || txtGanhoBanco.getText().equals("")
                || txtPerdaBanco.getText().equals("")
                || txtSaldoBanco.getText().equals("")
                || jcaDataBanco.getDate().equals("")) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio ou não se cadastrou, preencha antes de alterar");
        } else {

            AlterarBanco();
            listarValoresBanco();
            LimparCamposBanco();
        }

    }//GEN-LAST:event_btnAlterarBancoActionPerformed

    private void btnLimparBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBancoActionPerformed

        LimparCamposBanco();

    }//GEN-LAST:event_btnLimparBancoActionPerformed

    private void btnExcluirBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirBancoActionPerformed

        ExcluirTorneio();
        listarValoresBanco();
        LimparCamposBanco();

    }//GEN-LAST:event_btnExcluirBancoActionPerformed

    private void btnTorneiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorneiosActionPerformed

        frmTorneios objtorneios = new frmTorneios();
        objtorneios.setVisible(true);

    }//GEN-LAST:event_btnTorneiosActionPerformed

    public int saldo_atual;// variável global para acesso de todos
    private void calcularSaldo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularSaldo

        //calculando Ganho - Perda e setando na TexField Saldo ao clical na TextField
        int saldo1 = Integer.parseInt(txtGanhoBanco.getText());
        int saldo2 = Integer.parseInt(txtPerdaBanco.getText());
        int saldo3 = Integer.parseInt(txtEntradaBanco.getText());
        int saldo4 = Integer.parseInt(txtSaqueBank.getText());
        //conversão de uma String para um inteiro
        // se for converter um inteiro em uma String, o código é String.valueOf()

        saldo_atual = ((saldo1 - saldo2) + saldo3) - saldo4;

        String saldoatual = String.valueOf(saldo_atual);

        txtSaldoBanco.setText(saldoatual);
    }//GEN-LAST:event_calcularSaldo

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btnLstTournActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLstTournActionPerformed

        frmListaTourn objlistatourn = new frmListaTourn();
        //ver o JForm
        objlistatourn.setVisible(true);


    }//GEN-LAST:event_btnLstTournActionPerformed

    private void btnLstPerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLstPerdasActionPerformed
        frmListarPerdas objlistaperdas = new frmListarPerdas();
        objlistaperdas.setVisible(true);

    }//GEN-LAST:event_btnLstPerdasActionPerformed

    private void btnLstGanhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLstGanhosActionPerformed
        frmListarGanhos objlistaganho = new frmListarGanhos();
        objlistaganho.setVisible(true);

    }//GEN-LAST:event_btnLstGanhosActionPerformed

    private void btnAtualizarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSaldoActionPerformed

        String login_recebe_id_string = JOptionPane.showInputDialog("Insira o ID de usuário");

        int id_login_recebe = Integer.parseInt(login_recebe_id_string);

//instanciando a DTO e passando os valores das variáveis para a DTO
        BankUserDTO objbankdto = new BankUserDTO();
        objbankdto.setId_user_bank(id_login_recebe);

        somarValoresSaldo(objbankdto);


    }//GEN-LAST:event_btnAtualizarSaldoActionPerformed

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
                new frmBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btnAlterarBanco;
    private javax.swing.JButton btnAtualizarSaldo;
    private javax.swing.JButton btnCarregarBanco;
    private javax.swing.JButton btnExcluirBanco;
    private javax.swing.JButton btnLimparBanco;
    private javax.swing.JButton btnLstGanhos;
    private javax.swing.JButton btnLstPerdas;
    private javax.swing.JButton btnLstTourn;
    private javax.swing.JButton btnRegistrarBanco;
    private javax.swing.JButton btnSairBanco;
    private javax.swing.JButton btnTorneios;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JComboBox<String> cbxAppBank;
    private javax.swing.JComboBox<String> cbxUserBank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jcaDataBanco;
    private javax.swing.JTable tableBanco;
    private javax.swing.JTextField txtCodigoBanco;
    private javax.swing.JTextField txtEntradaBanco;
    private javax.swing.JTextField txtGanhoBanco;
    private javax.swing.JTextField txtPerdaBanco;
    private javax.swing.JTextField txtSaldoBanco;
    private javax.swing.JTextField txtSaqueBank;
    private javax.swing.JTextField txtTotalSaldo;
    // End of variables declaration//GEN-END:variables

    private void CadastrarBanco() {

        Date data_banco = new Date();
        //declarando variável
        int user_banco, app_banco, entrada_banco, perda_banco, ganho_banco, saldo_banco, saque_banco, codigo_banco;

        user_banco = cbxUserBank.getSelectedIndex();
        app_banco = cbxAppBank.getSelectedIndex();
        entrada_banco = Integer.parseInt(txtEntradaBanco.getText());
        perda_banco = Integer.parseInt(txtPerdaBanco.getText());
        ganho_banco = Integer.parseInt(txtGanhoBanco.getText());
        saldo_banco = Integer.parseInt(txtSaldoBanco.getText());
        saque_banco = Integer.parseInt(txtSaqueBank.getText());
        data_banco = jcaDataBanco.getDate();

        //setando os valores dos campos da VIEW para a DTO
        BankUserDTO objbankuserdto = new BankUserDTO();

        objbankuserdto.setId_user_bank(user_banco);
        objbankuserdto.setApp_id_bank(app_banco);
        objbankuserdto.setEntrada_bank(entrada_banco);
        objbankuserdto.setPerda_bank(perda_banco);
        objbankuserdto.setGanho_bank(ganho_banco);
        objbankuserdto.setSaldo_bank(saldo_banco);
        objbankuserdto.setSaque_bank(saque_banco);
        objbankuserdto.setData_bank(data_banco);

        //acessando o método cadastroUsuario na DAO
        BancoDAO objbancodao = new BancoDAO();
        objbancodao.cadastrarBancoDAO(objbankuserdto);//passando as informações da DTO para o método

    }

    private void ExcluirTorneio() {
        int codigo_bank;

        codigo_bank = Integer.parseInt(txtCodigoBanco.getText());

        BankUserDTO objbankuserdto = new BankUserDTO();
        objbankuserdto.setCodigo_bank(codigo_bank);

        BancoDAO objbancodao = new BancoDAO();
        objbancodao.excluirBancoDAO(objbankuserdto);

    }

    private void AlterarBanco() {
        Date data_banco = new Date();
        //declarando variável
        int user_banco, app_banco, entrada_banco, perda_banco, ganho_banco, saldo_banco, saque_banco, codigo_banco;

        codigo_banco = Integer.parseInt(txtCodigoBanco.getText());
        user_banco = cbxUserBank.getSelectedIndex();
        app_banco = cbxAppBank.getSelectedIndex();
        entrada_banco = Integer.parseInt(txtEntradaBanco.getText());
        perda_banco = Integer.parseInt(txtPerdaBanco.getText());
        ganho_banco = Integer.parseInt(txtGanhoBanco.getText());

        //antes de setar o valor de saldo, fazendo a operação matemática necessário e converterndo o valor inteiro em string
        int ssa = ganho_banco - perda_banco;
        String tr = new Integer(ssa).toString();//CONVERTENDO O INTEIRO EM STRING

        txtSaldoBanco.setText(tr);

        //FIM
        saldo_banco = saldo_atual;
        saque_banco = Integer.parseInt(txtSaqueBank.getText());

        data_banco = jcaDataBanco.getDate();

//setando os valores dos campos da VIEW para a DTO
        BankUserDTO objbankuserdto = new BankUserDTO();
        objbankuserdto.setCodigo_bank(codigo_banco);
        objbankuserdto.setId_user_bank(user_banco);
        objbankuserdto.setApp_id_bank(app_banco);
        objbankuserdto.setEntrada_bank(entrada_banco);
        objbankuserdto.setPerda_bank(perda_banco);
        objbankuserdto.setGanho_bank(ganho_banco);
        objbankuserdto.setSaldo_bank(saldo_banco);
        objbankuserdto.setSaque_bank(saque_banco);
        objbankuserdto.setData_bank(data_banco);

        //acessando o método cadastroUsuario na DAO
        BancoDAO objbancodao = new BancoDAO();
        objbancodao.alterarBancoDAO(objbankuserdto);//passando as informações da DTO para o método

    }

    private void CarregarCamposBanco() {

        int setar = tableBanco.getSelectedRow();//serve para designar a linha que será setada, através da seleção feita pelo usuário

//pegar um campo de texto e setando = qual o texto? -> pegar do modelo da tabela, pegando o valor
//o getValue pega qual a linha e qual a coluna
//pega na tabela e seta no campo
        txtCodigoBanco.setText(tableBanco.getModel().getValueAt(setar, 0).toString());
        cbxUserBank.getModel().setSelectedItem(tableBanco.getModel().getValueAt(setar, 1).toString());
        cbxAppBank.getModel().setSelectedItem(tableBanco.getModel().getValueAt(setar, 2).toString());
        txtEntradaBanco.setText(tableBanco.getModel().getValueAt(setar, 3).toString());
        txtPerdaBanco.setText(tableBanco.getModel().getValueAt(setar, 4).toString());//MOSTRANDO O VALOR NA TABELA
        txtGanhoBanco.setText(tableBanco.getModel().getValueAt(setar, 5).toString());
        txtSaldoBanco.setText(tableBanco.getModel().getValueAt(setar, 6).toString());
        txtSaqueBank.setText(tableBanco.getModel().getValueAt(setar, 7).toString());

        //para converter o String para Date, o método PARSE exige tratamento de Exception
        try {

            String teste;//declaro a string
            teste = tableBanco.getModel().getValueAt(setar, 8).toString();//pego a string da tabela

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");//declaro o formato da data 
            Date dataFormatada = formato.parse(teste);//converto a string para data
            jcaDataBanco.setDate(dataFormatada);//seto a data no campo JCalendar

        } catch (ParseException erro) {
            erro.printStackTrace();
        }

        CalcularSaldoGeral();

    }

    private void listarValoresBanco() {

        try {

            BancoDAO objbancodao = new BancoDAO();

//montar esse modo de tabela no Array tabelaUsuario
            DefaultTableModel model = (DefaultTableModel) tableBanco.getModel();
            model.setNumRows(0);

//pega as informações da DAO e monta o ArrayList lista
            ArrayList<BankUserDTO> lista = objbancodao.PesquisarBancoDAO();

//estrutura de repetição for (inicia, até onde vai, acrescentando)
            for (int num = 0; num < lista.size(); num++) {

//aqui dentro montar a tabela
//adicionar na linha quantas colunas
                model.addRow(new Object[]{
                    lista.get(num).getCodigo_bank(),
                    lista.get(num).getId_user_bank(),
                    lista.get(num).getApp_id_bank(),
                    lista.get(num).getEntrada_bank(),
                    lista.get(num).getPerda_bank(),
                    lista.get(num).getGanho_bank(),
                    lista.get(num).getSaldo_bank(),
                    lista.get(num).getSaque_bank(),
                    lista.get(num).getData_bank()
                });
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Listar Valores Banco VIEW: " + erro);

        }

    }

    private void LimparCamposBanco() {

        txtCodigoBanco.setText("");
        cbxAppBank.getModel().setSelectedItem("Selecione");
        cbxUserBank.getModel().setSelectedItem("Selecione");
        txtEntradaBanco.setText("");
        txtPerdaBanco.setText("");
        txtGanhoBanco.setText("");
        txtSaldoBanco.setText("");
        txtSaqueBank.setText("");
        jcaDataBanco.setDate(null);

    }

    public void restaurarDadosComboBoxAppTourn() {
        //Vetor usado para passar dois valores para comboBox
        Vector<Integer> idPoker = new Vector<Integer>();

        try {

            cbxAppBank.removeAllItems();
            cbxAppBank.addItem("Selecione");

            ContaPokerDAO objcontapokerdao = new ContaPokerDAO();
            ResultSet rs = objcontapokerdao.listarAppCombo();

            while (rs.next()) {

                idPoker.addElement(rs.getInt(1));//o elemento faz parte do Vector, e também é importante pois será chave estrangeira
                //concatenei o id mais o valor da coluna selecionada no banco de dados na visualização do usuário
                //também usei o método do Vetor id_contapoker que me retorna o valor somente do último elemento, e não de todo valor
                cbxAppBank.addItem(idPoker.lastElement() + rs.getString(2));// o Item é o que aparece para usuário visualizar

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "frmTorneios comboBoxApp: " + erro);

        }

    }

    public void restaurarDadosComboBoxUserTourn() {
        //Vetor usado para passar dois valores para comboBox
        Vector<Integer> idPoker = new Vector<Integer>();

        try {

            cbxUserBank.removeAllItems();//limpa a comboBox
            cbxUserBank.addItem("Selecione");//inicializa o primeiro item, e não o elemento, com essa string Selecione

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rs = objusuariodao.listarUsuarioCombo();

            while (rs.next()) {

                idPoker.addElement(rs.getInt(1));//o elemento faz parte do Vector, e também é importante pois será chave estrangeira
                //concatenei o id mais o valor da coluna selecionada no banco de dados na visualização do usuário
                //também usei o método do Vetor id_contapoker que me retorna o valor somente do último elemento, e não de todo valor
                cbxUserBank.addItem(idPoker.lastElement() + rs.getString(2));// o Item é o que aparece para usuário visualizar

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "frmTorneios comboBoxUser: " + erro);

        }

    }

    public void CalcularSaldoGeral() {

        //calculando Ganho - Perda e setando na TexField Saldo ao clical na TextField
        int saldo1 = Integer.parseInt(txtGanhoBanco.getText());
        int saldo2 = Integer.parseInt(txtPerdaBanco.getText());
        int saldo3 = Integer.parseInt(txtEntradaBanco.getText());
        int saldo4 = Integer.parseInt(txtSaqueBank.getText());
        //conversão de uma String para um inteiro
        // se for converter um inteiro em uma String, o código é String.valueOf()

        saldo_atual = ((saldo1 - saldo2) + saldo3) - saldo4;

        String saldoatual = String.valueOf(saldo_atual);

        txtSaldoBanco.setText(saldoatual);
    }

    public int somaSaldos;

    private void somarValoresSaldo(BankUserDTO objbankdto) {

        String sql = "SELECT SUM(saldo_bank) AS Total FROM tablebankuser WHERE fk_id_user_bank = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objbankdto.getId_user_bank());

            rs = pstm.executeQuery();

            if (rs.next()) {

                // para pegar o valor de da variável ResultSet pegou no BD, tem que estar 
                //dentro de uma CONDICIONAL IF ou LOOP como WHILE, com o compartaivo se ela está vazia ou não rs.next()
                somaSaldos = rs.getInt(1);
                String textoSoma = String.valueOf(somaSaldos);
                txtTotalSaldo.setText(textoSoma);

            } else {

                JOptionPane.showMessageDialog(null, "Erro na soma dos saldos no frmPrincipal");
            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "frmPrincipal método listarSaldos: " + erro);
        }

    }

}
