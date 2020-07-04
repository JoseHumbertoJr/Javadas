package DequeEncadeado;

public class NodePessoa {
	
	private String nome;
	private NodePessoa proximo;
	
	public NodePessoa(String nome) {
		this.nome = nome;
		this.proximo = null;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setProximo(NodePessoa proximo) {
		this.proximo = proximo;
	}
	public NodePessoa getProximo() {
		return proximo;
	}
}
