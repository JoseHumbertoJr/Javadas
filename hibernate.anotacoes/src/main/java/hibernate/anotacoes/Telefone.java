package hibernate.anotacoes;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Telefone {
	
	@Embedded
	private int numero;
	@Embedded
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
