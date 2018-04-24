import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double i = 0, j = 1, x;
		do {
			for (x = j; x <= (j+2); x++) {
				if (i == 0 || i>0.9 && i<1.1 || i>1.9 && i<2.1 || i>2.9 && i<3.1) {
					System.out.printf("I=%.0f J=%.0f%n", i, x);
				} else {
					System.out.printf("I=%.1f J=%.1f%n", i, x);
				}
			}
			i = i + 0.2;
			j = j + 0.2;
		} while (i <= 2); 
	}
}