package Questão6;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.print("Digite sua letra-> ");
		conversorMinusculo novoConversor = new conversorMinusculo();
		Scanner teclado = new Scanner(System.in);
		char l = teclado.nextLine().charAt(0);
		novoConversor.setLetra(l);
		System.out.println("-> "+novoConversor.getMinusculo());
		teclado.close();
		
	}

}
