import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String letra, frase; double porc = 0, cont = 0;
		letra = sc.nextLine();
		frase = sc.nextLine();
		String [] palavra = frase.split(" ");
		for (int i = 0; i < palavra.length; i++) {
			if (palavra[i].contains(letra)) {
				cont++;
			}
		}
		porc = (cont*100)/palavra.length;
		System.out.printf("%.1f%n", porc);
		
	}
}