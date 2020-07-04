package br.unifacisa.treinamento.backend;
import java.util.List;

public class Classrrom {
	
	private long id;
	private Integer number;
	private List<Student> students;
	private boolean availability;
	private int capacity;
	
	public Classrrom(int capacity) {
		this.capacity = capacity;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	public void setAilability(boolean avali) {
		this.availability = avali;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return "Classrrom [number=" + number + ", students=" + students + ", availability=" + availability
				+ ", capacity=" + capacity + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
