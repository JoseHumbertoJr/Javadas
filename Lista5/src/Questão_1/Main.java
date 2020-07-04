package Questão_1;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		Inteiro novoInt = new Inteiro();
		int valor = teclado.nextInt();
		novoInt.setValor(valor);
		int [] array = novoInt.getDivisores();
		for (int i = 0;i < array.length;i++){
			System.out.print(array[i]+" ");
		}
		teclado.close();
	}
}