import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
		double media;
		n = teclado.nextInt();
		for (i = 0; i < n; i++) {
			double v1 = teclado.nextDouble();
			double v2 = teclado.nextDouble();
			double v3 = teclado.nextDouble();
			media = ((v1 * 2.0) + (v2 * 3.0) + (v3 * 5.0)) / 10.0;
			System.out.printf("%.1f%n", media);
		}
	}
}