package Exercise_5_24;

import java.util.Scanner;

public class DiamondPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		
		for (int i = 1; i <= 9; i++) {
			int a = 1;
			int b = 1;
			for (int j = 1; j <= 9; j++) {
				if (i <= 5 && j <= 5) {
					if (a <= 5 - i) {
						System.out.print(" ");
						a++;
					} else {
						System.out.print("*");
					}
				} else if (i <= 5 && j > 5) {
					if (b < i) {
						System.out.print("*");
						b++;
					} else {
						System.out.print(" ");
					}
				} else if (i > 5 && j <= 5) {
					if (a <= i - 5) {
						System.out.print(" ");
						a++;
					} else {
						System.out.print("*");
					}
				} else if (i > 5 && j > 5) {
					if (b <= 9 - i) {
						System.out.print("*");
						b++;
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}
		*/
		Scanner s = new Scanner(System.in);
		System.out.println("Enter odd size number:");
		int size = s.nextInt();
		int middle = size/2+1;
		
		for (int i = 1; i <= size; i++) {
			int a = 1;
			int b = 1;
			for (int j = 1; j <= size; j++) {
				if (i <= middle && j <= middle) {
					if (a <=middle - i) {
						System.out.print(" ");
						a++;
					} else {
						System.out.print("*");
					}
				} else if (i <= middle && j > middle) {
					if (b < i) {
						System.out.print("*");
						b++;
					} else {
						System.out.print(" ");
					}
				} else if (i > middle && j <= middle) {
					if (a <= i - middle) {
						System.out.print(" ");
						a++;
					} else {
						System.out.print("*");
					}
				} else if (i > middle && j > middle) {
					if (b <=size - i) {
						System.out.print("*");
						b++;
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}

	}

}
