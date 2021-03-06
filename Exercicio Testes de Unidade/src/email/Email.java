package email;

import email.excecoes.EmailInvalidoException;

/**
 * Um email descreve um endere�o para correspond�ncia
 * enviada de forma eletr�nica. 
 */
public interface Email 
{
	/**
	 * Altera o endere�o deste email.
	 * @param endereco deste email
	 * @throws EmailInvalidoException se o email n�o for v�lido.
	 * Formato a@b.c.d, em que: 
	 * - a e b n�o podem ser vazios e s� podem conter letras min�sculas 
	 * ou d�gitos e os s�mbolos ponto (.), h�fen (-) e underscore (_), 
	 * mas n�o podem come�ar e nem terminar com estes s�mbolos;
	 * - .c n�o pode ser vazio e s� podem conter duas ou tr�s letras min�sculas;
	 * - .d pode ser vazio e s� podem conter duas letras min�sculas; 
	 */
	public void setEndereco(String endereco) throws EmailInvalidoException;

	/**
	 * Retorna o endere�o de email
	 * @return endere�o de email
	 */
	public String getEndereco();
}
