
package uri;

import java.util.Scanner;

public class Uri1078 {
public static void main (String[]args) {
	Scanner dados= new Scanner(System.in);
	
	int N = dados.nextInt();
	
	
	
	for(int i=0; i<=10; i ++) {
		int multi=i*N;
		System.out.println(i + "x" + N +"=" + multi);
	}
	
	
	dados.close();
	
}
}
