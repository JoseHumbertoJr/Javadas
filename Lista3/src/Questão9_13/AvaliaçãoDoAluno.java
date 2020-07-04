package Questão9_13;

public class AvaliaçãoDoAluno {
	private double primeiraNota;
	private double segundaNota;
	private double terceiraNota;
	private double frequencia;
	public AvaliaçãoDoAluno(double primeiraNota,double segundaNota,double terceiraNota,double frequencia){
		this.primeiraNota = primeiraNota;
		this.segundaNota = segundaNota;
		this.terceiraNota = terceiraNota;
		this.frequencia = frequencia;
	}
	public double getAproveitamento(){
		double media = ((primeiraNota+segundaNota+terceiraNota)/3);
		return media;
	}
	public double getFrequência(){
		return frequencia;
	}
	public String getSituaçâo(){
		String aprovação = "";
		if (getAproveitamento()>=7.0 && getFrequência()>=75.0){
			aprovação = "aprovado";
		}
		else{
			aprovação = "reprovado";
		}
		return aprovação;
	}

}
