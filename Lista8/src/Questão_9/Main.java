package Questão_9;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String operacao = teclado.nextLine();
		if (operacao.equals("+")){
			OperacaoSoma nova = new OperacaoSoma();
			System.out.println("Digite os dois valores");
			double primeiroValor = teclado.nextDouble();
			double segundoValor = teclado.nextDouble();
			nova.setPrimeiroValor(primeiroValor);
			nova.setSegundo_Valor(segundoValor);
			System.out.print(nova.getResultado());
		}
		teclado.close();
	}
}
