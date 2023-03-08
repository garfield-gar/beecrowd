package uri;

import java.util.Locale;
import java.util.Scanner;

public class Multi {
public static void main (String[]args){
	Locale.setDefault(Locale.US);
	Scanner dados = new Scanner(System.in);
	
	int A=dados.nextInt();
	int B=dados.nextInt();
	
	
	if(A%B ==0 || B % A ==0) {
		
		System.out.println("Sao multiplos");
	}else {
		System.out.println("Nao sao multiplos");
	}
	
	
	dados.close();
}
}
