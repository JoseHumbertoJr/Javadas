package Questão9_11;
import java.util.Scanner;

public class Main {
	public static  void main(String[] args){
		System.out.println("Digite os lados: ");
		Scanner teclado = new Scanner(System.in);
		int ladoA = teclado.nextInt();
		int ladoB = teclado.nextInt();
		int ladoC = teclado.nextInt();
		Triangulo Triangulo = new Triangulo(ladoA,ladoB,ladoC);
		System.out.println(Triangulo.getFormaTriangulo());
		teclado.close();
	}

}
