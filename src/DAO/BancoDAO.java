package DAO;

import DTO.BankUserDTO;
import DTO.TournamentsDTO;
import VIEW.frmListarDatas;
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

import DTO.PesquisaDateDTO;
import VIEW.frmRelatorioUser;

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

    public void pesquisaDateUserGainDAO(PesquisaDateDTO objpesqdatedto) {

        int somaganhos = 0;
        int part_soma = 0;
        Date data_in = new Date();
        Date data_en = new Date();
        String data_in_formatada = "";
        String data_en_formatada = "";

        String sql = "SELECT fk_id_user_bank, ganho_bank, data_bank FROM tablebankuser WHERE fk_id_user_bank = ? AND data_bank BETWEEN ? AND ?";

        conn = new ConexaoDAO().conectaBD();//conecta ao banco Local

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objpesqdatedto.getIduser());
            
             //converte a variável data para string antes de enviar para
            //o preparedStatement
            data_in = objpesqdatedto.getDatainicio();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data_in_formatada = dateFormat.format(data_in);

            pstm.setString(2, data_in_formatada);
            
            data_en = objpesqdatedto.getDatafim();
            DateFormat dateFormaten = new SimpleDateFormat("yyyy-MM-dd");
            data_en_formatada = dateFormaten.format(data_en);

            pstm.setString(3, data_en_formatada);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {                
                part_soma = rs.getInt(2);
                
                somaganhos = somaganhos + part_soma;
            }
                                 
            objpesqdatedto.setSoma(somaganhos);
            
            pstm.close();
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na BancoDAO no método PesquisaGainDate: " + e);
        }
    }
    
        public void nomeParaListarDatas(PesquisaDateDTO objpesqdatedto){
          int id_user = 0;
          String retorna_nome = "";
          String sqlnome = "";
          String nome_paradto = "";
          
          sqlnome = "SELECT nome_usuario FROM tableusuario WHERE id_usuario = ?";
          
          conn = new ConexaoDAO().conectaBD();
          //CONECTOU, AGORA É NECESSÁRIO UMA TRY CATACH PARA TRATAMENTO DAS EXCEÇÕES
          
            try {
                pstm = conn.prepareStatement(sqlnome);
                
                id_user = objpesqdatedto.getIduser();
                
                pstm.setInt(1, id_user);
                rs = pstm.executeQuery();
                
                //TEM QUE TRATAR A RESULTSET APÓS EXECUTAR A QUERY, SEMPRE
                //COM IF, COM WHILE, COM FOR, O IMPORTANTE É TRATAR ELA
                //PARA PEGAR VALORES OU NÃO
                if(rs.next()){
                //pegando o nome da ResulSet que recebeu do banco
                nome_paradto = rs.getString(1);
                }else{
                JOptionPane.showMessageDialog(null, "Erro na execução da Query no método buscar Nome no BancoDAO");
                 }
                
                //mandando o nome para DTO
                objpesqdatedto.setNome_user(nome_paradto);
                
                    pstm.close();
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro no método nomeParaListarDatas: " + erro);
            }      
                                
        }
        
    public void pesquisaDateAppGainDAO(PesquisaDateDTO objpesqdatedto) {

        int somaganhos = 0;
        int part_soma = 0;
        Date data_in = new Date();
        Date data_en = new Date();
        String data_in_formatada = "";
        String data_en_formatada = "";

        String sql = "SELECT fk_app_id_bank, ganho_bank, data_bank FROM tablebankuser WHERE fk_app_id_bank = ? AND data_bank BETWEEN ? AND ?";

        conn = new ConexaoDAO().conectaBD();//conecta ao banco Local

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objpesqdatedto.getId_app());
            
             //converte a variável data para string antes de enviar para
            //o preparedStatement
            data_in = objpesqdatedto.getDatainicio();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data_in_formatada = dateFormat.format(data_in);

            pstm.setString(2, data_in_formatada);
            
            data_en = objpesqdatedto.getDatafim();
            DateFormat dateFormaten = new SimpleDateFormat("yyyy-MM-dd");
            data_en_formatada = dateFormaten.format(data_en);

            pstm.setString(3, data_en_formatada);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {                
                part_soma = rs.getInt(2);
                
                somaganhos = somaganhos + part_soma;
            }
                                 
            objpesqdatedto.setSoma(somaganhos);
            
            pstm.close();
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na BancoDAO no método APP PesquisaGainDate: " + e);
        }
    } 

    
 public void appParaListarDatas(PesquisaDateDTO objpesqdatedto){
          int id_app = 0;
          
          String sqlapp = "";
          String app_paradto = "";
          
          sqlapp = "SELECT app_contapoker FROM tablecontapoker WHERE id_contapoker = ?";
          
          conn = new ConexaoDAO().conectaBD();
          //CONECTOU, AGORA É NECESSÁRIO UMA TRY CATACH PARA TRATAMENTO DAS EXCEÇÕES
          
            try {
                pstm = conn.prepareStatement(sqlapp);
                
                id_app = objpesqdatedto.getId_app();
                
                pstm.setInt(1, id_app);
                rs = pstm.executeQuery();
                
                //TEM QUE TRATAR A RESULTSET APÓS EXECUTAR A QUERY, SEMPRE
                //COM IF, COM WHILE, COM FOR, O IMPORTANTE É TRATAR ELA
                //PARA PEGAR VALORES OU NÃO
                if(rs.next()){
                //pegando o nome da ResulSet que recebeu do banco
                app_paradto = rs.getString(1);
                }else{
                JOptionPane.showMessageDialog(null, "Erro na execução da Query no método buscar APP (Set) no BancoDAO");
                 }
                
                //mandando o nome para DTO
                objpesqdatedto.setNome_app(app_paradto);
                
                    pstm.close();
                
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro no método appParaListarDatas APP: " + erro);
            }      
                                
        }
    
     public void pesquisaDateAppLostDAO(PesquisaDateDTO objpesqdatedto) {

        int somalost = 0;
        int part_soma = 0;
        Date data_in = new Date();
        Date data_en = new Date();
        String data_in_formatada = "";
        String data_en_formatada = "";

        String sql = "SELECT fk_app_id_bank, perda_bank, data_bank FROM tablebankuser WHERE fk_app_id_bank = ? AND data_bank BETWEEN ? AND ?";

        conn = new ConexaoDAO().conectaBD();//conecta ao banco Local

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objpesqdatedto.getId_app());
            
             //converte a variável data para string antes de enviar para
            //o preparedStatement
            data_in = objpesqdatedto.getDatainicio();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data_in_formatada = dateFormat.format(data_in);

            pstm.setString(2, data_in_formatada);
            
            data_en = objpesqdatedto.getDatafim();
            DateFormat dateFormaten = new SimpleDateFormat("yyyy-MM-dd");
            data_en_formatada = dateFormaten.format(data_en);

            pstm.setString(3, data_en_formatada);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {                
                part_soma = rs.getInt(2);
                
                somalost = somalost + part_soma;
            }
                                 
            objpesqdatedto.setSoma(somalost);
            
            pstm.close();
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na BancoDAO no método APP PesquisaGainDate: " + e);
        }
    }    
 
 
    public void pesquisaDateUserLostDAO(PesquisaDateDTO objpesqdatedto) {

        int somalost = 0;
        int part_soma = 0;
        Date data_in = new Date();
        Date data_en = new Date();
        String data_in_formatada = "";
        String data_en_formatada = "";

        String sql = "SELECT fk_id_user_bank, perda_bank, data_bank FROM tablebankuser WHERE fk_id_user_bank = ? AND data_bank BETWEEN ? AND ?";

        conn = new ConexaoDAO().conectaBD();//conecta ao banco Local

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objpesqdatedto.getIduser());
            
             //converte a variável data para string antes de enviar para
            //o preparedStatement
            data_in = objpesqdatedto.getDatainicio();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data_in_formatada = dateFormat.format(data_in);

            pstm.setString(2, data_in_formatada);
            
            data_en = objpesqdatedto.getDatafim();
            DateFormat dateFormaten = new SimpleDateFormat("yyyy-MM-dd");
            data_en_formatada = dateFormaten.format(data_en);

            pstm.setString(3, data_en_formatada);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {                
                part_soma = rs.getInt(2);
                
                somalost = somalost + part_soma;
            }
                                 
            objpesqdatedto.setSoma(somalost);
            
            pstm.close();
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na BancoDAO no método PesquisaLostDate: " + e);
        }
    }
     
    
    public void pesquisaDateAppSaldDAO(PesquisaDateDTO objpesqdatedto) {

        int somasald = 0;
        int part_soma = 0;
        Date data_in = new Date();
        Date data_en = new Date();
        String data_in_formatada = "";
        String data_en_formatada = "";

        String sql = "SELECT fk_app_id_bank, saldo_bank, data_bank FROM tablebankuser WHERE fk_app_id_bank = ? AND data_bank BETWEEN ? AND ?";

        conn = new ConexaoDAO().conectaBD();//conecta ao banco Local

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objpesqdatedto.getId_app());
            
             //converte a variável data para string antes de enviar para
            //o preparedStatement
            data_in = objpesqdatedto.getDatainicio();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data_in_formatada = dateFormat.format(data_in);

            pstm.setString(2, data_in_formatada);
            
            data_en = objpesqdatedto.getDatafim();
            DateFormat dateFormaten = new SimpleDateFormat("yyyy-MM-dd");
            data_en_formatada = dateFormaten.format(data_en);

            pstm.setString(3, data_en_formatada);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {                
                part_soma = rs.getInt(2);
                
                somasald = somasald + part_soma;
            }
                                 
            objpesqdatedto.setSoma(somasald);
            
            pstm.close();
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na BancoDAO no método APP PesquisaSaldDate: " + e);
        }
    }    

    
    public void pesquisaDateUserSaldDAO(PesquisaDateDTO objpesqdatedto) {

        int somasald = 0;
        int part_soma = 0;
        Date data_in = new Date();
        Date data_en = new Date();
        String data_in_formatada = "";
        String data_en_formatada = "";

        String sql = "SELECT fk_id_user_bank, saldo_bank, data_bank FROM tablebankuser WHERE fk_id_user_bank = ? AND data_bank BETWEEN ? AND ?";

        conn = new ConexaoDAO().conectaBD();//conecta ao banco Local

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objpesqdatedto.getIduser());
            
             //converte a variável data para string antes de enviar para
            //o preparedStatement
            data_in = objpesqdatedto.getDatainicio();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data_in_formatada = dateFormat.format(data_in);

            pstm.setString(2, data_in_formatada);
            
            data_en = objpesqdatedto.getDatafim();
            DateFormat dateFormaten = new SimpleDateFormat("yyyy-MM-dd");
            data_en_formatada = dateFormaten.format(data_en);

            pstm.setString(3, data_en_formatada);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {                
                part_soma = rs.getInt(2);
                
                somasald = somasald + part_soma;
            }
                                 
            objpesqdatedto.setSoma(somasald);
            
            pstm.close();
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na BancoDAO no método PesquisaSaldDate: " + e);
        }
    }
     
    public void pesquisaDateAppSQDAO(PesquisaDateDTO objpesqdatedto) {

        int somaSQ = 0;
        int part_soma = 0;
        Date data_in = new Date();
        Date data_en = new Date();
        String data_in_formatada = "";
        String data_en_formatada = "";

        String sql = "SELECT fk_app_id_bank, saque_bank, data_bank FROM tablebankuser WHERE fk_app_id_bank = ? AND data_bank BETWEEN ? AND ?";

        conn = new ConexaoDAO().conectaBD();//conecta ao banco Local

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objpesqdatedto.getId_app());
            
             //converte a variável data para string antes de enviar para
            //o preparedStatement
            data_in = objpesqdatedto.getDatainicio();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data_in_formatada = dateFormat.format(data_in);

            pstm.setString(2, data_in_formatada);
            
            data_en = objpesqdatedto.getDatafim();
            DateFormat dateFormaten = new SimpleDateFormat("yyyy-MM-dd");
            data_en_formatada = dateFormaten.format(data_en);

            pstm.setString(3, data_en_formatada);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {                
                part_soma = rs.getInt(2);
                
                somaSQ = somaSQ + part_soma;
            }
                                 
            objpesqdatedto.setSoma(somaSQ);
            
            pstm.close();
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na BancoDAO no método APP PesquisaSQDate: " + e);
        }
    }    
     
      public void pesquisaDateUserSQDAO(PesquisaDateDTO objpesqdatedto) {

        int somaSQ = 0;
        int part_soma = 0;
        Date data_in = new Date();
        Date data_en = new Date();
        String data_in_formatada = "";
        String data_en_formatada = "";

        String sql = "SELECT fk_id_user_bank, saque_bank, data_bank FROM tablebankuser WHERE fk_id_user_bank = ? AND data_bank BETWEEN ? AND ?";

        conn = new ConexaoDAO().conectaBD();//conecta ao banco Local

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objpesqdatedto.getIduser());
            
             //converte a variável data para string antes de enviar para
            //o preparedStatement
            data_in = objpesqdatedto.getDatainicio();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data_in_formatada = dateFormat.format(data_in);

            pstm.setString(2, data_in_formatada);
            
            data_en = objpesqdatedto.getDatafim();
            DateFormat dateFormaten = new SimpleDateFormat("yyyy-MM-dd");
            data_en_formatada = dateFormaten.format(data_en);

            pstm.setString(3, data_en_formatada);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {                
                part_soma = rs.getInt(2);
                
                somaSQ = somaSQ + part_soma;
            }
                                 
            objpesqdatedto.setSoma(somaSQ);
            
            pstm.close();
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na BancoDAO no método PesquisaSQDate: " + e);
        }
    }
    
    
      public void pesquisaDateAppTDAO(PesquisaDateDTO objpesqdatedto) {

        int somatourn = 0;
        int num = 0;//marcador do contador
               
        Date data_in = new Date();
        Date data_en = new Date();
       
        String data_in_formatada = "";
        String data_en_formatada = "";
     

        String sql = "SELECT fk_app_id_tourn FROM tabletournaments WHERE fk_app_id_tourn = ? AND date_tourn BETWEEN  ? AND ?";

        conn = new ConexaoDAO().conectaBD();//conecta ao banco Local

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objpesqdatedto.getId_app());
            
             //converte a variável data para string antes de enviar para
            //o preparedStatement
            data_in = objpesqdatedto.getDatainicio();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data_in_formatada = dateFormat.format(data_in);

            pstm.setString(2, data_in_formatada);
            
            data_en = objpesqdatedto.getDatafim();
            DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            data_en_formatada = dateFormat1.format(data_en);

            pstm.setString(3, data_en_formatada);
         
            rs = pstm.executeQuery();
            
            //CONTADOR, usando NUM como marcador
            while (rs.next()) {   
                
                num = 1;               
                somatourn = somatourn + num; 
                                           
            }
                                 
            objpesqdatedto.setSoma(somatourn);
            
            pstm.close();
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na BancoDAO no método APP PesquisaTournDate: " + e);
        }
    }    
      
      
      public void pesquisaDateUserTDAO(PesquisaDateDTO objpesqdatedto) {

        int somatourn = 0;
        int num = 0;//marcador do contador
               
        Date data_in = new Date();
        Date data_en = new Date();
       
        String data_in_formatada = "";
        String data_en_formatada = "";
     

        String sql = "SELECT fk_id_user_tourn FROM tabletournaments WHERE fk_id_user_tourn = ? AND date_tourn BETWEEN  ? AND ?";

        conn = new ConexaoDAO().conectaBD();//conecta ao banco Local

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objpesqdatedto.getIduser());
            
             //converte a variável data para string antes de enviar para
            //o preparedStatement
            data_in = objpesqdatedto.getDatainicio();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            data_in_formatada = dateFormat.format(data_in);

            pstm.setString(2, data_in_formatada);
            
            data_en = objpesqdatedto.getDatafim();
            DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            data_en_formatada = dateFormat1.format(data_en);

            pstm.setString(3, data_en_formatada);
         
            rs = pstm.executeQuery();
            
            //CONTADOR, usando NUM como marcador
            while (rs.next()) {   
                
                num = 1;               
                somatourn = somatourn + num; 
                                           
            }
                                 
            objpesqdatedto.setSoma(somatourn);
            
            pstm.close();
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro na BancoDAO no método USER PesquisaTournDate: " + e);
        }
    }    
      
      
   }
