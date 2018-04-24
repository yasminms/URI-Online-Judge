import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		double A, B, C, r1, r2;
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		if ((B*B-4.0*A*C) < 0 || A == 0) {
			System.out.println("Impossivel calcular");
		} else {
			r1 = (- (B) + Math.sqrt(B*B-4.0*A*C))/(2*A);
			r2 = (- (B) - Math.sqrt(B*B-4.0*A*C))/(2*A);
			System.out.printf("R1 = %.5f\nR2 = %.5f%n",r1,r2);
		}
	}
}