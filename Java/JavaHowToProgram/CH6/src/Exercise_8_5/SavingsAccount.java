package Exercise_8_5;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	
	SavingsAccount(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}
	
	public double calculateMonthlyInterest(){
		double newSavingsBalance = annualInterestRate/100*savingsBalance/12;
		savingsBalance += newSavingsBalance;
		return savingsBalance;
	}

	public static void modifyInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	public void setSavingsBalance(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}
}
