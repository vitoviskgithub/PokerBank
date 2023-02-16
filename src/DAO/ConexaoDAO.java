package DAO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class ConexaoDAO {

    public static Connection conn = null;// a variável acessível a todo código
   
    
    public Connection conectaBD(){
         
        try {
           /* String part1 = "jdbc:mysql://localhost:3306/pokerbank?user=root&password=";
            String part2 = "";           
            String url = ""; //já se conecta ao banco de dados específico, no caso pokerbank
            part2 = JOptionPane.showInputDialog(null,"Insira a senha do Banco de Dados Local");
            url = part1 + part2;*/
           
           String url = "jdbc:mysql://localhost:3306/pokerbank?user=root&password=12345678"; //já se conecta ao banco de dados específico, no caso pokerbank
                                   
            conn = DriverManager.getConnection(url);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return conn;
    }

    public Connection ConectarWeb() {

        try {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

               /** JOptionPane.showMessageDialog(null, "Passou o primeiro");*/

            } catch (ClassNotFoundException erro) {
                JOptionPane.showMessageDialog(null, "Conectar com a WEB o BD erro 1: " + erro);
            }

            conn = DriverManager.getConnection("jdbc:mysql://us-east.connect.psdb.cloud/", "j0xowov0pnbkcr9t2u2j", "pscale_pw_PJu1lRdWsoUub8kkNpa1OMP3zRWBTpYyfxuKUgmmWpL");

            /**JOptionPane.showMessageDialog(null, "Conectou");*/

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO ao conectar na WEB com BD erro 2: " + e);
            JOptionPane.showMessageDialog(null, "Banco de Dados OFFLINE\nVerifique se digitou seus dados corretamente e tente novamente");
            
            throw new RuntimeException(e);
        }

        return conn;
    }

//CONECTA AO BANCO DE DADOS DA INTERNET, MAS O MÉTODO NÃO É TIPO CONNECTION
//ELE É VOID, NÃO RETORNA NADA
    public static void ConectarWebNoReturn() {
        
        try {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                JOptionPane.showMessageDialog(null, "CONECTANDO COM O BD PASSO 1");

            } catch (ClassNotFoundException erro) {
                JOptionPane.showMessageDialog(null, "Conectar com a WEB o BD erro 1: " + erro);
            }

            conn = DriverManager.getConnection("jdbc:mysql://us-east.connect.psdb.cloud/",
                    "j0xowov0pnbkcr9t2u2j",
                    "pscale_pw_PJu1lRdWsoUub8kkNpa1OMP3zRWBTpYyfxuKUgmmWpL");

            JOptionPane.showMessageDialog(null, "CONECTOU COM O BD(BANCO DE DADOS)");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO ao conectar na WEB com BD erro 2: " + e);
            throw new RuntimeException(e);
        }

    }

}
