import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		int x, i, y, soma = 0;
		x = teclado.nextInt();
		y = teclado.nextInt();
		if (x < y) {
			for (i = x + 1; i < y; i++) {
				if (i % 2 != 0) {
					soma = soma + i;
				}
			}
		} else {
			for (i = y + 1; i < x; i++) {
				if (i % 2 != 0) {
					soma = soma + i;
				}
			}
		}
		System.out.printf("%d%n",soma);
	}
}