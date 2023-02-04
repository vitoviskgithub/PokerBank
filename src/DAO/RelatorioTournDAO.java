
package DAO;


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

import CONTROL.MoverArquivos;

import static DAO.ConexaoDAO.conn;
import DTO.BankUserDTO;
import DTO.TournamentsDTO;
import DTO.UsuarioDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RelatorioTournDAO {
    
    public int somaSaldos;

    //variáveis externas(globais)
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    ArrayList<BankUserDTO> lista = new ArrayList<>();
    
         public void gerarRelatorioTorneio(Date datapara) {

//instância do documento
//usando a classe estática PageSize para definir o tamanho da página
        Document documento = new Document(PageSize.A4);

//definindo as margens do documento
        documento.setMargins(40f, 40f, 40f, 40f);

        try {
//pegar o objeto que está em memória e gerar o arquivo físico
            PdfWriter.getInstance(documento, new FileOutputStream("relatorioTorneios.pdf"));

//abrir o documento para editá-lo
            documento.open();
      
            //gerando código para criar tabela no pdf
//Create Table object, Here 4 specify the no. of columns
            PdfPTable tabelaTourn = new PdfPTable(new float[] { 60f, 30f, 30f, 30f, 30f });
                       
            //primeiro parágrafom setndo o texto
            Paragraph tituloDoRelatorio = new Paragraph(new Phrase("POKER BANK APP WEB",
        FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18f)));
            tituloDoRelatorio.setAlignment(tituloDoRelatorio.ALIGN_CENTER);
            
            try {
            
            //PEGANDO A DATA ATUAL E FORMATANDO ELA
            //DEPOIS CONVERTENDO EM UM STRING
            Date datahoje = new Date();
            
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");//declaro o formato da data 
            String dataFormatada = formato.format(datahoje);
            
            //Coloca isso em um parágrafo para imprimir no relatório
            String paragComData = "Relatório de Usuários cadastrados / Data:" + dataFormatada;
                        
            Paragraph espacoDepoisTitulo = new Paragraph(paragComData);
            espacoDepoisTitulo.setAlignment(espacoDepoisTitulo.ALIGN_CENTER);
            
            Paragraph quebraLinha = new Paragraph();
            quebraLinha.setSpacingAfter(12f);

//colocando o parágrafo dentro do documento
            documento.add(tituloDoRelatorio);
            documento.add(espacoDepoisTitulo);
            documento.add(quebraLinha);
            
            } catch (Exception e) {
            }          
                    
            
                    //Criando parágrafos para inserir dentro das células        
            Paragraph paragrafoTORNEIO = new Paragraph(new Phrase("TORNEIO",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /* paragrafoId.setAlignment(Element.ALIGN_CENTER);*/

            Paragraph paragrafoUSER = new Paragraph(new Phrase("USUÁRIO",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
                     
            Paragraph paragrafoAPP = new Paragraph(new Phrase("APP",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoAtivo.setAlignment(Element.ALIGN_CENTER);*/
                        
            /*paragrafoNome.setAlignment(Element.ALIGN_CENTER);*/
            Paragraph paragraBUYIN = new Paragraph(new Phrase("BUY-IN",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoIdConta.setAlignment(Element.ALIGN_CENTER);*/
            
               /*paragrafoNome.setAlignment(Element.ALIGN_CENTER);*/
            Paragraph paragraITM = new Paragraph(new Phrase("ITM",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoIdConta.setAlignment(Element.ALIGN_CENTER);*/

//criando CÉLULAS 
            //Create cells
            PdfPCell celulatourn = new PdfPCell(paragrafoTORNEIO);
            //alinhando no centro horizontalmente
            celulatourn.setHorizontalAlignment(celulatourn.ALIGN_CENTER);

            PdfPCell celulausuarioid = new PdfPCell(paragrafoUSER);
            celulausuarioid.setHorizontalAlignment(celulausuarioid.ALIGN_CENTER);
                       
            PdfPCell cellapp = new PdfPCell(paragrafoAPP);
            cellapp.setHorizontalAlignment(cellapp.ALIGN_CENTER);
            
            PdfPCell celulabuyin = new PdfPCell(paragraBUYIN);
            celulabuyin.setHorizontalAlignment(celulabuyin.ALIGN_CENTER);

            PdfPCell celulaitm = new PdfPCell(paragraITM);
            celulaitm.setHorizontalAlignment(celulaitm.ALIGN_CENTER);
            
//adicionando celulas a tabela
            //Add cells to table
            tabelaTourn.addCell(celulatourn);
            tabelaTourn.addCell(celulausuarioid);
            tabelaTourn.addCell(cellapp);
            tabelaTourn.addCell(celulabuyin);
            tabelaTourn.addCell(celulaitm);
            
                       
            //LAYOUT DA TABELA MONTADA, AGORA É INSERIR AS LINHAS COM OS VALORES

            int iduser_osc = 0;
            int idapp_osc = 0;
            int buyin_osc = 0;
            int itm_osc = 0;
            int qtdTourn = 0;
            String tourn_osc = "";
            
                       
            //APÓS ABRIR O DOCUEMNTO CONECTO AO BACO DE DADOS
            // BUSCOS OS VALORES DA TABELA DE USUÁRIOS
            // ADICIONO A UM ARRAYLIST          
            TorneiosDAO objtourndao = new TorneiosDAO();
            ArrayList<TournamentsDTO> lista = objtourndao.PesquisarTorneioDateDAO(datapara);
            
            //INICIA FOR PARA RODAR E ACICIONAR OS VALORES NO RELATÓRIO
            // O FOR É BASEADO NO TAMANHO DO ARRAY
            for (int num = 0; num < lista.size(); num++) {
                
                tourn_osc = lista.get(num).getType_tourn();
                String idtypeStr = String.valueOf(tourn_osc);
                
                iduser_osc = lista.get(num).getId_user_tourn();
                String id_oscStr = String.valueOf(iduser_osc);
                
                idapp_osc = lista.get(num).getApp_id_tourn();
                String idappStr = String.valueOf(idapp_osc);
                
                buyin_osc = lista.get(num).getValue_tourn();
                String idbuyStr = String.valueOf(buyin_osc);
                
                itm_osc = lista.get(num).getItm_val_tourn();
                String iditmStr = String.valueOf(itm_osc);
                
              
                           
                
                          //Criando parágrafos para inserir dentro das células        
            Paragraph paragrafoITypeTourn = new Paragraph(new Phrase(idtypeStr,
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /* paragrafoId.setAlignment(Element.ALIGN_CENTER);*/

            Paragraph paragrafoIdUserTourn = new Paragraph(new Phrase(id_oscStr,
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));

            Paragraph paragrafoIdAppTourn = new Paragraph(new Phrase(idappStr,
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoAtivo.setAlignment(Element.ALIGN_CENTER);*/
                        
            /*paragrafoNome.setAlignment(Element.ALIGN_CENTER);*/
            Paragraph paragrafoBuyInTourn = new Paragraph(new Phrase(idbuyStr,
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoIdConta.setAlignment(Element.ALIGN_CENTER);*/
            
               /*paragrafoNome.setAlignment(Element.ALIGN_CENTER);*/
            Paragraph paragrafoItmTourn = new Paragraph(new Phrase(iditmStr,
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoIdConta.setAlignment(Element.ALIGN_CENTER);*/

//criando CÉLULAS 
            //Create cells
            PdfPCell celulatypetourn = new PdfPCell(paragrafoITypeTourn);
            //alinhando no centro horizontalmente
            celulatypetourn.setHorizontalAlignment(celulatypetourn.ALIGN_CENTER);

            PdfPCell celulaidusertourn = new PdfPCell(paragrafoIdUserTourn);
            celulaidusertourn.setHorizontalAlignment(celulaidusertourn.ALIGN_CENTER);

            PdfPCell celulaidapptourn = new PdfPCell(paragrafoIdAppTourn);
            celulaidapptourn.setHorizontalAlignment(celulaidapptourn.ALIGN_CENTER);
            
            PdfPCell celulabuyintourn = new PdfPCell(paragrafoBuyInTourn);
            celulabuyintourn.setHorizontalAlignment(celulabuyintourn.ALIGN_CENTER);

             PdfPCell celulaitmtourn = new PdfPCell(paragrafoItmTourn);
            celulaitmtourn.setHorizontalAlignment(celulaitmtourn.ALIGN_CENTER);

//adicionando celulas a tabela
            //Add cells to table
            tabelaTourn.addCell(celulatypetourn);
            tabelaTourn.addCell(celulaidusertourn);
            tabelaTourn.addCell(celulaidapptourn);
            tabelaTourn.addCell(celulabuyintourn);
            tabelaTourn.addCell(celulaitmtourn);
            
            //FORMA CORRETA DE USAR O ++
            qtdTourn++;
            
            }
            //TERMINA FOR
            
            //IMPRIMIR NO RELATÓRIO A QUANTIDADE DE TORNEIOS
            Paragraph quebraLinha1 = new Paragraph();
            quebraLinha1.setSpacingAfter(12f);
            
            String paragQtdTourn = "Quantidade total de torneios:" + qtdTourn;
                        
            Paragraph espacoDepoisTable = new Paragraph(paragQtdTourn);
            espacoDepoisTable.setAlignment(espacoDepoisTable.ALIGN_CENTER);
            
           
            documento.add(espacoDepoisTable);
            documento.add(quebraLinha1);
            
            
          
          //adicionando tabela ao documento
            documento.add(tabelaTourn);


            String arquivopdf = "relatorioTorneios.pdf";
//abrir pdf usando o Runtime e executando no PROMPT comando CMD
            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + "cmd /c " + arquivopdf);

            documento.close();
            
            JOptionPane.showMessageDialog(null, "GRADE DE TORNEIO GERADA");
           
           
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro na criação documento na classe DAO:" + e);

        } catch (DocumentException e) {

            JOptionPane.showMessageDialog(null, "Erro na criação documento na classe DAO:" + e);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na criação documento na classe DAO:" + e);
        }
        
             //MOVER O PDF PARA PASTA WEB DO GITHUB
        MoverArquivos objmoverarq = new MoverArquivos();
        objmoverarq.moveArqPdfRela1();
        
}
}