package Questão5;

public class ComparadorNumerico {
	private int valorUm;
	private int valorDois;
	private int valorTres;
	
	public ComparadorNumerico(int valorUm,int valorDois,int valorTres){
		this.valorUm = valorUm;
		this.valorDois = valorDois;
		this.valorTres = valorTres;
	}
	public int getMaior(){
		int maiorValor;
		if (valorUm>valorDois && valorUm>valorTres){
			maiorValor = valorUm;
		}
		else if (valorDois>valorUm && valorDois>valorTres){
			maiorValor = valorDois;
		}
		else{
			maiorValor = valorTres;
		}
		return maiorValor;
	}

}
