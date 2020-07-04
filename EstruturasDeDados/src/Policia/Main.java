package Policia;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Procurados lista = new Procurados();
		boolean ok = true;
		while(ok == true) {
			System.out.println("Adicinar procurado Sim ou Nao");
			String nome = teclado.nextLine();
			if(nome.equalsIgnoreCase("Sim")) {
				System.out.print("Digite o nome: ");
				String procurado = teclado.nextLine();
				lista.adicionaNome(procurado);
			}
			else {
				ok = false;
			}
		}
		System.out.print("Digite o nome=> ");
		String nome = teclado.nextLine();
		System.out.println(lista.getProcurado(nome));
	}
}
