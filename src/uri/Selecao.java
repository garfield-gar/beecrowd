package uri;

import java.util.Locale;
import java.util.Scanner;

public class Selecao {

	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados=new Scanner(System.in);
		
		int soma=0,soma1=0,divi=0;
		
		int A=dados.nextInt();
		int B=dados.nextInt();
		int C=dados.nextInt();
		int D=dados.nextInt();
		
			soma=C +D;
			soma1= A+B;
		
		
			
			if(C>D) {
				
			}if(B>A) {
				
			}if(soma>soma1) {
				
			}if(C<0 && D<0 ) {
				divi=A/2;
				
				System.out.println("Valores aceitos");
			}else {
				System.out.println("Valores nao aceitos");
			}
	
		dados.close();
	}
}
