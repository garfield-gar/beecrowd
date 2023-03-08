package uri;

import java.util.Scanner;

public class Uri1116 {
public static void main (String[]args) {
	
	Scanner dados= new Scanner (System.in);

	double x= dados.nextDouble();
	int cont=0;
	double media;
	
	while(cont==2) {
		cont= cont + 1;
		if(x>=0 && x<=10) {
			media= x/cont;
			System.out.println("meida = " +media);
		}else {
			System.out.println("nota invalida");
		}
	}
	dados.close();
}
}
