package Arvore;


public class NodeBinario {
	
	private Node raiz;
	private int numeroDeDireita;
	private int numeroDeEsquerda;
	private int numeroDeFolha;
	
	public Node getRaiz() {
		return raiz;
	}
	public void inserir(int valor) {
		raiz = inserir(raiz,valor);
	}
	public Node inserir(Node no, int valor) {
		if(no != null) {
			if(valor <= no.getValor()) {
				if(no.getEsquerda() != null) {
					inserir(no.getEsquerda(),valor);
				}
				else {
					no.setEsquerda(new Node(valor));
				}
			}
			else if(valor > no.getValor()) {
				if(no.getDireita() != null) {
					inserir(no.getDireita(),valor);
				}
				else {
					no.setDireita(new Node(valor));
				}
			}
		}
		else {
			no = new Node(valor);
		}
		return no;
	}
	public Node encontraMinimo(Node no) {
		if(no != null) {
			while(no.getEsquerda() != null) {
				no = no.getEsquerda();
			}
		}
		return no;
	}
	public void removerMinimo(Node no) {
		if(no != null) {
			while(no.getEsquerda().getEsquerda() != null) {
				no = no.getEsquerda();
			}
			no.setEsquerda(null);
		}
	}
	public void preOrdem(Node no) {
		if(no != null) {
			System.out.println(no.getValor());
			preOrdem(no.getEsquerda());
			preOrdem(no.getDireita());
		}
	}
	public int getNumeroDeNos(Node no) {
		int numero = numeroEsquerdo(no.getEsquerda())+numeroDireito(no.getDireita());
		return numero+1;
	}
	public int numeroEsquerdo(Node no) {
		if(no != null) {
			if(no.getEsquerda() != null) {
				numeroDeEsquerda++;
			}
			numeroEsquerdo(no.getEsquerda());
		}
		return numeroDeEsquerda;
	}
	public int numeroDireito(Node no) {
		if(no != null) {
			if(no.getDireita() != null) {
				numeroDeDireita++;
			}
			numeroDireito(no.getDireita());
		}
		return numeroDeDireita;
	}
	public int getNumeroDeFolha(Node no) {
		int numero = getFolhasDireitas(no.getDireita()) + getFolhasEsquerdas(no.getDireita());
		return numero;
	}
	public int getFolhasEsquerdas(Node no) {
		if(no != null) {
			if(no.getDireita() == null && no.getEsquerda() == null) {
				numeroDeFolha++;
				System.out.println(no.getValor()+"Folha");
			}
			getFolhasEsquerdas(no.getEsquerda());
		}
		return numeroDeFolha;
	}
	public int getFolhasDireitas(Node no) {
		if(no != null) {
			if(no.getDireita() == null && no.getEsquerda() == null) {
				numeroDeFolha++;
				System.out.println(no.getValor()+"folha");
			}
			getFolhasDireitas(no.getDireita());
		}
		return numeroDeFolha;
	}
}
