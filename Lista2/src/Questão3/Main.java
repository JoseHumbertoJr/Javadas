package Questão3;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.print("Digite seu número-> ");
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		Centena novaCentena = new Centena();
		novaCentena.setNumero(x);
		System.out.println(novaCentena.getCentena());
		teclado.close();
		
	}
}
