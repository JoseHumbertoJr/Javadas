package Questão_1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		int valor = teclado.nextInt();
		Numero qtdDigitos = new Numero();
		qtdDigitos.setValor(valor);
		int resultado = qtdDigitos.getQtdDigitos();
		System.out.println(resultado);
		teclado.close();
	}
}
