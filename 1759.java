import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int x, i = 1;
		x = teclado.nextInt();
		while (i < x) {
			i++;
			System.out.printf("Ho ");
		}
		System.out.printf("Ho!%n");
	}

}
