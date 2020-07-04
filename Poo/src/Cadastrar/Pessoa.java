package Cadastrar;

public class Pessoa {
	private String dataDeNascimento;
	private String nome;
	private double altura;
	
	public Pessoa(String data,String nome,double altura){
		this.dataDeNascimento = data;
		this.nome = nome;
		this.altura = altura;
	}
	
	public void setDataDeNascimento(String data){
		this.dataDeNascimento = data;
	}
	public String getDataDeNascimento(){
		return dataDeNascimento;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	public double getAltura(){
		return altura;
	}

}
