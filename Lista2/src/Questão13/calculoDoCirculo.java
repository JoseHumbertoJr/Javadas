package Questão13;

public class calculoDoCirculo {
	private int valor;
	private static final double PI = 3.1416;

	public void setValor(int valor){
		this.valor = valor;
	}
	public int getDiametroDoCirculo(){
		return valor * 2;
	}
	public double getAreaDoCirculo(){
		return (PI*(valor*valor));
	}
	public double getCircunferenciaDoCirculo(){
		return (valor*PI*2);
	}

}
