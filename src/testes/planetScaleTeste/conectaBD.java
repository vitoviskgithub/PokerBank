package testes.planetScaleTeste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conectaBD {

    public static Connection conn = null;

    public static void Conectar() {

        try {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                JOptionPane.showMessageDialog(null, "passou o primeiro");

            } catch (ClassNotFoundException erro) {
                JOptionPane.showMessageDialog(null, "erro 1:" + erro);
            }

            conn = DriverManager.getConnection("jdbc:mysql://us-east.connect.psdb.cloud/",
                    "j0xowov0pnbkcr9t2u2j",
                    "pscale_pw_PJu1lRdWsoUub8kkNpa1OMP3zRWBTpYyfxuKUgmmWpL");

            JOptionPane.showMessageDialog(null, "conectou");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro 2:" + e);
            throw new RuntimeException(e);
        }

    }

    public Connection ConectarClass() {

        try {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                JOptionPane.showMessageDialog(null, "passou o primeiro");

            } catch (ClassNotFoundException erro) {
                JOptionPane.showMessageDialog(null, "erro 1:" + erro);
            }

            conn = DriverManager.getConnection("jdbc:mysql://us-east.connect.psdb.cloud/", "j0xowov0pnbkcr9t2u2j", "pscale_pw_PJu1lRdWsoUub8kkNpa1OMP3zRWBTpYyfxuKUgmmWpL");

            JOptionPane.showMessageDialog(null, "conectou");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "conectaBD erro 2:" + e);
            throw new RuntimeException(e);
        }

        return conn;
    }

}
