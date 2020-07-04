package questao01;

public abstract class Pessoa implements Runnable
{
	private static final int QTD_ITERACAO = 10;
	private static final int ESPERA = 1000;
	
	public void informarDesejo()
	{	
		for (int i = 0; i < QTD_ITERACAO; i++) 
		{	
			try {
				Thread.sleep(getEspera());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getDesejo());
		}
	}
	public void run() {
		informarDesejo();
	}

	public abstract String getDesejo();
	
	private long getEspera()
	{	return (long)(Math.random() * ESPERA);
	}
}
