package Exercise_3_15;

public class Date {
	private int year;
	private int month;
	private int date;

	/**
	 * @param year
	 * @param month
	 * @param date
	 */
	public Date(int year, int month, int date) {
		super();
		if (year <= 0) {
			System.out.println("Wrong Year");
		} else {
			this.year = year;
		}

		if (month <= 0 && month > 12) {
			System.out.println("Wrong month");
		} else {
			this.month = month;
		}

		if (date <= 0 && date > 31) {
			System.out.println("Wrong Date");
		} else {
			this.date = date;
		}
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month
	 *            the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the date
	 */
	public int getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	}

}
