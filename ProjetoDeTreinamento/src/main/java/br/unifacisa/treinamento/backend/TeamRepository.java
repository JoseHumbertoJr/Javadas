package br.unifacisa.treinamento.backend;
import java.util.ArrayList;
import java.util.List;

public class TeamRepository {
	
	private List<Team> team = new ArrayList<Team>();
	private int qtd;
	
	public void addTurma(Team tean) {
		team.add(tean);
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
}
