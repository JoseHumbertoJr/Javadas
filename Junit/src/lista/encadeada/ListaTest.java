package lista.encadeada;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaTest {

	@Test
	public void inseriNoInicioTest() {
		ListaEncadeada novaLista = new ListaEncadeada();
		novaLista.inserir("robim");
		novaLista.inserir("paulo raivozo");
		novaLista.inserirFinal("sitio esperanca");
		assertEquals("paulo raivozo", novaLista.getFirst());
		assertEquals("sitio esperanca", novaLista.getLast());
	}

}
