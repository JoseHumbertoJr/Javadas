package br.Unifacisa.Fila;

public class Fila {
	private int posicao;
	public static final int TAMANHO = 3; 
	private String [] arrayInterno = new String[TAMANHO];
	
	public void enfileirar(String elemento) {
		if(posicao == arrayInterno.length) {
			String [] novoArray = new String[arrayInterno.length * 2];
			for(int i = 0; i < posicao-1;i++) {
				novoArray[i] = arrayInterno[i];
			}
			this.arrayInterno = novoArray;
		}
		arrayInterno[posicao] = elemento;
		posicao++;
	}
	public String desenfileirar() throws NullPointerException {
		if(posicao == 0) {
			System.out.println("zerou");
			throw new NullPointerException();
		}
		arrayInterno[posicao-1] = null;
		posicao--;
		return arrayInterno[0];
	}
	public String primeiro() {
		return arrayInterno[0];
	}
	public int tamanho() {
		return posicao;
	}
	public boolean isVazia() {
		return posicao==0;
	}
}
