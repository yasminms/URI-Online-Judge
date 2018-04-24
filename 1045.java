import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double vet[] = new double[3];
		double maior, a, b, c;
		vet[0] = teclado.nextDouble();
		vet[1] = teclado.nextDouble();
		vet[2] = teclado.nextDouble();
		Arrays.sort(vet);

		a = vet[2];
		b = vet[1];
		c = vet[0];

		if (a >= (b + c)) {
			System.out.printf("NAO FORMA TRIANGULO%n");
		} else {
			if ((a * a) == (b * b) + (c * c)) {
				System.out.printf("TRIANGULO RETANGULO%n");
			}
			if ((a * a) > (b * b) + (c * c)) {
				System.out.printf("TRIANGULO OBTUSANGULO%n");
			}
			if ((a * a) < (b * b) + (c * c)) {
				System.out.printf("TRIANGULO ACUTANGULO%n");
			}
			if (a == b && a == c) {
				System.out.printf("TRIANGULO EQUILATERO%n");
			}
			if (a == b && c != a || b == c && a != b || a == c && b != a) {
				System.out.printf("TRIANGULO ISOSCELES%n");
			}
		}
	}
}
