import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, soma = 0, media;
		int nov;
		do {
			n1 = teclado.nextDouble();
			if (n1 < 0 || n1 > 10) {
				while (n1 < 0 || n1 > 10) {
					System.out.printf("nota invalida%n");
					n1 = teclado.nextDouble();
					if (n1 >= 0 && n1 <= 10) {
						soma = soma + n1;
					}
				}
			} else {
				soma = soma + n1;
			} 
			n2 = teclado.nextDouble();
			if (n2 < 0 || n2 > 10) {
				while (n2 < 0 || n2 > 10) {
					System.out.printf("nota invalida%n");
					n2 = teclado.nextDouble();
					if (n2 >= 0 && n2 <= 10) {
						soma = soma + n2;
					}
				}
			} else {
				soma = soma + n2;
			}
			if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10) {
				media = soma/2;
				System.out.printf("media = %.2f%n", media);
				soma = 0;
			}
			System.out.printf("novo calculo (1-sim 2-nao)%n");
			nov = teclado.nextInt();	
			if (nov != 1 || nov != 2) {
				while (nov > 2 || nov < 1) {
					System.out.printf("novo calculo (1-sim 2-nao)%n");
					nov = teclado.nextInt();
				}
			}
		} while (nov == 1);
	}
}