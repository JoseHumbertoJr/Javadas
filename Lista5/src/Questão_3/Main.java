package Questão_3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		VetorDeNumero novoVetor = new VetorDeNumero();
		for (int i = 0;i<=3;i++){
			System.out.print("Digite o valor: ");
			double valor = teclado.nextDouble();
			novoVetor.add(valor);
		}
		System.out.println("O menor é : "+novoVetor.getMenor());
		teclado.close();
	}

}
