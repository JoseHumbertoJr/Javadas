package Quest�o_7;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os nomes dos Procurados: ");
		ListaDeProcurados novaLista = new ListaDeProcurados();
		for (int i = 0;i <= 1;i++){
			String nome = teclado.nextLine();
			novaLista.addProcurado(nome);
		}
		System.out.println("Procurar se est� na lista");
		String nome = teclado.nextLine();
		novaLista.setNome(nome);
		System.out.println("Est� : "+novaLista.getEstaNaLista());
		teclado.close();
	}
}
		
