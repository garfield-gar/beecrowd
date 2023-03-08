package uri;

import java.util.Scanner;

public class Uri1115 {
public static void main (String[]args) {
	Scanner dados = new Scanner(System.in);
	
	int x= dados.nextInt();
	int y= dados.nextInt();
	
	while(x != 0 && y !=0) {
	 if (x > 0 && y >0) {
		System.out.println("primeiro");
	}else if(x<0 && y >0) {
		System.out.println("segundo");
		}else if(x <0 && y<0) {
			System.out.println("terceiro");
		}else {
			System.out.println("quarto");
		}
	 
	 x=dados.nextInt();
	 y=dados.nextInt();		
	
}
	dados.close();
}
}
