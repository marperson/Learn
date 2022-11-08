package Exercise_6_27;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first integer:");
		int a = s.nextInt();
		System.out.println("Enter second integer:");
		int b = s.nextInt();

		System.out.println("Greatest common divisor is: " + CalculateGcd(a, b));
	}

	private static int CalculateGcd(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int factor = 1;
		int c = 1;
		int p = 0;
		int gcd = 0;
		while (c != 0) {
			while (max >= factor * min){
				p=factor * min;
				factor++;
			}
			c = max - p;
			//System.out.print(max +"," + min+ ","+ c+","+p+ "\n");
			if (c == 0) {
				gcd = min;
			} 
			else if (c>=0){
				max = min;
				min = c;
				factor = 1;
				p=0;
			}
			else{
				gcd = -1;
				break;
			}

		}
		return gcd;

	}

}
