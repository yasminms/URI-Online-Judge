import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		double[] valor = new double[6];
		int i, cont = 0;
		double soma = 0, media;
		for (i = 0; i < 6; i++) {
			valor[i] = teclado.nextDouble();
			if (valor[i] > 0) {
				cont++;
				soma = soma + valor[i];
			}
		}
		media = soma/cont;
		System.out.printf("%d valores positivos%n",cont);
		System.out.printf("%.1f%n",media);
	}
}