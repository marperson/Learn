/**
 * 
 */
package Exercise_7_3;

import java.util.Random;

/**
 * @author hefang
 *
 */
public class fractions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		final int ARRAY_SIZE = 10;
		double[] fractions;
		fractions = new double[ARRAY_SIZE];
		for (int i = 0; i < fractions.length; i++) {
			fractions[i] = r.nextDouble();
		}

		for (double value : fractions) {
			System.out.println(value);
		}

		System.out.println("--------------");

		final int ARRAY_SIZE2 = 5;
		
		double [][]fractions2;
		fractions2 = new double[ARRAY_SIZE][ARRAY_SIZE2];
		for (double []fractions2row:fractions2){
			for(double fractions2colume:fractions2row){
				System.out.println(fractions2colume);
			}
		}

	}

}
