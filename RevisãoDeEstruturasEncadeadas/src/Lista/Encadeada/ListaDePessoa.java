package Lista.Encadeada;

public class ListaDePessoa {
	private String nome;
	private ListaDePessoa proximo;
	
	public ListaDePessoa(String nome) {
		this.nome = nome;
		this.proximo = null;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setProximo(ListaDePessoa proximo) {
		this.proximo = proximo;
	}
	public ListaDePessoa getProximo() {
		return proximo;
	}
	
}
