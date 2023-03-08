package uri;

import java.util.Locale;
import java.util.Scanner;

public class Maior {
public static void main (String[]args) {
	Locale.setDefault(Locale.US);
	Scanner dados= new Scanner(System.in);
	
	int x, y, z, k, t;

	x = dados.nextInt();
	y = dados.nextInt();
	z = dados.nextInt();
	

	k = (x + y + Math.abs(x - y)) / 2;

	t = (k + z + Math.abs(k - z)) / 2;

	System.out.println(t + " eh o maior");
	
	dados.close();
}
}
