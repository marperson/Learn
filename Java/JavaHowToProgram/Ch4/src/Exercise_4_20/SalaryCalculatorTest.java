package Exercise_4_20;

import java.util.Scanner;

public class SalaryCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);

		System.out.println("Input Number of Employees:");
		int nbr = s1.nextInt();

		int i = 1;
		double salary = 0;
		double rate = 0;
		int hours = 0;
		SalaryCalculator sc1 = new SalaryCalculator();
		while (i <= nbr) {
			System.out.println("Input rate:");
			rate = s1.nextDouble();
			System.out.println("input hours:");
			hours = s1.nextInt();
			System.out.println("Pay is: "+sc1.pay(rate, hours));
			i++;
		}

	}
}
