package br.unifacisa.treinamento.backend;

public class Student {
	
	private long id;
	private Integer register;
	private String name;
	private String curso;
	
	public Student(Integer register,String name, String curso) {
		this.register = register;
		this.name = name;
		this.curso = curso;
	}
	
	public Integer getRegister() {
		return register;
	}
	public void setRegister(Integer register) {
		this.register = register;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Student [register=" + register + ", name=" + name + ", curso=" + curso + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
