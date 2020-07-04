package abastecimento;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnbastecimentoTest {

	@Test
	public void test() {
		Abastecimento novoAbastecimento = new Abastecimento();
		novoAbastecimento.setAlcool(3.07);
		novoAbastecimento.setGasolina(4.40);
		assertEquals("alcool", novoAbastecimento.getRecomendacao());
	}

}
