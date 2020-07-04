package Questão_4;

public class ParDeNumeros {
	private int valorUm;
	private int valorDois;
	
	public ParDeNumeros(int valorUm,int valorDois){
		this.valorUm = valorUm;
		this.valorDois = valorDois;
	}
	public int getMDC(){
		int divisor = 0;
		for (int i = 1;i!=valorUm && i!=valorDois;i++){
			if (valorUm%i==0 && valorDois%i==0){
				divisor = i;
			}
		}
		return divisor;
	}

}
