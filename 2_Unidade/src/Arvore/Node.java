package Arvore;

public class Node {
	
	private Node esquerda;
	private Node direita;
	private int valor;
	
	public Node (int valor) {
		this.valor = valor;
		this.esquerda = null;
		this.direita = null;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getValor() {
		return valor;
	}
	public void setEsquerda(Node esquerda) {
		this.esquerda = esquerda;
	}
	public Node getEsquerda() {
		return esquerda;
	}
	public void setDireita(Node direita) {
		this.direita = direita;
	}
	public Node getDireita() {
		return direita;
	}
}
