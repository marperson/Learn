package Exercise_5_11;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of integer.");
		int nbr = s.nextInt();
		int max = 0;
		int i = 0;
		while (nbr>0){
			System.out.print("Enter integer value.");
			i = s.nextInt();
			if (i>max){
				max = i;
			}
			nbr--;
		}
		System.out.println("Max value is "+max);
		

	}

}
