package uri;

import java.util.Scanner;

public class Uri1116f {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		

		int N = dados.nextInt();

		for (int i = 0; i < N; i++) {

			int x = dados.nextInt();
			int y = dados.nextInt();

			
			if (x == 0) {
				System.out.println("divisão impossivel");
			} else {
				double dividido = x / y;
				System.out.printf("%.1f%n", dividido);
			}
		}
		dados.close();
	}
}
