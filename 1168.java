import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, leds = 0;
		String num = null;
		n = sc.nextInt();
		for (int x = 0; x < n; x++) {
			num = sc.next();
			for (int i = 0; i < num.length(); i++) {
				char teste = num.charAt(i);
				if (teste == '1') {
					leds += 2;
				}
				if (teste == '2') {
					leds += 5;
				}
				if (teste == '3') {
					leds += 5;
				}
				if (teste == '4') {
					leds += 4;
				}
				if (teste == '5') {
					leds += 5;
				}
				if (teste == '6') {
					leds += 6;
				}
				if (teste == '7') {
					leds += 3;
				}
				if (teste == '8') {
					leds += 7;
				}
				if (teste == '9') {
					leds += 6;
				}
				if (teste == '0') {
					leds += 6;
				}
			}
			System.out.printf("%d leds%n", leds);
			leds = 0;
		}
		
	}
}