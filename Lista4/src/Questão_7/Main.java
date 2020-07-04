package Questão_7;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite dois numeros: ");
		int valorInicial = teclado.nextInt();
		int valorFinal = teclado.nextInt();
		Somatório novaSoma = new Somatório(valorInicial,valorFinal);
		System.out.println("Soma do intervalor = "+novaSoma.getSomaDoIntervalo());
		teclado.close();
	}
}
