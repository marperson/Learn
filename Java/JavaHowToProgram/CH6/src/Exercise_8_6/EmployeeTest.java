package Exercise_8_6;

//Fig. 8.9: EmployeeTest.java
//Composition demonstration.

public class EmployeeTest {
	public static void main(String args[]) {
		Date birth = new Date(7, 24, 1949);
		Date hire = new Date(3, 12, 1988);
		Employee employee = new Employee("Bob", "Blue", birth, hire);

		System.out.println(employee);
		
		//newDate
		Date d = new Date(12, 31, 2014);
		d.NextDay();
		System.out.println(d.toString());
		
	} // end main
} // end class EmployeeTest

