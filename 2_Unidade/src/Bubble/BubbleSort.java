package Bubble;

public class BubbleSort {
	
	private int[] array = new int [5];
	private int posicao;
	
	public void inserir(int elemento) {
		this.array[posicao] = elemento;
		posicao++;
	}
	
	public void bubbleSort() {
		int aux;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j + 1]){
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
			}
		}
	}
	public void imprime() {
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public int getMaior() {
		return array[posicao];
	}
}
