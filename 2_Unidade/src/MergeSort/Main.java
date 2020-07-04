package MergeSort;

public class Main {
	public static void main(String[] args) {
		
		MergeSort sort = new MergeSort();
		sort.inserir(5);
		sort.inserir(4);
		sort.inserir(7);
		sort.inserir(3);
		sort.inserir(71);
		sort.inserir(39);
		sort.inserir(14);
		sort.inserir(16);
		sort.inserir(2);
		sort.inserir(500);
		sort.mergeSort();
		sort.imprime();
	}
}
