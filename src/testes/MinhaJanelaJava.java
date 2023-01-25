package testes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MinhaJanelaJava {

    public static void main(String[] args) {


        BufferedImage img = null;

        try {
            
            //OBTEM E COLOCA A IMAGEM DENTRO DE UMA BUFFEREDIMAGE
            img = ImageIO.read(new File("imageBack1.jpg"));


        } catch (IOException erro) {

            JOptionPane.showMessageDialog(null, "erro :" + erro);

            erro.printStackTrace();
        }

        
            //cria e configura o texto no JLabel
            JLabel label = new JLabel();
            label.setText("Teste");
            label.setFont(new Font("Calibri", Font.BOLD, 120));
            label.setForeground(Color.white);
            label.setHorizontalTextPosition(JLabel.CENTER);
            
            JLabel lab = new JLabel();
            label.setText("passou");

// cria e configura a janela
            JFrame janela = new JFrame();
            janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//não faz nada ao clicar no X
            janela.setSize(1280, 720);

            Image dimg = img.getScaledInstance(janela.getWidth(), janela.getHeight(), Image.SCALE_SMOOTH);//CARREGANDO A IMAGEM ADAPTANDO AO TAMANHO DA JANELA

            ImageIcon imageIcon = new ImageIcon(dimg);
            label.setIcon(imageIcon);

//mostra a janela e adiciona a label a ela
            janela.setVisible(true);
            janela.add(label);//adicionando a label ao JFrame
            
            label.add(lab);//adicionando uma label nova
                }
}
