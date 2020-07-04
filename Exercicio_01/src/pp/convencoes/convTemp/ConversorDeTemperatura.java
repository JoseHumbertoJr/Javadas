package pp.convencoes.convTemp;

//erro(1) import nao ultilizavel
import java.util.Arrays;
//erro(2) falta de documentacao na classe

public class ConversorDeTemperatura 
{	
	//erro(3)constante final em minusculo
	private static final double offset = 32.0;
	private static final double FATOR_A = 5.0;
	private static final double FATOR_B = 32.0;
	
	/**
	 * Metodo que converte temperatura de Fahrenheit para Celsius.
	 * @return temperatura em Celsius
	 */
	//erro (4) falta declara o paramentro no doc tempFahrenheit
	//erro(5) parametro tempFahrenheit em maisculo
	public static double getTempCelsius(double TempFahrenheit)
	{	return FATOR_A * (TempFahrenheit - offset) / FATOR_B;
	}
	
	/**
	 * Metodo que converte temperatura de Celsius para Fahrenheit.
	 * @param tempCelsius temperatura em Celsius
	 */
	//(6) falta declarar o return do metodo no doc
	public static double getTempFahrenheit(double tempCelsius)
	{	return FATOR_B * tempCelsius / 5.0 + offset;
	}
}
