package Questão_1174;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Object [] arrayInterno = new Object[100];
		float cont = 0;
		for(int i = 1; i <= 10; i++) {
			float x = teclado.nextFloat();
			for(int y = 0; y <= 10; x++) {
				if(x <= 10 && arrayInterno[y] == null) {
					arrayInterno[y] = x;
					cont = y;
				}
			}
		}
		for(int j = 0; j <= cont; j++) {
			if(arrayInterno[j] != null) {
				System.out.println("A["+j+"] = "+arrayInterno[j]);
			}
		}
	}
}
