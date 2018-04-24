import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, soma = 0, i;
		a = teclado.nextInt();
		b = teclado.nextInt();
		if (a > b) {
			for (i = b; i <= a; i++) {
				if (i % 13 != 0) {
					soma = soma + i;
				}
			}
		} else {
			if (a < b) {
				for (i = a; i <= b; i++) {
					if (i % 13 != 0) {
						soma = soma + i;
					}
				}
			} else {
				soma = 0;
			}
		}
		System.out.printf("%d%n", soma);
	}
}