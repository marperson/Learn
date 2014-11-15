package Exercise_6_15;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st side:");
		int a = s.nextInt();
		System.out.println("Enter 2nd side:");
		int b = s.nextInt();
		System.out.println("3rd side is :"+Math.hypot(a, b));

	}

}
