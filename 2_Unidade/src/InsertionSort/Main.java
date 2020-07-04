package InsertionSort;

public class Main {
	
	public static void main(String [] args) {
		InsertionSort sort = new InsertionSort();
		sort.inserir(5);
		sort.inserir(3);
		sort.inserir(2);
		sort.inserir(4);
		sort.inserir(7);
		sort.inserir(1);
		sort.inserir(0);
		sort.inserir(6);
		sort.inserir(9);
		sort.inserir(0);
		sort.insertionSort();
		sort.imprime();
		
	}
}
