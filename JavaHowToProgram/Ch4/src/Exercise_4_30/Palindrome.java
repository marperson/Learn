package Exercise_4_30;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Input Palindrom number:");

		int pal = s.nextInt();

		int a = 0, b = 0, c = 0, d = 0, e = 0;

		a = pal / 10000;
		b = (pal - a * 10000) / 1000;
		c = (pal - a * 10000 - b * 1000) / 100;
		d = (pal - a * 10000 - b * 1000 - c * 100) / 10;
		e = (pal - a * 10000 - b * 1000 - c * 100 - d * 10) / 1;

		if (a == e && b == d) {
			System.out.println("This is a palindrom number.");
		} else {
			System.out.println("This is not a palindrom number.");
		}

	}

}
