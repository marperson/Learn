package Exercise_6_14;

import java.util.Scanner;

public class IntegerPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter base:");
		int base = s.nextInt();
		System.out.println("Enter exponent:");
		int exponent = s.nextInt();
		
		System.out.println("Value is "+calculateIntergerPower(base,exponent));

	}
	
	private static int calculateIntergerPower(int base, int exponent){
		int value = 1;
		for(int i=0; i<exponent;i++){
			value*=base;
		}
		return value;
	}

}
