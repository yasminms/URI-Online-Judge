import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		double[] valor = new double[6];
		int i, cont = 0;
		for (i = 0; i < 6; i++) {
			valor[i] = teclado.nextDouble();
			if (valor[i] > 0) {
				cont++;
			}
		}
		System.out.printf("%d valores positivos%n",cont);
	}
}