package Cadastrar;

public class Cordenador extends Pessoa {
	private int matricula;
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	public int getMatricula(){
		return matricula;
	}

	public Cordenador(String data, String nome, double altura,int matricula) {
		super(data, nome, altura);
		this.matricula = matricula;
	}
	public void status(){
		System.out.println("Nascimento: "+getDataDeNascimento());
		System.out.println("Cordenador: " +getNome());
		System.out.println("Altura: "+getAltura());
		System.out.println("Matricula: "+getMatricula());

	}

}
