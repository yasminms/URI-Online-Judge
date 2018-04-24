import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont=0;
		int num = sc.nextInt();
		int [] registro = new int[num];
		for (int i = 0; i < num; i++) {
			registro[i] = sc.nextInt();
		}
		Arrays.sort(registro);
		for (int i = 0; i < num; i++) {
			if(i != num-1 && registro[i] == registro[i+1]) {
				cont++;
			}
		}
		System.out.println(num-cont);
	}
}