package uri;

import java.util.Locale;

import java.util.Scanner;

public class SalarioBonus {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados= new Scanner(System.in);
		
		String nome;
		double salary,comicao;
		
		nome=dados.next();
		salary=dados.nextDouble();
		comicao=dados.nextDouble();
		
	
		double Total=(comicao*0.15)+salary;
		
		
		System.out.printf("SALARY = R$ %.3f" , Total);
		dados.close();
}
}
