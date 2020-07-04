package Questão9_10;

public class Ano {
	private int numero;
	
	public Ano(int numero){
		this.numero = numero;
	}
	public boolean getBissexto(){
		boolean bissexto = false;
		if (numero%4==0 && numero%100!=0){
			bissexto = true;
		}
		else if (numero%400==0){
			bissexto = true;
		}
		return bissexto;
	}

}
