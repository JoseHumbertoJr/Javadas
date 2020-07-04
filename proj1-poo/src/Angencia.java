
public class Angencia {

	public static void main(String[] args) {
		Conta [] novaConta = new Conta[10];
		Conta usuario = new Conta(2,"paulete",200, 213);
		novaConta[0] = usuario;
		System.out.println(novaConta[0].getNomeDaConta());
	}

}
