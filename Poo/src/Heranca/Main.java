package Heranca;

public class Main {
	public static void main(String[] args){
		Endereco endereco = new Endereco("So tem uma",29,"todo seco","eperança - Pb");
		Casa casa = new Casa(endereco);
		System.out.print(casa.getEndereco().getCidade());
	}
}
