package lista.sequencial;

public class Lista {
	private int inseridos;
	public static final int TAMANHO = 3;
	public static final int DOBRO = 2;
	private Object [] arrayInterno = new Object[TAMANHO];
	
	
	public void inserirFinal(Object elemento) {
		if(inseridos == arrayInterno.length) {
			Object [] novoArray = new Object[arrayInterno.length * DOBRO];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i] = arrayInterno[i];
			}
			this.arrayInterno = novoArray;
		}
		arrayInterno[inseridos] = elemento;
		inseridos++;
	}
	public void inserirInicio(Object elemento) {
		if(inseridos == arrayInterno.length) {
			Object [] novoArray = new Object[arrayInterno.length * 2];
			for(int i = 0; i < inseridos; i++) {
				novoArray[i] = arrayInterno[i];
			}
			this.arrayInterno = novoArray;
		}
		for(int i = 0; i < inseridos; i++) {
			arrayInterno[i+1] = arrayInterno[i];
		}
		arrayInterno[0] = elemento;
		inseridos++;
	}
	public void removerFinal() {
		if(inseridos == 0) {
			throw new NullPointerException();
		}
		arrayInterno[inseridos -1] = null;
		inseridos--;
	}
	public void removerInicio() {
		arrayInterno[0] = null;
		for(int i = 0; i < inseridos; i++) {
			arrayInterno[i] = arrayInterno[i+1];
		}
		arrayInterno[inseridos-1] = null;
		inseridos--;
	}
	public boolean isEmpty() {
		return inseridos == 0;
	}
	public int size() {
		return inseridos;
	}
	public Object getFisrt() {
		return arrayInterno[0];
	}
}
