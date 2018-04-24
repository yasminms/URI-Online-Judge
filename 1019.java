import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = 0, horas = 0, minutos = 0;
		N = teclado.nextInt();
		while (N >= 3600) {
			N = N - 3600;
			horas++;
		}
		while (N >= 60) {
			N = N - 60;
			minutos++;
		}
		System.out.println(horas+":"+minutos+":"+N);
	}
}