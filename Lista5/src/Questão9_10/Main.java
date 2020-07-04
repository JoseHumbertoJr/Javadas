package Questão9_10;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		CampeonatoDeFutebol novoCampeonato = new CampeonatoDeFutebol();
		System.out.println("Digite 3 times: ");
		String timeUm = teclado.nextLine();
		novoCampeonato.addTime(timeUm);
		String timeDois = teclado.nextLine();
		novoCampeonato.addTime(timeDois);
		String timeTres = teclado.nextLine();
		novoCampeonato.addTime(timeTres);
		for (int i = 0;i < novoCampeonato.getJogos().length;i++){
			System.out.println(novoCampeonato.getJogos()[i]);
		}
		teclado.close();
	}
}
