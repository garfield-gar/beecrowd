package uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1117 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);

		double x, y, media=0;

		x = dados.nextDouble();
		y = dados.nextDouble();

		while (x<0 || x>10) {
			System.out.println("nota invalidac");
				x = dados.nextDouble();

			}
			while (y < 0 || y > 10) {
				System.out.println("nota invalidac");
				y = dados.nextDouble();
				}
		media = (x + y) / 2;
		System.out.println("media = %.2f%n" + media);
	

		dados.close();
	}
}
