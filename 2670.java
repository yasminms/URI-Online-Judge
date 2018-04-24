import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1, a2, a3;
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		a3 = sc.nextInt();
		int maior = 10001;
		if (a2 * 2 + a3 * 4 < maior) {//andar 1
			maior = a2 * 2 + a3 * 4;
		}
		if (a1 * 2 + a3 * 2 < maior) {//andar 2
			maior = a1 * 2 + a3 * 2;
		}
		if (a1 * 4 + a2 * 2 < maior) {//andar 3
			maior = (a1 * 4) + (a2 * 2);
		}

		System.out.printf("%d%n", maior);
	}
}
