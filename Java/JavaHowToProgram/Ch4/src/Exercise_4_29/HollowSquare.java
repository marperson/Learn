package Exercise_4_29;

import java.util.Scanner;

public class HollowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Input Hollow Square side size:");
		int side = s.nextInt();

		int i = 1;
		int j = 1;
		while (i <= side) {
			while (j <= side) {
				if (i == 1 || i == side || j == 1 || j == side) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			j = 1;
			i++;
		}

	}
}
