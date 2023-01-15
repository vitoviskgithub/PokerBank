
package testes;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;


public class GraficoSimples {
    public static void main(String[] args){
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

dataset.addValue(10, "Máximo", "Hora 1");
dataset.addValue(20, "Máximo", "Hora 2");
dataset.addValue(30, "Máximo", "Hora 3");
dataset.addValue(40, "Máximo", "Hora 4");
dataset.addValue(50, "Máximo", "Hora 5");

JFreeChart criaGrafico = ChartFactory.createLineChart("nomedografico","Dados hora","Valor", dataset,
        PlotOrientation.VERTICAL, true, true,true);
//os tres ultimos true (legenda, tolltips, url)

try{

System.out.println("Criando o Gráfico");
OutputStream imagemSaida = new FileOutputStream("GraficoSimples.png");//gerando um arquivo de imagem no diretório de projeto
ChartUtilities.writeChartAsPNG(imagemSaida, criaGrafico, 500, 400);//configurações da imagem, largura e altura
//toda vez que usar OUTPUT no jchart tem que fechar

imagemSaida.close();

}catch(IOException erroIO){

System.out.println("Erro:" + erroIO.getMessage());


}

JOptionPane.showMessageDialog(null, "gráfico criado");

        
        
    }
    
}
