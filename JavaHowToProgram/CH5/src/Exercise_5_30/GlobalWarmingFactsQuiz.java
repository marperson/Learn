package Exercise_5_30;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question A: Answer A and B.");
		Scanner s = new Scanner(System.in);
		
		String A = s.next();
		int correctNbr = 0;
		
		
		if (A.equals("AB")){
			correctNbr++;
		}else{
			System.out.println("Question A Search Advice.");
		}
		
		System.out.println("Question B: Answer B and C.");
		String B = s.next();
		if (B.equals("BC")){
			correctNbr++;
		}else{
			System.out.println("Question B Search Advice.");
		}
		
		switch (correctNbr){
		case 1 : System.out.println("Poor");
				break;
		case 2 : System.out.println("Good");
				break;
		default : break;
			
		}
			
				
		
		
		
		
		
	}

}