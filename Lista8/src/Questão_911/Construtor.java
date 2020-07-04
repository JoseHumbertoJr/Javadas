package Questão_911;

public class Construtor extends Metodo {
	
	protected Construtor (String visibilidade,String nome) throws MetodoInvalidoException{
		super(visibilidade,nome);
	}
	public String toString(){
		return getVisibilidade()+" "+getNome()+"(){}";
	}
}
