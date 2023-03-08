package uri;

import java.util.Scanner;


public class somaSimples {
public static void main (String[]args) {
	Scanner dados= new Scanner(System.in);
	
	int A=dados.nextInt();
	int B=dados.nextInt();
	
	int PROD= A * B;
	System.out.println("PROD = " + PROD);
	dados.close();
}
}
