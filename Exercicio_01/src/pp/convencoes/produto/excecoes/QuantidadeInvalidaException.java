package pp.convencoes.produto.excecoes;

/**
 * Excecao que e lançada quando e fornecido um valor zerado ou negativo para a 
 * quantidade.
 */
public class QuantidadeInvalidaException extends Exception {

	//erro(5) constante em minusculo
	private static final long serialVersionUID = 1L;
	
	//erro(6)metodo sem documentacao
	public QuantidadeInvalidaException() {
		super("Quantidade invalida");
	}
	
}
