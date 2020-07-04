package Questão_4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os valores");
		VetorDeReais novoVetor = new VetorDeReais();
		for (int i = 1;i <= 4;i++){
			double numero = teclado.nextDouble();
			novoVetor.addNumero(numero);
		}
		System.out.println(novoVetor.getMedia());
		teclado.close();
	}

}
