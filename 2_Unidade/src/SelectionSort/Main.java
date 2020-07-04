package SelectionSort;

public class Main {
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		sort.inserir(0);
		sort.inserir(0);
		sort.inserir(1);
		sort.inserir(0);
		sort.inserir(0);
		sort.selection();
		sort.imprime();
	}
}
