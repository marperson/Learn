/**
 * 
 */
package Exercise_7_20;

import java.util.Random;

/**
 * @author hefang
 *
 */
public class TotalSales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] sales = new int [4][5];
		Random r = new Random();
		
		for(int i=1;i<=31;i++){
			for(int j=0;j<4;j++){
				for(int k=0;k<5;k++){
					sales[j][k]+=r.nextInt(10000);
				}
			}
		}
		
		int sum1=0;
		int sum2=0;
		for(int [] value1:sales){
			for(int value2:value1){
				System.out.print(value2+"\t");
				sum1+=value2;
			}
			System.out.println(sum1);
			System.out.println();
			sum1=0;
		}
		
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				sum2+=sales[j][i];
			}
			System.out.print(sum2+"\t");
			sum2=0;
		}

	}

}