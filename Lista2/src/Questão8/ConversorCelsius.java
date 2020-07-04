package Questão8;

public class ConversorCelsius {
	private double numero;
	
	public void setNumero(double numero){
		this.numero = numero;
	}
	public double getCelsius(){
		return (double)((numero-32)/1.8);
	}

}
