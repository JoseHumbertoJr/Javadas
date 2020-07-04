package Questão_5;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero base: ");
		long base = teclado.nextLong();
		System.out.print("Digite o expoente: ");
		long expoente = teclado.nextLong();
		PotenciaNumerica potencia = new PotenciaNumerica(base,expoente);
		System.out.println("Resultado "+potencia.getValor());
		teclado.close();
	}
}
