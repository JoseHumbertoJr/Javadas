package Questão4;

public class Arredondador {
	private double numero;
	
	public void setNumero(double numero){
		this.numero = numero;
	}
	public int getArredondador(){
		return (int)(numero*2)-(int)numero;
		
	}

}
