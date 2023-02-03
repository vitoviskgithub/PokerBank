package DAO;

import CONTROL.MoverArquivos;
import static DAO.ConexaoDAO.conn;
import DTO.BankUserDTO;
import DTO.UsuarioDTO;
import VIEW.frmRelatorioUser;
import com.itextpdf.layout.element.Table;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Color;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RelatorioUserDAO {
    
     public int somaSaldos;

    //variáveis externas(globais)
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    ArrayList<BankUserDTO> lista = new ArrayList<>();
    
         public void gerarRelatorioUsuario() {

//instância do documento
//usando a classe estática PageSize para definir o tamanho da página
        Document documento = new Document(PageSize.A4);

//definindo as margens do documento
        documento.setMargins(40f, 40f, 40f, 40f);

        try {
//pegar o objeto que está em memória e gerar o arquivo físico
            PdfWriter.getInstance(documento, new FileOutputStream("relatorioUsuario.pdf"));

//abrir o documento para editá-lo
            documento.open();
      
            //gerando código para criar tabela no pdf
//Create Table object, Here 4 specify the no. of columns
            PdfPTable tabelaUsuarios = new PdfPTable(new float[] { 20f, 100f, 30f, 20f });
                       
            //primeiro parágrafom setndo o texto
            Paragraph tituloDoRelatorio = new Paragraph(new Phrase("POKER BANK APP WEB",
        FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18f)));
            tituloDoRelatorio.setAlignment(tituloDoRelatorio.ALIGN_CENTER);

            Paragraph espacoDepoisTitulo = new Paragraph("Relatório de Usuários cadastrados");
            espacoDepoisTitulo.setAlignment(espacoDepoisTitulo.ALIGN_CENTER);

            Paragraph quebraLinha = new Paragraph();
            quebraLinha.setSpacingAfter(12f);

//colocando o parágrafo dentro do documento
            documento.add(tituloDoRelatorio);
            documento.add(espacoDepoisTitulo);
            documento.add(quebraLinha);
            
                    //Criando parágrafos para inserir dentro das células        
            Paragraph paragrafoId = new Paragraph(new Phrase("ID",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /* paragrafoId.setAlignment(Element.ALIGN_CENTER);*/

            Paragraph paragrafoNome = new Paragraph(new Phrase("NOME",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
                     
            Paragraph paragrafoAtivo = new Paragraph(new Phrase("ATIVO",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoAtivo.setAlignment(Element.ALIGN_CENTER);*/
                        
            /*paragrafoNome.setAlignment(Element.ALIGN_CENTER);*/
            Paragraph paragrafoSaldo = new Paragraph(new Phrase("SALDO",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoIdConta.setAlignment(Element.ALIGN_CENTER);*/

//criando CÉLULAS 
            //Create cells
            PdfPCell celulausuarioid = new PdfPCell(paragrafoId);
            //alinhando no centro horizontalmente
            celulausuarioid.setHorizontalAlignment(celulausuarioid.ALIGN_CENTER);

            PdfPCell celulausuarionome = new PdfPCell(paragrafoNome);
            celulausuarionome.setHorizontalAlignment(celulausuarionome.ALIGN_CENTER);
                       
            PdfPCell celulausuarioativo = new PdfPCell(paragrafoAtivo);
            celulausuarioativo.setHorizontalAlignment(celulausuarioativo.ALIGN_CENTER);
            
            PdfPCell celulausuarsaldo = new PdfPCell(paragrafoSaldo);
            celulausuarsaldo.setHorizontalAlignment(celulausuarsaldo.ALIGN_CENTER);

//adicionando celulas a tabela
            //Add cells to table
            tabelaUsuarios.addCell(celulausuarioid);
            tabelaUsuarios.addCell(celulausuarionome);
            tabelaUsuarios.addCell(celulausuarioativo);
            tabelaUsuarios.addCell(celulausuarsaldo);
            
                       
            //LAYOUT DA TABELA MONTADA, AGORA É INSERIR AS LINHAS COM OS VALORES

            int id_osc = 0;
            String nome_osc = "";
            String ativo_osc = "";
            int saldo_osc = 0;
            
            //APÓS ABRIR O DOCUEMNTO CONECTO AO BACO DE DADOS
            // BUSCOS OS VALORES DA TABELA DE USUÁRIOS
            // ADICIONO A UM ARRAYLIST          
            UsuarioDAO objusuariodao = new UsuarioDAO();
            ArrayList<UsuarioDTO> lista = objusuariodao.PesquisarUsuario();
            
            //INICIA FOR PARA RODAR E ACICIONAR OS VALORES NO RELATÓRIO
            // O FOR É BASEADO NO TAMANHO DO ARRAY
            for (int num = 0; num < lista.size(); num++) {
                
                id_osc = lista.get(num).getId_usuario();
                String id_oscStr = String.valueOf(id_osc);
                
                nome_osc = lista.get(num).getNome_usuario();
                ativo_osc = lista.get(num).getUsuario_ativo();
                
                somarValoresSaldoRelatorio(id_osc);
                
                saldo_osc = somaSaldos;
                String saldo_oscStr = String.valueOf(saldo_osc);
                
                //INSERIR CALCULO SALDO
                
                
                          //Criando parágrafos para inserir dentro das células        
            Paragraph paragrafoIdUser = new Paragraph(new Phrase(id_oscStr,
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /* paragrafoId.setAlignment(Element.ALIGN_CENTER);*/

            Paragraph paragrafoNomeUser = new Paragraph(new Phrase(nome_osc,
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));

            Paragraph paragrafoAtivoUser = new Paragraph(new Phrase(ativo_osc,
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoAtivo.setAlignment(Element.ALIGN_CENTER);*/
                        
            /*paragrafoNome.setAlignment(Element.ALIGN_CENTER);*/
            Paragraph paragrafoSaldoUser = new Paragraph(new Phrase(saldo_oscStr,
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoIdConta.setAlignment(Element.ALIGN_CENTER);*/

//criando CÉLULAS 
            //Create cells
            PdfPCell celulausuarioiduser = new PdfPCell(paragrafoIdUser);
            //alinhando no centro horizontalmente
            celulausuarioiduser.setHorizontalAlignment(celulausuarioiduser.ALIGN_CENTER);

            PdfPCell celulausuarionomeuser = new PdfPCell(paragrafoNomeUser);
            celulausuarionomeuser.setHorizontalAlignment(celulausuarionomeuser.ALIGN_CENTER);

            PdfPCell celulausuarioativouser = new PdfPCell(paragrafoAtivoUser);
            celulausuarioativouser.setHorizontalAlignment(celulausuarioativouser.ALIGN_CENTER);
            
            PdfPCell celulausuarsaldouser = new PdfPCell(paragrafoSaldoUser);
            celulausuarsaldouser.setHorizontalAlignment(celulausuarsaldouser.ALIGN_CENTER);

//adicionando celulas a tabela
            //Add cells to table
            tabelaUsuarios.addCell(celulausuarioiduser);
            tabelaUsuarios.addCell(celulausuarionomeuser);
            tabelaUsuarios.addCell(celulausuarioativouser);
            tabelaUsuarios.addCell(celulausuarsaldouser);
                
    
            
            }
            //TERMINA FOR
          
          //adicionando tabela ao documento
            documento.add(tabelaUsuarios);


            String arquivopdf = "relatorioUsuario.pdf";
//abrir pdf usando o Runtime e executando no PROMPT comando CMD
            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + "cmd /c " + arquivopdf);

            documento.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro na criação documento na classe DAO:" + e);

        } catch (DocumentException e) {

            JOptionPane.showMessageDialog(null, "Erro na criação documento na classe DAO:" + e);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na criação documento na classe DAO:" + e);
        }
        
             //MOVER O PDF PARA PASTA WEB DO GITHUB
        MoverArquivos objmoverarq = new MoverArquivos();
        objmoverarq.moveArqPdfRela();
        
       }

   private void somarValoresSaldoRelatorio(int idUser) {

        String sql = "SELECT SUM(saldo_bank) AS Total FROM tablebankuser WHERE fk_id_user_bank = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, idUser);

            rs = pstm.executeQuery();

            if (rs.next()) {

                // para pegar o valor de da variável ResultSet pegou no BD, tem que estar 
                //dentro de uma CONDICIONAL IF ou LOOP como WHILE, com o compartaivo se ela está vazia ou não rs.next()
                somaSaldos = rs.getInt(1);
               
              
            } else {

                JOptionPane.showMessageDialog(null, "Erro na soma dos saldos no RelatorioUserDAO");
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "RelatorioUserDAO método somarValoresSaldos: " + erro);
        }

    }

}
