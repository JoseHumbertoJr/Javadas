package Ufc;

public class Octogono {
	public static void main(String[]args){
		Lutador l[]= new Lutador[4];
		l[0] = new Lutador("Spider","Brasil",37,1.80f,90.5f,7,1,0);
		l[1] = new Lutador("Weidman","EUA",36,1.82f,91.2f,8,3,4);
		l[2] = new Lutador("Aldo","Brasil",35,1.70f,82.5f,8,1,0);
		l[3] = new Lutador("McGregor","IRL",34,1.72f,81.2f,5,2,0);
		
		Luta ufc = new Luta();
		ufc.marcarLutar(l[1], l[2]);
		ufc.lutar();
	}

}
