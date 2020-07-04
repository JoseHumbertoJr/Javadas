package abastecimento;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbastecimentoTest {
	
	@Test
	public void gasolinaTest() {
		Abastecimento abastecimento = new Abastecimento();
		abastecimento.setGasolina(4.0);
		abastecimento.setAlcool(2.70);
		assertEquals("alcool", abastecimento.getRecomendacao());
	}

}
