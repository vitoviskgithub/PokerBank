package DAO;

import java.sql.DriverManager;
import java.sql.Connection; 
import java.sql.SQLException; 

import javax.swing.JOptionPane;


public class ConexaoDAO{

public Connection conectaBD(){
	Connection conn = null;

	try{
		String url = "jdbc:mysql://localhost:3306/pokerbank?user=root&password="; //já se conecta ao banco de dados específico, no caso pokerbank
		conn = DriverManager.getConnection(url);
		
		}catch(SQLException erro){
		JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
	}
return conn;
}
}