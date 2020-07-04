package Questão9_13;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite as medias do aluno:");
		double valorUm = teclado.nextDouble();
		double valorDois = teclado.nextDouble();
		double valorTres = teclado.nextDouble();
		System.out.println("Percentual em faltas: ");
		double valorQuatro = teclado.nextDouble();
		AvaliaçãoDoAluno aluno = new AvaliaçãoDoAluno(valorUm,valorDois, valorTres,valorQuatro );
		System.out.println(aluno.getAproveitamento()+" "+aluno.getSituaçâo());
		teclado.close();
	}

}
