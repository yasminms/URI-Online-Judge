import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x;
		n = sc.nextInt();
		int[] teste = new int[n];
		int[] soma = new int[n];
		for (x = 0; x < n; x++) {
			soma[x] = 0;
			teste[x] = sc.nextInt();
			for (int i = 1; i < teste[x]; i++) {
				if (teste[x] % i == 0) {
					soma[x] = soma[x] + i;
				}
			}
			
		}

		for (x = 0; x < n; x++) {
			if (soma[x] == teste[x]) {
				System.out.printf("%d eh perfeito%n", teste[x]);
			} else {
				System.out.printf("%d nao eh perfeito%n", teste[x]);
			}
		}
	}
}
