import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long m, n, mult1 = 1, mult2 = 1, soma;
			m = sc.nextLong();
			n = sc.nextLong();
			if (m == 0) {
				mult1 = 1;
			} else {
				for (int i = 2; i <= m; i++) {
					mult1 *= i;
				}
			}
			if (n == 0) {
				mult2 = 1;
			} else {
				for (int i = 2; i <= n; i++) {
					mult2 *= i;
				}
			}
			soma = mult1 + mult2;
			System.out.printf("%d%n", soma);
			soma = 0;
		}
	}
}