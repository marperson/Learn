package Exercise_4_37;

public class MatheConstant {
	double e=1;
	
	public MatheConstant(int n){
		while (n!=0){
			NFactorial nf = new NFactorial(n);
			e+=1/nf.sum;
			n--;
					
		}
	}

}
