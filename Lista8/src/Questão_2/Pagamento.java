package Questão_2;

public abstract class Pagamento {
	private double subTotal;
	private double desconto;
	
	public void setSubtotal(double subTotal){
		this.subTotal = subTotal;
	}
	public double getSubTotal(){
		return subTotal;
	}
	public void setDesconto(double desconto){
		this.desconto = desconto;
	}
	public double getDesconto(){
		return desconto;
	}
}
