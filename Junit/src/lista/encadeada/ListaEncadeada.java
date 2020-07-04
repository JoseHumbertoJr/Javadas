package lista.encadeada;

public class ListaEncadeada {
	private int inseridos;
	private ListaDePessoa inicio;
	
	public ListaEncadeada() {
		this.inicio = null;
	}
	public void inserir(String elemento) {
		if(this.inicio == null) {
			this.inicio = new ListaDePessoa(elemento);
			inseridos++;
		}
		ListaDePessoa aux = new ListaDePessoa(elemento);
		aux.setProximo(inicio);
		this.inicio = aux;
		inseridos++;
	}
	public void inserirFinal(String elemento) {
		if(inseridos == 0) {
			this.inicio = new ListaDePessoa(elemento);
		}
		ListaDePessoa aux = inicio;
		while(aux.getProximo() !=null) {
			aux = aux.getProximo();
		}
		aux.setProximo(new ListaDePessoa(elemento));
		inseridos++;
	}
	public String getFirst() {
		return inicio.getNome();
	}
	public String getLast() {
		ListaDePessoa aux = inicio;
		while(aux.getProximo() != null) {
			aux = aux.getProximo();
		}
		return aux.getNome();
	}
}
