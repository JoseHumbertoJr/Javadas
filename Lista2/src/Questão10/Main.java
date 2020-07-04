package Questão10;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.print("Digite dois valores :");
		Scanner teclado = new Scanner(System.in);
		maiorMultiplo novoMaior = new maiorMultiplo();
		int n = teclado.nextInt();
		int z = teclado.nextInt();
		novoMaior.setN(n);
		novoMaior.setX(z);
		System.out.println(novoMaior.getMaiorMult());
		teclado.close();
	}

}
