package Quest�o1;
import java.util.Scanner;

public class Main {
	public static void main(String []args){
		System.out.print("Digite seu n�mero-> ");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		Unidade novaUnidade = new Unidade();
		novaUnidade.setN(n);
		System.out.println(novaUnidade.getUnidade());
		teclado.close();
	}

}
