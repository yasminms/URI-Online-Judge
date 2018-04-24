import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double vet[] = new double[3];
		double a, b, c, area, p;
		vet[0] = teclado.nextDouble();
		vet[1] = teclado.nextDouble();
		vet[2] = teclado.nextDouble();
		Arrays.sort(vet);

		a = vet[2];
		b = vet[1];
		c = vet[0];

		if (a >= (b + c)) {
			area = (a + b) * c / 2;
			System.out.printf("Area = %.1f%n", area);
		} else {
			p = a + b + c;
			System.out.printf("Perimetro = %.1f%n", p);
		}
	}
}