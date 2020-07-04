package questao04;

public enum Planeta {
	
	TERRA(9.807),MARTE(3.711),VENUS(8.87),MERCURIO(3.7);
	
	private double gravidade;
	
	Planeta(double valor){
		this.gravidade = valor;
	}

	public double getGravidade() {
		return gravidade;
	}

	public Object getPesoSuperficie(double massa) {
		
		return gravidade * massa;
	}

}
