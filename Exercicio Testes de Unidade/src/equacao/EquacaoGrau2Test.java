package equacao;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EquacaoGrau2Test 
{
	private static final double TOLERANCIA = 0.001;
	
	@Test
	public void testDeltaNegativo() 
	{	EquacaoGrau2 equacao = new EquacaoGrau2Impl();
		equacao.setA(5);
		equacao.setB(2);
		equacao.setC(3);
		assertEquals(-56, equacao.getDelta(), TOLERANCIA);
		assertEquals(0, equacao.getQtdRaizes());
		assertEquals(Double.NaN, equacao.getRaiz1(), TOLERANCIA);
		assertEquals(Double.NaN, equacao.getRaiz2(), TOLERANCIA);
	}
	
	@Test
	public void testDeltaZero() 
	{	EquacaoGrau2 equacao = new EquacaoGrau2Impl();
		equacao.setA(4);
		equacao.setB(4);
		equacao.setC(1);
		assertEquals(0, equacao.getDelta(), TOLERANCIA);
		assertEquals(1, equacao.getQtdRaizes());
		assertEquals(-0.5, equacao.getRaiz1(), TOLERANCIA);
		assertEquals(equacao.getRaiz1(), equacao.getRaiz2(), TOLERANCIA);
	}

	@Test
	public void testDeltaPositivo() 
	{	EquacaoGrau2 equacao = new EquacaoGrau2Impl();
		equacao.setA(1);
		equacao.setB(5);
		equacao.setC(6);
		assertEquals(1, equacao.getDelta(), TOLERANCIA);
		assertEquals(2, equacao.getQtdRaizes());
		assertEquals(-2, equacao.getRaiz1(), TOLERANCIA);
		assertEquals(-3, equacao.getRaiz2(), TOLERANCIA);
	}
}
