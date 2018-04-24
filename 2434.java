import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, s;
		n = sc.nextInt();
		s = sc.nextInt();
		int menor = s;
		int soma = s;
		int [] v = new int [n];
		for (int x = 0; x < n; x++) {
			v[x] = sc.nextInt();
			soma = soma + v[x];
			if (soma < menor) {
				menor = soma;
			}
		}
		System.out.printf("%d%n", menor);
	}
}