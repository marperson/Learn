package Exercise_4_37;

public class NFactorial {
	double sum=1;
	
	public NFactorial(int n){
		while (n!=0){
			sum*=n;
			n--;
		}
	}

}
