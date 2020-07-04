package Questão_1;

public class Mes {
	private int numeroDoMes;
	
	public void setNumeroDoMes(int numero) throws MesInvalidoException  {
		this.numeroDoMes = numero;
		if(this.numeroDoMes > 12 || this.numeroDoMes < 1) {
			throw new MesInvalidoException();
		}
	}
	protected int getNumeroDoMes(){
		return numeroDoMes;
	}
}
