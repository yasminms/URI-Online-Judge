import java.util.Scanner;


public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int filhas, filhos, total;
		do{
			filhas = sc.nextInt();
            filhos = sc.nextInt();
            total = filhas + filhos ;
            if (filhas != 0 && filhos != 0) {
            	System.out.println(total);
            }
		}while (filhas != 0 && filhos != 0);
	}
}