package br.unifacisa.testeMaven;

public class GerenteDePessoa {
	
	Pessoa novaPessoa = new Pessoa();
	Pessoa pessoa = new Pessoa();
	
	public void cadastrarPessoa(String nome,int idade,double salario) {
		novaPessoa.setNome(nome);
		novaPessoa.setIdade(idade);
		novaPessoa.setSalario(salario);
		if(novaPessoa.isValid()) {
			pessoa.setNome(nome);
			pessoa.setIdade(idade);
			pessoa.setSalario(salario);
		}
		
	}
	public String getPessoa() {
		return pessoa.getNome();
	}

}
