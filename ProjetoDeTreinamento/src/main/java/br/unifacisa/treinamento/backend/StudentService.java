package br.unifacisa.treinamento.backend;
import java.util.List;

public class StudentService {
	
	private StudentRepository repository = new StudentRepository();
	
	public void addStudent(Student student) {
		if(student.getCurso().equals("SI")) {
			repository.createStudent(student);
		}
	}
	
	//Atualiza somente se o curso n�o foi alterado
	
	public void removeStudent(Student student) {
		this.repository.deleteStudent(student);
	}
	
	public List<Student> listAll(){
		return repository.readAll();
		
	}
}
