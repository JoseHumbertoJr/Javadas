package Questão_9_10;
import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a Quantidade de metros: ");
		double metros = teclado.nextDouble();
		ConversorDeComprimento novoConversor = new ConversorDeComprimento();
		novoConversor.setMetros(metros);
		System.out.println(ConversorDeComprimento.getMedidaEmJardas());
		System.out.print(ConversorDeComprimento.getMedidaEmPolegadas());
		teclado.close();
	}
}
