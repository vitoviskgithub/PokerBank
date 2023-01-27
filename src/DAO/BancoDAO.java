package DAO;

import DTO.BankUserDTO;
import DTO.TournamentsDTO;
import java.util.ArrayList;

import java.util.Date;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class BancoDAO {

    //variáveis externas(globais)
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    ArrayList<BankUserDTO> lista = new ArrayList<>();

    public ArrayList<BankUserDTO> PesquisarBancoDAO() {

        String sql = "SELECT * FROM tablebankuser";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar
            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                BankUserDTO objbankuserdto = new BankUserDTO();

                //acessando a classe através do objeto
                objbankuserdto.setCodigo_bank(rs.getInt("codigo_bank"));//o rs recebe o valor do banco para armazenar na variável, pois é variável ResultSet / após isso setamos na DTO esse valor
                objbankuserdto.setId_user_bank(rs.getInt("fk_id_user_bank"));
                objbankuserdto.setApp_id_bank(rs.getInt("fk_app_id_bank"));
                objbankuserdto.setEntrada_bank(rs.getInt("entrada_bank"));
                objbankuserdto.setPerda_bank(rs.getInt("perda_bank"));//nome do banco de dados após o getInt
                objbankuserdto.setGanho_bank(rs.getInt("ganho_bank"));
                objbankuserdto.setSaldo_bank(rs.getInt("saldo_bank"));
                objbankuserdto.setSaque_bank(rs.getInt("saque_bank"));
                objbankuserdto.setData_bank(rs.getDate("data_bank"));
                objbankuserdto.setComment_bank(rs.getString("comment_bank"));

                lista.add(objbankuserdto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "BancoDAO PesquisarTorneioDAO: " + erro);
        }

        return lista;
    }

    public void alterarBancoDAO(BankUserDTO objbankuserdto) {

        String sql = "UPDATE tablebankuser SET fk_id_user_bank = ?, fk_app_id_bank = ?, entrada_bank = ?, perda_bank = ?, ganho_bank = ?, saldo_bank = ?, saque_bank = ?, data_bank = ?, comment_bank = ? where codigo_bank = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            //sempre começa do parâmetro 1
            pstm.setInt(1, objbankuserdto.getId_user_bank());
            pstm.setInt(2, objbankuserdto.getApp_id_bank());
            pstm.setInt(3, objbankuserdto.getEntrada_bank());
            pstm.setInt(4, objbankuserdto.getPerda_bank());
            pstm.setInt(5, objbankuserdto.getGanho_bank());
            pstm.setInt(6, objbankuserdto.getSaldo_bank());
            pstm.setInt(7, objbankuserdto.getSaque_bank());
            
              //converte a variável data para strig antes de enviar para
            //o preparedStatement
            Date data_banco = objbankuserdto.getData_bank();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data_banco_formatada = dateFormat.format(data_banco);
            
            pstm.setString(8, data_banco_formatada);
            pstm.setString(9, objbankuserdto.getComment_bank());
            
            pstm.setInt(10, objbankuserdto.getCodigo_bank());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Alterados dados com sucesso no banco Local");
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "BancoDAO AlterarBanco: " + erro);
        }

    }
    
        public void alterarBancoDAOWeb(BankUserDTO objbankuserdto) {

        String sql = "UPDATE tablebankuser SET fk_id_user_bank = ?, fk_app_id_bank = ?, entrada_bank = ?, perda_bank = ?, ganho_bank = ?, saldo_bank = ?, saque_bank = ?, data_bank = ?, comment_bank = ? where codigo_bank = ?";

        conn = new ConexaoDAO().ConectarWeb();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            //sempre começa do parâmetro 1
            pstm.setInt(1, objbankuserdto.getId_user_bank());
            pstm.setInt(2, objbankuserdto.getApp_id_bank());
            pstm.setInt(3, objbankuserdto.getEntrada_bank());
            pstm.setInt(4, objbankuserdto.getPerda_bank());
            pstm.setInt(5, objbankuserdto.getGanho_bank());
            pstm.setInt(6, objbankuserdto.getSaldo_bank());
            pstm.setInt(7, objbankuserdto.getSaque_bank());
            
              //converte a variável data para strig antes de enviar para
            //o preparedStatement
            Date data_banco = objbankuserdto.getData_bank();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data_banco_formatada = dateFormat.format(data_banco);
            
            pstm.setString(8, data_banco_formatada);
            pstm.setString(9, objbankuserdto.getComment_bank());
            pstm.setInt(10, objbankuserdto.getCodigo_bank());

            pstm.execute();
            
             JOptionPane.showMessageDialog(null, "Alterados dados com sucesso na WEB");

            //acessando o método alteraBanco na DAO
            //ALTERANDO NO BANCO LOCAL
            alterarBancoDAO(objbankuserdto);//passando as informações da DTO para o método

            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "BancoDAO AlterarBanco: " + erro);
        }

    }

    public void excluirBancoDAO(BankUserDTO objbankuserdto) {

        String sql = "DELETE from tablebankuser where codigo_bank = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            pstm.setInt(1, objbankuserdto.getCodigo_bank());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Excluidos dados com sucesso no banco Local");
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "BancoDAO ExcluirBanco: " + erro);
        }

    }
    
        public void excluirBancoDAOWeb(BankUserDTO objbankuserdto) {

        String sql = "DELETE from tablebankuser where codigo_bank = ?";

        conn = new ConexaoDAO().ConectarWeb();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            pstm.setInt(1, objbankuserdto.getCodigo_bank());

            pstm.execute();
            
             JOptionPane.showMessageDialog(null, "Excluidos dados com sucesso na WEB");

            //acessando o método alteraBanco na DAO
            //ALTERANDO NO BANCO LOCAL
           excluirBancoDAO(objbankuserdto);//passando as informações da DTO para o método

            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "BancoDAO ExcluirBanco: " + erro);
        }

    }

    public void cadastrarBancoDAO(BankUserDTO objbankuserdto) {

        String sql = "INSERT INTO tablebankuser (fk_id_user_bank, fk_app_id_bank, entrada_bank, perda_bank, ganho_bank, saldo_bank, saque_bank, data_bank, comment_bank) VALUES(?,?,?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //a variável id_usuario é AUTOINCREMENTY, então é automático ela receber o valor do sistema todas as vezes que cadastra
            pstm.setInt(1, objbankuserdto.getId_user_bank());
            pstm.setInt(2, objbankuserdto.getApp_id_bank());
            pstm.setInt(3, objbankuserdto.getEntrada_bank());
            pstm.setInt(4, objbankuserdto.getPerda_bank());
            pstm.setInt(5, objbankuserdto.getGanho_bank());
            pstm.setInt(6, objbankuserdto.getSaldo_bank());
            pstm.setInt(7, objbankuserdto.getSaque_bank());
                        
            //converte a variável data para strig antes de enviar para
            //o preparedStatement
            Date data_banco = objbankuserdto.getData_bank();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data_banco_formatada = dateFormat.format(data_banco);

            pstm.setString(8, data_banco_formatada);
            pstm.setString(9, objbankuserdto.getComment_bank());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastrados dados com sucesso no banco Local");
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "BancoDAO: " + erro);
        }

    }

    public void cadastrarBancoDAOWeb(BankUserDTO objbankuserdto) {

        String sql = "INSERT INTO tablebankuser (fk_id_user_bank, fk_app_id_bank, entrada_bank, perda_bank, ganho_bank, saldo_bank, saque_bank, data_bank, comment_bank) VALUES(?,?,?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().ConectarWeb();

        try {

            pstm = conn.prepareStatement(sql);

            //a variável id_usuario é AUTOINCREMENTY, então é automático ela receber o valor do sistema todas as vezes que cadastra
            pstm.setInt(1, objbankuserdto.getId_user_bank());
            pstm.setInt(2, objbankuserdto.getApp_id_bank());
            pstm.setInt(3, objbankuserdto.getEntrada_bank());
            pstm.setInt(4, objbankuserdto.getPerda_bank());
            pstm.setInt(5, objbankuserdto.getGanho_bank());
            pstm.setInt(6, objbankuserdto.getSaldo_bank());
            pstm.setInt(7, objbankuserdto.getSaque_bank());
            
            //converte a variável data para strig antes de enviar para
            //o preparedStatement
            Date data_banco = objbankuserdto.getData_bank();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data_banco_formatada = dateFormat.format(data_banco);

            pstm.setString(8, data_banco_formatada);
            pstm.setString(9, objbankuserdto.getComment_bank());

            pstm.execute();
            
             JOptionPane.showMessageDialog(null, "Cadastrados dados com sucesso na WEB");

            //acessando o método alteraBanco na DAO
            //ALTERANDO NO BANCO LOCAL
           cadastrarBancoDAO(objbankuserdto);//passando as informações da DTO para o método

            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "BancoDAO: " + erro);
        }

    }
    
    public ArrayList<BankUserDTO> PesquisarGanhosLista(BankUserDTO objbankdto) {

        String sql = "SELECT * FROM tablebankuser WHERE fk_id_user_bank = ?";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar

            pstm.setInt(1, objbankdto.getId_user_bank());

            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                BankUserDTO objbankuserdto = new BankUserDTO();

                //acessando a classe através do objeto
                objbankuserdto.setData_bank(rs.getDate("data_bank"));
                objbankuserdto.setApp_id_bank(rs.getInt("fk_app_id_bank"));
                objbankuserdto.setGanho_bank(rs.getInt("ganho_bank"));

                lista.add(objbankuserdto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO PesquisarBancoDAOGanho: " + erro);
        }

        return lista;
    }

    public ArrayList<BankUserDTO> PesquisarPerdasLista(BankUserDTO objbankdto) {

        String sql = "SELECT * FROM tablebankuser WHERE fk_id_user_bank = ?";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar

            pstm.setInt(1, objbankdto.getId_user_bank());

            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                BankUserDTO objbankuserdto = new BankUserDTO();

                //acessando a classe através do objeto
                objbankuserdto.setData_bank(rs.getDate("data_bank"));
                objbankuserdto.setApp_id_bank(rs.getInt("fk_app_id_bank"));
                objbankuserdto.setPerda_bank(rs.getInt("perda_bank"));

                lista.add(objbankuserdto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "BancoDAO PesquisarBancoDAOPerda: " + erro);
        }

        return lista;
    }
    
     public ArrayList<BankUserDTO> PesquisarSaquesLista(BankUserDTO objbankdto) {

        String sql = "SELECT * FROM tablebankuser WHERE fk_id_user_bank = ?";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar

            pstm.setInt(1, objbankdto.getId_user_bank());

            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                BankUserDTO objbankuserdto = new BankUserDTO();

                //acessando a classe através do objeto
                objbankuserdto.setData_bank(rs.getDate("data_bank"));
                objbankuserdto.setApp_id_bank(rs.getInt("fk_app_id_bank"));
                objbankuserdto.setSaque_bank(rs.getInt("saque_bank"));

                lista.add(objbankuserdto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "BancoDAO PesquisarBancoDAOSaques: " + erro);
        }

        return lista;
    }

}
