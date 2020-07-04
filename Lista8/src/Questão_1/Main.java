package Questão_1;

import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite qual tipo de ligação: ");
		String tipo = teclado.nextLine();
		if (tipo.equals("internacional")){
			TelefoneInternacional novoTelefone = new TelefoneInternacional();
			System.out.print("Digite o numero: ");
			long numero = teclado.nextLong();
			novoTelefone.setNumero(numero);
			System.out.println(novoTelefone.toString());
		}
		else if(tipo.equals("telefone")){
			Telefone novoTelefone = new Telefone();
			System.out.print("Digite o numero: ");
			long numero = teclado.nextLong();
			novoTelefone.setNumero(numero);
			System.out.println(novoTelefone.toString());
		}
		else if(tipo.equals("interurbano")){
			TelefoneInterurbano novoTelefone = new TelefoneInterurbano();
			System.out.print("Digite o numero: ");
			long numero = teclado.nextLong();
			novoTelefone.setNumero(numero);
			System.out.println(novoTelefone.toString());
		}
		teclado.close();
	}
}
