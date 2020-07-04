package Questão_1;

public class Telefone {
	private long numero;
	
	public void setNumero(long numero){
		this.numero = numero;
	}
	public long getNumero(){
		return numero;
	}
	public String toString(){
		String formato = ((this.numero/10000)%10000)+"-"+this.numero%10000;
		return formato;
	}
}
