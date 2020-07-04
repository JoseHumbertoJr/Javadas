package Sobregarga;

public class Classe {
	private int numero;
	private String nome;
	
	public Classe(int numero,String nome){
		this.nome = nome;
		this.numero = numero;
	}
	public Classe(String nome,int numero){
		this.numero = numero;
		this.nome = nome;
	}
	public int getNumero(){
		return numero;
	}
	public String getNome(){
		return nome;
	}
}
