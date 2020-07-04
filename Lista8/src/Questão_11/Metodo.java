package Questão_11;

public abstract class Metodo {
	private String visibilidade;
	private String nome;
	
	public void setVisibilidade(String visibilidade){
		this.visibilidade = visibilidade;
	}
	public String getVisibilidade(){
		return visibilidade;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public abstract String toString();
}
