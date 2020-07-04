package Questão_6;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		for(int i = 1;i <= 3;i++){
			Atleta novoAtleta = new Atleta();
			System.out.println("Digite o nome: ");
			String nome = teclado.nextLine();
			novoAtleta.setNome(nome);
			System.out.println("Digite o peso: ");
			double peso = teclado.nextDouble();
			novoAtleta.setPeso(peso);
			System.out.println("Digite a altura: ");
			double altura = teclado.nextDouble();
			novoAtleta.setAltura(altura);
			teclado.nextLine();
		}
		System.out.println(Atleta.getMaiorAltura());
		System.out.println(Atleta.getMaiorPeso());
		teclado.close();
	}
}