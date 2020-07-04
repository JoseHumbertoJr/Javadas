package Questão_911;

public class Abstrato extends Instancia {
	protected Abstrato(String visibilidade,String retorno,String nome) throws MetodoInvalidoException{
		super(visibilidade,retorno,nome);
	}
	public String toString(){
		return getVisibilidade()+" "+"abstract"+" "+getNome()+"();";
	}
}
