import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x1, y1, x2, y2;
		x1 = teclado.nextDouble();
		y1 = teclado.nextDouble();
		x2 = teclado.nextDouble();
		y2 = teclado.nextDouble();
		System.out.printf("%.4f%n",Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1)));
	}
}
