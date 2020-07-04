package br.Unifacisa.p3;

public class Fila {
	private Object [] array = new Object[4];
	private int posicao = 0;
	
	public void inserirNoInicio(Object objeto) {
		for(int i = 0;i < posicao;i++) {
			array[i+1] = array[i];
		}
		array[0] = objeto;
		posicao++;
	}
	public void inserirNoFinal(Object objeto) {
		array[posicao] = objeto;
		posicao++;
	}
	public void removerNoInicio(Object objeto) {
		for(int i = 0;i < posicao;i++) {
			array[i] = array[i+1];
		}
	}
	public void removerNoFinal(Object objeto) {
		array[posicao-1] = null;
		posicao--;
	}
	public Object fist() {
		return array[0];
	}
	public Object last() {
		return array[posicao-1];
	}
	public Object size() {
		return array[posicao];
	}
	public String toString() {
		String fila = null;
		for(int i = 0;i < array.length;i++) {
			fila+=array[i];
		}
		return fila;
	}
}
