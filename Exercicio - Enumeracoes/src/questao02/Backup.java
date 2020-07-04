package questao02;

public class Backup 
{	
	private long tamanho;
	
	public Backup(long tamanho) 
	{	this.tamanho = tamanho;
	}

	public double getQtdMidiasNecessarias(MidiaOptica midia) 
	{	
		
		return (double) this.tamanho / midia.getCapacidade();
	}
}
