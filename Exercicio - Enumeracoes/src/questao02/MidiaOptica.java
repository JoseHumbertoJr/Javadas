 package questao02;

public enum MidiaOptica {
	
	DVD(4700),BLUERAY(50000),CD(700);
	
	private long capacidade;
	
	MidiaOptica(int valor){
		this.capacidade = valor;
	}
	
	public long getCapacidade() {
		return capacidade;
	}
	
}