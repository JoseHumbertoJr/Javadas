package Questão2;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um valor negativo: ");
		int valor = teclado.nextInt();
		ConversorDeNumero numero = new ConversorDeNumero(valor);
		System.out.println(numero.getPositivo());
		teclado.close();
	}

}
