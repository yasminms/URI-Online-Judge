import java.util.Scanner;


public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] n = new int[20];
		String [] vet = {"N[19] = ", "N[18] = ", "N[17] = ", "N[16] = ", "N[15] = ", "N[14] = ", "N[13] = ", "N[12] = ", "N[11] = ", "N[10] = ", "N[9] = ", "N[8] = ", "N[7] = ", "N[6] = ", "N[5] = ", "N[4] = ", "N[3] = ", "N[2] = ", "N[1] = ", "N[0] = "};
		int i;
		for (i = 0; i <= 19; i++) {
			n[i] = sc.nextInt();
			
		}
		
		for (i = 19; i >= 0; i--) {
			System.out.println(vet[i] + n[i]);
		}
	}
}  