package uri;

import java.util.Scanner;

public class Uri1042 {
	
	public static void main (String[]args) {
		
		Scanner dados= new Scanner(System.in);
		
		int a =dados.nextInt();
		int b=dados.nextInt();
		int c=dados.nextInt();
		
		int maior,medio,menor;
		
		maior=Math.min(a, b);
		maior=Math.min(maior, c);
		
		
		medio=Math.max(maior, c);
		
		
		menor=Math.min(a, b);
		menor=Math.min(menor, c);
		
		
		System.out.println(maior);
		System.out.println(menor);
		System.out.println(medio);
		
		dados.close();
		
		
	}

}
