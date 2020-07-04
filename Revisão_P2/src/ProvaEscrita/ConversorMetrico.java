package ProvaEscrita;

public class ConversorMetrico {
	private static final double VALOR_DA_POLEGADA = 0.5;
	
	public static double getValorEmMilimetro(double valor){
		return valor*VALOR_DA_POLEGADA;
	}
}
