import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double x, y;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			if (y == 0) {
				System.out.printf("divisao impossivel%n");
			} else {
				double tot = x/y;
				System.out.printf("%.1f%n", tot);
			}
		}

	}
}
