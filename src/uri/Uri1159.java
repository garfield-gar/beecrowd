package uri;

import java.util.Scanner;

public class Uri1159 {
	
	public static void main (String[]args) {
		
		Scanner dados = new Scanner(System.in);
		
		
		int x= dados.nextInt();
		int par;
		
		while(x!=0) {
			if(x%2 !=0) {
				x=x+1;
			}
			
			par=x+x+2+x+4+x+6+x+8;
			System.out.println(par);
			x=dados.nextInt();
		}
		
		dados.close();
	}
}
