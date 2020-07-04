package Questão9_14;

public class ConsumoEnergia {
	private int valor;
	
	public ConsumoEnergia(int valor){
		this.valor = valor;
	}
	public double getConsumokwh(){
		double Consumo = 0.0;
		if (valor <= 100){
			Consumo = valor*0.08;
		}
		else if (valor >= 101 && valor <=200){
			Consumo = valor*0.10;
		}
		else if (valor >= 201 && valor <= 500){
			Consumo = valor*0.12;
		}
		return Consumo;
	}
	public double getIcms(){
		return this.getConsumokwh()*0.18;
	}
	public double getValorTotal(){
		return this.getConsumokwh()+this.getIcms();
	}

}
