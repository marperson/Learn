package Exercise_4_18;

import java.util.Scanner;

public class CreditLimitCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Input Account Number:");
		int accountNumber = s1.nextInt();
		System.out.println("INput Beginning Balance:");
		int beginningBalance = s1.nextInt();
		System.out.println("Input Charged:");
		int charged = s1.nextInt();
		System.out.println("Input Credit:");
		int credit = s1.nextInt();
		System.out.println("Input Allowed Credit:");
		int allowedCredit = s1.nextInt();
		
		CreditLimitCalculator c1 = new CreditLimitCalculator();
		if (c1.CalculateCreditLimit(beginningBalance, charged, credit, allowedCredit)){
			
		}else{
			System.out.println("Credit limit exceeded.");
		}
		
	}

}
