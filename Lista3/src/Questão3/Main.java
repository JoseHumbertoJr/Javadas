package Quest�o3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite dois valores: ");
		int valorUm = teclado.nextInt();
		int valorDois = teclado.nextInt();
		ComparadorNumerico comparador = new ComparadorNumerico(valorUm,valorDois);
		System.out.println("O maior � "+comparador.getMaior());
		teclado.close();
	}

}
