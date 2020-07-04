package questao01;

public class GastosMealheiroApp 
{
	public static void main(String[] args) throws InterruptedException 
	{	Homem homem = new Homem();
		//homem.informarDesejo();
		Thread trediHomi = new Thread(homem);
		Mulher mulher = new Mulher();
		Thread trediMulher = new Thread(mulher);
		trediHomi.start();
		trediMulher.start();
		trediHomi.join();
		trediMulher.join();
		//mulher.informarDesejo();
		System.out.println("O ganhador é quem falou por último");
	}
}
