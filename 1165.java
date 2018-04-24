import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x, cont = 0;
		n = sc.nextInt();
		boolean[] primo = new boolean[n];
		int[] teste = new int[n];
		for (x = 0; x < n; x++) {
			primo[x] = true;
			teste[x] = sc.nextInt();
			for (int i = 2; i <= teste[x]; i++) {
				if ( ( (teste[x] % i) == 0) && (i != teste[x]) ) {
					primo[x] = false;
				}
			}
		}
		for (x = 0; x < n; x++) {
			if (primo[x]) {
				System.out.printf("%d eh primo%n", teste[x]);
			} else {
				System.out.printf("%d nao eh primo%n", teste[x]);
			}
		}
	}
}
