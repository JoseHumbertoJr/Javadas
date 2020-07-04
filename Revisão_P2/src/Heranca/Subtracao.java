package Heranca;

public class Subtracao extends OperacaoMatematica {
	
	public Subtracao(double valorUm,double valorDois){
		super(valorUm,valorDois);
	}
	
	
	protected double getOperacao(){
		return getValorUm()-getValorDois();
	}
	protected String getSimboloDaOperacao(){
		return "-";
	}
}
