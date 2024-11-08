/**
 * 
 */
package Exercise_8_13;

import java.util.Arrays;

/**
 * @author hefang
 *
 */
public class IntegerSet {
	private static boolean array[]= new boolean[100];
	private static String s;
	IntegerSet(){
		Arrays.fill(array, false);
		s="null";
	}
	
	public static void union(boolean[] a, boolean[] b){
		for(int i=0;i<array.length;i++){
			if (a[i]||b[i]){
				array[i]=true;
			}
		}
	}
	
	public static void interSection(boolean[] a, boolean[] b){
		for(int i=0;i<array.length;i++){
			if (a[i]&&b[i]){
				array[i]=true;
			}
		}
	}
	
	public static void insertElement(int k){
		Arrays.fill(array, k, k+1, true);
	}
	
	public static void deleteElement(int m){
		Arrays.fill(array, m, m+1, false);
	}
	
	public static boolean isEqualTo(boolean[] a, boolean[] b){
		boolean trigger = false;
		int i = 0;
		while(i<array.length){
			if (a[i] != b[i]){
				trigger = true;
			}
			i++;
		}
		return !trigger;
	}
	
	public String toString(){
		boolean trigger = false;
		for(int i=0;i<array.length;i++){
			if (i==0){
				s=String.valueOf(array[i])+" ";
			}
			else {
				s+=String.valueOf(array[i])+" ";
			}
			
			if (array[i]){
				trigger = true;
			}
			
		}
		if (!trigger){
			s = "---";
		}
		return s;
	}
}
