package Bubble;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	void maiorElemento() {
		BubbleSort sort = new BubbleSort();
		sort.inserir(5);
		sort.inserir(60);
		sort.inserir(4);
		sort.inserir(6);
		sort.bubbleSort();
		assertEquals(60, sort.getMaior());
	}

}
