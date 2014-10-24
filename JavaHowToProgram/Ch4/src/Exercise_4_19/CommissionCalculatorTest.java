package Exercise_4_19;

import java.util.Scanner;

public class CommissionCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Input number of items:");
		int nbr = s1.nextInt();
		int i = 1;
		
		
		double item = 0;
		int itemId = 0;
		double itemTotal = 0;
		
		while(i<=nbr){
			System.out.println("Input item value:");
			item = s1.nextDouble();
			itemTotal+=item;
			i++;
		}
		
		CommissionCalculator cc1 = new CommissionCalculator();
		System.out.println("Sum is: "+cc1.sum(itemTotal));
	}

}
