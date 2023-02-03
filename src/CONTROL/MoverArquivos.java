package CONTROL;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.JOptionPane;

public class MoverArquivos {

    public void moveArqPngUser() {
        Path sourcePath = Paths.get("C:/Users/Meu Computador/Desktop/Graphic_user.png");
        Path destinationPath = Paths.get("C:/Users/Meu Computador/Documents/GitHub/links/src/images/Graphic_user.png");

        try {
            Files.move(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
    }
    
     public void moveArqPngApp() {
        Path sourcePath = Paths.get("C:/Users/Meu Computador/Desktop/Graphic_app.png");
        Path destinationPath = Paths.get("C:/Users/Meu Computador/Documents/GitHub/links/src/images/Graphic_app.png");

        try {
            Files.move(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
    }
    
     public void moveArqPdfRela() {
        Path sourcePath = Paths.get("C:/Users/Meu Computador/Desktop/relatorioUsuario.pdf/");
        Path destinationPath = Paths.get("C:/Users/Meu Computador/Documents/GitHub/links/src/images/info/relatorioUsuario.pdf/");

        try {
            Files.move(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
    }
    
      public void moveArqPdfRela1() {
        Path sourcePath = Paths.get("C:/Users/Meu Computador/Desktop/relatorioTorneios.pdf/");
        Path destinationPath = Paths.get("C:/Users/Meu Computador/Documents/GitHub/links/src/images/info/relatorioTorneios.pdf/");

        try {
            Files.move(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
    }
    
}
