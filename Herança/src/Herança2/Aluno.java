package Heran�a2;


public class Aluno extends Pessoa {
	private int matri;
	private String curso;
	
	public void pagarMensal(){
		System.out.println("Pagando Mensalidade");
	}

	public int getMatri() {
		return matri;
	}

	public void setMatri(int matri) {
		this.matri = matri;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
