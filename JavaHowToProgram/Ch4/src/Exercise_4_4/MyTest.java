package Exercise_4_4;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1, y=2,z=0;
		System.out.println(z=y+x++);
		System.out.println(x);
		
		int count=11;
		System.out.println(count>10? "Count is greater than 10":"");
		
		int total=10;
		x=4;
		System.out.println(total-=--x);
		System.out.println(x);
		
		int q=10;
		int divisor=3;
		System.out.println(q%=divisor);
		q=10;
		System.out.println(q=q%divisor);
		
	}

}
