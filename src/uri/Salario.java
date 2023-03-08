package uri;

import java.util.Scanner;

public class Salario {
	public static void main (String[]args) {
		Scanner dados= new Scanner(System.in);
		
		int number,salary;
		double horas;
		
		number=dados.nextInt();
		salary=dados.nextInt();
		horas=dados.nextDouble();
		
		double money=salary*horas;
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n"  ,  money);
		dados.close();
}
}
