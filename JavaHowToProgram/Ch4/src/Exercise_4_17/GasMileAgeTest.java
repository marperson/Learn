package Exercise_4_17;

import java.util.Scanner;

public class GasMileAgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("How many data?");
		int nbr = s1.nextInt();
		int i = 1;
		double totalMile = 0;
		double totalGas = 0;
		int mile=0;
		int gas=0;
		while (i <= nbr) {
			System.out.println("Input Mile:");
			mile = s1.nextInt()-mile;
			System.out.println("Input Gas:");
			gas = s1.nextInt();
			totalMile += mile;
			totalGas += gas;
			i++;
		}
		GasMileage mg1 = new GasMileage();
		System.out.println("Mile Per Gas is: "+mg1.calculateGasMileage(totalMile, totalGas));
	}

}
