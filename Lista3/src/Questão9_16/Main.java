package Questão9_16;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.print("Digite seu horario: ");
		Scanner teclado = new Scanner(System.in);
		int hora = teclado.nextInt();
		int minuto = teclado.nextInt();
		Fome comer = new Fome(hora,minuto);
		System.out.println(comer.getRefeição());
		teclado.close();
	}
}
