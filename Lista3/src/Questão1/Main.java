package Questão1;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		System.out.println("Digite o valor: ");
		Scanner teclado = new Scanner(System.in);
		int Valor = teclado.nextInt();
		ClassificadorDeNumero novoClassif = new ClassificadorDeNumero(Valor);
		novoClassif.isImpar();
		novoClassif.isPar();
		System.out.println("seu numero é par:"+novoClassif.isPar());
		System.out.println("seu numero é impar:"+novoClassif.isImpar());
		teclado.close();
		
	}

}
