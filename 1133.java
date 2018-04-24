import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, y, i, soma = 0;
		x = teclado.nextInt();
		y = teclado.nextInt();
		if (x > y) {
			for (i = y + 1; i < x; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.printf("%d%n", i);
				}
			}
		} else {
			if (x < y) {
				for (i = x + 1; i < y; i++) {
					if (i % 5 == 2 || i % 5 == 3) {
						System.out.printf("%d%n", i);
					}
				}
			}
		}
	}
}