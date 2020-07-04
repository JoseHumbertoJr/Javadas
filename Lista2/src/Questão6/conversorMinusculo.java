package Questão6;

public class conversorMinusculo {
	private char letra;
	
	public void setLetra(char letra){
		this.letra = letra;
	}
	public char getMinusculo(){
		return (char)(letra+32);
	}

}
