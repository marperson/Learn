package Exercise_4_38;

import java.util.Scanner;

public class Cryptography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Input thousand value:");
		int nbr = s.nextInt();
		int [] x={0,0,0,0};
		int n=3;
		while (nbr>0){
			 x[n]=nbr%10;
			 nbr/=10;
			 System.out.println(x[n]);
			 n--;
			 
		}
		
	}

}
