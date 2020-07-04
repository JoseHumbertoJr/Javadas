package questao05;

public enum Moeda {
	CINCO(0.05,"C:/Users/José Humberto/workspace/Exercicio - Enumeracoes/images/moedas/cincoCent.gif"),
	DEZ(0.10,"C:/Users/José Humberto/workspace/Exercicio - Enumeracoes/images/moedas/dezCent.gif"),
	VINTE_E_CINCO(0.25,"C:/Users/José Humberto/workspace/Exercicio - Enumeracoes/images/moedas/VinteECincoCent.gif"),
	CINQUENTA(0.50,"C:/Users/José Humberto/workspace/Exercicio - Enumeracoes/images/moedas/ciquentaCent.gif"),
	UM_REAL(1.0,"C:/Users/José Humberto/workspace/Exercicio - Enumeracoes/images/moedas/umReal.gif");
	
	private double valor;
	private String local;
	
	Moeda(double valor,String local){
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}

	public String getArquivo() {
		return local;
	}

}
