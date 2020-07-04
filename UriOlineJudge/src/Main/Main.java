package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double media = 0;
		int cont = 0;
		while(cont < 2) {
			System.out.println("digite o valor");
			double numero = teclado.nextDouble();
			if(numero >= 0 && numero <= 10) {
				media+=numero;
				cont++;
			}
			else if(numero < 0 || numero > 10) {
				System.out.println("nota invalida");
			}
			if(cont == 2) {
				media = media / 2;
				System.out.printf("media = %.2f",media);
				System.out.println(" ");
				System.out.println("novo calculo (1-sim 2-nao)");
				int opcao = 0;
				opcao = teclado.nextInt();
				if(opcao == 1) {
					media = 0;
					cont = 0;
				}
				else if(opcao == 2) {
					cont = 3;
				}
				else {
					while(opcao !=1 || opcao != 2) {
						System.out.println("novo calculo (1-sim 2-nao)");
						opcao = teclado.nextInt();
						if(opcao == 1) {
							media = 0;
							cont = 0;
						}
						else if(opcao == 2) {
							cont = 3;
							opcao = 2;
						}
					}
				}
			}
		}
		
		
	}

}
