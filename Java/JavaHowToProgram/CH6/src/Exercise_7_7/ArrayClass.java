/**
 * 
 */
package Exercise_7_7;

import java.util.Arrays;

/**
 * @author hefang
 *
 */
public class ArrayClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ARRAY_SIZE = 10;
		double myArray[];
		double myArray2[];
		myArray = new double[ARRAY_SIZE];
		myArray2 = new double[ARRAY_SIZE + 10];

		Arrays.fill(myArray, Math.random());

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = Math.random();
		}

		System.arraycopy(myArray, 0, myArray2, 0, 5);
		for (double value : myArray) {
			System.out.println(value);
		}
		System.out.println("--------------");
		for (double value : myArray2) {
			System.out.println(value);
		}

		double min = myArray[0];
		double max = myArray[0];
		for (double value : myArray) {
			if (min > value) {
				min = value;
			}
			if (max < value) {
				max = value;
			}
		}

		System.out.println("max and min is: " + max + "," + min);

	}

}
