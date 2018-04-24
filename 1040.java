import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double n1, n2, n3, n4, media, exame;
		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		n3 = teclado.nextDouble();
		n4 = teclado.nextDouble();
		media = (n1*2 + n2*3 + n3*4 + n4*1)/10.0;
		System.out.println("Media: " + df.format(media));
		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else {
			if (media < 5) {
				System.out.println("Aluno reprovado.");
			} else {
				if (media >= 5 && media <= 6.9) {
					System.out.println("Aluno em exame.");
					exame = teclado.nextDouble();
					System.out.println("Nota do exame: " + df.format(exame));
					media = (media + exame)/2.0;
					if (media >= 5) {
						System.out.println("Aluno aprovado.");
					} else {
						if (media <= 4.9) {
							System.out.println("Aluno reprovado.");
						}
					}
					System.out.println("Media final: " + df.format(media));
				}
			}
		}
	}
}