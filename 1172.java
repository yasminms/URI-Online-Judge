import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x [] = new int [10];
		int i;
		for (i = 0; i < 10; i++) {
			x[i] = teclado.nextInt();
			if (x[i] == 0 || x[i] < 0) {
				x[i] = 1;
				System.out.printf("X[%d] = %d%n",i, x[i]);
			} else {
				System.out.printf("X[%d] = %d%n",i, x[i]);
			}
		}
	}
} 