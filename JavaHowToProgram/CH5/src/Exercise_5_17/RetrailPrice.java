package Exercise_5_17;

import java.util.Scanner;

public class RetrailPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input Number.");
		int nbr = s.nextInt();
		System.out.println("input quantity.");
		int quantity = s.nextInt();
		
		double price = 0;
		switch (nbr){
			case 1: System.out.println("Price is "+quantity*2.98);
					break;
			case 2: System.out.println("Price is "+quantity*4.50);
			break;
			case 3: System.out.println("Price is "+quantity*9.98);
			break;
			case 4: System.out.println("Price is "+quantity*4.49);
			break;
			case 5: System.out.println("Price is "+quantity*6.87);
			break;
			default: break;
		}
	
		
	}

}