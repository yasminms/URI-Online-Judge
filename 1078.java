import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int n, i, valor;
		n = teclado.nextInt();

		for (i = 1; i <= 10; i++) {
			valor = i * n;
			System.out.printf("%d x %d = %d%n", i, n, valor);
		}
	}

}
