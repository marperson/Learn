package Exercise_4_37;

public class MatheConstantX {
	double e=1;
	
	public MatheConstantX(double x, int n){
		while(n!=0){
			NFactorial nf = new NFactorial(n);
			e+=Math.pow(x, n)/nf.sum;
			n--;
		}
	}

}
