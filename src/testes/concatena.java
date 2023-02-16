
package testes;

import javax.swing.JOptionPane;

public class concatena {
    public void conca(){
        String part1 = "jdbc:mysql://localhost:3306/pokerbank?user=root&password=";
        String part2 = "";        
        String  total = "";
        
        part2 = JOptionPane.showInputDialog("Insira a senha root");
        
        total = part1 + part2;
        
        JOptionPane.showMessageDialog(null, total);
        
       
    }
}
