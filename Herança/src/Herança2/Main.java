package Herança2;

import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Visitante v1 = new Visitante();
		System.out.println("Digite Seu Nome Gafanhoto");
		Scanner n = new Scanner(System.in);
		v1.setNome(n.nextLine());
		System.out.println("Digite Sua Idade:");
		Scanner i = new Scanner(System.in);
		v1.setIdade(i.nextInt());
		System.out.println("Digite seu Sexo:");
		Scanner s = new Scanner(System.in);
		v1.setSexo(s.nextLine());
		v1.status();
		n.close();
		i.close();
		s.close();
	}
	
}
