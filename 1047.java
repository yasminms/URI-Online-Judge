import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hi, hf, mi, mf, totalmi, totalmf, totalh, totalm;
		hi = teclado.nextInt();
		mi = teclado.nextInt();
		hf = teclado.nextInt();
		mf = teclado.nextInt();
		totalmi = (hi * 60) + mi;
		totalmf = (hf * 60) + mf;

		if (totalmi > totalmf) {
			totalh = (24 * 60) - totalmi + totalmf;
			if (totalh > 60) {
				totalh = totalh / 60;
				if (mi > mf) {
					totalm = 60 + mf - mi;
					System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totalh, totalm);
				} else {
					if (mf > mi) {
						totalm = mf - mi;
						System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totalh, totalm);
					} else {
						totalm = 0;
						System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totalh, totalm);
					}
				}

			} else {
				if (totalh != 0) {
					System.out.printf("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)%n", totalh);
				}
			}
		} else {
			totalh = totalmf - totalmi;
			if (totalh > 60) {
				totalh = totalh / 60;
				totalm = totalh % 60;
				if (mi > mf) {
					totalm = 60 + mf - mi;
					System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totalh, totalm);
				} else {
					if (mf > mi) {
						totalm = mf - mi;
						System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totalh, totalm);
					} else {
						totalm = 0;
						System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totalh, totalm);
					}
				}
			} else {
				if (totalh != 0 && totalh < 60) {
					System.out.printf("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)%n", totalh);
				} else {
					if (totalh != 0 && totalh == 60) {
						totalh = 1;
						System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTO(S)%n", totalh);
					} else {
					totalh = 24;
					System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTO(S)%n", totalh);
					}
				}
			}
		}
	}
}