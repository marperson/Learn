/**
 * 
 */
package Exercise_7_29;

import java.util.Scanner;

/**
 * @author hefang
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Value is :"+myFibonacci(n));
	}
	
	static int myFibonacci(int n){
		int f=0;
		if (n==0 || n==1){
			f = 0;
		}else if (n==2){
			f = 1;
		}else{
			f = myFibonacci(n-1)+myFibonacci(n-2);
		}
		
		return f;
		
	}

}
