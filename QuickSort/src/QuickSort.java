
public class QuickSort {
	
	private static final int TAMANHO = 5;
	private int [] arrayInterno = new int [TAMANHO];
	
	
	public void inserir(int el1,int el2,int el3, int el4,int el5) {
		this.arrayInterno[0] = el1;
		this.arrayInterno[1] = el2;
		this.arrayInterno[2] = el3;
		this.arrayInterno[3] = el4;
		this.arrayInterno[4] = el5;
	}
	
	public void quickSort() {
		int posicao = 0 ; 
		int pivo;
		for(int i = 0; i < arrayInterno.length; i++) {
			pivo = arrayInterno[i];
			posicao = 0;
			for(int j = 1 ; j < arrayInterno.length;j++) {
				if(pivo > arrayInterno[j]){
					posicao++;
				}
			}
			arrayInterno[posicao] = pivo;
		}
	}
	public void imprime() {
		for(int i = 0; i < arrayInterno.length;i++) {
			System.out.print(arrayInterno[i]+" ");
		}
	}
}
