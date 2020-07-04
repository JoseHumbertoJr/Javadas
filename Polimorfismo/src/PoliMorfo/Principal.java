package PoliMorfo;

public class Principal {
	public static void main(String[]args){
		Mamifero m1 = new Mamifero();
		Reptil r1 = new Reptil();
		Peixe p1 = new Peixe();
		Ave a1 = new Ave();
		Canguru c1 = new Canguru();
		
		m1.locomover();
		r1.locomover();
		p1.locomover();
		a1.locomover();
		c1.locomover();
	}
}
