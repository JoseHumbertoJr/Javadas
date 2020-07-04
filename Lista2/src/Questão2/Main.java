package Questão2;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.print("Digite seu numero-> ");
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		Dezena novaDezena = new Dezena();
		novaDezena.setN(x);
		System.out.println(novaDezena.getDezena());
		teclado.close();
		
	}

}
