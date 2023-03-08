package uri;

import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
	
		int N = dados.nextInt();
		
		int in = 0;
		int out = 0;
	

		for (int i = 0; i < N; i++) {
			int x = dados.nextInt();

			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else  {
				out = out + 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");

		dados.close();
	}

}
