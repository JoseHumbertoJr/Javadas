package Questão_2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		VetorDeNumeros inteiro = new VetorDeNumeros();
		for (int i = 0;i<=3;i++){
			System.out.println("Digite o valor");
			double valor = teclado.nextDouble();
			inteiro.add(valor);	
		}
		System.out.println("Maior é "+inteiro.getMaior());
		teclado.close();
	}
}
