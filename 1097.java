import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1, j = 7, x;
		do {
			for (x = j; x <= (j+2); j--) {
				System.out.printf("I=%d J=%d%n", i, j);
			}
			i = i + 2;
			j = j+5;
		} while (j <= 15); 
	}
}