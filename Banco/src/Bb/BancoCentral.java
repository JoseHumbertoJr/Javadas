package Bb;

public class BancoCentral {
	public static void main(String[]args){
		ContaBanco p1 = new ContaBanco();
		p1.setConta(111111111);
		p1.setDono("jublieu");
		p1.AbrirConta("cc", true);
		p1.Deposita(100);
		p1.estatusAtual();
		
		ContaBanco p2 = new ContaBanco();
		p2.setConta(11111);
		p2.setDono("creusa");
		p2.AbrirConta("cp",true);
		p2.Deposita(500);
		p2.estatusAtual();
		
	
}

}
