package uri;

import java.util.Scanner;

public class Uri1132 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

	
		int x = dados.nextInt();
		int y = dados.nextInt();
		int maior = x;
		int menor = y;

		if (x > y) {
			menor = y;
			maior = x;
		}

		int soma = 0;
		for (int i = menor; i <= maior; i++) {

			if (i % 13 != 0) {
				soma = soma + 1;
			}
			System.out.println(soma);
		}
		dados.close();
	}
}
