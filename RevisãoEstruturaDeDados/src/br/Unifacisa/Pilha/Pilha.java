package br.Unifacisa.Pilha;

public class Pilha {
	
	public static final int CAPACIDADE = 3;
	private Object[] arrayInterno = new Object[CAPACIDADE];
	private int tamanho;
	
	public void empilharPush(Object elemento) {
		if(tamanho == 0) {
			arrayInterno[0] = elemento;
			tamanho++;
		}
		if(this.tamanho == this.arrayInterno.length) {
			Object [] novoArray = new Object[arrayInterno.length*2];
			for(int i = 0;i < tamanho;i++) {
				novoArray[i] = arrayInterno[i];
			}
			this.arrayInterno = novoArray;
		}
		this.arrayInterno[tamanho] = elemento;
		tamanho++;
	}
	public void desempiharPop() {
		if(this.tamanho > 0) {
			arrayInterno[tamanho-1] = null;
			tamanho--;
		}
	}
	public String imprimePilha() {
		String pilha = "";
		for(int i = 0;i < tamanho;i++) {
			pilha+=arrayInterno[i]+" ";
		}
		return pilha;
	}
	public boolean estadoDaPilha() {
		return tamanho == 0;
	}
	public String topo() {
		if(estadoDaPilha() == true) {
			return null;
		}
		return (String) arrayInterno[tamanho-1];
	}
	public int tamanho() {
		return tamanho;
	}
}
