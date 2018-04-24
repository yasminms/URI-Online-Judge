import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, maior;
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		maior = (a+b+Math.abs(a-b))/2;
		maior = (maior+c+Math.abs(maior-c))/2;
		System.out.printf("%d eh o maior%n", maior);
	}
}