package uri;

import java.util.Scanner;


public class media2 {
public static void main (String[]args) {
	Scanner dados= new Scanner(System.in);
	
	double A=dados.nextDouble();
	double B=dados.nextDouble();
	double C=dados.nextDouble();
	
	double  Media=(( A * 2 ) + ( B * 3) + (C * 5)) / 10.0;
	
	System.out.println("MEDIA = " +  Media);
	dados.close();
}
}