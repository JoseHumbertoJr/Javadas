package Questão6;

public class ComparadorNumerico {
	private int valorUm;
	private int valorDois;
	private int valorTres;
	
	public ComparadorNumerico(int valorUm,int valorDois,int valorTres){
		this.valorUm = valorUm;
		this.valorDois = valorDois;
		this.valorTres = valorTres;
	}
	public int getMenor(){
		int menor;
		if (valorUm<valorDois && valorUm<valorTres){
			menor = valorUm;
		}
		else if (valorDois<valorUm && valorDois<valorTres){
			menor = valorDois;
		}
		else{
			menor = valorTres;
		}
		return menor;
	}

}
