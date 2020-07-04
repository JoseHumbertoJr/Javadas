package Questão7;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.print("Digite a temperatura em Celsius: ");
		Scanner teclado = new Scanner(System.in);
		conversorFahrenheit novoConversor = new conversorFahrenheit();
		double n = teclado.nextDouble();
		novoConversor.setNumero(n);
		System.out.println("Fahrenheit: "+novoConversor.getFahrenheit());
		teclado.close();
		
	}

}
