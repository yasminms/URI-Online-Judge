import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, prod;
		a = teclado.nextInt();
		b = teclado.nextInt();
		prod = a * b;
		System.out.printf("PROD = %d%n",prod);
	}
}
