import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int distancia, X = 60, Y = 90, total;
		distancia = teclado.nextInt();
		total = distancia*2;
		System.out.printf("%d minutos%n",total);
	}
}