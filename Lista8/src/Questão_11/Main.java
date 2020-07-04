package Questão_11;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o Metodo: ");
		String nome = teclado.nextLine();
		if (nome.equalsIgnoreCase("construtor")){
			Metodo construtor = new Construtor();
			System.out.println("Digite a visibilidade: ");
			String visibilidade = teclado.nextLine();
			System.out.println("Nome Do Metodo");
			String metodo = teclado.nextLine();
			construtor.setNome(visibilidade);
			construtor.setVisibilidade(metodo);
			System.out.println(construtor.toString());
		}
		teclado.close();
	}
}
