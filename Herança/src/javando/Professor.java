package javando;

public class Professor extends Pessoa {
	private String esp;
	private float salario;

	public String getEsp() {
		return esp;
	}

	public void setEsp(String esp) {
		this.esp = esp;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void receberAumento() {
		this.salario++;
	}
}
