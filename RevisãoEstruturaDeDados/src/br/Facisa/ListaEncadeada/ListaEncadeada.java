package br.Facisa.ListaEncadeada;

public class ListaEncadeada {
	private int inseridos;
	private Pessoa inicio;
	
	public ListaEncadeada() {
		this.inicio = null;
	}
	
	public void inserirPrimeiro(String nome) {
		if(inicio == null || inseridos == 0) {
			this.inicio = new Pessoa(nome);
			inseridos++;
		}
		Pessoa novaPessoa = this.inicio;
		this.inicio = new Pessoa(nome);
		this.inicio.proximo = novaPessoa;
		inseridos++;
	}
	public void inserirNoFinal(String nome) {
		Pessoa novaPessoa = this.inicio;
		while(novaPessoa.proximo != null) {
			novaPessoa = novaPessoa.proximo;
		}
		novaPessoa.proximo = new Pessoa(nome);
		inseridos++;
	}
	public void removerInicio() {
		if(this.inicio != null) {
			this.inicio = this.inicio.proximo;
			inseridos--;
		}
	}
	public void removerFinal() {
		Pessoa aux = this.inicio;
		for(int i = 0;i < inseridos-2;i++) {
			aux = aux.proximo;
		}
		aux.proximo = null;
		inseridos--;
	}
}
