package pp.convencoes.produto.excecoes;

/**
 * Excecao que e lançada quando e fornecido um preco negativo, zerado ou com 
 * mais de tres casas decimais.
 */
public class PrecoInvalidoException extends Exception {

	//erro(3) constante em minusculo
	private static final long serialVersionUID = 1L;
	
	//erro(4) falta documentacao
	public PrecoInvalidoException() {
		super("Preço inválido");
	}
	
}
