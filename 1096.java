import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1, j;
		do {
			for (j = 7; j >= 5; j--) {
				System.out.printf("I=%d J=%d%n", i, j);
			}
			i = i + 2;
		} while (i <= 9); 
	}
}