package Exercise_5_15;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=10;i>=1;i--){
			for (int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for (int h=1;h<(10-i);h++){
				System.out.print("*");
			}

			System.out.println();
		}
		
		for (int i=10;i>=1;i--){
			for (int j=0;j<(10-i);j++){
				System.out.print(" ");
			}
			for (int h=1;h<i;h++){
				System.out.print("*");
			}

			System.out.println();
		}
			

	}

}