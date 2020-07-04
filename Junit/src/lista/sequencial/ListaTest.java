package lista.sequencial;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaTest {

	@Test
	public void inserirLista() {
		Lista novaLista = new Lista();
		novaLista.inserirInicio("robin");
		novaLista.inserirInicio("felipe");
		assertEquals(2, novaLista.size());
		assertEquals(false, novaLista.isEmpty());
	}

}
