package Quest�o9_13;

public class Avalia��oDoAluno {
	private double primeiraNota;
	private double segundaNota;
	private double terceiraNota;
	private double frequencia;
	public Avalia��oDoAluno(double primeiraNota,double segundaNota,double terceiraNota,double frequencia){
		this.primeiraNota = primeiraNota;
		this.segundaNota = segundaNota;
		this.terceiraNota = terceiraNota;
		this.frequencia = frequencia;
	}
	public double getAproveitamento(){
		double media = ((primeiraNota+segundaNota+terceiraNota)/3);
		return media;
	}
	public double getFrequ�ncia(){
		return frequencia;
	}
	public String getSitua��o(){
		String aprova��o = "";
		if (getAproveitamento()>=7.0 && getFrequ�ncia()>=75.0){
			aprova��o = "aprovado";
		}
		else{
			aprova��o = "reprovado";
		}
		return aprova��o;
	}

}
