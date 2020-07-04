package Trabalhando;
import java.util.Scanner;

public class Input {
    
	private static Scanner s;
    public static void main(String[] args) {
		
    	s = new Scanner(System.in);
        System.out.println("qual seu primeiro nome?");
        String primeiroNome = s.next();
        s = new Scanner(System.in);
        System.out.println("qual sua idade?");
        int idade = s.nextInt();
        System.out.println(primeiroNome);
        System.out.println(idade);
    }
}