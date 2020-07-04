package Javando;

import java.util.Scanner;

public class UsandoCaneta {
	public static void main(String[]args){
		Caneta c1 = new Caneta();
		System.out.println("Qual a cor da caneta? ");
		Scanner c = new Scanner(System.in);
		c1.cor = c.nextLine();
		Scanner p = new Scanner(System.in);
		c1.ponta = p.nextFloat();
		c1.tampada = false;
		c1.carga = 0.5f;
		c1.peso = 132;
		c1.status();
		c.close();
		p.close();
		
	}

}
