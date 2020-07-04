package br.unifacisa.si.p3;

public class Conta {
	
	private double SALDO = 1000.00;
	private final double VALOR_LIMITE = 0.0;
	
	public double Sacar(double valor) throws SaldoInsuficienteException {
		if(valor > SALDO) {
			throw new SaldoInsuficienteException ();
		}
		else{
			SALDO = SALDO-valor;
		}
		return SALDO;
	}
	
	public double Depositar(double valor) throws DepositoInvalidoException{
		if(valor <= VALOR_LIMITE) {
			throw new DepositoInvalidoException();
		}
		else {
			SALDO = SALDO + valor;
		}
		return SALDO;
	}
}
