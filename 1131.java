import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int goli, golg, nov, cont = 0, conti = 0, contg = 0, conte = 0;
		do {
			goli = teclado.nextInt();
			golg = teclado.nextInt();
			if (goli > golg) {
				conti++;
			} else {
				if (golg > goli) {
					contg++;
				} else {
					conte++;
				}
			}
			System.out.printf("Novo grenal (1-sim 2-nao)%n");
			nov = teclado.nextInt();
			cont++;
		} while (nov == 1);
		System.out.printf("%d grenais%n", cont);
		System.out.printf("Inter:%d%n", conti);
		System.out.printf("Gremio:%d%n", contg);
		System.out.printf("Empates:%d%n", conte);
		if (conti > contg && conti > conte) {
			System.out.printf("Inter venceu mais%n");
		} else {
			if (contg > conti && contg > conte) {
				System.out.printf("Gremio venceu mais%n");
			} else {
				System.out.printf("Nao houve vencedor%n");
			}
		}
	}
}