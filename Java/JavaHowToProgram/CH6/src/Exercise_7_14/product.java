/**
 * 
 */
package Exercise_7_14;

/**
 * @author hefang
 *
 */
public class product {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []s1={1,2,3,4,5};
		int []s2={1,2,3,4,5,6};
		
		System.out.println("The Product is:"+calculateProduct(s1));
		//7_15
		if (args.length !=1){
			System.out.println("Need to enter args 0");
		}
		else{
			int arrayLength = Integer.parseInt(args[0]);
		
			System.out.println("The Product is:"+calculateProduct(s1, arrayLength));
		}
	}
	
	static int calculateProduct(int...s){
		int product = 1;
		for(int value:s){
			product*=value;
		}
		
		return product;
	}
	
	
	static int calculateProduct(int []s, int arrayLength){
		int product = 1;
		for(int value:s){
			product*=value;
		}
		
		return product;
	}
}
