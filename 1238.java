import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String a, b, comb = "";
		int num = teclado.nextInt();
		while (num > 0) {
			a = teclado.next();
			b = teclado.next();
			int tam = a.length() + b.length();
			for (int i = 0; i < tam; i++) {
				if (i < a.length()) {
					comb += a.charAt(i);
				}
				if (i < b.length()) {
					comb += b.charAt(i);
				}
			}
			System.out.println(comb);
			comb = "";
			num--;
		}
	}
}