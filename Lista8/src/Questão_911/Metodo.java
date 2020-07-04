package Questão_911;

public abstract class Metodo {
	private String nome;
	private String visibilidade;
	
	protected Metodo(String visibilidade,String nome) throws MetodoInvalidoException{
		this.nome = nome;
		this.visibilidade = visibilidade;
	}
	protected String getNome(){
		return nome;
	}
	protected String getVisibilidade(){
		return visibilidade;
	}
	public abstract String toString();
}
