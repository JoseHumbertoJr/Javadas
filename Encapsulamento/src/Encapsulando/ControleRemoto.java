package Encapsulando;
public class ControleRemoto implements Controlador{
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	//Metodos Especiais
	public ControleRemoto(){
		this.volume = 50;
		this.ligado = false;
		this.tocando = true;
	}

	public int getVolume(){
		return volume;
	}
	
	public void setVolume(int volume){
		this.volume = volume;
	}
	
	public boolean getLigado(){
		return ligado;
	}
	
	public void setLigado(boolean ligado){
		this.ligado = ligado;
	}
	public boolean getTocando(){
		return tocando;
	}
	
	public void setTocando(boolean tocando){
		this.tocando = tocando;
	}
	//Metodos Abstratos
	public void Ligar(){
		this.setLigado(true);
	}
	
	public void Desligar(){
		this.setLigado(false);
	}
	public void AbrirMenu(){
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.print("Volume: "+ this.getVolume());
		for(int i = 0; i <=this.getVolume();i+=10){
			System.out.print("-");
		}
	}
	public void FecharMenu(){
		System.out.println("");
		System.out.println("Fechando menu");
	}
	
	public void MaisVolume(){
		if (this.getLigado()==true){
			this.setVolume(this.getVolume()+1);
			
		}
	}
	
	public void MenosVolume(){
		if (this.getLigado()==false){
			this.setVolume(this.getVolume()-1);
		}
	}
	
	public void LigarMudo(){
		if (this.getLigado()==true && this.getVolume()>0){
			this.setVolume(0);
		}
	}
	
		public void DesligarMudo(){
		if (this.getLigado()==true && this.getVolume()>0){
			this.setVolume(50);
		}
	}
	
		public void Play(){
		if (this.getLigado()==true && this.getTocando()==true){
			this.setLigado(true);
		}
	}
	
		public void Pause(){
		if (this.getTocando()==true&& this.getLigado()==true){
			this.setTocando(false);
		}
	}
} 


