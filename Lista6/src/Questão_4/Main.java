package Questão_4;
import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu Salário Bruto: ");
		double salario = teclado.nextDouble();
		ContribuicaoPrevidenciaria novaConsulta = new ContribuicaoPrevidenciaria();
		novaConsulta.setSalarioBruto(salario);
		System.out.println(ContribuicaoPrevidenciaria.getValorDaContribuicao());
		System.out.print(ContribuicaoPrevidenciaria.getSalarioLiquido());
		teclado.close();
	}

}
