import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i, f, total = 0;
		i = teclado.nextInt();
		f = teclado.nextInt();

		if (i > f || i == f) {
			total = 24 - i + f;
		} else {
			if (f > i) {
				total = f - i;
			}
		}
		System.out.printf("O JOGO DUROU %d HORA(S)%n", total);
	}
}