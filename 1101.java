import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int m, n, i, soma = 0;
		do {
			m = teclado.nextInt();
			n = teclado.nextInt();
			if (m > n && m != 0 && n != 0 && n > 0 && m > 0) {
				for (i = n; i <= m; i++) {
					System.out.printf("%d ",i);
					soma = soma + i;
				}
			System.out.printf("Sum=%d%n", soma);
			soma = 0;
			} else {
				if (m < n && m != 0 && n != 0 && n > 0 && m > 0) {
					for (i = m; i <= n; i++) {
						System.out.printf("%d ",i);
						soma = soma + i;
					}
				System.out.printf("Sum=%d%n", soma);
				soma = 0;
				} else {
					if (n == m && n != 0 && n > 0 && m > 0){
					System.out.printf("%d Sum=%d%n", m, m);
					}
				}
				
			}
		} while (m != 0 && n != 0 && n > 0 && m > 0);
	}
}