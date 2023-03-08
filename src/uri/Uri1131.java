package uri;

import java.util.Scanner;

public class Uri1131 {

	public static void main (String[]args) {
		
		Scanner dados= new Scanner(System.in);
		
		int gremio = 0, Inter=0;
		int grenal=1;
		int cont=0;
		int vencedor=0,vencer=0,empate=0;
		
		
			
		System.out.println("Novo grenal(1-sim 2-nao)");
		grenal=dados.nextInt();
		
		
		while(grenal==1) {
			
			gremio=dados.nextInt();
			Inter=dados.nextInt();
			
			
			if(gremio>Inter) {
				vencedor=vencedor+1;
			}else if(Inter>gremio){
				vencer=vencer+1;
			}
			else {
				empate=empate+1;
			}
			System.out.println("novo calculo (1-sim 2-nao)");
			grenal = dados.nextInt();	
			
		}
		int total = vencedor+vencer+empate;
		System.out.println(total + " grenais");
		System.out.println("Inter:" + vencer );
		System.out.println("Gremio: " +vencedor);
		System.out.println("Empate:" + empate);
		
		
		if(vencedor>vencer) {
			System.out.println("Gremio venceu mais");
		}else if(vencer>vencedor) {
			System.out.println("Inter venceu mais");
		}else {
			System.out.println("Não houve vencedor");
		}
		dados.close();
	}
	}