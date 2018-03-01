/**
 * 
 */
package lab02;

import java.util.Date;

/**
 * @author tecty
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test_employee();

		
		
		// create two manager
//		Manager manager1  = new Manager("M1", 100, Date());
//		Manager manager2  = new Manager("M2", 100, Date());
		
		
		
	}
	private static void test_employee() {
		// create two employee
		Employee employee1 = new Employee("E1",100);
		Employee employee2 = new Employee("E2",100);


		// print these employee out
		System.out.println(employee1);
		System.out.println(employee2);
		
		// test whether the equal function Work
		System.out.println(employee1 == employee2);
		
		
		// mananual make them equal
		employee2.setName("E1");
		System.out.println(employee1 == employee2);
		
		
	};

	
}
