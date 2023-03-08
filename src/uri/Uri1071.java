package uri;

import java.util.Scanner;

public class Uri1071 {

	public static void main (String[]args) {
		Scanner dados = new Scanner (System.in);
		
		int x= dados.nextInt();
		int y= dados.nextInt();
		
		int min,max;
		
		if(x < y) {
			min=x;
			max=y;
		}else {
			min=y;
			max=x;
		}
		
		int soma=0;
		
		for(int i=min+1; i<max; i++) {
			if( i %2 !=0) {
				soma = soma + 1;
			}
		}
		
		System.out.println(soma);
		
		
		dados.close();
	}
}
