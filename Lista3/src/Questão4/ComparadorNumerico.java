package Questão4;

public class ComparadorNumerico {
	private int valorUm;
	private int valorDois;
	
	public ComparadorNumerico(int valorUm,int valorDois){
		this.valorUm = valorUm;
		this.valorDois = valorDois;
	}
	public int getMenor(){
		int MenorValor;
		if (valorUm<valorDois){
			MenorValor = valorUm;
		}
		else{
			MenorValor = valorDois;
		}
		return MenorValor;
	}

}
