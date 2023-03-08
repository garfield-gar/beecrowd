package uri;

import java.util.Scanner;

public class Uri1154 {

	public static void main (String[]args) {
		
		Scanner dados= new Scanner(System.in);
		
		int cont=0;
		int idade;
		double media;
		int soma=0;
		
		idade=dados.nextInt();
		
		while(idade >=0 ) {
			soma=soma+idade;
			cont=cont+1;
			idade=dados.nextInt();			
		
		}
		media=soma/cont;
		
		System.out.printf("%.3f%n", media);
		dados.close();
	}
	
}
