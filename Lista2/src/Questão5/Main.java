package Questão5;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		conversorMaiusculo novoConversor = new conversorMaiusculo();
		System.out.print("Digite sua letra-> ");
		char l = teclado.nextLine().charAt(0);
		novoConversor.setLetra(l);
		System.out.println("-> "+novoConversor.getMaiusculo());
		teclado.close();
		
		
	}
}
