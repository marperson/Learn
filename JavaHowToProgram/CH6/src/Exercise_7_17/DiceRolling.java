/**
 * 
 */
package Exercise_7_17;

import java.util.Random;

/**
 * @author hefang
 *
 */
public class DiceRolling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] frequence = new int[11];
		int[] dice = new int[2];
		Random r = new Random();
		int sum = 0;
		for (int i = 0; i < 36000000; i++) {
			dice[0] = 1 + r.nextInt(6);
			dice[1] = 1 + r.nextInt(6);
			sum = dice[0] + dice[1];
			for (int j=0;j<11;j++){
				if (sum==value[j]){
					frequence[j]++;
				}
			}

		}
		
		for(int frequencyValue:frequence){
			System.out.println(frequencyValue);
		}

	}

}