package Aula_04;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		Vetor novoVetor = new Vetor();
		int cont = 0;
		while(cont < 6){
			System.out.println("Digite elementos: ");
			String elemento = teclado.nextLine();
			novoVetor.adicionarElemento(elemento);
			System.out.println(novoVetor.getTamanho());
			cont++;
		}
		System.out.println(novoVetor.toString());
	}
}
