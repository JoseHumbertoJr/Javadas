package ano;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiasDoMesTest {

	@Test
	public void anoBissextoTest() {
		Ano novoAno = new Ano();
		novoAno.setNumero(2028);
		novoAno.isBissexto();
		assertEquals(true, novoAno.isBissexto());
	}

	@Test
	public void anoNaoBissextoTest() {
		Ano novoAno = new Ano();
		novoAno.setNumero(2018);
		novoAno.isBissexto();
		assertEquals(false, novoAno.isBissexto());
	}
	
	@Test
	public void mesComTrintaEUmDiasTest() {
		Ano novoAno = new Ano();
		assertEquals(31, novoAno.getQtdDias(1));
	}
	
	@Test
	public void mesComVinteEOitoDiasTest() {
		Ano novoAno = new Ano();
		novoAno.setNumero(2020);
		assertEquals(28, novoAno.getQtdDias(2));
	}
	
	
	@Test
	public void mesComVinteENoveDiasTest() {
		Ano novoAno = new Ano();
		novoAno.setNumero(2018);
		assertEquals(29, novoAno.getQtdDias(2));
	}

}
