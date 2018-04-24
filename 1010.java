import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cod1, num1, cod2, num2;
		double valor1, valor2, total;
		cod1 = teclado.nextInt();
		num1 = teclado.nextInt();
		valor1 = teclado.nextDouble();
		cod2 = teclado.nextInt();
		num2 = teclado.nextInt();
		valor2 = teclado.nextDouble();
		total = (num1 * valor1) + (num2 * valor2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
	}
}