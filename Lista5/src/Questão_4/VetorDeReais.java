package Questão_4;

public class VetorDeReais {
	private double[] numero = new double[4];
	private int posicao = 0;
	
	public void addNumero(double valor){
		this.numero[posicao] = valor;
		posicao++;
	}
	public double getMedia(){
		int contador = 0;
		double numeros = 0.0;
		for (int i = 0;i < numero.length;i++){
			numeros+=numero[i];
			contador++;
		}
		return numeros/contador;
	}

}
