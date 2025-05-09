/**
 * 
 */
package Exercise_7_19;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hefang
 *
 */
public class AirlineReservations {
	static boolean[] seat = new boolean[10];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.fill(seat, false);
		Scanner s = new Scanner(System.in);

		for (int i=0;i<10;i++){
			System.out
			.println("Please type 1 for First Class and Please type 2 for Economy.");
			int type = s.nextInt();
			selectSeat(type);
		}

	}

	static void selectSeat(int type) {

		if (type == 1) {
			boolean status = false;
			for (int i = 0; i < 5; i++) {
				if (!seat[i]) {
					seat[i] = true;
					status = true;
					System.out.println("Your Seat Number is " + (i + 1));
					break;
				}
			}
			if (!status) {
				System.out
						.println("Would you like to choose 1st class? 1-Yes, 2-No");
				Scanner s = new Scanner(System.in);
				int choice = s.nextInt();
				if (choice == 1) {
					type = 2;
				}
			}

		} 
		if (type == 2) {
			boolean status = false;
			for (int i = 5; i < 10; i++) {
				if (!seat[i]) {
					seat[i] = true;
					status = true;
					System.out.println("Your Seat Number is " + (i + 1));
					break;
				}
			}
		} 
		
		if(type!=1 && type!=2) {
			System.out.println("Please enter 1 or 2");
		}
	}

}
