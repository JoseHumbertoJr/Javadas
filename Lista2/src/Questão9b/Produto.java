package Questão9b;

public class Produto{
	private double valor;
	private double desconto;
	
	public void setDesconto(double desconto)
	{
		this.desconto = desconto;
	}
	public void setValor(double valor)
	{
		this.valor = valor;
	}
	public double getDescontado(){
		double descontou = valor-(valor*(desconto/100));
		return descontou;
	}

}
