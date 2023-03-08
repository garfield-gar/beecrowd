package uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1118n {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);
		
		double x,y,media;
		int entrada;
		
		System.out.println("novo calculo (1-sim 2-nao)");
		entrada=dados.nextInt();
		System.out.println("entrada dados");
		
		
		
		
		
		while(entrada == 1) {
			
			x=dados.nextDouble();
			while(x<0 || x>10) {
				System.out.println("nota invalida");
				x=dados.nextDouble();
				
			}
			
			y=dados.nextDouble();
			
			while(y<0 || y>10) {
				System.out.println("nota invalida");
				y=dados.nextDouble();
			}
			
			media=(x+y)/2.0;
			System.out.printf("media= %.2f%n " ,media);
			entrada=dados.nextInt();
			System.out.println("novo calculo (1-sim 2-nao)");
			
			entrada = dados.nextInt();
			while (entrada != 1 && entrada != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				entrada = dados.nextInt();
			}
		};
		
		dados.close();

	}

}
