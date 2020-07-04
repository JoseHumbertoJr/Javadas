package SelectionSort;

public class SelectionSort {
	
	private int [] array = new int [5];
	private int posicao;
	
	public void inserir(int elemento) {
		this.array[posicao] = elemento;
		posicao++;
	}
	
	public void selection() {
		int aux;
		
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i+1; j < array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			if(i != min) {
				aux = array[i];
				array[i] = array[min];
				array[min] = aux; 
			}
		}
	}
	public void imprime() {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}
