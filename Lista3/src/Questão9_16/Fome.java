package Quest�o9_16;

public class Fome {
	private int hora;
	
	public Fome(int hora,int minuto){
		this.hora = hora;
	}
	public String getRefei��o(){
		String refei��o = null;
		if (hora<=7){
			refei��o = "cafe da manha";
		}
		else if (hora>10 && hora<=13){
			refei��o = "almo�o";
		}
		else if (hora>17 && hora<=20){
			refei��o = "jantar";
		}
		return refei��o;
	}

}
