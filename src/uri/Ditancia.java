package uri;

import java.util.Locale;
import java.util.Scanner;

public class Ditancia {
public static void main (String[]args) {
	Locale.setDefault(Locale.US);
	Scanner dados =new Scanner(System.in);
	
	double x1,y1;
	double x2,y2;
	double raiz;
	
	x1=dados.nextDouble();
	y1=dados.nextDouble();
	
	x2=dados.nextDouble();
	y2=dados.nextDouble();
	
	raiz=Math.sqrt(Math.pow((x2-x1),2.0)+ Math.pow((y2-y1),2.0));
	
	System.out.printf("%.4f%n",raiz);
	dados.close();
}
}
