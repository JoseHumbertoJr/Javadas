package Questão_1;

public class Numero {
	private int valor;
	
	public void setValor(int valor){
		this.valor = valor;
	}
	public int getQtdDigitos(){
		int qtdDigitos = 0;
		while (valor >0){
			valor/=10;
			qtdDigitos++;
		}
		return qtdDigitos;
	}
}
