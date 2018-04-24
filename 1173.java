import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		n = teclado.nextInt();
		int x [] = new int [10];
		int i;
		x[0] = n;
		System.out.printf("N[0] = %d%n", x[0]);
		for(i=1;i<10;i++) {
			if (x[i] == 0 || x[i] < 0) {
				x[i] = x[i-1]*2;
				System.out.printf("N[%d] = %d%n", i, x[i]);
			}
		}
	}
}