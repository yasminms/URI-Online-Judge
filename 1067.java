import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		int x, i;
		x = teclado.nextInt();
		for (i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d%n",i);
			}
			
		}
	}
}