package Prova;

import java.util.Scanner;

public class Main{
	public static void main(String[] args){

	Scanner teclado = new Scanner(System.in);

	System.out.print("Digite o valor Octal: ");

	long valor = teclado.nextLong();
	
	try{
		NumeroOctal numero = new NumeroOctal(valor);
		System.out.println(valor + " em binário é " + numero.getBinario());
	}
	catch(NumeroInvalidoException rose){
		rose.getMessage();
	}
	}
}