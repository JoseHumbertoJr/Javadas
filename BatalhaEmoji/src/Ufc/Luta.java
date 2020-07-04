package Ufc;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLutar(Lutador l1,Lutador l2){
		if (l1.getCategoria()==l2.getCategoria()&&l1!=l2){
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}
		else{
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar(){
		if(this.aprovada==true){
			System.out.println("Luta Marcada");
			System.out.println("###DESAFIADO###");
			this.desafiado.apresentar();
			System.out.println("###DESAFIANTE###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor){
			case 0: //empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1 ://desafiado
				System.out.println("Venceu "+this.getDesafiado());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: //desafiante
				System.out.println("Venceu "+this.getDesafiante());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
			}
		}
		else{
			System.out.println("Não Pode acontecer!");
		}
	}
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	

}
