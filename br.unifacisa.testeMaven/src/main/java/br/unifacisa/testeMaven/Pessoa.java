package br.unifacisa.testeMaven;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double salario;
	private String sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public boolean isValid() {
		return this.getSalario() >= 5.000 && this.getIdade() >= 18 && this.getSexo() == "feminino";
	}

}
