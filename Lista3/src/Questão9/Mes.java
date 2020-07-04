package Questão9;

public class Mes {
	private String nomeMes;
	public Mes(String nomeMes){
		this.nomeMes = nomeMes;
	}
	public int getNumeroDoMes(){
		int numeroDoMes = 0;
		switch(nomeMes){
		case "janeiro":
			numeroDoMes = 1;
			break;
		case "fevereiro":
			numeroDoMes = 2;
			break;
		case "março":
			numeroDoMes= 3;
			break;
		case "abril":
			numeroDoMes = 4;
			break;
		case "maio":
			numeroDoMes = 5;
			break;
		case "junho":
			numeroDoMes = 6;
			break;
		case "julho":
			numeroDoMes = 7;
			break;
		case "agosto":
			numeroDoMes = 8;
			break;
		case "setembro":
			numeroDoMes = 9;
			break;
		case "outubro":
			numeroDoMes = 10;
			break;
		case "novembro":
			numeroDoMes = 11;
			break;
		case "dezembro":
			numeroDoMes = 12;
			break;
		}
		return numeroDoMes;
	}

}
