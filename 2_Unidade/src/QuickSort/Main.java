package QuickSort;

public class Main {
	
	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		sort.inserir(0);
		sort.inserir(1);
		sort.inserir(0);
		sort.inserir(0);
		sort.inserir(1);
		sort.quickSort();
		sort.imprime();
	}
}
