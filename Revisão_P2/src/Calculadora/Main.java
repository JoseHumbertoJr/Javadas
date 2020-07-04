package Calculadora;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		double valorUm = teclado.nextDouble();
		double valorDois = teclado.nextDouble();
		System.out.println("Soma "+Calculadora.getSoma(valorUm, valorDois));
		System.out.println("Subtracao "+Calculadora.getSubtracao(valorUm,valorDois));
		System.out.println("Divisao "+Calculadora.getDivisao(valorUm, valorDois));
		System.out.println("Multiplicacao "+Calculadora.getMultiplicacao(valorUm, valorDois));
	}
}
