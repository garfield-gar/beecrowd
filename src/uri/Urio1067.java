package uri;

import java.util.Scanner;

public class Urio1067 {
	
	public static void main (String[]args) {
		
		Scanner dados=new Scanner(System.in);
		
			int x=dados.nextInt();
			
			for(int i=1; i<x;i++) {
				if(i%2 !=0) {
					System.out.println(i);
				}
			}
			dados.close();
	}
}