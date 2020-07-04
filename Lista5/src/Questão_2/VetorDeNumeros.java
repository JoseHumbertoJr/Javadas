package Questão_2;

public class VetorDeNumeros {
	private double[] numeros = new double[4];
	private int posicao = 0;
	
	public void add(double valor){
		this.numeros[posicao] = valor;
		posicao++;
	}
	public double getMaior(){
		double maior = 0;
		for (int i = 0;i<numeros.length;i++){
			if (numeros [i]  >maior){
				maior = numeros[i];
			}
		}
		return maior;
	}
}
