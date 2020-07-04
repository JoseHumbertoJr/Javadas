package Questão8;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		System.out.print("Digite a temperatura em Fahrenheit: ");
		ConversorCelsius novoConversor = new ConversorCelsius();
		Scanner teclado = new Scanner(System.in);
		double n = teclado.nextDouble();
		novoConversor.setNumero(n);;
		System.out.println("Celsius: "+novoConversor.getCelsius());
		teclado.close();
	}

}
