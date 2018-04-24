import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String tot;
		while (sc.hasNext()) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			String a1 = Long.toBinaryString(a);
			String b1 = Long.toBinaryString(b);
			long c = a ^ b;
			System.out.println(c);
		}
	}
}  