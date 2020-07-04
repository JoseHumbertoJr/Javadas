package Questão5;

public class conversorMaiusculo {
	private char letra;
	
	public void setLetra(char letra){
		this.letra = letra;
	}
	public char getMaiusculo(){
		return  (char) (letra - 32);
	}

}
