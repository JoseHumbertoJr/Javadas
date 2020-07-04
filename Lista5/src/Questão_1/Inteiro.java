package Questão_1;

public class Inteiro {
	private int valor;
	
	public void setValor(int valor){
		this.valor = valor;
	}
	public int getQtdDivisores(){
		int qtdDivisores = 0;
		for (int i = 1;i <= valor;i++){
			if (valor % i == 0){
				qtdDivisores++;
			}
		}
		return qtdDivisores;
	}
	public int[] getDivisores(){
		int [] divisores = new int[getQtdDivisores()];
		int posicao = 0;
		for (int i = 1;i <= valor;i++){
			if (valor % i == 0){
				divisores[posicao] = i;
				posicao++;
			}
		}
		return divisores;
	}
}