import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		int[] valor = new int[5];
		int i, contpositivo = 0, contpar = 0, contimpar = 0, contnegativo = 0;
		double soma = 0, media;
		for (i = 0; i < 5; i++) {
			valor[i] = teclado.nextInt();
			if (valor[i] > 0) {
				contpositivo++;
			} else {
				if (valor[i] < 0) {
					contnegativo++;
				}
			}
			if (valor[i] % 2 == 0) {
				contpar++;
			} else {
				if (valor[i] % 2 != 0) {
					contimpar++;
				}
			}
		}
		System.out.printf("%d valor(es) par(es)%n",contpar);
		System.out.printf("%d valor(es) impar(es)%n",contimpar);
		System.out.printf("%d valor(es) positivo(s)%n",contpositivo);
		System.out.printf("%d valor(es) negativo(s)%n",contnegativo);

	}
}