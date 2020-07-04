package br.Facisa.Lista;

public class Lista {
	private int posicao;
	public static final int TAMANHO = 3;
	private Object [] arrayInterno = new Object[TAMANHO];
	
	public void inserir(Object elemento) {
		if(posicao == arrayInterno.length) {
			Object [] novoArray = new Object[arrayInterno.length * 2];
			for(int i = 0;i < posicao;i++) {
				novoArray[i] = arrayInterno[i];
			}
			this.arrayInterno = novoArray;
		}
		arrayInterno[posicao] = elemento;
		posicao++;
	}
	public void removerPorPosicao(int index) throws NullPointerException{
		if(posicao == 0) {
			throw new NullPointerException();
		}
		for(int i = index; i < posicao; i++) {	
			arrayInterno[i] = arrayInterno[i+1];
		}
		arrayInterno[posicao-1] = null;
		posicao--;
	}
	public void removerPorValor(Object elemento) {
		for(int i = 0; i < posicao; i++) {
			if(arrayInterno[i].equals(elemento)) {
				arrayInterno[i] = null;
				for(int j = i; i < posicao; i++) {
					arrayInterno[j] = arrayInterno[j+1];
				}
			}
		}
		arrayInterno[posicao - 1] = null;
		posicao--;
	}
	public int getTamanho() {
		return posicao;
	}
	public boolean isEmpty() {
		return posicao == 0;
	}
	public Object getIndex(int index) {
		return arrayInterno[index];
	}
}
