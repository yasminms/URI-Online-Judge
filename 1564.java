import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				System.out.printf("vai ter copa!%n");
			} else {
				System.out.printf("vai ter duas!%n");
			}
		}
	}
}
