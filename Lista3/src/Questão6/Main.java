package Quest�o6;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite tr�s valores: ");
		int valorUm = teclado.nextInt();
		int valorDois = teclado.nextInt();
		int valorTres = teclado.nextInt();
		ComparadorNumerico comparador = new ComparadorNumerico(valorUm,valorDois,valorTres);
		System.out.println(comparador.getMenor());
		teclado.close();
		
	}
}
