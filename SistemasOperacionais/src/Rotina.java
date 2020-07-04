
public class Rotina {
	
	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		banheiro.entrar("Masculino");
		banheiro.entrar("MAsculino");
		banheiro.sair("Masculino");
		System.out.println(banheiro.qtdHomem);
	}

}
