package Bubble;

public class Main {
	public static void main(String[] args) {
		BubbleSort nova = new BubbleSort();
		nova.inserir(5);
		nova.inserir(60);
		nova.inserir(3);
		nova.inserir(100);
		nova.inserir(1);
		nova.bubbleSort();
		nova.imprime();
	}
}
