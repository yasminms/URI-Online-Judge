import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N, X, i;
		N = teclado.nextInt();
		for (i = 0; i < N; i++) {
			X = teclado.nextInt();
			if (X % 2 == 0 && X != 0) {
				System.out.printf("EVEN ");
			} else {
				if (X % 2 != 0 && X != 0)
				System.out.printf("ODD ");
			}
			if (X > 0) {
				System.out.printf("POSITIVE%n");
			} else {
				if (X < 0) {
					System.out.printf("NEGATIVE%n");
				} else {
					System.out.printf("NULL%n");
				}
			}
		}
	}
}