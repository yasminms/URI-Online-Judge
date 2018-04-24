import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, quant;
		double valor, salario;
		num = teclado.nextInt();
		quant = teclado.nextInt();
		valor = teclado.nextDouble();
		salario = quant * valor;
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f%n",num,salario);
	}
}