import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num=1, i=1, flag=0; String concat="";
		 while (num != 0) {	
			 if (flag == 1) {
				 System.out.println();
			 }
			 num=sc.nextInt();
			while (i*i <= num) {	
				concat+=i*i+" ";
				i++;
			}
			String [] tot = concat.split(" ");
			for (int j=0; j<tot.length; j++) {
				if (j == 0) {
					System.out.print(tot[j]);
				} else {
					System.out.print(" "+tot[j]);
				}
			}
			concat="";
			i=1;
			flag=1;
			
		 }
	 }
}