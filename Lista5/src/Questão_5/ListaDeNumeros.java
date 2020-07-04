package Questão_5;

public class ListaDeNumeros {
	private int[] numero = new int[5];
	private int posicao = 0;
	
	public void addNumero(int numero){
		this.numero[posicao] = numero ;
		posicao++;
	}
	public boolean hasRepeticao(){
		boolean repeticao = false;
		for (int i = 0;i < numero.length;i++){
			for (int j = i+1;j < numero.length;j++){
				if (numero[j] == numero[i]){
					repeticao = true;
				}
			}
		}
		return repeticao;
	}
}
