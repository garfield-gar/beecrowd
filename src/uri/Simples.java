package uri;

import java.util.Scanner;

public class Simples {
	public static void main (String[]args) {
		Scanner dados= new Scanner(System.in);
		
		
		int codigo=0,cod2=0,qtd,qtd2;
		double preco1, preco2,valor;
		
		
		codigo=dados.nextInt();
		qtd=dados.nextInt();
		preco1=dados.nextDouble();
		
		cod2=dados.nextInt();
		qtd2=dados.nextInt();
		preco2=dados.nextDouble();
		
		valor= (qtd *preco1) + (qtd2*preco2) ;
	
		System.out.printf("VALOR A PAGAR: %.2f%n" ,valor);
	
		dados.close();
		
}
}
