package uri;

import java.util.Scanner;


public class Circulo {
public static void main (String[]args) {
	Scanner dados= new Scanner(System.in);
	
	double n=3.14159;
	double raio=dados.nextDouble();
	
	double area= Math.pow(raio,2)*n;
	System.out.printf("A=%.4f%n",area);
	dados.close();
}
}
