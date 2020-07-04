package Cadastrar;

public class Professor extends Pessoa {
	private double salario;
	private String disciplina;
	
	public void setDisciplina(String disciplina){
		this.disciplina = disciplina;
	}
	public String getDisciplina(){
		return disciplina;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return salario;
	}
	
	public Professor (String data,String nome,double altura,double salario,String disciplina){
		super(data,nome,altura);
		this.salario = salario;
		this.disciplina = disciplina;
	}
	public void Status(){
		System.out.println("Nascimento:m "+getDataDeNascimento());
		System.out.println("Professor: "+getNome());
		System.out.println("Disciplina: "+getDisciplina());
		System.out.println("Altura: "+getAltura());
		System.out.println("Salario: "+getSalario());
	}
}
