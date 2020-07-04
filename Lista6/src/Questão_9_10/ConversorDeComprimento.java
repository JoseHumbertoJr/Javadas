package Questão_9_10;

public class ConversorDeComprimento {
	private static double metros;
	public static final double jardas = 1.09361;
	public static final double polegadas = 39.36996;
	
	public void setMetros(double metros){
		ConversorDeComprimento.metros = metros;
	}
	
	public static double getMedidaEmJardas(){
		double medidaEmJardas = 0;
		medidaEmJardas = metros*jardas;
		return medidaEmJardas;
	}
	public static double getMedidaEmPolegadas(){
		double medidaEmPolegadas = 0;
		medidaEmPolegadas = metros*polegadas;
		return medidaEmPolegadas;
	}

}
