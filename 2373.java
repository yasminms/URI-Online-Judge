import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int soma = 0;
		int[] l = new int[n];
		int[] c = new int[n];
		for (int x = 0; x < n; x++) {
			l[x] = sc.nextInt();
			c[x] = sc.nextInt();
			if (l[x] > c[x]) {
				soma = soma + c[x];
			}

		}
		System.out.printf("%d%n", soma);
	}
}
