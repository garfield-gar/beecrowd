package uri;

import java.util.Scanner;

public class EXnelio {

	public static void main (String[]args) {
		
		Scanner dados=new Scanner(System.in);
		
		int x=dados.nextInt();
		int cont=0;
		int soma=0;
		
	
		while(x >=0) {
			soma= soma +x;
			cont= cont + 1;
			x=dados.nextInt();
		}
		
		if(cont >0) {
			double media =(double) soma /cont;
			System.out.printf("%.2f%n", media);
		}else {
			System.out.println("impossivel calcular");
		}
		dados.close();
	}
}
