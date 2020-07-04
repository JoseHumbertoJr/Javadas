package javando;

public class Funcionário extends Pessoa {
	private String setor;
	private boolean trabalhando;

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void mudaTrabalho() {
		this.trabalhando = !this.trabalhando;
	}

}
