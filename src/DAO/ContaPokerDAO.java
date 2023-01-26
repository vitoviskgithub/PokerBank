package DAO;

import DTO.ContaPokerDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ContaPokerDAO {

    //variáveis externas(globais)
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ContaPokerDTO> lista = new ArrayList<>();//criei um Array através da DTO e todas as vezes que usar o array estou montando esse Array

    public void cadastrarContaPoker(ContaPokerDTO objpokerdto) {

        String sql = "INSERT INTO tablecontapoker (app_contapoker, user_contapoker) VALUES(?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //a variável id_usuario é AUTOINCREMENTY, então é automático ela receber o valor do sistema todas as vezes que cadastra
            pstm.setString(1, objpokerdto.getApp_contapoker());
            pstm.setString(2, objpokerdto.getUser_contapoker());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro da conta poker realizado no banco Local");
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ContaPokerDAO: " + erro);
        }

    }
    
        public void cadastrarContaPokerWeb(ContaPokerDTO objpokerdto) {

        String sql = "INSERT INTO tablecontapoker (app_contapoker, user_contapoker) VALUES(?,?)";

        conn = new ConexaoDAO().ConectarWeb();

        try {

            pstm = conn.prepareStatement(sql);

            //a variável id_usuario é AUTOINCREMENTY, então é automático ela receber o valor do sistema todas as vezes que cadastra
            pstm.setString(1, objpokerdto.getApp_contapoker());
            pstm.setString(2, objpokerdto.getUser_contapoker());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro da conta poker realizado na WEB");
            cadastrarContaPoker(objpokerdto);
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ContaPokerDAO: " + erro);
        }

    }

    public ArrayList<ContaPokerDTO> PesquisarContaPoker() {

        String sql = "SELECT * FROM tablecontapoker";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar
            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                ContaPokerDTO objpokerdto = new ContaPokerDTO();

                //acessando a classe através do objeto
                objpokerdto.setId_contapoker(rs.getInt("id_contapoker"));//o rs recebe o valor do banco para armazenar na variável, pois é variável ResultSet / após isso setamos na DTO esse valor
                objpokerdto.setApp_contapoker(rs.getString("app_contapoker"));
                objpokerdto.setUser_contapoker(rs.getString("user_contapoker"));

                lista.add(objpokerdto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ContaPokerDAO Pesquisar: " + erro);
        }

        return lista;
    }

    public void alterarContaPoker(ContaPokerDTO objcontapokerdto) {

        String sql = "UPDATE tablecontapoker set app_contapoker = ?, user_contapoker = ? where id_contapoker = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 3
            //sempre começa do parâmetro 1
            pstm.setString(1, objcontapokerdto.getApp_contapoker());
            pstm.setString(2, objcontapokerdto.getUser_contapoker());
            pstm.setInt(3, objcontapokerdto.getId_contapoker());

            pstm.execute();
            
             JOptionPane.showMessageDialog(null, "Conta poker do APP alterada no banco Local");
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ContaPokerDAO AlterarContaPoker: " + erro);
        }

    }
    
     public void alterarContaPokerWeb(ContaPokerDTO objcontapokerdto) {

        String sql = "UPDATE tablecontapoker set app_contapoker = ?, user_contapoker = ? where id_contapoker = ?";

        conn = new ConexaoDAO().ConectarWeb();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 3
            //sempre começa do parâmetro 1
            pstm.setString(1, objcontapokerdto.getApp_contapoker());
            pstm.setString(2, objcontapokerdto.getUser_contapoker());
            pstm.setInt(3, objcontapokerdto.getId_contapoker());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Conta poker do APP alterada na WEB");
            alterarContaPoker(objcontapokerdto);
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ContaPokerDAO AlterarContaPoker: " + erro);
        }

    }


    public void excluirContaPoker(ContaPokerDTO objpokerodto) {

        String sql = "DELETE from tablecontapoker where id_contapoker = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            pstm.setInt(1, objpokerodto.getId_contapoker());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Conta poker do APP excluída no banco Local");
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ContaPokerDAO ExcluirContaPoker: " + erro);
        }

    }
    
    public void excluirContaPokerWeb(ContaPokerDTO objpokerodto) {

        String sql = "DELETE from tablecontapoker where id_contapoker = ?";

        conn = new ConexaoDAO().ConectarWeb();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            pstm.setInt(1, objpokerodto.getId_contapoker());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Conta poker do APP excluída na WEB");
            excluirContaPoker(objpokerodto);
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ContaPokerDAO ExcluirContaPoker WEB: " + erro);
        }

    }

    //toda vez que eu trago uma consulta do banco eu tenho que montar o ResultSet
//sempre declarando a classe de conexão e o método exemplo : classe ResultSet método : listarContaPOkerCombo
public ResultSet listarContaPokerCombo(){

conn = new ConexaoDAO().conectaBD();
String sql = "SELECT * FROM tablecontapoker ORDER BY id_contapoker";

try{

pstm = conn.prepareStatement(sql);
return pstm.executeQuery();

}catch(SQLException erro){

System.out.println(erro.getMessage());
JOptionPane.showMessageDialog(null, "ContaPokerDAO : " + erro);
return null;

}
}
      
    public ResultSet listarAppCombo() {

        conn = new ConexaoDAO().conectaBD();
        String sql = "SELECT * FROM tablecontapoker ORDER BY id_contapoker";

        try {

            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {

            System.out.println(erro.getMessage());
            JOptionPane.showMessageDialog(null, "ContaPokerDAO ListarComboIdConta : " + erro);
            return null;

        }
    }

}
