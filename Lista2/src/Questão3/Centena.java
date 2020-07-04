package Questão3;

public class Centena {
	private int numero;
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getCentena(){
		return numero%1000/100;
	}

}
