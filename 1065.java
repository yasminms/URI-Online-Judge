import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		int[] valor = new int[5];
		int i, cont = 0;
		double soma = 0, media;
		for (i = 0; i < 5; i++) {
			valor[i] = teclado.nextInt();
			if (valor[i] % 2 == 0) {
				cont++;
			}
		}
		System.out.printf("%d valores pares%n",cont);
	}
}