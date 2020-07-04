package br.unifacisa.treinamento.backend;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

	private List<Student> dbStudent = new ArrayList<Student>();
	
	public Student createStudent(Student student) {
		this.dbStudent.add(student);
		return student;
		
	}
	
	public Student updateStudent(Student student) {
		for (int i = 0; i < dbStudent.size(); i++) {
			Student studentAtual = dbStudent.get(i);
			if(studentAtual.equals(student)) {
				dbStudent.add(i, studentAtual);;
				i = dbStudent.size();
			}
		}
		return student;
	}
	
	public Student addStudent(Student student) {
		this.dbStudent.add(student);
		return student;
	}
	
	public void deleteStudent(Student student) {
		for (int i = 0; i < dbStudent.size(); i++) {
			Student studentAtual = dbStudent.get(i);
			if(studentAtual.equals(student)) {
				dbStudent.remove(i);
				i = dbStudent.size();
			}
		}
	}
	public List<Student> readAll(){
		return dbStudent;
		
	}
}
