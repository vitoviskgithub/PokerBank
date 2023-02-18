package DAO;

/**
 * INFORMAÇÃO IMPORTANTE: QUANDO CADASTRA NO SQL ATRAVÉS DO JAVA - pega info do
 * usuário - armazena na DTO - e joga para o banco
 *
 * QUANDO PESQUISA NA SQL ATRAVÉS DO JAVA - pega informação do banco - armazena
 * na DTO - exibe para o usuário
 */
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UsuarioDAO {

    //variáveis externas(globais)
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();//criei um Array através da DTO e todas as vezes que usar o array estou montando esse Array

    public void cadastrarUsuario(UsuarioDTO objusuariodto) {

        String sql = "INSERT INTO tableusuario (nome_usuario, email_usuario, telefone_usuario, senha_usuario, adm_usuario, fk_idcontapoker_idusuario, usuario_ativo) VALUES(?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //a variável id_usuario é AUTOINCREMENTY, então é automático ela receber o valor do sistema todas as vezes que cadastra
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getEmail_usuario());
            pstm.setString(3, objusuariodto.getTelefone_usuario());
            pstm.setString(4, objusuariodto.getSenha_usuario());
            pstm.setInt(5, 0);
            pstm.setInt(6, objusuariodto.getCod_contapoker());//pegando os dados que a comboBox passou para DTO
            pstm.setString(7, objusuariodto.getUsuario_ativo());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Usuário cadastrado no Banco de dados Local");

            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Uusário não se cadastrou no Banco Local");
            JOptionPane.showMessageDialog(null, "UsuarioDAO Cadastrar no Banco Local: " + erro);
        }

    }

    public void cadastrarUsuarioWeb(UsuarioDTO objusuariodto) {

        String sql = "INSERT INTO tableusuario (nome_usuario, email_usuario, telefone_usuario, senha_usuario, adm_usuario, fk_idcontapoker_idusuario, usuario_ativo) VALUES(?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().ConectarWeb();//conectando ao BANCO pela WEB
        //se esta variável volta vazia não dá continuidade na TRY

        try {

            pstm = conn.prepareStatement(sql);

            //a variável id_usuario é AUTOINCREMENTY, então é automático ela receber o valor do sistema todas as vezes que cadastra
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getEmail_usuario());
            pstm.setString(3, objusuariodto.getTelefone_usuario());
            pstm.setString(4, objusuariodto.getSenha_usuario());
            pstm.setInt(5, 0);
            pstm.setInt(6, objusuariodto.getCod_contapoker());//pegando os dados que a comboBox passou para DTO
            pstm.setString(7, objusuariodto.getUsuario_ativo());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Usuário cadastrado no Banco de dados na WEB");

            //acessando o método cadastroUsuario na DAO
            UsuarioDAO objusuariodao = new UsuarioDAO();
            //CADASTRANDO NO BANCO LOCAL
            objusuariodao.cadastrarUsuario(objusuariodto);//passando as informações da DTO para o método

            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Não se conectou ao Banco de dados pela WEB");
            JOptionPane.showMessageDialog(null, "UsuarioDAO Cadastrar Web: " + erro);

        }

    }

    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
   
            conn = new ConexaoDAO().conectaBD();
      
        try {

            String sql = "SELECT * FROM tableusuario where nome_usuario = ? and senha_usuario = ?";

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());

            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO Autenticar Usuario fora da WEB: " + erro);
            return null;
        }

    }

    //AUTENTICA com o ID e não o nome do usuário, mais a senha
    public ResultSet autenticacaoUsuario2(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();

        try {

            String sql = "SELECT * FROM tableusuario where id_usuario = ? and senha_usuario = ?";

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objusuariodto.getId_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());

            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }

    }

    //AUTENTICA com o campo ADM(0 não e 1 para simn) e não o nome do usuário, mais a senha
    //LOCAL
    public ResultSet autenticacaoUsuario3(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();

        try {

            String sql = "SELECT * FROM tableusuario where adm_usuario = 1 and senha_usuario = ?";

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objusuariodto.getSenha_usuario());

            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }

    }

    //AUTENTICA com o campo ADM(0 não e 1 para simn) e não o nome do usuário, mais a senha
    //WEB
    public ResultSet autenticacaoUsuario3Web(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().ConectarWeb();

        try {

            String sql = "SELECT * FROM tableusuario where adm_usuario = 1 and senha_usuario = ?";

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objusuariodto.getSenha_usuario());

            rs = pstm.executeQuery();

            return rs;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }

    }

    public ResultSet autenticacaoUsuarioWeb(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().ConectarWeb();

        try {

            String sql = "SELECT * FROM tableusuario where nome_usuario = ? and senha_usuario = ?";

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());

            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO no autenticacaoUsuarioWeb: " + erro);

            return null;
        }

    }

//toda vez que usar o ResultSet é que pega a tabela do banco de dados e consegue percorrer através do sql
//o ResultSet é usado para trablhar o sql que vêm para o java
//o método precisar ter o tipo do retorno, nesse caso ArrayList
    public ArrayList<UsuarioDTO> PesquisarUsuario() {

        String sql = "SELECT * FROM tableusuario";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar
            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                UsuarioDTO objusuariodto = new UsuarioDTO();

                //acessando a classe através do objeto
                objusuariodto.setId_usuario(rs.getInt("id_usuario"));//o rs recebe o valor do banco para armazenar na variável, pois é variável ResultSet / após isso setamos na DTO esse valor
                objusuariodto.setNome_usuario(rs.getString("nome_usuario"));
                objusuariodto.setEmail_usuario(rs.getString("email_usuario"));
                objusuariodto.setTelefone_usuario(rs.getString("telefone_usuario"));
                objusuariodto.setSenha_usuario(rs.getString("senha_usuario"));
                objusuariodto.setCod_contapoker(rs.getInt("fk_idcontapoker_idusuario"));//nome do banco de dados após o getInt
                objusuariodto.setUsuario_ativo(rs.getString("usuario_ativo"));

                lista.add(objusuariodto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO Pesquisar: " + erro);
        }

        return lista;
    }

    public void alterarUsuario(UsuarioDTO objusuariodto) {

        String sql = "UPDATE tableusuario SET nome_usuario = ?, email_usuario = ?, telefone_usuario = ?, senha_usuario = ?, fk_idcontapoker_idusuario = ?, usuario_ativo = ? where id_usuario = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            //sempre começa do parâmetro 1
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getEmail_usuario());
            pstm.setString(3, objusuariodto.getTelefone_usuario());
            pstm.setString(4, objusuariodto.getSenha_usuario());
            pstm.setInt(5, objusuariodto.getCod_contapoker());
            pstm.setString(6, objusuariodto.getUsuario_ativo());
            pstm.setInt(7, objusuariodto.getId_usuario());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Alterados dados do Usuário no Banco de dados na Local");

            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO AlterarUsuario: " + erro);
        }

    }

    public void alterarUsuarioWeb(UsuarioDTO objusuariodto) {

        String sql = "UPDATE tableusuario SET nome_usuario = ?, email_usuario = ?, telefone_usuario = ?, senha_usuario = ?, fk_idcontapoker_idusuario = ?, usuario_ativo = ? where id_usuario = ?";

        conn = new ConexaoDAO().ConectarWeb();
        //se a variável volta vazia não continua

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            //sempre começa do parâmetro 1
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getEmail_usuario());
            pstm.setString(3, objusuariodto.getTelefone_usuario());
            pstm.setString(4, objusuariodto.getSenha_usuario());
            pstm.setInt(5, objusuariodto.getCod_contapoker());
            pstm.setString(6, objusuariodto.getUsuario_ativo());
            pstm.setInt(7, objusuariodto.getId_usuario());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Alterados dados do Usuário no Banco de dados na WEB");

            //instanciando a classe DAO
            UsuarioDAO objusuariodao = new UsuarioDAO();
            //Alterando no BANCO LOCAL
            objusuariodao.alterarUsuario(objusuariodto);

            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO AlterarUsuario: " + erro);
        }

    }

    public void excluirUsuario(UsuarioDTO objusuariodto) {

        String sql = "DELETE from tableusuario where id_usuario = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            pstm.setInt(1, objusuariodto.getId_usuario());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Usuário excluído no banco Local");

            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO ExcluirUsuario: " + erro);
        }

    }

    public void excluirUsuarioWeb(UsuarioDTO objusuariodto) {

        String sql = "DELETE from tableusuario where id_usuario = ?";

        conn = new ConexaoDAO().ConectarWeb();

        try {

            pstm = conn.prepareStatement(sql);

            //parâmetros são os pontos de interrogação, nesta comando sql existem 5
            pstm.setInt(1, objusuariodto.getId_usuario());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Usuário excluido na WEB");
            excluirUsuario(objusuariodto);

            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO ExcluirUsuario: " + erro);
        }

    }

    //método para Usuário que não é administrador
    public void DadosCadastrais(UsuarioDTO objusuariodto) {

        conn = new ConexaoDAO().conectaBD();

        try {

            String sql = "SELECT * FROM tableusuario where nome_usuario = ? and senha_usuario = ?";

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());

            rs = pstm.executeQuery();

            while (rs.next()) {

                //acessando a classe através do objeto
                objusuariodto.setId_usuario(rs.getInt("id_usuario"));//o rs recebe o valor do banco para armazenar na variável, pois é variável ResultSet / após isso setamos na DTO esse valor
                objusuariodto.setNome_usuario(rs.getString("nome_usuario"));
                objusuariodto.setEmail_usuario(rs.getString("email_usuario"));
                objusuariodto.setTelefone_usuario(rs.getString("telefone_usuario"));
                objusuariodto.setSenha_usuario(rs.getString("senha_usuario"));
                objusuariodto.setCod_contapoker(rs.getInt("fk_idcontapoker_idusuario"));//nome do banco de dados após o getInt

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO DadosCadastrais: " + erro);

        }

    }

    public ResultSet listarUsuarioCombo() {

        conn = new ConexaoDAO().conectaBD();
        String sql = "SELECT * FROM tableusuario ORDER BY id_usuario";

        try {

            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {

            System.out.println(erro.getMessage());
            JOptionPane.showMessageDialog(null, "UsuarioDAO ListarComboUsuariId : " + erro);
            return null;

        }
    }

    //TENTATIVA DE CONECTAR NO MEU BANCO DE DADOS NA WEB
    public void DadosCadastrais2(UsuarioDTO objusuariodto) {

        conn = new ConexaoDAO().ConectarWeb();

        try {

            String sql = "SELECT * FROM tableusuario where id_usuario = ?";

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objusuariodto.getId_usuario());

            rs = pstm.executeQuery();

            while (rs.next()) {
                objusuariodto.setNome_usuario(rs.getString("nome_usuario"));
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO DadosCadastrais2: " + erro);

        }

    }
    
     public ArrayList<UsuarioDTO> PesquisarAppUser(int codApp) {

        String sql = "SELECT * FROM tableusuario WHERE fk_idcontapoker_idusuario = ?";//percorre todas as linhas do banco de dados

        conn = new ConexaoDAO().conectaBD();//conecta ao banco

        try {

            pstm = conn.prepareStatement(sql);//conecta ao banco com a variável conn e prepara o código sql dentro do banco pela variável ResultSet pstm pronto para executar
            
            pstm.setInt(1, codApp);
            
            rs = pstm.executeQuery();//executa o código sql através da variável ResultSet

            while (rs.next()) {

                UsuarioDTO objusuariodto = new UsuarioDTO();

                //acessando a classe através do objeto
                objusuariodto.setId_usuario(rs.getInt("id_usuario"));//o rs recebe o valor do banco para armazenar na variável, pois é variável ResultSet / após isso setamos na DTO esse valor
                objusuariodto.setNome_usuario(rs.getString("nome_usuario"));
                objusuariodto.setEmail_usuario(rs.getString("email_usuario"));
                objusuariodto.setTelefone_usuario(rs.getString("telefone_usuario"));
                objusuariodto.setSenha_usuario(rs.getString("senha_usuario"));
                objusuariodto.setCod_contapoker(rs.getInt("fk_idcontapoker_idusuario"));//nome do banco de dados após o getInt
                objusuariodto.setUsuario_ativo(rs.getString("usuario_ativo"));

                lista.add(objusuariodto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO PesquisarApp: " + erro);
        }

        return lista;
    }
               
}
