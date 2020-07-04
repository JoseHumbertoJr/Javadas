package Questão13;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		calculoDoCirculo calculandoCirculo = new calculoDoCirculo();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor do raio: ");
		int valor = teclado.nextInt();
		calculandoCirculo.setValor(valor);
		System.out.println(calculandoCirculo.getDiametroDoCirculo());
		System.out.println(calculandoCirculo.getAreaDoCirculo());
		System.out.printf("%.2f",calculandoCirculo.getCircunferenciaDoCirculo());
		teclado.close();
		
	}

}
