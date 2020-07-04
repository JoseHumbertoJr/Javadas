package questao04;

public enum Planeta {
	TERRA(9.807);
	
	private double gravidade;
	
	Planeta(double gravidade){
		this.gravidade = gravidade;
	}

	public double getGravidade() {
		// TODO Auto-generated method stub
		return gravidade;
	}

	public Object getPesoSuperficie(double massa) {
		// TODO Auto-generated method stub
		return massa / this.gravidade;
	}

}
