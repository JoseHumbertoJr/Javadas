package Questão_9;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.print("Digite o valor: ");
		Scanner teclado = new Scanner(System.in);
		double numero = teclado.nextDouble();
		ConversorDePotencia novaPotencia = new ConversorDePotencia(numero);
		System.out.println(ConversorDePotencia.getHorsePower()+" HP");
		System.out.println(ConversorDePotencia.getKiloWatts()+" KW");
		teclado.close();
	}
}
