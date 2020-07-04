package Questão_5;

public class PotenciaNumerica {
	private long base;
	private long expoente;
	
	public PotenciaNumerica(long base,long expoente){
		this.base = base;
		this.expoente = expoente;
	}
	public long getValor(){
		long potencia = 1;
		for (long i = 1;i<=expoente;i++){
			potencia*=base;
		}
		return potencia;
	}

}
