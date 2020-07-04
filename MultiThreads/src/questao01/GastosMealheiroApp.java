package questao01;

public class GastosMealheiroApp 
{
	public static void main(String[] args) throws InterruptedException 
	{	Homem homem = new Homem();
		//homem.informarDesejo();
		Mulher mulher = new Mulher();
		//mulher.informarDesejo();
		Thread threadHomem = new Thread(homem);
		Thread threadMulher = new Thread(mulher);
		threadHomem.start();
		threadMulher.start();
		threadHomem.join();
		threadMulher.join();
		System.out.println("O ganhador é quem falou por último");
	}
}
