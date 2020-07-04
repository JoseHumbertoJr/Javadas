package InsertionSort;

public class InsertionSort {
	
	private int posicao;
	public static final int TAMANHO = 10;
	private int[] array = new int [TAMANHO];
	
	public void inserir(int elemento) {
		array[posicao] = elemento;
		posicao++;
	}
	
	public void insertionSort() {
		 for (int i = 0; i < array.length;i++) {
			 int chave = i+1;
			 int atual = chave-1;
			 int anterior = atual-1;
			 while(anterior >=0) {
				 if(array[atual] < array[anterior]) {
					 int aux = array[anterior];
					 array[anterior] = array[atual];
					 array[atual] = aux;
					 atual--;
					 anterior--;
				 }
				 else {
					 atual--;
					 anterior--;
				 }
			 }
		 }
	}
	public void imprime() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" ");
			System.out.print(array[i]+" ");
		}
	}
}
