package hibernate.anotacoes;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Pessoa {
	@Embedded
	private long id;
	@Embedded
	private String nome;
	@Embedded
	private long cpf;
	@Embedded
	private int telefone;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
