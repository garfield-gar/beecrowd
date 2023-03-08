package uri;

import java.util.Scanner;

public class Consumo {
	public static void main (String[]args) {
		Scanner dados= new Scanner(System.in);
	
		int X=0;
		float Y=0, km;
		
		X=dados.nextInt();
		Y=dados.nextFloat();
		
		km=X/Y;
		
		System.out.printf("%.3f km/l%n", km );
		
		dados.close();
	}
}
