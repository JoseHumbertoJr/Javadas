package Questão_6;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o cargo: ");
		String cargo = teclado.nextLine();
		if (cargo.equalsIgnoreCase("Deputado Estadual")){
			Candidato novo = new DeputadoEstadual();
			System.out.print("Digite o Número: ");
			int numero = teclado.nextInt();
			System.out.println("Digite o Nome: ");
			String nome = teclado.nextLine();
			novo.setNome(nome);
			novo.setNumero(numero);
			System.out.println(novo.toString());
		}
		else if (cargo.equalsIgnoreCase("Deputado Federal")){
			Candidato novo = new DeputadoFederal();
			System.out.print("Digite o Número: ");
			int numero = teclado.nextInt();
			System.out.println("Digite o Nome: ");
			String nome = teclado.nextLine();
			novo.setNome(nome);
			novo.setNumero(numero);
			System.out.println(novo.toString());
		}
		else if (cargo.equalsIgnoreCase("Senador")){
			Candidato novo = new Senador();
			System.out.print("Digite o Número: ");
			int numero = teclado.nextInt();
			System.out.println("Digite o Nome: ");
			String nome = teclado.nextLine();
			novo.setNome(nome);
			novo.setNumero(numero);
			System.out.println(novo.toString());
		}
		else if (cargo.equalsIgnoreCase("Governador")){
			Candidato novo = new Governador();
			System.out.print("Digite o Número: ");
			int numero = teclado.nextInt();
			novo.setNome(cargo);
			novo.setNumero(numero);
			System.out.println(novo.toString());
		}
		else if (cargo.equalsIgnoreCase("Presidente")){
			Candidato novo = new Presidente();
			System.out.print("Digite o Número: ");
			int numero = teclado.nextInt();
			System.out.println("Digite o Nome: ");
			String nome = teclado.nextLine();
			novo.setNome(nome);
			novo.setNumero(numero);
			System.out.println(novo.toString());
		}
		teclado.close();
	}
}
