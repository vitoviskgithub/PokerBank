package DAO;

import CONTROL.MoverArquivos;
import DTO.PesquisaDateDTO;
import VIEW.frmGraphicAdm;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import org.jfree.data.category.DefaultCategoryDataset;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GeraGraphicDAO {

    //variáveis externas(globais)
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public void gerandoGraphicLoopCalc(PesquisaDateDTO objpesqdatedto) {

        int ent_osc = 0;
        int ganho_osc = 0;
        int perda_osc = 0;
        int saque_osc = 0;

        int num = 0;//contador para o método FOR onde terá o ARRAY

        int resultado_y = 0;
        Date data_in = new Date();
        Date data_en = new Date();
        Date data_osc = new Date();

        String data_in_formatada = "";
        String data_en_formatada = "";

        String sql = "SELECT entrada_bank, ganho_bank, perda_bank, data_bank, saque_bank FROM tablebankuser WHERE fk_app_id_bank = ? AND data_bank BETWEEN  ? AND ?";

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
            data_en_formatada = dateFormat.format(data_en);

            pstm.setString(3, data_en_formatada);

            rs = pstm.executeQuery();

            ArrayList<String> resultadoYArray = new ArrayList();
            ArrayList<String> dataOscArray = new ArrayList();

            //CONTADOR, usando NUM como marcador
            while (rs.next()) {
                ent_osc = rs.getInt(1);
                ganho_osc = rs.getInt(2);
                perda_osc = rs.getInt(3);

                data_osc = rs.getDate(4);
                saque_osc = rs.getInt(5);

                //primeiro cálculo do resultado recebendo entrada com ganho
                resultado_y = resultado_y + (ent_osc + ganho_osc);

                resultadoYArray.add(String.valueOf(resultado_y));
                dataOscArray.add(String.valueOf(data_osc));

                //---------------------------------------------------
                //segundo cálculo do resultado subtraindo a perda
                resultado_y = resultado_y - (perda_osc + saque_osc);

                resultadoYArray.add(String.valueOf(resultado_y));
                dataOscArray.add(String.valueOf(data_osc));

                //zerando os campos que oscilam
                ent_osc = 0;
                ganho_osc = 0;
                perda_osc = 0;
                saque_osc = 0;

                data_osc = new Date();

            }

            int n = 0;
            int n1 = 0;
            int i = 0;

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            n = resultadoYArray.size();

            for (i = 0; i < n; i++) {
                //já inicia imprimindo a posição incial do VECTOR ArrayList que é 0
                System.out.printf("Posição %d- %s\n", i, resultadoYArray.get(i));

                int testeResArr = Integer.parseInt(resultadoYArray.get(i));
                String convNum = String.valueOf(i);

                dataset.addValue(testeResArr, "LINHA", convNum);

            }

            try {

                JFreeChart criaGrafico = ChartFactory.createLineChart("Gráfico carreira (por Aplicativo)", "Intervalo: " + data_in_formatada + " e " + data_en_formatada + " - ID do App(Conta): " + objpesqdatedto.getId_app(), "VALORES (R$)", dataset,
                        PlotOrientation.VERTICAL, true, true, true);
//os tres ultimos true (legenda, tolltips, url)

                JOptionPane.showMessageDialog(null, "Criando gráfico");
                OutputStream imagemSaida = new FileOutputStream("Graphic_app.png");//gerando um arquivo de imagem no diretório de projeto
                ChartUtilities.writeChartAsPNG(imagemSaida, criaGrafico, 500, 400);//configurações da imagem, largura e altura
//toda vez que usar OUTPUT no jchart tem que fechar

                imagemSaida.close();

            } catch (IOException erroIO) {

                JOptionPane.showMessageDialog(null, "geraGraphicDAO: " + erroIO);

            }

            JOptionPane.showMessageDialog(null, "Gráfico criado");

            pstm.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro na GeraGraphicDAO no método Gerador de gráfico: " + e);
        }
        
        //MOVE O ARQUIVO DE UM PASTA PARA OUTRA
        MoverArquivos objmoverarq = new MoverArquivos();
        objmoverarq.moveArqPngApp();// move o arquivo gerado para dentro da pasta do APP


    }

    public void gerandoGraphicLoopCalcUser(PesquisaDateDTO objpesqdatedto) {

        int ent_osc = 0;
        int ganho_osc = 0;
        int perda_osc = 0;
        int saque_osc = 0;

        int num = 0;//contador para o método FOR onde terá o ARRAY

        int resultado_y = 0;
        Date data_in = new Date();
        Date data_en = new Date();
        Date data_osc = new Date();

        String data_in_formatada = "";
        String data_en_formatada = "";

        String sql = "SELECT entrada_bank, ganho_bank, perda_bank, data_bank, saque_bank FROM tablebankuser WHERE fk_id_user_bank = ? AND data_bank BETWEEN  ? AND ?";

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
            data_en_formatada = dateFormat.format(data_en);

            pstm.setString(3, data_en_formatada);

            rs = pstm.executeQuery();

            ArrayList<String> resultadoYArray = new ArrayList();
            ArrayList<String> dataOscArray = new ArrayList();

            //CONTADOR, usando NUM como marcador
            while (rs.next()) {
                ent_osc = rs.getInt(1);
                ganho_osc = rs.getInt(2);
                perda_osc = rs.getInt(3);

                data_osc = rs.getDate(4);
                saque_osc = rs.getInt(5);
                

                //primeiro cálculo do resultado recebendo entrada com ganho
                resultado_y = resultado_y + (ent_osc + ganho_osc);

                resultadoYArray.add(String.valueOf(resultado_y));
                dataOscArray.add(String.valueOf(data_osc));

                //---------------------------------------------------
                //segundo cálculo do resultado subtraindo a perda
                resultado_y = resultado_y - (perda_osc + saque_osc);

                resultadoYArray.add(String.valueOf(resultado_y));
                dataOscArray.add(String.valueOf(data_osc));

                //zerando os campos que oscilam
                ent_osc = 0;
                ganho_osc = 0;
                perda_osc = 0;
                saque_osc = 0;

                data_osc = new Date();

            }

            int n = 0;
            int n1 = 0;
            int i = 0;

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            n = resultadoYArray.size();
            for (i = 0; i < n; i++) {
                //já inicia imprimindo a posição incial do VECTOR ArrayList que é 0
                System.out.printf("Posição %d- %s\n", i, resultadoYArray.get(i));

                int testeResArr = Integer.parseInt(resultadoYArray.get(i));
                String convNum = String.valueOf(i);
                dataset.addValue(testeResArr, "LINHA", convNum);

            }

            try {

                JFreeChart criaGrafico = ChartFactory.createLineChart("Gráfico carreira (por Usuário)", "Intervalo: " + data_in_formatada + " e " + data_en_formatada + " - ID do Usuário: " + objpesqdatedto.getIduser(), "VALORES (R$)", dataset,
                        PlotOrientation.VERTICAL, true, true, true);
//os tres ultimos true (legenda, tolltips, url)

                JOptionPane.showMessageDialog(null, "Criando gráfico");
                OutputStream imagemSaida = new FileOutputStream("Graphic_user.png");//gerando um arquivo de imagem no diretório de projeto

                ChartUtilities.writeChartAsPNG(imagemSaida, criaGrafico, 500, 400);//configurações da imagem, largura e altura
//toda vez que usar OUTPUT no jchart tem que fechar

                imagemSaida.close();

            } catch (IOException erroIO) {

                JOptionPane.showMessageDialog(null, "geraGraphicDAO: " + erroIO);

            }

            JOptionPane.showMessageDialog(null, "Gráfico criado");

            pstm.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro na GeraGraphicDAO no método Gerador de gráfico: " + e);
        }

        //MOVE O ARQUIVO DE UM PASTA PARA OUTRA
        MoverArquivos objmoverarq = new MoverArquivos();
        objmoverarq.moveArqPngUser();// move o arquivo gerado para dentro da pasta do APP

    }

    public void janelaNovaImagemUser() {

        BufferedImage img = null;

        try {

            //OBTEM E COLOCA A IMAGEM DENTRO DE UMA BUFFEREDIMAGE
            img = ImageIO.read(new File("C:/Users/Meu Computador/Documents/GitHub/repositories/links/src/images/Graphic_user.png"));

        } catch (IOException erro) {

            JOptionPane.showMessageDialog(null, "Abrindo uma nova janela para carregar a imagem do gráfico GeraGraphicDAO: \n" + erro);
        }

        //cria e configura o texto no JLabel
        JLabel label = new JLabel();
        /*label.setText("Teste");
            label.setFont(new Font("Arial", Font.BOLD, 28));*/
        label.setForeground(Color.white);
        label.setHorizontalTextPosition(JLabel.CENTER);

        JLabel lab = new JLabel();
        /*label.setText("Passou");*/

// cria e configura a janela
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//não faz nada ao clicar no X
        janela.setSize(520, 445);

        /*Image dimg = img.getScaledInstance(janela.getWidth(), janela.getHeight(), Image.SCALE_SMOOTH);//ADAPTANDO A IMAGEM AO TAMANHO DA JANELA*/
        Image dimg = img.getScaledInstance(500, 400, Image.SCALE_SMOOTH);//ADAPTANDO A IMAGEM AO TAMANHO DA JANELA

        ImageIcon imageIcon = new ImageIcon(dimg);
        label.setIcon(imageIcon);//fazendo a imagem aparecer

//mostra a janela e adiciona a label a ela
        janela.setVisible(true);
        janela.add(label);//adicionando a label ao JFrame

        label.add(lab);//adicionando uma label nova

    }

    public void janelaNovaImagemApp() {

        BufferedImage img = null;

        try {

            //OBTEM E COLOCA A IMAGEM DENTRO DE UMA BUFFEREDIMAGE
            img = ImageIO.read(new File("C:/Users/Meu Computador/Documents/GitHub/repositories/links/src/images/Graphic_app.png/"));

        } catch (IOException erro) {

            JOptionPane.showMessageDialog(null, "Abrindo uma nova janela para carregar a imagem do gráfico GeraGraphicDAO: \n" + erro);
        }

        //cria e configura o texto no JLabel
        JLabel label = new JLabel();
        /*label.setText("Teste");
            label.setFont(new Font("Arial", Font.BOLD, 28));*/
        label.setForeground(Color.white);
        label.setHorizontalTextPosition(JLabel.CENTER);

        JLabel lab = new JLabel();
        /*label.setText("Passou");*/

// cria e configura a janela
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//não faz nada ao clicar no X
        janela.setSize(520, 445);

        /*Image dimg = img.getScaledInstance(janela.getWidth(), janela.getHeight(), Image.SCALE_SMOOTH);//ADAPTANDO A IMAGEM AO TAMANHO DA JANELA*/
        Image dimg = img.getScaledInstance(500, 400, Image.SCALE_SMOOTH);//ADAPTANDO A IMAGEM AO TAMANHO DA JANELA

        ImageIcon imageIcon = new ImageIcon(dimg);
        label.setIcon(imageIcon);//fazendo a imagem aparecer

//mostra a janela e adiciona a label a ela
        janela.setVisible(true);
        janela.add(label);//adicionando a label ao JFrame

        label.add(lab);//adicionando uma label nova

    }

}
