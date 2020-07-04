package email;

import java.lang.reflect.Parameter;

import email.excecoes.EmailInvalidoException;
/**
 * A EmailImpl verifica se o email 
 * for válido ultilizando alguns 
 * padroes estabelecidos
 * @author J.H
 *
 */

public class EmailImpl implements Email 
{	
	private static final char LETRA_MINUS_INICIAL = 'a';
	private static final char LETRA_MINUS_FINAL = 'z';
	private static final char[] CARACTERES_VALIDOS = {'.', '-', '_'};
	private String endereco;

	/**
	 * modifica o endereco
	 * @param endereco
	 */
	public void setEndereco(String endereco) throws EmailInvalidoException 
	{	if (getA(endereco).isEmpty()
			|| getB(endereco).isEmpty()
			|| !isValido(getA(endereco))) 
		{	throw new EmailInvalidoException();
		}
		this.endereco = endereco;
	}

	/**
	 * retorna o endereco
	 * @return endereco
	 */
	public String getEndereco() 
	{	return this.endereco;
	}

	/**
	 * retorna o endereco ate onde foi definido
	 * @param endereco
	 * @return endereco
	 */
	private String getA(String endereco) 
	{	return endereco.substring(0, endereco.indexOf("@"));
	}
	/**
	 * retorna o endereco ate onde foi definido
	 * @param endereco
	 * @return
	 */
	private String getB(String endereco) 
	{	return endereco.substring(endereco.indexOf("@") + 1, endereco.indexOf(".", endereco.indexOf("@") + 1));
	}
	/**
	 * retorna o endereco ate onde foi definido
	 * @param endereco
	 * @return
	 */
	private String getC(String endereco) 
	{	int primeiroPonto = endereco.indexOf(".", endereco.indexOf("@") + 1);
		return endereco.substring(primeiroPonto + 1, endereco.indexOf(".", primeiroPonto + 1));
	}
	
	/**
	 * retorna o endereco ate onde foi definido
	 * @param endereco
	 * @return
	 */
	private String getD(String endereco) 
	{	int primeiroPonto = endereco.indexOf(".", endereco.indexOf("@") + 1);
		int segundoPonto = endereco.indexOf(".", primeiroPonto + 1);
		return endereco.substring(segundoPonto + 1);
	}
	
	/**
	 * verifica se a palavra e valida ou nao
	 * @param palavra
	 * @return boolean
	 */
	private boolean isValido(String palavra) 
	{	for (int i = 0; i < palavra.length(); i++) 
		{	char caracter = palavra.charAt(i);
			if (!((LETRA_MINUS_INICIAL <= caracter && caracter <= LETRA_MINUS_FINAL)
				|| caracter == CARACTERES_VALIDOS[0] 
				|| caracter == CARACTERES_VALIDOS[1]
				|| caracter == CARACTERES_VALIDOS[2])) 
			{	return false;
			}
		}
		return true;
	}
}
