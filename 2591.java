import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c, cont = 0, cont2 = 0;
		c = sc.nextInt();
		for (int x = 0; x < c; x++) {
			String poder = sc.next();
			String[] array = poder.split("k");
			for (int y = 0; y < array[0].length(); y++) {
				if (array[0].charAt(y) == 'a') {
					cont++;
				}
			}
			for (int z = 0; z < array[1].length(); z++) {
				if (array[1].charAt(z) == 'a') {
					cont2++;
				}
			}
			int t = cont * cont2;
			for (int i = 1; i <= t + 1; i++) {
				if (i == 1) {
					System.out.printf("k");
				} else {
					if (i == t + 1) {
						System.out.printf("a%n");
					} else {
						System.out.printf("a");
					}
				}
			}
			cont = 0;
			cont2 = 0;
		}
	}
}