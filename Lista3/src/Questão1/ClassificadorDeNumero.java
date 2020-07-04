package Questão1;

public class ClassificadorDeNumero {
	private int Numero;
	
	public ClassificadorDeNumero(int Numero){
		this.Numero = Numero;
	}
	public boolean isPar(){
		return this.Numero%2==0;
	}
	public boolean isImpar(){
		return !isPar();
	}
}
