package equacao;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquacaoTest {

	@Test
	public void testQuantidadeDeRaizesZero() {
		EquacaoGrau2Impl novaEquacao = new EquacaoGrau2Impl();
		novaEquacao.setA(4);
		novaEquacao.setB(5);
		novaEquacao.setC(6);
		assertEquals(0, novaEquacao.getQtdRaizes());
		novaEquacao.setA(25);
		novaEquacao.setB(5);
		novaEquacao.setC(4);
		assertEquals(0, novaEquacao.getQtdRaizes());
	}

	@Test
	public void testQuantidadeDeRaizesUm() {
		EquacaoGrau2Impl novaEquacao = new EquacaoGrau2Impl();
		novaEquacao.setA(0);
		novaEquacao.setB(0);
		novaEquacao.setC(0);
		assertEquals(1, novaEquacao.getQtdRaizes());
		novaEquacao.setA(2);
		novaEquacao.setB(4);
		novaEquacao.setC(2);
		assertEquals(1, novaEquacao.getQtdRaizes());
		
	}
	
	@Test
	public void testQuantidadeDeRaizesDois() {
		EquacaoGrau2Impl novaEquacao = new EquacaoGrau2Impl();
		novaEquacao.setA(4);
		novaEquacao.setB(25);
		novaEquacao.setC(6);
		assertEquals(2, novaEquacao.getQtdRaizes());
		novaEquacao.setA(25);
		novaEquacao.setB(25);
		novaEquacao.setC(6);
		assertEquals(2, novaEquacao.getQtdRaizes());
	}
}
