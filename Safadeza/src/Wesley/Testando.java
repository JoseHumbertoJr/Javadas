package Wesley;

import java.util.Scanner;

public class Testando {
	public static void main(String[]args){
		TesteDeSafadeza p1 = new TesteDeSafadeza();
		System.out.println("_____________________TESTE DE SAFADEZA____________________________");
		System.out.println("Digite o dia que vo�� nasceu:");
		Scanner d = new Scanner(System.in);
		p1.setDia(d.nextInt());
		System.out.println("Digite o mes que vo�� nasceu: ");
		Scanner mes = new Scanner(System.in);
		p1.setMes(mes.nextInt());
		System.out.println("Digite o ano que voc� nasceu: ");
		Scanner ano = new Scanner(System.in);
		p1.setAno(ano.nextInt());
		p1.wesley_safadao();
		mes.close();
		ano.close();
		d.close();
	}

}
