package Questão10;

public class maiorMultiplo {
	private int n;
	private int x;
	
	public void setX(int x){
		this.x = x ;
	}
	
	public void setN(int n ){
		this.n = n ;
	}
	public int getMaiorMult(){
		int h = 0;
		while(h<x){
			if(n<x)
				h+=n;
		}
		return h - n;
	}

}
