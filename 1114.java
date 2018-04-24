import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		int senha;
		boolean senha2 = false;
		do {
			senha = teclado.nextInt();
			if (senha != 2002) {
				System.out.printf("Senha Invalida%n");
				senha2 = false;
			} else {
				senha2 = true;
			}
		} while (senha2 == false);
		System.out.printf("Acesso Permitido%n");
	}
	
}