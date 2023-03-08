package uri;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		
		if (x< 0 && x >100) {
			System.out.println("Fora de intervalo");
		}
		if (x > 0 && x <=25.00) {
			System.out.println("Intevalor (0,25 ]");
		}
		else if (x>25.00 && x <=50.00) {
			System.out.println("Intervalo [25,50 ]");
		}
		if (x > 50.00 && x <= 75.00) {
			System.out.println("Intevalor (50,75] ");
		}
		else if (x>75.00 && x <=100.00) {
			System.out.println("Intervalo [75,100) ");
		}
		
		sc.close();
	}
}
