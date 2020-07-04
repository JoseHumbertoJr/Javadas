package Questão_2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		int valor = teclado.nextInt();
		Fatorial fatorial = new Fatorial();
		fatorial.setValor(valor);
		System.out.println("Fatorial-> "+fatorial.getFatorial());
		teclado.close();
	}
}
