import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X;
		double Y, consumo;
		X = teclado.nextInt();
		Y = teclado.nextDouble();
		consumo = X/Y;
		System.out.printf("%.3f km/l%n",consumo);
	}
}
