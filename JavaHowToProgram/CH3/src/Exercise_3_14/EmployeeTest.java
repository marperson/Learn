package Exercise_3_14;

public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee myEmployee1 = new Employee("Frank", "he", 1000);
		
		System.out.println(myEmployee1.getFirstName());
		System.out.println(myEmployee1.getLastName());
		System.out.println(myEmployee1.getSalary()*12);
		
		Employee myEmployee2 = new Employee("Evara","Cai",2000);
		
		System.out.println(myEmployee2.getFirstName());
		System.out.println(myEmployee2.getLastName());
		System.out.println(myEmployee2.getSalary()*12);
		
		myEmployee1.setSalary(1000*1.1);
		myEmployee2.setSalary(2000*1.1);
		System.out.println(myEmployee1.getSalary()*12);
		System.out.println(myEmployee2.getSalary()*12);
	}

}