package uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1094 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();

		int sapo = 0, rato = 0, coelho = 0;

		for (int i = 0; i < N; i++) {
			int x = dados.nextInt();

			char tipos = dados.next().charAt(0);

			if (tipos == 'C') {
				coelho = coelho + x;
			} else if (tipos == 'R') {
				rato = rato + x;
			} else {
				sapo = sapo + x;
			}

		}
		int total = 0;
		total = sapo + coelho + rato;

		double porcetagemcoelhos = (double) (coelho / total) * 100.0;
		double porcetagemratos = (double) (rato / total) * 100.0;
		double porcetagemsapos = (double) (sapo / total) * 100.0;

		System.out.println("Total" + total + "cobaias ");
		System.out.println("Total de coelhos :" + coelho);
		System.out.println("Total de ratos :" + rato);
		System.out.println("Total de sapos :" + sapo);

		System.out.printf("Percentual de coelhos: %.2f %%%n", porcetagemcoelhos);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcetagemratos);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcetagemsapos);

		dados.close();

	}
}
