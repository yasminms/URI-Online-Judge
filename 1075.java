import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
		n = teclado.nextInt();
		for (i = 1; i <= 10000; i++) {
			if (i % n == 2) {
				System.out.printf("%d%n", i);
			}
		}
	}
}