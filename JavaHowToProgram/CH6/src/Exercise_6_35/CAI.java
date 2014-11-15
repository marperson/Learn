package Exercise_6_35;

import java.util.Random;
import java.util.Scanner;

public class CAI {
	static double correct = 0;
	static double wrong =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMulti(3,2);
		perf();
	}
	
	private static void LearnMulti(int times, int level){
		Scanner s = new Scanner(System.in);
		int pos = 0;
		int neg = 0;
		String [] posString = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
		String [] negString = {"No. Please try again.", "Wrong. Try once more.","Don't give up!", "No. Keep trying."};
		for (int i=0;i<times;i++){
			int a = randomLevelControl(level);
			int b = randomLevelControl(level);
			int answer = a*b;
			System.out.print("How much is "+a+" times "+ b+" ?\n");
			while (true){						
				if (answer == s.nextInt()){		
					System.out.println(posString[pos]);
					if (pos<3){						
						pos++;
					}
					else{
						pos=0;
					}
					correct++;
					break;
				}
				else {	
					
					if (neg<4){
						System.out.println(negString[neg]);
						neg++;
					}
					else {
						neg = 0;
						wrong++;
						break;
					}
				}
			}
		}
			
	}
	
	private static void perf(){
		double result = correct/(correct+wrong);
		System.out.println(result*100+"%");
		if (result<0.75){
			System.out.println("Please ask your teacher for extra help.");
		}
		else{
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
	}
	
	private static int randomLevelControl(int level){
		Random r = new Random();
		Scanner s = new Scanner(System.in);	
		int a=0;
		if (level==1){
			a = r.nextInt(10);
		}
		else if (level ==2){
			a = r.nextInt(89)+10;
		}
		else if (level ==3){
			a = r.nextInt(899)+100;
		}
		return a;
	}
}
