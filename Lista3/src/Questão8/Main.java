package Questão8;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o número do mês: ");
		int numero = teclado.nextInt();
		Mes novoMes = new Mes(numero);
		System.out.println(novoMes.getMesDoNumero());
		teclado.close();
	}

}
