package Questão_1099;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 100;
		int cont = 1;
		int maior = 0;
		int posicao = 0;
		while(cont <= n) {
			cont++;
			int x = teclado.nextInt();
			if(x > maior) {
				maior = x;
				posicao = cont;
			}
		}
		System.out.println(maior);
		System.out.println(posicao-1);
	}
}
