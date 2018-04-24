import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vet[] = new int[100];
		int i, maior = -1, ind = -1;
		for (i = 0; i < 100; i++) {
			vet[i] = teclado.nextInt();
			if (vet[i] > maior) {
				maior = vet[i];
				ind = i + 1;
			}
		}
		System.out.printf("%d\n%d%n", maior, ind);
	}
}