package Questão_6;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os bits");
		VerifficadorDeParidade verificador = new VerifficadorDeParidade();
		long bits = teclado.nextLong();
		verificador.setBits(bits);
		System.out.println(verificador.hasParidade());
		teclado.close();
		
	}
}
