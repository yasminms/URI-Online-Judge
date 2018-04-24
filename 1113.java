import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, y;
		do {
			x = teclado.nextInt();
			y = teclado.nextInt();
			if (x > y) {
				System.out.printf("Decrescente%n");
			} else {
				if (x < y) {
					System.out.printf("Crescente%n");
				}
			}
		}while(x != y);
	}
}