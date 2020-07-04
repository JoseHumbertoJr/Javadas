package Questão_2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		System.out.println("Digite");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nome do artista: ");
		String artista = teclado.nextLine();
		System.out.print("Nome do Album: ");
		String album = teclado.nextLine();
		System.out.print("Nome da Musica: ");
		String nome = teclado.nextLine();
		System.out.print("Faixa: ");
		int numero = teclado.nextInt();
		DescritorMusical novo = new DescritorMusical(artista,album,nome,numero);
		System.out.print(novo.toString());
		teclado.close();
	}
}
