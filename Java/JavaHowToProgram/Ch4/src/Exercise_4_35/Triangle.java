package Exercise_4_35;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int x = 0, y = 0, z = 0;
		System.out.println("Input 3 varialbes:");
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();

		if ((x * x + y * y) == z * z || (x * x + z * z) == y * y
				|| (y * y + z * z) == x * x){
			System.out.println("This is triangle!");
		}
		else {
			System.out.println("This isn't triangle!");
		}

	}

}
