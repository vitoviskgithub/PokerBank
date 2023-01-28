/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testes.planetScaleTeste;

import DAO.UsuarioDAO;
import DTO.BankUserDTO;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Meu Computador
 */
public class testandoJform extends javax.swing.JFrame {

    /**
     * Creates new form testandoJform
     */
    public testandoJform() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAparecer = new javax.swing.JLabel();
        btnAparecer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAparecer.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtAparecer.setText("TEXTO A APARECER");

        btnAparecer.setText("APARECER");
        btnAparecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAparecerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(txtAparecer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnAparecer)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(txtAparecer)
                .addGap(72, 72, 72)
                .addComponent(btnAparecer)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAparecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAparecerActionPerformed
        String login_recebe_id_string = JOptionPane.showInputDialog("Insira novamente seu ID de usuário, por seguranaça");

        int id_login_recebe = Integer.parseInt(login_recebe_id_string);//converte o string recebido para inteiro

        int id_usuario;

        id_usuario = id_login_recebe;
        

        UsuarioDTO objusuariodto = new UsuarioDTO();

        objusuariodto.setId_usuario(id_usuario);
        

        UsuarioDAO objusuariodao = new UsuarioDAO();

        objusuariodao.DadosCadastrais2(objusuariodto);
        //não executa a função e nem conecta, erro ao tentar conectar no BD na web

        String nome_para = objusuariodto.getNome_usuario();

        txtAparecer.setText(nome_para);

        JOptionPane.showMessageDialog(null, nome_para);


    }//GEN-LAST:event_btnAparecerActionPerformed

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
            java.util.logging.Logger.getLogger(testandoJform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testandoJform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testandoJform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testandoJform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testandoJform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAparecer;
    public javax.swing.JLabel txtAparecer;
    // End of variables declaration//GEN-END:variables
}