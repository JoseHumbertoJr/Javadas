package Metodo_Statico;

public class Atleta {
	private String nome;
	private double peso;
	private double altura;
	private static double MAIOR_PESO = 0;
	private static double MAIOR_ALTURA = 0;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setPeso(double peso){
		if(peso > MAIOR_PESO){
			MAIOR_PESO = peso;
		}
		this.peso = peso;
	}
	public void setAltura(double altura){
		if(altura > MAIOR_ALTURA){
			MAIOR_ALTURA = altura;
		}
		this.altura = altura;
	}
	protected static double getMaiorPeso(){
		return MAIOR_PESO;
	}
	protected static double getMaiorAltura(){
		return MAIOR_ALTURA;
	}
}
