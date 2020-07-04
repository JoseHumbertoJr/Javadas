package Questão_7;

public class Somatório {
	private int valorInicial;
	private int valorFinal;
	
	public Somatório(int valorInicial,int valorFinal){
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
	}
	public int getSomaDoIntervalo(){
		int soma = 0;
		for (int i = valorInicial;i<=valorFinal;i++){
			soma+=i;
		}
		return soma;
	}
}
