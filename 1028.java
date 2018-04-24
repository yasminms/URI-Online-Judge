import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, f1, f2;
		n = sc.nextInt();
		for (int x = 0; x < n; x++) {
			f1 = sc.nextInt();
			f2 = sc.nextInt();
			if (f1 < f2) {
				int aux2 = f2;
				f2 = f1;
				f1 = aux2;

				}
			while (f1%f2!=0) {
				int aux = f1%f2;
				f1 = f2;
				f2 = aux;
			}
			System.out.printf("%d%n", f2);
		}
	}
}