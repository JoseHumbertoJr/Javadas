package Javou;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CaixaDeTexto extends JFrame{
	private JTextField fixa, caixa;
	private JButton exibe, limpa;
	
	public CaixaDeTexto(){
		super("Hipercard");
		setLayout(new FlowLayout());
		
		fixa = new JTextField("N�o � poss�vel alterar essa caixa de texto");
		fixa.setEditable(false);
		add(fixa);
		
		caixa=new JTextField(20);
		add(caixa);
		
		exibe = new JButton("Exibir");
		exibe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento){
				if(evento.getSource() == exibe)
					JOptionPane.showMessageDialog(null, caixa.getText());
			}
		 }
		);
		add(exibe);
		
		limpa = new JButton("Limpar");
		limpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento){
				if(evento.getSource() == limpa)
					caixa.setText("");
			}
		 }
		);
		add(limpa);
	}
	
	
}