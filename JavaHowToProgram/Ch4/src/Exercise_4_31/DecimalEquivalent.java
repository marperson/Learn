package Exercise_4_31;

import java.util.Scanner;

public class DecimalEquivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input binary number:");
		int binary = s.nextInt();
		
		int number=0;
		int n=0;
		int temp=0;
		boolean flag = true;
		int x=1,y=2;
		
		while(flag){
			temp = (int) ((binary-temp*Math.pow(10, n))/Math.pow(10, n+1));
			number += temp*Math.pow(2,n);
			n++;
			if (temp == 0){
				flag = false;
			}
			
		}
		System.out.println("Number is:"+number);
	}

}
