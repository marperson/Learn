package Exercise_5_12;

public class OddInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product=1;
		for(int i =1;i<16;i++){
			if (i%2==0){
				product*=i;
			}
		}
		System.out.println("product is "+product);

	}

}