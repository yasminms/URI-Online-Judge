import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double n, reajuste, salario;
		n = teclado.nextDouble();
		if (n >= 0 && n <= 400.0) {
			reajuste = (n * 15) / 100;
			salario = n + reajuste;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.printf("Em percentual: 15 %%%n");
		} else {
			if (n >= 400.01 && n <= 800.0) {
				reajuste = (n * 12) / 100;
				salario = n + reajuste;
				System.out.printf("Novo salario: %.2f%n", salario);
				System.out.printf("Reajuste ganho: %.2f%n", reajuste);
				System.out.printf("Em percentual: 12 %%%n");
			} else {
				if (n >= 800.01 && n <= 1200.0) {
					reajuste = (n * 10) / 100;
					salario = n + reajuste;
					System.out.printf("Novo salario: %.2f%n", salario);
					System.out.printf("Reajuste ganho: %.2f%n", reajuste);
					System.out.printf("Em percentual: 10 %%%n");
				} else {
					if (n >= 1200.01 && n <= 2000.0) {
						reajuste = (n * 7) / 100;
						salario = n + reajuste;
						System.out.printf("Novo salario: %.2f%n", salario);
						System.out.printf("Reajuste ganho: %.2f%n", reajuste);
						System.out.printf("Em percentual: 7 %%%n");
					} else {
						if (n > 2000) {
							reajuste = (n * 4) / 100;
							salario = n + reajuste;
							System.out.printf("Novo salario: %.2f%n", salario);
							System.out.printf("Reajuste ganho: %.2f%n",
									reajuste);
							System.out.printf("Em percentual: 4 %%%n");
						}
					}
				}
			}
		}
	}
}