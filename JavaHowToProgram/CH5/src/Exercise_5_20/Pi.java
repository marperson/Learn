package Exercise_5_20;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get Pi value
		double pi = 0;
		int accu = 1;
		while (accu < 200000) {
			if (accu % 2 == 0) {
				pi -= (double) 4 / (2 * accu - 1);
				System.out.print("Pi is: " + pi + ", where n=" + accu + "\n");
			} else if (accu % 2 != 0) {
				pi += (double) 4 / (2 * accu - 1);
				System.out.print("Pi is: " + pi + ", where n=" + accu + "\n");
			}
			accu++;

			// Check accu value when pi = 3.14159
			int n = (int) (pi * 100000);
			int nbr = 5;
			int[] individual = { 0, 0, 0, 0, 0, 0 };
			while (nbr >= 0) {
				individual[nbr] = n % 10;
				n /= 10;
				nbr--;
			}
			if (individual[0] == 3 && individual[1] == 1 && individual[2] == 4
					&& individual[3] == 1 && individual[4] == 5
					&& individual[5] == 9) {
				System.out
						.print("Where accu = " + accu + " we have pi = " + pi);
				break;
			}

		}

	}
}
