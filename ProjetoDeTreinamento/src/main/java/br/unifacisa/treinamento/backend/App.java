package br.unifacisa.treinamento.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		//Classrrom classroom = new Classrrom(1,false,12);
		//List<Student> students = new ArrayList<Student>();
		//Team team = new Team(students,classroom , 1);
		
		SpringApplication.run(App.class, args);
	}
}
