package uri;

import java.util.Scanner;

public class Uri1114 {
	
	public static void main (String[]args) {
		Scanner dados=new Scanner(System.in);
		
		
		int x;
		x=dados.nextInt();
		
		while(x != 2002) {
			System.out.println("Senha Invalida");
			x=dados.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
			dados.close();	
	}

}
