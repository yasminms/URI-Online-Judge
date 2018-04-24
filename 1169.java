import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, x, y;
		long z;
		x = sc.nextInt();
		if (1 <= x && 1 <= 100) {
			for (i = 0; i < x; i++) {
				y = sc.nextInt();
				if (1 <= y && y <= 64) {
					z = (long) (Math.pow(2, y) / 12000.00);
					System.out.printf("%d kg%n", z);

				}
			}
		}

	}
}
