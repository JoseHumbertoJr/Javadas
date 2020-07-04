package equacao;

public class EquacaoGrau2Impl implements EquacaoGrau2
{

	private double a;
	private double b;
	private double c;

	@Override
	public void setA(double a) 
	{	this.a  = a;		
	}

	@Override
	public void setB(double b) 
	{	this.b  = b;	
	}

	@Override
	public void setC(double c) 
	{	this.c  = c;	
	}

	@Override
	public double getDelta() 
	{	return Math.pow(b, 2) - 4  * a * c;
	}

	@Override
	public int getQtdRaizes() 
	{	int qtdRaizes;
		double delta = getDelta();
		if (delta < 0) 
		{	qtdRaizes = 0;
		} else if (delta == 0)
		{	qtdRaizes = 1;
		} else 
		{	qtdRaizes = 2;
		}
		return qtdRaizes;
	}

	@Override
	public double getRaiz1() 
	{	return (-b + Math.sqrt(getDelta())) / (2 * a);
	}

	@Override
	public double getRaiz2() 
	{	return  (-b - Math.sqrt(getDelta())) / (2 * a);
	}

}
