import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
		n = teclado.nextInt();
		for (i = 1; i <= n; i++) {
			System.out.printf("%d %d %d%n", i, (i*i), (i*i*i) );
			System.out.printf("%d %d %d%n", i, (i*i+1), (i*i*i+1));
		}
	}
}