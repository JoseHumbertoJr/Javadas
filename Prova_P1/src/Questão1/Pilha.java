package Questão1;

public class Pilha {
	
	private Object[] arrayInterno;
	private int impar = 1;
	private int par = 0;
	
	public Pilha(int tamanho) {
		arrayInterno = new Object[tamanho];
	}
	public void inserir(Object elemento) {
		if(impar < arrayInterno.length && arrayInterno[impar] == null) {
			arrayInterno[impar] = elemento;
			impar+=2;
		}
		else if(impar >= arrayInterno.length && par < arrayInterno.length && arrayInterno[par] == null) {
			arrayInterno[par] = elemento;
			par+=2;
		}
	}
	public void imprimeArray() {
		for(int i = 0; i < arrayInterno.length;i++) {
			System.out.print(arrayInterno[i]+" ");
		}
	}
}
