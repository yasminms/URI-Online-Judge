import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,  cont = 0, x = 0;
		n = sc.nextInt();
		double[] teste = new double[n];
		double[] tot = new double[n];
		while (x < n) {
			teste[x] = sc.nextDouble();
			tot[x] = teste[x];
			cont = 0;
			while (tot[x] > 1) {
				tot[x] = tot[x]/2;
				cont++;
			}
			System.out.printf("%d dias%n", cont);
		x++;
		}
	}
}