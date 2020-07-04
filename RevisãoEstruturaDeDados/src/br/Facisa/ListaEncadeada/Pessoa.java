package br.Facisa.ListaEncadeada;

public class Pessoa {
	private String nome;
	protected Pessoa proximo;
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.proximo = null;
	}
	public String getNome() {
		return nome;
	}
	public Pessoa getProximo() {
		return proximo;
	}
}
