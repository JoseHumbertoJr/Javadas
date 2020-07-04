package Questão_1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int codX = teclado.nextInt();
		int codY = teclado.nextInt();
		String rotulo = teclado.nextLine();
		PontoCartesiano novoPonto = new PontoCartesiano(codX,codY,rotulo);
		System.out.println(novoPonto.toString());
		teclado.close();
	}
}
