package Exercise_4_21;

import java.util.Scanner;

public class LargestNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		int counter = 1;
		int number =0;
		int largest = 0;
		while(counter <=10){
			System.out.println("Input Number:");
			number = s1.nextInt();
			if (number > largest){
				largest = number;
			}
			counter++;
		}
		System.out.println("The largest number is:"+largest);

	}

}
