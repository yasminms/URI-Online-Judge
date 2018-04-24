import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x, y;
		do {
			x = teclado.nextDouble();
			y = teclado.nextDouble();
			if (x != 0 && y != 0) {
				if (x > 0 && y > 0) {
					System.out.printf("primeiro%n");
				} else {
					if (x < 0 && y > 0) {
						System.out.printf("segundo%n");
					}
					if (x < 0 && y < 0) {
						System.out.printf("terceiro%n");
					} else {
						if (x > 0 && y < 0) {
							System.out.printf("quarto%n");
						}
					}
				}
			}
		} while (x != 0 || y != 0);
	}
}