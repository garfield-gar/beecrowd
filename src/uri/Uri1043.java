package uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1043 {

	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados= new Scanner(System.in);
		
		double triangulo,menor,menores,maior;
		
		double a =dados.nextDouble();
		double b =dados.nextDouble();
		double c =dados.nextDouble();
		
		
		menor=Math.min(a, b);
		menores=Math.min(b,c);
		
		maior=Math.max(a, b);
		maior=Math.max(maior, c);
		
		
		triangulo=menor+menores;
		
		
		if(triangulo>maior) {
			double perimetro= a+b+c;
			System.out.println("Perimetro = " +perimetro);
			
		}else  {
			double area = a+ b;
			area= (area * c)/2;
			System.out.println("Area = " +area);
		}
			
		dados.close();
	}
}
