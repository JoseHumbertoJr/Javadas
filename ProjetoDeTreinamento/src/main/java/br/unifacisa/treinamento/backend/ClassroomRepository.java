package br.unifacisa.treinamento.backend;
import java.util.ArrayList;
import java.util.List;

public class ClassroomRepository {
	
	private List<Classrrom> classroom = new ArrayList<Classrrom>();
	
	public Classrrom createClassrrom(Classrrom classroom) {
		this.classroom.add(classroom);
		return classroom;
	}
	
	public Classrrom updateClassrom(Classrrom classroom) {
		for (int i = 0; i < this.classroom.size(); i++) {
			Classrrom classrromAtual = this.classroom.get(i);
			if(classrromAtual.equals(classroom)) {
				this.classroom.add(i, classrromAtual);;
				i = this.classroom.size();
			}
		}
		return classroom;	
	}
	
	public Classrrom addClasrrom(Classrrom classrrom) {
		this.classroom.add(classrrom);
		return classrrom;
	}
	
	public void deleteClassroom(Classrrom classroom) {
		for (int i = 0; i < this.classroom.size(); i++) {
			Classrrom classrromAtual = this.classroom.get(i);
			if(classrromAtual.equals(classroom)) {
				this.classroom.remove(i);
				i = this.classroom.size();	
			}
		}
	}
	public List<Classrrom> readAll(){
		return this.classroom;
		
	}
	
	
}
