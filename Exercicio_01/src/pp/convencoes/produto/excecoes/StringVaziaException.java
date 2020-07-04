package pp.convencoes.produto.excecoes;

/**
 * Excecao que e lan�ada quando uma string vazia ou nula e fornecida.
 */
public class StringVaziaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	//erro(6) metodo em maiusculo 
	//erro(7) falta a documentaco do metodo
 	public StringVaziaException(String campo) {
		super("O campo " + campo + " n�o pode ser vazio");
	}
	
}


