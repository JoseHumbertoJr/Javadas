package Interface;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");       
         
        String nomeCompleto = nome + " " + sobreNome;
     
        JOptionPane.showMessageDialog(null,"Nome Completo: "+nomeCompleto,"Informação",JOptionPane.WARNING_MESSAGE);
 
    }
}
