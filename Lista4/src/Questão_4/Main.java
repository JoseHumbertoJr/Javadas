package Questão_4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite dois valores: ");
		int valorUm = teclado.nextInt();
		int valorDois = teclado.nextInt();
		ParDeNumeros numeros = new ParDeNumeros(valorUm,valorDois);
		System.out.println("Maximo divisor comum: "+numeros.getMDC());
		teclado.close();
	}

}
