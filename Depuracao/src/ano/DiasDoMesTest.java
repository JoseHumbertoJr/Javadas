package ano;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiasDoMesTest {

	@Test
	public void DiasComTrintaEUmtest() {
		Ano novoAno = new Ano();
		novoAno.setNumero(2016);
		assertEquals(31,novoAno.getQtdDias(1));
		
	}
	@Test
	public void DiasNoAnoBissextotest() {
		Ano novoAno = new Ano();
		novoAno.setNumero(2016);
		assertEquals(28,novoAno.getQtdDias(2));
		
	}
	@Test
	public void DiasComVinteENovetest() {
		Ano novoAno = new Ano();
		novoAno.setNumero(2017);
		assertEquals(29,novoAno.getQtdDias(2));
		
	}

}
