/**
 * 
 */
package Exercise_7_12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hefang
 *
 */
public class DuplicateElimination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	
		int []myIntegers = new int [5];
		
		for(int i=0;i<myIntegers.length;i++){
			System.out.println("Enter integer:");
			myIntegers[i]=s.nextInt();
			//System.out.println(Arrays.binarySearch(myIntegers, myIntegers[i]));
			for(int j=0;j<i;j++){
				if(myIntegers[j]==myIntegers[i]){
					System.out.println("Wrong!");
				}
			
			}
		}
		
	}

}
