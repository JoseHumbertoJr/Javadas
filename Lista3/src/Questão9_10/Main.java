package Questão9_10;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.print("Digite seu ano: ");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		Ano novoAno = new Ano(numero);
		System.out.println("Bissexto: "+novoAno.getBissexto());
		teclado.close();
	}

}
