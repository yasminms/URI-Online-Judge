import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		String cidade;
		num = teclado.nextInt();
		if (num == 61) {
			cidade = "Brasilia";
			System.out.printf("%s%n",cidade);
		} else {
			if (num == 71) {
				cidade = "Salvador";
				System.out.printf("%s%n",cidade);
			} else {
				if (num == 11) {
					cidade = "Sao Paulo";
					System.out.printf("%s%n",cidade);
				} else {
					if (num == 21) {
						cidade = "Rio de Janeiro";
						System.out.printf("%s%n",cidade);
					} else {
						if (num == 32) {
							cidade = "Juiz de Fora";
							System.out.printf("%s%n",cidade);
						} else {
							if (num == 19) {
								cidade = "Campinas";
								System.out.printf("%s%n",cidade);
							} else {
								if (num == 27) {
									cidade = "Vitoria";
									System.out.printf("%s%n",cidade);
								} else {
									if (num == 31) {
										cidade = "Belo Horizonte";
										System.out.printf("%s%n",cidade);
									} else {
										cidade = "DDD nao cadastrado";
										System.out.printf("%s%n",cidade);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}