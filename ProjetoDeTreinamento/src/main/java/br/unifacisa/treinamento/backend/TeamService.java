package br.unifacisa.treinamento.backend;
import java.util.ArrayList;
import java.util.List;

public class TeamService {
	
	private List<TeamRepository> team = new ArrayList<TeamRepository>();
	Classrrom clas;
	
	public void cadastrarTurma(int qtdAlunos) {
		clas = new Classrrom(qtdAlunos);

	}
}
