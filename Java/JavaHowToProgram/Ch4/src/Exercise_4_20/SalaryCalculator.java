package Exercise_4_20;

public class SalaryCalculator {
	double pay(double rate, int hours) {
		if (hours <= 40 && hours >= 0) {
			return hours * rate;
		} else {
			return 40 * rate + (hours - 40) * rate * 1.5;
		}
	}

}
