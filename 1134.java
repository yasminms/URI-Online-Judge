import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, contal = 0, contga = 0, contdi = 0;
		do {
			num = teclado.nextInt();
			if (num < 1 && num > 4) {
				while (num < 1 && num > 4) {
					num = teclado.nextInt();
				}
			} if (num == 1) {
				contal++;
			} else {
				if (num == 2) {
					contga++;
				} else {
					if (num == 3) {
						contdi++;
					}
				}
			}
		} while (num != 4);
		System.out.printf("MUITO OBRIGADO%n");
		System.out.printf("Alcool: %d%n", contal);
		System.out.printf("Gasolina: %d%n", contga);
		System.out.printf("Diesel: %d%n", contdi);
	}
}