package questao05;

import java.util.Scanner;

public class AvaliacaoApp
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		Avaliacao avaliacao = new Avaliacao();
		boolean nota1Ok = false;
		boolean nota2Ok = false;
		System.out.print("Digite nota do est�gio 1: ");
		avaliacao.setNota1(teclado.nextDouble());
		nota1Ok = true;
		System.out.print("Digite nota do est�gio 2: ");
		avaliacao.setNota2(teclado.nextDouble());
		nota2Ok = true;
		System.out.println("M�dia: " + avaliacao.getMedia());
		teclado.close();
	}
}
