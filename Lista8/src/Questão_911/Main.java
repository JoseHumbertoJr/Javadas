package Questão_911;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws MetodoInvalidoException{
		System.out.print("Digite o Tipo do Metodo: ");
		Scanner teclado = new Scanner(System.in);
		String nomeDoMetodo = teclado.nextLine();
		System.out.print("Digite a visibilidade: ");
		String visibilidade = teclado.nextLine();
		System.out.print("Digite o retorno se for de instancia ou abstrato: ");
		String retorno = teclado.nextLine();
		System.out.print("Digite o nome do metodo: ");
		String nome = teclado.nextLine();
		
		switch (nomeDoMetodo){
		case "instancia":
			Metodo Instancia = new Instancia(visibilidade,retorno,nome);
			System.out.print(Instancia.toString());
			break;
		case "construtor":
			Metodo construtor = new Construtor(visibilidade,nome);
			System.out.print(construtor.toString());
			break;
		case "abstrato":
			Metodo abstrato = new Abstrato(visibilidade,retorno,nome);
			System.out.print(abstrato.toString());
			break;
		default:
			break;
		}
		teclado.close();
	}
}
