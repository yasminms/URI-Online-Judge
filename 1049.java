import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String a1, a2, a3, animal;
		a1 = teclado.next();
		a2 = teclado.next();
		a3 = teclado.next();
		if (a1.equalsIgnoreCase("Vertebrado")) {
			if (a2.equalsIgnoreCase("Ave")) {
				if (a3.equalsIgnoreCase("Carnivoro")) {
					animal = "aguia";
					System.out.printf("%s%n",animal);
				} else {
					if (a3.equalsIgnoreCase("onivoro")) {
						animal = "pomba";
						System.out.printf("%s%n",animal);
					}
				}
			} else {
				if (a2.equalsIgnoreCase("mamifero")) {
					if (a3.equalsIgnoreCase("onivoro")) {
						animal = "homem";
						System.out.printf("%s%n",animal);
					} else {
						if (a3.equalsIgnoreCase("herbivoro")) {
							animal = "vaca";
							System.out.printf("%s%n",animal);
						}
					}
				}
			}
		} else {
			if (a1.equalsIgnoreCase("invertebrado")) {
				if (a2.equalsIgnoreCase("inseto")) {
					if (a3.equalsIgnoreCase("hematofago")) {
						animal = "pulga";
						System.out.printf("%s%n",animal);
					} else {
						if (a3.equalsIgnoreCase("herbivoro")) {
							animal = "lagarta";
							System.out.printf("%s%n",animal);
						}
					}
				} else {
					if (a2.equalsIgnoreCase("anelideo")) {
						if (a3.equalsIgnoreCase("hematofago")) {
							animal = "sanguessuga";
							System.out.printf("%s%n",animal);
						} else {
							if (a3.equalsIgnoreCase("onivoro")) {
								animal = "minhoca";
								System.out.printf("%s%n",animal);
							}
						}
					}
				}
			}
		}
	}
}