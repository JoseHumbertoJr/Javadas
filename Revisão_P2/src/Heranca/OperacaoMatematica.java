package Heranca;

public abstract class OperacaoMatematica {
	private double valorUm;
	private double valorDois;
	
	public OperacaoMatematica(double valorUm,double valorDois){
		this.valorUm = valorUm;
		this.valorDois = valorDois;
	}
	
	protected double getValorUm(){
		return valorUm;
	}
	protected double getValorDois(){
		return valorDois;
	}
	
	protected abstract double getOperacao();
	protected abstract String getSimboloDaOperacao();
	public String toString(){
		return getSimboloDaOperacao()+" "+getValorUm()+" "+getValorDois()+" fornece "+getOperacao();
	}
}
