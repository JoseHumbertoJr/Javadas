package Arvore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeBinarioTest {

	@Test
	void testInserir() {
		NodeBinario node = new NodeBinario();
		node.inserir(1);
		assertEquals(1, node.getRaiz().getValor());
	}
	
	@Test
	void testRemoverMinimo() {
		NodeBinario node = new NodeBinario();
		node.inserir(2);
		node.inserir(1);
		node.inserir(0);
		node.removerMinimo(node.getRaiz());
		
	}
}
