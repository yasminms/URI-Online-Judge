import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 0, anos = 0, mes = 0, dias = 0;
		idade = teclado.nextInt();
		while (idade >= 365) {
			idade = idade - 365;
			anos++;
		}
		while (idade >= 30) {
			idade = idade - 30;
			mes++;
		}
		while (idade >= 1) {
			idade = idade - 1;
			dias++;
		}
		System.out.println(anos +" ano(s)\n" + mes + " mes(es)\n" + dias + " dia(s)");
	}
}