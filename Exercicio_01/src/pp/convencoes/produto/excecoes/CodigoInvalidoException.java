package pp.convencoes.produto.excecoes;

/**
 * Excecao que e lancada quando e fornecido um valor zerado ou negativo para a 
 * codigo de barras.
 */
public class CodigoInvalidoException extends Exception {

	//erro(1) constante em minusculo
	private static final long serialVersionUID = 1L;
	
	//erro(2)falta documentacao
	public CodigoInvalidoException() {
		super("Código inválido");
	}
	
}
