package br.unifacisa.treinamento.backend;
import java.util.List;

public class ClassroomService {
	
	private ClassroomRepository classroom = new ClassroomRepository();
	
	
	private void addClassroom(Classrrom classrroom) {
		if(classrroom.getNumber().equals(classrroom)) {
			classroom.addClasrrom(classrroom);
		}
		this.classroom.createClassrrom(classrroom);
	}
	
	private void removeClassroom(Classrrom classrroom) {
		this.classroom.deleteClassroom(classrroom);
	}
	
	public List<Classrrom> listAll(){
		return classroom.readAll();
		
	}
}
