package br.Facisa.Lista;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaTest {

	@Test
	public void inserirElemento() {
		Lista novaLista = new Lista();
		novaLista.inserir("rosinha");
		novaLista.inserir("nidinha");
		novaLista.removerPorPosicao(0);
		assertEquals(null, novaLista.getIndex(1));
		assertEquals("nidinha", novaLista.getIndex(0));
	}

}
