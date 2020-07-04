package Questão7;

public class conversorFahrenheit {
	private double numero;
	private double x = 1.8;
	private double y = 32.0;
	
	public double getY(){
		return y;
	}
	public double getX(){
		return x;
	}
	public void setNumero(double numero){
		this.numero = numero;
	}
	public double getFahrenheit(){
		return (numero*x)+y;
	}

}
