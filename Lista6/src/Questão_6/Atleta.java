package Questão_6;

public class Atleta {
	private String nome;
	private double peso;
	private double altura;
	private static double maiorAltura;
	private static double maiorPeso;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setPeso(double peso){
		this.peso = peso;
		if(peso > maiorPeso){
			maiorPeso = peso;
		}
	}
	public void setAltura(double altura){
		this.altura = altura;
		if (altura > maiorAltura){
			maiorAltura = altura;
		}
	}
	public static double getMaiorPeso(){
		return maiorPeso;
	}
	public static double getMaiorAltura(){
		return maiorAltura;
	}
}
