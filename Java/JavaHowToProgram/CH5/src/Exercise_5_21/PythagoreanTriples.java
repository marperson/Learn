package Exercise_5_21;

public class PythagoreanTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1, b = 1, c = 1;

		while (a <= 500) {
			while (b <= 500) {
				while (c <= 500) {
					if (a * a == b * b + c * c) {
						System.out.print("This is Pythagoran Triples a = " + a
								+ " b = " + b + " c = " + c + "\n");
					}
					c++;
				}
				c = 1;
				b++;
			}
			b = 1;
			a++;
		}

	}

}
