package Exercise_4_18;

public class CreditLimitCalculator {
	public boolean CalculateCreditLimit(int beginningBalance, int charged,
			int credit, int allowedCredit) {
		int balance = beginningBalance + charged - credit;
		if (balance < allowedCredit) {
			return true;
		} else
			return false;
	}

}
