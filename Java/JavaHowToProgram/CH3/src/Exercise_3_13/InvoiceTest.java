package Exercise_3_13;

public class InvoiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice myInvoice = new Invoice("partNumber", "Description", 24, 3);
		System.out.println(myInvoice.getInvoiceAmount());
		
		System.out.println(myInvoice.getNumber());
		System.out.println(myInvoice.getPartDescription());
		System.out.println(myInvoice.getPartNumber());
		System.out.println(myInvoice.getPrice());
	}

}
