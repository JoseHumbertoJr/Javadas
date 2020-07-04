package Paulete;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		TransformandoEmBinario numero = new Binario();
		int valor = teclado.nextInt();
		numero.setNumero(valor);
		System.out.print(numero.getNumeroEmBinario());
	}
}
