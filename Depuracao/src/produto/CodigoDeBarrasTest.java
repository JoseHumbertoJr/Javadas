package produto;

import static org.junit.Assert.*;

import org.junit.Test;

import produto.excecoes.CodigoDeBarrasInvalido;

public class CodigoDeBarrasTest {

	@Test
	public void testGetPais() throws CodigoDeBarrasInvalido {
		CodigoDeBarrasImpl codigo = new CodigoDeBarrasImpl();
		codigo.setNumero(1183991030162L);
		assertEquals(11,codigo.getPais());
	}

	@Test
	public void testGetNumero() throws CodigoDeBarrasInvalido {
		CodigoDeBarrasImpl codigo = new CodigoDeBarrasImpl();
		codigo.setNumero(1183991030162L);
		assertEquals(1183991030162L,codigo.getNumero());
	}
	
	@Test
	public void testGetVerificador() throws CodigoDeBarrasInvalido {
		CodigoDeBarrasImpl codigo = new CodigoDeBarrasImpl();
		codigo.setNumero(1183991030162L);
		assertEquals(2,codigo.getVerificador());
	}
}
