package Arvore;

public class Main {
	public static void main(String [] args) {
		
		NodeBinario node = new NodeBinario();
		node.inserir(1);
		node.inserir(2);
		node.inserir(0);
		node.inserir(0);
		node.inserir(3);
		node.inserir(2);
		node.inserir(4);
		//System.out.println(node.getNumeroDeNos(node.getRaiz()));
		System.out.println(node.getNumeroDeFolha(node.getRaiz()));
	}
}
