package Questão8;

public class Mes {
	private int numero;
	public Mes(int numero){
		this.numero = numero;
	}
	public String getMesDoNumero(){
		String numeroDoMes = ""; 
		switch(numero){
		case 1:
			numeroDoMes = "janeiro";
			break;
		case 2:
			numeroDoMes = "fevereiro";
			break;
		case 3:
			numeroDoMes= "março";
			break;
		case 4:
			numeroDoMes = "abril";
			break;
		case 5:
			numeroDoMes = "maio";
			break;
		case 6:
			numeroDoMes = "junho";
			break;
		case 7:
			numeroDoMes = "julho";
			break;
		case 8:
			numeroDoMes = "agosto";
			break;
		case 9:
			numeroDoMes = "setembro";
			break;
		case 10:
			numeroDoMes = "outubro";
			break;
		case 11:
			numeroDoMes = "novembro";
			break;
		case 12:
			numeroDoMes = "dezembro";
			break;
		}
		return numeroDoMes;
	}

}
