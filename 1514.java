import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m, cont1linpos=0, tot=0, j, i, cont0lin=0, cont0colpos=0, conttdsproblin = 0, cont1probpessoa = 0, cont1colpos=0, contprobresolptds=0, contprobresolvido=0, flag=0;
		do {
			
			n = sc.nextInt();
			m = sc.nextInt();
			
			if (n !=0 && m !=0) {
			int array[][] = new int[n][m];
			// i = linha       j = coluna
			for (i=0; i<n; i++) {
				for (j=0; j<m; j++) {
					array[i][j]=sc.nextInt();
				}
				
			}
			
			//ninguem resolveu todos os problemas 
			//resolveu ao menos um problema
			for (i=0; i<n; i++) {//linha
				for (j=0; j<m; j++) {//coluna
					if (array[i][j]==1) {
						cont1linpos++;
					} else {
						cont0lin++;
					}
				}
				
				if (cont1linpos >= 1) {
					cont1probpessoa ++;
				}
				if (cont1linpos == m) {
					conttdsproblin++;
				}
				cont0lin=0;
				cont1linpos=0;
				
			}
			
			if (conttdsproblin == 0) {
				tot++;
			}
			if (cont1probpessoa == n) {
				tot++;
			}
			
			conttdsproblin=0;
			cont1probpessoa=0;
			
			//todo problema foi resolvido por ao menos uma pessoa
			for (j=0; j<m; j++) {//coluna
				for (i=0;i<n;i++) {//linha
					if (array[i][j]==1) {
						cont1colpos++;
					} else {
						cont0colpos++;
					}
				}
				if (cont1colpos >= 1) {
					contprobresolvido++;
				}
				if (cont1colpos == n) {
					contprobresolptds++;
				}
				cont1colpos=0;
				cont0colpos=0;
			}
			
			if (contprobresolvido == m) {
				tot++;
			} 
			if (contprobresolptds == 0) {
				tot++;
			}
			contprobresolptds=0;
			contprobresolvido=0;
			
			System.out.printf("%d%n",tot);
			tot=0;
			} 
			flag=1;
		} while(n!=0 && m!=0);
	}
}