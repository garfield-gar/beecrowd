package uri;

import java.util.Locale;
import java.util.Scanner;

public class Cordenadas {

	public static void main (String []args) {
		Locale.setDefault(Locale.US);
		Scanner dados =new Scanner(System.in);
		
		double x,y;
		
		x=dados.nextDouble();
		y=dados.nextDouble();
		
		if(x==0 && y ==0) {
			System.out.println("Origem");
		}else if (x == 0.0) {
			System.out.println("Eixo y");
		}else if(y ==0.0) {
			System.out.println("Eixo x");
		}else if (x > 0.0 && y >0.0) {
			System.out.println("Q1");
		}else if(x<0.0 && y >0.0) {
			System.out.println("Q2");
			}else if(x <0.0 && y<0.0) {
				System.out.println("Q3");
			}else {
				System.out.println("q4");
			}
		
		dados.close();
		}
}
