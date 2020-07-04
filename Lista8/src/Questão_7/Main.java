package Questão_7;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		Intens lista = new ListaComLetras();
		for (int j = 0;j <= 4;j++){
			String intem = teclado.nextLine();
			lista.addIntens(intem);
		}
		System.out.println(lista.toString());
		teclado.close();
	}
}
