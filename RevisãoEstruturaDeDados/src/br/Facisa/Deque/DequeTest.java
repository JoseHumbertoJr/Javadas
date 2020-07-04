package br.Facisa.Deque;

import org.junit.Test;

public class DequeTest {

	@Test
	public void testDeque() {
		Deque novoDeque = new Deque();
		novoDeque.inserirNoFinal("Z�");
		novoDeque.inserirPrimeiro("Nilda");
		novoDeque.inserirNoFinal("buxada");
		novoDeque.removerPorPosicao(3);
		novoDeque.removerPorElemento("Z�");
		System.out.println(novoDeque.size());
		System.out.println(novoDeque.toString());
	}

}
