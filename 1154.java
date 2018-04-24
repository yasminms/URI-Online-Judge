import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i, soma = 0, cont = 0;
		double media;
		do {
			i = sc.nextDouble();
			if (i > 0) {
				soma = soma + i;
				cont++;
			}
		} while (i > 0);
		media = soma /cont;
		System.out.printf("%.2f%n", media);
	}
}