package DequeEncadeado;

public class Node {
	
	private int inseridos;
	private NodePessoa inicio;
	
	public Node() {
		this.inicio = null;
	}
	
	public void inserirNoInicio(NodePessoa pessoa) {
		if(this.inicio == null) {
			this.inicio = pessoa;
		}
		else {
			pessoa.setProximo(inicio);
			this.inicio = pessoa;
		}
		inseridos++;
	}
	public void inserirNoFinal(NodePessoa pessoa) {
		NodePessoa aux = inicio;
		while(aux.getProximo() != null) {
			aux = aux.getProximo();
		}
		aux.setProximo(pessoa);
		inseridos++;
	}
}
