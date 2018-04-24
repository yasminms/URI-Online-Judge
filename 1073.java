import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		int n, i, quadrado;
		n = teclado.nextInt();
		for (i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				quadrado = i * i;
				System.out.printf(i + "^2 = %d%n",quadrado);
			}
		}
	}
}