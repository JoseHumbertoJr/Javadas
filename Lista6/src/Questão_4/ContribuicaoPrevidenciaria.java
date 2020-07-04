package Questão_4;

public class ContribuicaoPrevidenciaria {
	private static  double salarioBruto;
	private static final double base_Um = 1174.86;
	private static final double base_Dois = 1958.10;
	private static final double base_Tres = 3916.20;
	private static final double valorMaximo = 430.78;
	private static final double primeiraPorcentagem = 8.0;
	private static final double segundaPorcentagem = 9.0;
	private static final double terceiraPorcentagem = 11.0;
	public static final double cem = 100;
	
	public void setSalarioBruto(double salario){
		salarioBruto = salario;
	}
	
	public static double  getValorDaContribuicao(){
		double valorDaContribuicao = 0;
		if (salarioBruto <= base_Um){
			valorDaContribuicao = (salarioBruto*primeiraPorcentagem)/cem;
		}
		else if (salarioBruto > base_Um && salarioBruto <= base_Dois){
			valorDaContribuicao = (salarioBruto*segundaPorcentagem)/cem;
		}
		else if (salarioBruto > base_Dois && salarioBruto <= base_Tres){
			valorDaContribuicao = (salarioBruto*terceiraPorcentagem)/cem;
		}
		else if (salarioBruto > base_Tres){
			valorDaContribuicao = valorMaximo;
		}
		return valorDaContribuicao;
	}
	public static double getSalarioLiquido(){
		double salarioLiquido = 0;
		if (salarioBruto <= base_Um){
			salarioLiquido = salarioBruto-getValorDaContribuicao();
		}
		else if (salarioBruto > base_Um && salarioBruto <= base_Dois){
			salarioLiquido = salarioBruto-getValorDaContribuicao();
		}
		else if (salarioBruto > base_Dois && salarioBruto <= base_Tres){
			salarioLiquido = salarioBruto-getValorDaContribuicao();
		}
		else if (salarioBruto > base_Tres){
			salarioLiquido = salarioBruto-getValorDaContribuicao();
		}
		return salarioLiquido;
	}
}
