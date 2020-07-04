package Questão_3;

public class VetorDeNumero {
	private double[]numeros = new double[4];
	private int posicao = 0;
	
	public void add(double valor){
		this.numeros[posicao] = valor;
		posicao++;
	}
	public double getMenor(){
		double menor = numeros[0];
		for (int i = 1;i < numeros.length;i++){
			if( numeros[i] < menor ){
				 menor = numeros[i];
			}
		}
		return menor;
	}
}
