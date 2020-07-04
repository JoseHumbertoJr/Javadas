package Questão_1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws MesInvalidoException{
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		Mes novoMes = new Mes();
		novoMes.setNumeroDoMes(numero);
		teclado.close();
	}
}
