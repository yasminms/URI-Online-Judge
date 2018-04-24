import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		double salario, vendas, total;
		nome = teclado.next();
		salario = teclado.nextDouble();
		vendas = teclado.nextDouble();
		total = salario + (vendas * 15)/100;
		System.out.printf("TOTAL = R$ %.2f%n",total);
	}
}
