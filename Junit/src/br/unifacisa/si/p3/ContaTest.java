package br.unifacisa.si.p3;

import org.junit.Assert;
import org.junit.Test;

public class ContaTest {

	@Test
	public void testSacar() throws SaldoInsuficienteException {
		Conta novaConta = new Conta();
		double resultado = novaConta.Sacar(100);
		
		Assert.assertEquals(900, resultado, 0.0002);
	}
	
	@Test
	public void testDepositar() throws DepositoInvalidoException{
		Conta outraConta = new Conta();
		double resultado = outraConta.Depositar(0.0);
		Assert.assertEquals(1000.00, resultado, 0.0002);
	}

}
