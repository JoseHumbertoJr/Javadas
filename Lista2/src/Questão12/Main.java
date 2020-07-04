package Questão12;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		PixeisDaTela calculoDePixeis = new PixeisDaTela();
		int primeiroValor = teclado.nextInt();
		int segundoValor = teclado.nextInt();
		int terceiroValor = teclado.nextInt();
		int quartoValor = teclado.nextInt();
		calculoDePixeis.setPrimeiroValor(primeiroValor);
		calculoDePixeis.setSegundoValor(segundoValor);
		calculoDePixeis.setTerceiroValor(terceiroValor);
		calculoDePixeis.setQuartoValor(quartoValor);
		System.out.println(calculoDePixeis.getQuantidadeDePixels());
		teclado.close();
		
		
	}

}
