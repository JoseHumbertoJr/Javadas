package pp.convencoes.formatador;

//erro(1) import nao ultilizavel
import java.sql.*;

/**
 * Classe que formata um identificador (atributo, metodo ou classe) de acordo com um padrão Camel Case.
 */
public class FormatadorCamelCase 
{	public static final String FORMATO_ATRIBUTO = "atributo";
	public static final String FORMATO_METODO = "metodo";
	public static final String FORMATO_CLASSE = "classe";
	//erro(2) constante final em minusculo
	public static final int primeiraPalavra = 0;
	
	private String identificador;
	
	/**
	 * Altera o identificador a ser formatado.
	 * @param IDENTIFICADOR identificador a ser formatado
	 */
	//erro(3) metodo em escrito em maiusculo
	//erro(4) parametro escrita em maiusculo
	public void SetIdentificador(String IDENTIFICADOR)
	{	this.identificador = IDENTIFICADOR;
	}
	
	/**
	 * Retorna o identificador no formato Camel Case 
	 * para atributos (camelCase).
	 * @return identificador no formato camelCase
	 */
	public String getCamelCaseAtributo()
	{	return getCamelCase(false, this.identificador);
	}
	//erro(5) metodo sem documentacao
	public String getCamelCaseMetodo()
	{	return getCamelCase(false, this.identificador);
	}
	
	/**
	 * Retorna o identificador no formato Camel Case 
	 * para classes (camelCase).
	 * @return identificador no formato CamelCase
	 */
	public String getCamelCaseClasse()
	{	return getCamelCase(true, this.identificador);
	}
	
	/**
	 * Retorna o identificador no formato Camel Case.
	 * @param PrimMaiuscula se desejar a primeira 
	 *			letra maiuscula
	 * @param identificador identificador a ser formatado
	 * @return identificador no formato Camel Case
	 */
	//erro(6) parametro PrimMaiuscula em maiusculo
	private String getCamelCase(boolean PrimMaiuscula, String identificador)
	{	String identMinusc = identificador.toLowerCase();
		String[] palavras = identMinusc.split(" ");
		String camelCase = "";
		for (int i = 0; i < palavras.length; i++)
		{	String primeiraLetra = palavras[i].substring(0, 1);
		//erro(7) falta chaves no if
			if (primeiraPalavra < i || PrimMaiuscula)
				primeiraLetra = primeiraLetra.toUpperCase();
			String restoLetras = palavras[i].substring(1);
			camelCase = camelCase.concat(primeiraLetra);
			camelCase = camelCase.concat(restoLetras);
		}
		return camelCase;
	}
}
