package testes.planetScaleTeste;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class connbdDAO {

    Connection conn;

    public Connection conectaBD() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://us-east.connect.psdb.cloud/pokerbank?sslMode=VERIFY_IDENTITY",
                    "4idqaf34msejn5sh2m45",
                    "pscale_pw_jOzNvhWpTejFfuVndAvdo6xYh1bOBMaummZjM8tNE6m");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro BD connbd: "+e);
        }
        return conn;
    }

}
