import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.printf("%d%n", x+2);
		} else {
			System.out.printf("%d%n", x+1);
		}
	}
}
