package Questão_2;

public class Fatorial {
	private int valor;
	
	public void setValor(int valor){
		this.valor = valor;
	}
	public int getFatorial(){
		for (int i = valor-1;i>0;i-=1){
			valor = valor*i;
		}
		return valor;
	}
}
