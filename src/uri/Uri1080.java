package uri;

import java.util.Scanner;

public class Uri1080 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		int maior = dados.nextInt();
		int posicao = 1;

		for (int i = 2; i <= 100; i++) {
			int N = dados.nextInt();

			if (N > maior) {
				maior = N;
				posicao = i;
			}

		}
		System.out.println(maior);
		System.out.println(posicao);
		dados.close();

	}
}