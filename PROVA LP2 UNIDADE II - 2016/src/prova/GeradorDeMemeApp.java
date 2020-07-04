package prova;
import java.util.Scanner;

public class GeradorDeMemeApp {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase = teclado.nextLine();
		GeradorDeMimimi novo = new GeradorDeMimimi();
		novo.setFrase(frase);
		System.out.println(novo.getFraseMemetizada());
	}

}
