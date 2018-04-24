import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cod, quant;
		double valor = 0;
		cod = teclado.nextInt();
		quant = teclado.nextInt();
		if (cod == 1) {
			valor = 4;
			valor = quant * valor;
		} else {
			if (cod == 2) {
				valor = 4.50;
				valor = quant * valor;
			} else {
				if (cod == 3) {
					valor = 5;
					valor = quant * valor;
				} else {
					if (cod == 4) {
						valor = 2;
						valor = quant * valor;
					} else {
						if (cod == 5) {
							valor = 1.50;
							valor = quant * valor;
						}
					}
				}
			}
		}
		System.out.printf("Total: R$ %.2f%n",valor);
	}
}