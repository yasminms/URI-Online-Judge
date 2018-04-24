import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, n0 = 0, n1 = 1;
		n = teclado.nextInt();
		System.out.printf("0 1");
		while (n > 2) {
			n1 = n1 + n0;
			n0 = n1 - n0;
			System.out.printf(" %d", n1);
			n--;
		}
		System.out.printf("%n");
	}
}