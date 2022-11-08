package Exercise_8_5;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount frank = new SavingsAccount(2000);
		SavingsAccount john = new SavingsAccount(3000);
		//4
		SavingsAccount.modifyInterestRate(4);
		int i =1;
		while(i<=12){
			System.out.print(frank.calculateMonthlyInterest()+"\t");
			i++;
		}
		System.out.println();
		int j=1;
		while(j<=12){
			System.out.print(john.calculateMonthlyInterest()+"\t");
			j++;
		}
		
		System.out.println();
		
		//5
		frank.setSavingsBalance(2000);
		john.setSavingsBalance(3000);
		SavingsAccount.modifyInterestRate(5);
		i =1;
		while(i<=12){
			System.out.print(frank.calculateMonthlyInterest()+"\t");
			i++;
		}
		System.out.println();
		j=1;
		while(j<=12){
			System.out.print(john.calculateMonthlyInterest()+"\t");
			j++;
		}
	}

}
