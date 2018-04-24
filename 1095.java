import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = -2, j;
		for (j = 60; j >= 0; j=j-5) {
			i = i + 3;
			System.out.printf("I=%d J=%d%n", i, j);
		}
	}
}