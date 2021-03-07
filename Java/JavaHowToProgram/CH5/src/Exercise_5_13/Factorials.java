package Exercise_5_13;

public class Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long factorial = 1;
		for(int i=1;i<=15;i++){
			factorial*=i;
			System.out.print(i+"\t"+factorial+"\n");
		}
	}

}
