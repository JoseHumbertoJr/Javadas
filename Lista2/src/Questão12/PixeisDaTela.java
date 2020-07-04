package Questão12;

public class PixeisDaTela {
	private int primeiroValor;
	private int segundoValor;
	private int terceiroValor;
	private int quartoValor;
	
	public void setPrimeiroValor(int primeiroValor){
		this.primeiroValor = primeiroValor;
	}
	public void setSegundoValor(int segundoValor){
		this.segundoValor = segundoValor;
	}
	public void setTerceiroValor(int terceiroValor){
		this.terceiroValor = terceiroValor;
	}
	public void setQuartoValor(int quartoValor){
		this.quartoValor = quartoValor;
	}
	public int getQuantidadeDePixels(){
		return (quartoValor-segundoValor)*(terceiroValor-primeiroValor);
	}
	

}
