package uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();

		for (int i = 0; i < N; i++) {

			double A = dados.nextDouble();
			double B = dados.nextDouble();
			double C = dados.nextDouble();

			double media = (A * 2.0 + B * 3.0 + C * 5.0) / 10.0;
			System.out.printf("%.1f%n",media);

		}

		dados.close();
	}

}
