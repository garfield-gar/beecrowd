package uri;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados= new Scanner(System.in);
		
		
		double A,B,C,pi=3.14159;
		double areaT,areaC,areaTr,AreaQ,AreaR;
		
		A=dados.nextDouble();
		B=dados.nextDouble();	
		C= dados.nextDouble();
		
		areaT= (A*C)/2;
		areaC=pi*Math.pow(C,2);
		areaTr=((A+B)*C)/2;
		AreaQ=B*B;
		AreaR=A*B;
		
		System.out.printf("TRIANGULO: %.3f%n",areaT);
		System.out.printf("CIRCULO: %.3f%n", areaC);
		System.out.printf("TRAPEZIO: %.3f%n", areaTr);
		System.out.printf("QUADRADO: %.3f%n",AreaQ);
		System.out.printf("RETANGULO: %.3f%n",AreaR);
		dados.close();
		
	}
}
