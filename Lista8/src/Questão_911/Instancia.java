package Questão_911;

public class Instancia extends Construtor {
	private String retorno;
	
	public String getRetorno(){
		return retorno;
	}
	protected Instancia(String visibilidade,String retorno,String nome) throws MetodoInvalidoException {
		super(nome,visibilidade);
		this.retorno = retorno;
	}
	public String toString(){
		return getVisibilidade()+" "+getRetorno()+" "+getNome()+"(){}";
	}
}
