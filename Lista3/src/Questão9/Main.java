package Quest�o9;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o m�s: ");
		String nomeMes = teclado.nextLine();
		Mes numeroDoMes = new Mes(nomeMes);
		System.out.println(numeroDoMes.getNumeroDoMes());
		teclado.close();
	}

}
