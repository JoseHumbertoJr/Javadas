package Questão9b;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		double valor = teclado.nextDouble();
		System.out.print("Digite o desconto: ");
		double desconto = teclado.nextDouble();
		Produto novoDesconto = new Produto();
		novoDesconto.setValor(valor);
		novoDesconto.setDesconto(desconto);
		System.out.println(novoDesconto.getDescontado());
		teclado.close();
	}

}
