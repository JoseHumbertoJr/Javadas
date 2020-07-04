package br.unifacisa.treinamento.backend;
import java.util.List;

public class Team {
	
	private long id;
	private List<Student> students;
	private List<Classrrom> classroom;
	private Integer period;
	
	public Team(List<Student> students, List<Classrrom> classroom, Integer period) {
		this.students = students;
		this.classroom = classroom;
		this.period = period;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Classrrom> getClassroom() {
		return classroom;
	}
	public void setClassroom(List<Classrrom> classroom) {
		this.classroom = classroom;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	
	@Override
	public String toString() {
		return "Team [students=" + students + ", classroom=" + classroom + ", period=" + period + "]";
	}

	public long getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public void setId(long id) {
		this.id = id;
	}

}
