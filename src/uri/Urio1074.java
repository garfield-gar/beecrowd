package uri;

import java.util.Scanner;

public class Urio1074 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		int n = dados.nextInt();

		for (int i = 0; i < n; i++) {

			int x = dados.nextInt();

			if (x == 0) {
				System.out.println("NULL");
			} else if (x % 2 == 0 && x < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (x % 2 == 0 && x > 0) {
				System.out.println("ODD POSITIVE");
			} else {
				System.out.println("ODD NEGATIVE");
			}

			dados.close();
		}
	}
}
