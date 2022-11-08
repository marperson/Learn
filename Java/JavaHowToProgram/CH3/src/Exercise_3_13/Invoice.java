package Exercise_3_13;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int number;
	private double price;

	public Invoice(String partNumber, String partDescription, int number,
			double price) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;

		if (number <= 0){
			this.number =0;
		}
		else{
			this.number = number;
		}

		if (price <= 0){
			this.price = 0;
		}
		else{
			this.price = price;
		}
	}


	public double getInvoiceAmount(){
		return price;
	}

	/**
	 * @return the partNumber
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * @param partNumber the partNumber to set
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * @return the partDescription
	 */
	public String getPartDescription() {
		return partDescription;
	}

	/**
	 * @param partDescription the partDescription to set
	 */
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}



}
