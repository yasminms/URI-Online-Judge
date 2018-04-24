import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, x, y, i, soma = 0, z;
		n = teclado.nextInt();
		for (z = 0; z < n; z++) {
			x = teclado.nextInt();
			y = teclado.nextInt();
			if (x > y) {
				for (i = y + 1; i < x; i++) {
					if (i % 2 != 0) {
						soma = soma + i;
					}
				}
				System.out.printf("%d%n", soma);
				soma = 0;
			} else {
				if (x < y) {
					for (i = x + 1; i < y; i++) {
						if (i % 2 != 0) {
							soma = soma + i;
						}
					}
					System.out.printf("%d%n", soma);
					soma = 0;
				} else {
					soma = 0;
					System.out.printf("%d%n", soma);
				}
			}
		}
	}
}