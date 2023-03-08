package uri;

import java.util.Scanner;

public class Uri1157 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();

		for (int i = 1; i <= N; i++) {

			if (N % i == 0) {
				System.out.println(i);
			}

		}
		dados.close();
	}

}
