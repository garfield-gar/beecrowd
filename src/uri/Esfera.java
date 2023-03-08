package uri;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {
	public static void main (String[]args) {
	Scanner dados= new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	double raio,pi=3.14159,Volume;
	
	raio=dados.nextDouble();
	
	
	Volume=4.0/3.0*pi*Math.pow(raio,3.0);
	
	System.out.printf("VOLUME = %.3f%n", Volume);
	
	dados.close();
}
}
