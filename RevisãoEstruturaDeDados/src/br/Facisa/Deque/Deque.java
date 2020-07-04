package br.Facisa.Deque;

public class Deque {
	private int posicao;
	public static final int TAMANHO = 3;
	private Object [] arrayInterno = new Object[TAMANHO];
	
	public void inserirPrimeiro(Object elemento) {
		if(posicao == arrayInterno.length) {
			Object [] novoArray = new Object[arrayInterno.length * 2];
			for(int i = 0; i < posicao;i++) {
				novoArray[i] = arrayInterno[i];
			}
			this.arrayInterno = novoArray;
		}
		for(int i = 0; i < posicao;i++) {
			arrayInterno[i+1] = arrayInterno[i];
		}
		arrayInterno[0] = elemento;
		posicao++;
	}
	public void inserirNoFinal(Object elemento) {
		if(posicao == arrayInterno.length) {
			Object [] novoArray = new Object[arrayInterno.length * 2];
			for(int i = 0; i < posicao;i++) {
				novoArray[i] = arrayInterno[i];
			}
			this.arrayInterno = novoArray;
		}
		arrayInterno[posicao] = elemento;
		posicao++;
	}
	public void removerPrimeiro() {
		if(posicao == arrayInterno.length) {
			Object [] novoArray = new Object[arrayInterno.length * 2];
			for(int i = 0; i < posicao;i++) {
				novoArray[i] = arrayInterno[i+1];
			}
			this.arrayInterno = novoArray;
			posicao--;
		}
		for(int i = 0; i < posicao;i++) {
			arrayInterno[i] = arrayInterno[i+1];
		}
		posicao--;
	}
	public void removerUltimo() throws NullPointerException{
		if(posicao == 0) {
			throw new NullPointerException();
		}
		this.arrayInterno[posicao-1] = null;
		posicao--;
	}  
	public void removerPorElemento(Object elemento) {
		for(int i = 0; i < posicao;i++) {
			if(arrayInterno[i] == elemento) {
				for(int j = i; i < posicao-1;i++) {
					arrayInterno[i] = arrayInterno[j+1];
				}
			}
		}
		arrayInterno[posicao] = null;
		posicao--;
	}
	public void removerPorPosicao(int indice) throws NullPointerException {
		if(posicao == 0) {
			throw new NullPointerException();
		}
		for(int i = indice; i < posicao;i++) {
			arrayInterno[indice] = arrayInterno[indice+1];
		}
		posicao--;
	}
	public String toString() {
		String elementos = "";
		for(int i = 0; i < posicao;i++) {
			elementos+=arrayInterno[i]+" ";
		}
		return elementos;
	}
	public boolean isEmpty() {
		return posicao == 0;
	}
	public int size() {
		return posicao;
	}
}
