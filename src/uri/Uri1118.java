package uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1118 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);

		int y;
		y= dados.nextInt();

		
		while (y!=4) {
			if(y==1) {
				System.out.println("Alcool:" + y);
			}else if(y==2) {
				System.out.println("Gasolina:" + y);
			}else if(y==3) {
				System.out.println("Diesel:" + y);
			}else if(y>4) {
				y=dados.nextInt();
			}
			y=dados.nextInt();
		}
		dados.close();
	}
}
