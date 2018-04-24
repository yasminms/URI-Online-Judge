import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, soma = 0, media;
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
			
		} while (n1 < 0 && n1 > 10 && n2 < 0 && n2 > 10);
		media = soma/2;
		System.out.printf("media = %.2f%n", media);
	}
}