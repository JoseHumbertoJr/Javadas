package Questão_9;

public class ConversorDePotencia {
	private static double cavaloVapor;
	private static final double hP = 0.9863;
	private static final double kW = 0.7355;
	
	public ConversorDePotencia(double cavaloVapor){
		this.cavaloVapor = cavaloVapor;
	}
	public static double getHorsePower(){
		double horsePower = 0;
		horsePower = cavaloVapor * hP;
		return horsePower;
	}
	public static double getKiloWatts(){
		double kiloWatts = 0;
		kiloWatts = cavaloVapor * kW;
		return kiloWatts;
	}
}
