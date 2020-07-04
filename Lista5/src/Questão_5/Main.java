package Questão_5;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seus cinco numeros: ");
		ListaDeNumeros novaLista = new ListaDeNumeros();
		for (int i = 1;i<=5;i++){
			int numero = teclado.nextInt();
			novaLista.addNumero(numero);
		}
		System.out.println("Tem repeticao: "+novaLista.hasRepeticao());
		teclado.close();
	}
}
