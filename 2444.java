import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v, t, f;
		v = sc.nextInt();
		t = sc.nextInt();
		f = v;
		int[] a = new int[t];
		for (int x = 0; x < t; x++) {
			a[x] = sc.nextInt();
			if (f + a[x] >= 0 && f + a[x] <= 100) {
				f = f + a[x];
			} else {
				if (f + a[x] > 100) {
					f = 100;
				} else {
					if (f + a[x] < 0) {
						f = 0;
					}
				}

			}
		}
		System.out.printf("%d%n", f);
	}
}
