package Exercise_5_3;

public class A_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A
		int sum=0;
		for(int i=1;i<100;i++){
			sum+=i;
		}
		System.out.printf("%d\n",sum);
		
		//B
		System.out.printf("%f\n",Math.pow(2.5, 3));
		
		//C
		int j=1;
		while(j<21){
			System.out.printf("%d\t",j);
			if (j%5==0){
				System.out.println();
			}
			j++;
		}

	}

}