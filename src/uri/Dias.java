package uri;

import java.util.Locale;
import java.util.Scanner;

public class Dias {
public static void main (String[]args) {
	
	Locale.setDefault(Locale.US);
	Scanner dados = new Scanner(System.in);
	
	int Idade,Anos,mes,Dia,resto;
	
	Idade=dados.nextInt();
	

	Anos=Idade/365;
	resto=Idade % 365;
	mes=resto/30;
	Dia=resto % 30;
	 

	
	
	System.out.println(Anos + "ano(s)");
	System.out.println(mes + "mes(es)");
	System.out.println(Dia + "dia(s");
	
	dados.close();
	
	
}
}
