package contador;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorDeDigitosTest {

	@Test
	public void test() {
		ContadorDeDigitos contador = new ContadorDeDigitos();
		contador.setValor(05);
		assertEquals(1, contador.getQtdDigitos());
	}

}
