package uri;

import java.util.Scanner;

public class Uri1130 {
public static void main(String[]args) {
	
	Scanner dados= new Scanner(System.in);
	
	int x= dados.nextInt();
	int y=dados.nextInt();
	
	while (x !=y ) {
		if(x>y) {
			System.out.println("Decrescente");
		}else {
			System.out.println("Crescente");
		}
		x=dados.nextInt();
		y=dados.nextInt();
	}
	dados.close();
}
}
