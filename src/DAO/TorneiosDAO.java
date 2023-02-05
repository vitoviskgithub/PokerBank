package DAO;

import DTO.TournamentsDTO;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TorneiosDAO {

    //variáveis externas(globais)
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    ArrayList<TournamentsDTO> lista = new ArrayList<>();

    public ArrayList<TournamentsDTO> PesquisarTorneiosLista(TournamentsDTO objlistatourndto) {

        String sql = "SELECT * FROM tabletournaments WHERE fk_id_user_tourn = ?";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar

            pstm.setInt(1, objlistatourndto.getId_user_tourn());

            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                TournamentsDTO objtournamentsdto = new TournamentsDTO();

                //acessando a classe através do objeto
                objtournamentsdto.setDate_tourn(rs.getDate("date_tourn"));
                objtournamentsdto.setApp_id_tourn(rs.getInt("fk_app_id_tourn"));
                objtournamentsdto.setType_tourn(rs.getString("type_tourn"));
                objtournamentsdto.setValue_tourn(rs.getInt("value_tourn"));
                objtournamentsdto.setItm_val_tourn(rs.getInt("itm_val_tourn"));//nome do banco de dados após o getInt

                lista.add(objtournamentsdto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO PesquisarTorneioDAO: " + erro);
        }

        return lista;
    }

    public void cadastrarTorneioDAO(TournamentsDTO objtournamentsdto) {

        String sql = "INSERT INTO tabletournaments (type_tourn, fk_app_id_tourn, fk_id_user_tourn, value_tourn, itm_val_tourn, date_tourn, desc_tourn) VALUES(?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //a variável id_usuario é AUTOINCREMENTY, então é automático ela receber o valor do sistema todas as vezes que cadastra
            pstm.setString(1, objtournamentsdto.getType_tourn());
            pstm.setInt(2, objtournamentsdto.getApp_id_tourn());
            pstm.setInt(3, objtournamentsdto.getId_user_tourn());
            pstm.setInt(4, objtournamentsdto.getValue_tourn());
            pstm.setInt(5, objtournamentsdto.getItm_val_tourn());

            //converte a variável data para strig antes de enviar para
            //o preparedStatement
            Date data_tourn = objtournamentsdto.getDate_tourn();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data_tourn_formatada = dateFormat.format(data_tourn);
            pstm.setString(6, data_tourn_formatada);
            pstm.setString(7, objtournamentsdto.getDesc_tourn());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Torneio cadastrado no banco Local");
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO: " + erro);
        }

    }

    public void cadastrarTorneioDAOWeb(TournamentsDTO objtournamentsdto) {

        String sql = "INSERT INTO tabletournaments (type_tourn, fk_app_id_tourn, fk_id_user_tourn, value_tourn, itm_val_tourn, date_tourn, desc_tourn) VALUES(?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().ConectarWeb();

        try {

            pstm = conn.prepareStatement(sql);

            //a variável id_usuario é AUTOINCREMENTY, então é automático ela receber o valor do sistema todas as vezes que cadastra
            pstm.setString(1, objtournamentsdto.getType_tourn());
            pstm.setInt(2, objtournamentsdto.getApp_id_tourn());
            pstm.setInt(3, objtournamentsdto.getId_user_tourn());
            pstm.setInt(4, objtournamentsdto.getValue_tourn());
            pstm.setInt(5, objtournamentsdto.getItm_val_tourn());

            //converte a variável data para strig antes de enviar para
            //o preparedStatement
            Date data_tourn = objtournamentsdto.getDate_tourn();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data_tourn_formatada = dateFormat.format(data_tourn);
            pstm.setString(6, data_tourn_formatada);
            pstm.setString(7, objtournamentsdto.getDesc_tourn());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Torneio cadastrado na WEB");
            cadastrarTorneioDAO(objtournamentsdto);
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO: " + erro);
        }

    }

    
    public void excluirTorneioDAO(TournamentsDTO objtournamentsdto) {

        String sql = "DELETE from tabletournaments where id_tourn = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            pstm.setInt(1, objtournamentsdto.getId_tourn());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Torneio excluído no banco Local");
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO ExcluirTorneioDAO: " + erro);
        }

    }
    
    public void excluirTorneioDAOWeb(TournamentsDTO objtournamentsdto) {

        String sql = "DELETE from tabletournaments where id_tourn = ?";

        conn = new ConexaoDAO().ConectarWeb();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            pstm.setInt(1, objtournamentsdto.getId_tourn());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Torneio excluído na WEB");
            excluirTorneioDAO(objtournamentsdto);
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO ExcluirTorneioDAO: " + erro);
        }

    }

    
    
    public void alterarTorneioDAO(TournamentsDTO objtournamentsdto) {

        String sql = "UPDATE tabletournaments SET type_tourn = ?, fk_app_id_tourn = ?, fk_id_user_tourn = ?, value_tourn = ?, itm_val_tourn = ?, date_tourn = ?, desc_tourn = ? where id_tourn = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            //sempre começa do parâmetro 1
            pstm.setString(1, objtournamentsdto.getType_tourn());
            pstm.setInt(2, objtournamentsdto.getApp_id_tourn());
            pstm.setInt(3, objtournamentsdto.getId_user_tourn());
            pstm.setInt(4, objtournamentsdto.getValue_tourn());
            pstm.setInt(5, objtournamentsdto.getItm_val_tourn());

            Date data_tourn = objtournamentsdto.getDate_tourn();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data_tourn_formatada = dateFormat.format(data_tourn);
            pstm.setString(6, data_tourn_formatada);
            pstm.setString(7, objtournamentsdto.getDesc_tourn());
            
            pstm.setInt(8, objtournamentsdto.getId_tourn());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Torneio alterado no banco Local");
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO AlterarTorneioDAO: " + erro);
        }

    }

    public void alterarTorneioDAOWeb(TournamentsDTO objtournamentsdto) {

        String sql = "UPDATE tabletournaments SET type_tourn = ?, fk_app_id_tourn = ?, fk_id_user_tourn = ?, value_tourn = ?, itm_val_tourn = ?, date_tourn = ?, desc_tourn = ? where id_tourn = ?";

        conn = new ConexaoDAO().ConectarWeb();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            //sempre começa do parâmetro 1
            pstm.setString(1, objtournamentsdto.getType_tourn());
            pstm.setInt(2, objtournamentsdto.getApp_id_tourn());
            pstm.setInt(3, objtournamentsdto.getId_user_tourn());
            pstm.setInt(4, objtournamentsdto.getValue_tourn());
            pstm.setInt(5, objtournamentsdto.getItm_val_tourn());

            Date data_tourn = objtournamentsdto.getDate_tourn();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data_tourn_formatada = dateFormat.format(data_tourn);
            pstm.setString(6, data_tourn_formatada);
            pstm.setString(7, objtournamentsdto.getDesc_tourn());
            
            pstm.setInt(8, objtournamentsdto.getId_tourn());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Torneio alterado na Web");
            alterarTorneioDAO(objtournamentsdto);
            
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO AlterarTorneioDAO: " + erro);
        }

    }

    
    public ArrayList<TournamentsDTO> PesquisarTorneioDAO() {

        String sql = "SELECT * FROM tabletournaments";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar
            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                TournamentsDTO objtournamentsdto = new TournamentsDTO();

                //acessando a classe através do objeto
                objtournamentsdto.setId_tourn(rs.getInt("id_tourn"));//o rs recebe o valor do banco para armazenar na variável, pois é variável ResultSet / após isso setamos na DTO esse valor
                objtournamentsdto.setType_tourn(rs.getString("type_tourn"));
                objtournamentsdto.setApp_id_tourn(rs.getInt("fk_app_id_tourn"));
                objtournamentsdto.setId_user_tourn(rs.getInt("fk_id_user_tourn"));
                objtournamentsdto.setValue_tourn(rs.getInt("value_tourn"));
                objtournamentsdto.setItm_val_tourn(rs.getInt("itm_val_tourn"));//nome do banco de dados após o getInt
                objtournamentsdto.setDate_tourn(rs.getDate("date_tourn"));
                objtournamentsdto.setDesc_tourn(rs.getString("desc_tourn"));

                lista.add(objtournamentsdto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO PesquisarTorneioDAO: " + erro);
        }

        return lista;
    }
    
     public ArrayList<TournamentsDTO> PesquisarTorneioDateDAO(Date dateset) {

        String sql = "SELECT * FROM tabletournaments WHERE date_tourn = ?";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar
            
            //pega a data de hoje e seta no comando que vai executar no SQL 
            //por essa razão seta String e não Date
            
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");//declaro o formato da data 
            String dataFormatada = formato.format(dateset);
            
            pstm.setString(1, dataFormatada);
            
            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                TournamentsDTO objtournamentsdto = new TournamentsDTO();

                //acessando a classe através do objeto
                objtournamentsdto.setId_tourn(rs.getInt("id_tourn"));//o rs recebe o valor do banco para armazenar na variável, pois é variável ResultSet / após isso setamos na DTO esse valor
                objtournamentsdto.setType_tourn(rs.getString("type_tourn"));
                objtournamentsdto.setApp_id_tourn(rs.getInt("fk_app_id_tourn"));
                objtournamentsdto.setId_user_tourn(rs.getInt("fk_id_user_tourn"));
                objtournamentsdto.setValue_tourn(rs.getInt("value_tourn"));
                objtournamentsdto.setItm_val_tourn(rs.getInt("itm_val_tourn"));//nome do banco de dados após o getInt
                objtournamentsdto.setDate_tourn(rs.getDate("date_tourn"));
                objtournamentsdto.setDesc_tourn(rs.getString("desc_tourn"));

                lista.add(objtournamentsdto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO PesquisarTorneioDAO: " + erro);
        }

        return lista;
    }
     
     public ArrayList<TournamentsDTO> PesquisarTorneiosListaType(String typetourn) {

        String sql = "SELECT * FROM tabletournaments WHERE type_tourn  = ?";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar

            pstm.setString(1, typetourn);

            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                TournamentsDTO objtournamentsdto = new TournamentsDTO();

                //acessando a classe através do objeto
                objtournamentsdto.setDate_tourn(rs.getDate("date_tourn"));
                objtournamentsdto.setApp_id_tourn(rs.getInt("fk_app_id_tourn"));
                objtournamentsdto.setType_tourn(rs.getString("type_tourn"));
                objtournamentsdto.setValue_tourn(rs.getInt("value_tourn"));
                objtournamentsdto.setItm_val_tourn(rs.getInt("itm_val_tourn"));//nome do banco de dados após o getInt
                objtournamentsdto.setDesc_tourn(rs.getString("desc_tourn"));

                lista.add(objtournamentsdto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "TorneiosDAO PesquisarTorneioDAO: " + erro);
        }

        return lista;
    }

     

}
