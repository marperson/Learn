/**
 * 
 */
package Exercise_8_13;

/**
 * @author hefang
 *
 */
public class IntegerSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerSet is = new IntegerSet();
		boolean [] a = new boolean[100];
		boolean [] b = new boolean[100];
		
		int i = 0;
		while(i<a.length){
			a[i] = false;
			b[i] = false;
			i++;
		}
		
		System.out.println("1. Two sets are equal? "+IntegerSet.isEqualTo(a, b));
		a[1]=true;
		System.out.println("2. Two sets are equal? "+IntegerSet.isEqualTo(a, b));

		
		IntegerSet.union(a,b);
		System.out.println(is.toString());
		
		
		IntegerSet.insertElement(1);
		System.out.println(is.toString());
		IntegerSet.union(a,b);
		System.out.println(is.toString());
		
		System.out.println("Two sets are equal? "+IntegerSet.isEqualTo(a, b));	
		IntegerSet.deleteElement(1);
		System.out.println(is.toString());
		IntegerSet.union(a,b);
		System.out.println(is.toString());
	}

}
