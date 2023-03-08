package uri;
import java.util.Scanner;


public class Diferencial {
	
	public static void main (String[]args) {
		Scanner dados= new Scanner(System.in);
		int A,B,C,D;
		
	     A=dados.nextInt();
	     
	     B=dados.nextInt();
	     
	     C=dados.nextInt();
	     
	     D=dados.nextInt();
		
		
	    int DIFERENCIAL = (A * B - C * D);


		
		System.out.printf("DIFERENCA = " +  DIFERENCIAL);
		dados.close();
	}
	}

