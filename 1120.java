import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num, valor;
		do {
			num = sc.next();
			valor = sc.next();
			if (!num.equals("0") && !valor.equals("0")) {
				valor = valor.replaceAll(num, "");
				if (valor.isEmpty()) {
					valor = "0";
				}
				BigDecimal val = new BigDecimal(valor);
				System.out.printf("%.0f%n", val);
			}
		} while (!num.equals("0"));
		sc.close();
	}
}