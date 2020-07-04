package Heranca;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o sinal da operacao: ");
		String operacao = teclado.nextLine();
		System.out.print("Digite o primeiro valor: ");
		double valorUm = Integer.parseInt(teclado.nextLine());
		System.out.print("Digite o segundo valor: ");
		double valorDois = teclado.nextDouble();
		if(operacao.equals("+")){
			OperacaoMatematica operacaoSoma = new Soma(valorUm,valorDois);
			System.out.print(operacaoSoma.toString());
		}
		teclado.close();
	}
}
