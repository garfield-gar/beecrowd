package uri;
import java.util.Scanner;

public class Uri1153 {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();

		int valor = 1;

		for (int i = 1;i <=N; i++) {

		valor=valor *i;

		}
		System.out.println(valor);
		dados.close();

	}
}
