package contador;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorDeDigitosTest {

	@Test
	public void testQuantidadeDeDigitos() {
		ContadorDeDigitos novoContador = new ContadorDeDigitos();
		novoContador.setValor(2018);
		assertEquals(4, novoContador.getQtdDigitos());
		novoContador.setValor(10);
		assertEquals(2, novoContador.getQtdDigitos());
	}

}
