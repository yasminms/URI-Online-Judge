import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tempo, veloc;
		double litros;
		tempo = teclado.nextInt();
		veloc = teclado.nextInt();
		litros = tempo/12.0*veloc;
		System.out.printf("%.3f%n",litros);
	}
}