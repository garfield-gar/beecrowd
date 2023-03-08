package uri;



import java.util.Locale;
import java.util.Scanner;

public class SalarioAumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto,reajuste;
		if (salario <= 400.00) {
			imposto = salario *0.15;
			reajuste=salario+imposto;
			System.out.printf("Novo salario: %.2f%n" , reajuste);
			System.out.printf("reajuste ganho %.2f%n", imposto);
			System.out.println("Em percentual 15%");
			
		}
		else if (salario >= 400.01 && salario <= 800.00) {
			imposto = salario  * 0.12;
			reajuste=salario-imposto;
			System.out.printf("Novo salario: %.2f%n" , reajuste);
			System.out.printf("reajuste ganho %.2f%n", imposto);
			System.out.println("Em percentual 12%");
		}
		else if (salario >= 800.01 && salario <= 1200.00) {
			imposto = salario * 0.10 ;
			reajuste=salario+imposto;
			System.out.printf("Novo salario: %.2f%n" , reajuste);
			System.out.printf("reajuste ganho %.2f%n", imposto);
			System.out.println("Em percentual 10%");
		}
		else if (salario >= 1200.01 && salario <= 2000.01) {
			imposto = salario * 0.07 ;
			reajuste=salario+imposto;
			System.out.printf("Novo salario: %.2f%n" , reajuste);
			System.out.printf("reajuste ganho %.2f%n", imposto);
			System.out.println("Em percentual 7%");
		}
		else if (salario >= 2000.00) {
			imposto = salario * 0.04 ;
			reajuste=salario-+imposto;
			System.out.printf("Novo salario: %.2f%n" , reajuste);
			System.out.printf("reajuste ganho %.2f%n", imposto);
			System.out.println("Em percentual 4%");
		}
		
	
		
		sc.close();
	}
}