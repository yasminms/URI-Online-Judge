import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N, i, X, cont = 0, cont2 = 0;
		N = teclado.nextInt();
		for (i = 0; i < N; i++) {
			X = teclado.nextInt();
			if (X >= 10 && X <= 20) {
				cont++;
			} else {
				cont2++;
			}
		}
		System.out.printf("%d in%n", cont);
		System.out.printf("%d out%n", cont2);
	}
}