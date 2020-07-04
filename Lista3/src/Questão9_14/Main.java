package Questão9_14;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Consumo: ");
		int valor = teclado.nextInt();
		ConsumoEnergia consumidor = new ConsumoEnergia(valor);
		System.out.println("Valor por kwh: "+consumidor.getConsumokwh()+" ");
		System.out.println("valor de ICMS: "+consumidor.getIcms()+" ");
		System.out.println("Valor total: "+consumidor.getValorTotal()+" ");
		teclado.close();
	}
}
