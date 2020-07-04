package Questão3;

public class ComparadorNumerico {
	private int valorUm;
	private int valorDois;
	
	public ComparadorNumerico(int valorUm,int valorDois){
		this.valorUm = valorUm;
		this.valorDois = valorDois;
	}
	public int getMaior(){
		int maior;
		if (valorUm>valorDois){
			maior = valorUm;
		}
		else{
			maior = valorDois;
		}
		return maior;
	}
}
