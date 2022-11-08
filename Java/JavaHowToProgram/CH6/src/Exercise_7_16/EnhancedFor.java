/**
 * 
 */
package Exercise_7_16;

/**
 * @author hefang
 *
 */
public class EnhancedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length == 0) {
			System.out.println("Enter Double values");
		} else {
			System.out.println("The product is :" + calculateProduct(args));
		}

	}

	static double calculateProduct(String... args) {
		double product = 1.0;
		for (String value : args) {
			product *= Double.parseDouble(value);
		}
		return product;
	}

}
