package Pilha;

public class Pilha {
	private int [] array = new int[5];
	private int posPar = 0;
	private int posImpar = 1;
	private int posicao = 0;
	
	public void push(int elemento) {
		if(this.posImpar < array.length) {
			array[posImpar] = elemento;
			posImpar+=2;
			posicao++;
		}
		else if(this.posPar < array.length) {
			array[posPar] = elemento;
			posPar+=2;
			posicao++;
		}
	}
	public void pop() {
		if(posicao-1 % 2 == 0) {
			array[posicao] = 0;
			posicao--;
			posPar-=2;
		}
		else {
			array[posicao] = 0;
			posicao--;
			posImpar-=2;
		}
	}
	public void imprime() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
