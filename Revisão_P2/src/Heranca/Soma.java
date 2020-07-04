package Heranca;

public class Soma extends OperacaoMatematica {
	
	public Soma(double valorUm, double valorDois) {
		super(valorUm, valorDois);
	}
	protected String getSimboloDaOperacao(){
		return "+";
	}

	protected double getOperacao(){
		return getValorUm()+getValorDois();
	}
}
