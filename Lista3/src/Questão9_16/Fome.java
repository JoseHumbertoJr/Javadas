package Questão9_16;

public class Fome {
	private int hora;
	
	public Fome(int hora,int minuto){
		this.hora = hora;
	}
	public String getRefeição(){
		String refeição = null;
		if (hora<=7){
			refeição = "cafe da manha";
		}
		else if (hora>10 && hora<=13){
			refeição = "almoço";
		}
		else if (hora>17 && hora<=20){
			refeição = "jantar";
		}
		return refeição;
	}

}
