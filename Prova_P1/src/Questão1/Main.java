package Questão1;

public class Main {
	public static void main(String[] args) {
		Pilha novaPilha = new Pilha(6);
		novaPilha.inserir("zé");
		novaPilha.inserir("nilda");
		novaPilha.inserir("jh");
		novaPilha.inserir("nino");
		novaPilha.inserir("julia");
		novaPilha.inserir("robim");
		novaPilha.imprimeArray();
	}
}
