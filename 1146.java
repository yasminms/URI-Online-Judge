import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, i;
		String concat;
		String msg = "1";
		do {
			x = teclado.nextInt();
			if (x != 0 && x >= 1) {
				for (i = 2; i <= x; i++) {
					concat = " " + i;
					msg += concat;
				}
				System.out.printf("%s%n", msg);
				msg = "1";
			}
		} while (x != 0);
	}
}