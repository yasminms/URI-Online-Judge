import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		String mes;
		num = teclado.nextInt();
		if (num >= 1 && num <= 12) {
			if (num == 1) {
				mes = "January";
				System.out.printf("%s%n",mes);
			} else { 
				if (num == 2) {
					mes = "February";
					System.out.printf("%s%n",mes);
				} else {
					if (num == 3) {
						mes = "March";
						System.out.printf("%s%n",mes);
					} else {
						if (num == 4) {
							mes = "April";
							System.out.printf("%s%n",mes);
						} else {
							if (num == 5) {
								mes = "May";
								System.out.printf("%s%n",mes);
							} else {
								if (num == 6) {
									mes = "June";
									System.out.printf("%s%n",mes);
								} else {
									if (num == 7) {
										mes = "July";
										System.out.printf("%s%n",mes);
									} else {
										if (num == 8) {
											mes = "August";
											System.out.printf("%s%n",mes);
										} else {
											if (num == 9) {
												mes = "September";
												System.out.printf("%s%n",mes);
											} else {
												if (num == 10) {
													mes = "October";
													System.out.printf("%s%n",mes);
												} else {
													if (num == 11) {
														mes = "November";
														System.out.printf("%s%n",mes);
													} else {
														if (num == 12) {
															mes = "December";
															System.out.printf("%s%n",mes);
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}