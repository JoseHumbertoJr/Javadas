package MergeSort;

public class MergeSort {
	
	public static final int TAMANHO = 10;
	private int posicao = 0;
	private int [] array = new int[TAMANHO];
	private int [] arrayEsquerda = new int[array.length / 2];
	
	
	public void inserir(int elemento) {
		array[posicao] = elemento;
		posicao++;
	}
	
	public void mergeSort() {
		if(array.length % 2 == 0) {
			for(int i = 0;i < array.length / 2; i++) {
				arrayEsquerda[i] = array[i];
			}
			for(int i = 0; i < arrayEsquerda.length;i++) {
				
			}
		}
	}
	public void imprime() {
		for(int i = 0; i < arrayEsquerda.length; i++) {
			System.out.print(arrayEsquerda[i]+" ");
		}
	}
}
