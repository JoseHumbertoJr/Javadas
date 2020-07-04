package Questão9;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.print("Digite suas medias: ");
		mediaTripla novaMedia = new mediaTripla();
		Scanner teclado = new Scanner(System.in);
		double numero = teclado.nextDouble();
		double numero2 = teclado.nextDouble();
		double numero3 = teclado.nextDouble();
		novaMedia.setNum1(numero);
		novaMedia.setNum2(numero2);
		novaMedia.setNum3(numero3);
		System.out.println("Média-> "+novaMedia.getMedia());
		teclado.close();
	}

}
