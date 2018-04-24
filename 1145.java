import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long x, i, y;
		x = teclado.nextLong();
		y = teclado.nextLong();
		for (i = 1; i <= y; i++) {
			if (i % x == 0 || i == y) {
				System.out.printf("%d", i);
				System.out.printf("%n");

			} else {
				System.out.printf("%d ", i);
			}
		}
	}
}