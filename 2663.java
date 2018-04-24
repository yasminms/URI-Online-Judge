import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, k;
		n = teclado.nextInt();
		k = teclado.nextInt();
		int cont = k;
		int[] c = new int[n];
		for (int x = 0; x < n; x++) {
			c[x] = teclado.nextInt();
		}
		Arrays.sort(c);
		int last = n - k - 1;
		while (last>=0 && c[n-k] == c[last]) {
			cont++;
			last--;
		}
		
		System.out.printf("%d%n", cont);
	}

}
