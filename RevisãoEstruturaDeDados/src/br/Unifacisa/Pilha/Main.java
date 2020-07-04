package br.Unifacisa.Pilha;

public class Main {
	public static void main(String[] args) {
		Pilha novaPilha = new Pilha();
		novaPilha.empilharPush("zé");
		novaPilha.empilharPush("Nilda");
		novaPilha.empilharPush("julia");
		novaPilha.empilharPush("jh");
		System.out.println(novaPilha.imprimePilha());
		System.out.print("vazia?: ");
		System.out.println(novaPilha.estadoDaPilha());
		System.out.println(novaPilha.topo());
		
	}
}
