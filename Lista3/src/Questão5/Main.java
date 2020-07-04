package Questão5;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite três valores: ");
		int valorUm = teclado.nextInt();
		int valorDois = teclado.nextInt();
		int valorTres = teclado.nextInt();
		ComparadorNumerico comparador = new ComparadorNumerico(valorUm,valorDois,valorTres);
		System.out.println(comparador.getMaior());
		teclado.close();
	}

}
