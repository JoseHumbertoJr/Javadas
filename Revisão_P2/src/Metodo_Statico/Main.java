package Metodo_Statico;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		for(int i = 1;i <= 3;i++){
			Atleta Atleta = new Atleta();
			System.out.print("Digite o nome: ");
			String nome = teclado.nextLine();
			Atleta.setNome(nome);
			System.out.print("Digite o peso: ");
			double peso = teclado.nextDouble();
			Atleta.setPeso(peso);
			System.out.print("Digite a altura: ");
			double altura = teclado.nextDouble();
			teclado.nextLine();
			Atleta.setAltura(altura);
		}
		System.out.println("Maior altura "+Atleta.getMaiorAltura());
		System.out.println("Maior peso: "+Atleta.getMaiorPeso());
		teclado.close();
	}
}
