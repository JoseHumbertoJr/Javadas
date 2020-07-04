package Questão_3;

public class ParDeNumeros {
	private int valorUm;
	private int valorDois;
	private int divisor = 2;
	private int contador;
	
	public ParDeNumeros(int valorUm,int valorDois,int divisor){
		this.valorUm = valorUm;
		this.valorDois = valorDois;
		this.divisor = divisor;
	}
	public int getMMC(){
		while (valorUm%divisor==0 && valorDois%divisor==0){
			divisor+=2;
			contador+=1;
		}
		return contador;
	}
}
