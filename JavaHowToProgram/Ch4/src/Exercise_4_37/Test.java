package Exercise_4_37;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Input n value:");
		int n = 0;
		n = s.nextInt();		
		NFactorial nf = new NFactorial(n);		
		System.out.println("n factorial is "+nf.sum);
		

		
		System.out.println("Input e calculate rate:");
		n = s.nextInt();
		MatheConstant mc = new MatheConstant(n);
		System.out.println("n factorial is "+mc.e);
		
		
		System.out.println("Input X and e calculate rate:");
		double x = s.nextDouble();
		n = s.nextInt();
		MatheConstantX mcx = new MatheConstantX(x,n);
		System.out.println("e power x is "+mcx.e);
		

	}

}
