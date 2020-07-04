package Questão9;

public class mediaTripla {
	private double num1,num2,num3;
	
	public void setNum1(double num1){
		this.num1 = num1;
	}
	public void setNum2(double num2){
		this.num2 = num2;
	}
	public void setNum3(double num3){
		this.num3 = num3;
	}
	
	public double getMedia(){
		return (num1+num2+num3)/3;
	}

}
