package QuickSort;

public class QuickSort {
	
	public static final int TAMANHO = 5;
	private int [] arrayInterno = new int[TAMANHO];
	private int [] arrayMenor = new int[TAMANHO];
	private int posMenor = 0;
	private int [] arrayMaior = new int[TAMANHO];
	private int posMaior = 0;
	private int posicao;
	
	public void inserir(int valor) {
		arrayInterno[posicao] = valor;
		posicao++;
	}
	
	public void quickSort() {
		
		for(int i = 1; i < arrayInterno.length; i++) {
			if(arrayInterno[0] < arrayInterno[i]) {
				arrayMaior[posMaior] = arrayInterno[i];
				posMaior++;
			}
			else {
				arrayMenor[posMenor] = arrayInterno[i];
				posMenor++;
			}
		}
	}
	public void imprime() {
		for (int i = 0; i < posMaior ; i++) {
			System.out.println(arrayMaior[i]);
		}
	}
}
