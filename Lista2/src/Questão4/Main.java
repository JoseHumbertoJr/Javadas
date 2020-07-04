package Questão4;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.print("Digite seu numero-> ");
		Scanner teclado = new Scanner(System.in);
		double x = teclado.nextDouble();
		Arredondador novoArred = new Arredondador();
		novoArred.setNumero(x);
		System.out.println(novoArred.getArredondador());
		teclado.close();
		
	}

}
