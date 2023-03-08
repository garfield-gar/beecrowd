package uri;

import java.util.Locale;
import java.util.Scanner;

public class Media3 {

	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner dados=new Scanner(System.in);
		
		float n1,n2,n3,n4,media;
		
		n1=dados.nextFloat();
		n2=dados.nextFloat();
		n3=dados.nextFloat();
		n4=dados.nextFloat();
		
		media=(n1*2f + n2*3f+ n3*4f + n4*1f ) /10f;
		
		if(media >=7f) {
			System.out.println("Aluno aprovado");
		}else if(media < 5f) {
			System.out.println("Aluno reprovado ");
		}else if (media >= 5f && media <=6f) {
			System.out.println("Aluno em exame");
			float r1;
			r1=dados.nextFloat();
			System.out.println("Nota do exame" + r1);
			media=(float) ((media +r1)/2f);
			System.out.printf("Media final %.1f%n", media);
						
		}

		dados.close();
	}
}
