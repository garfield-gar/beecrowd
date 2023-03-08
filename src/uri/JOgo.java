package uri;

import java.util.Scanner;

public class JOgo {
	
	public static void main (String[]args) {
		Scanner dados= new Scanner(System.in);
		
		int fim= dados.nextInt();
		int inicio=dados.nextInt();
		int duracao;
		
		if(fim < inicio) {
			duracao=fim-inicio;
		}else {
			duracao=24-fim+inicio;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		dados.close();
	}

}
