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
		// call the unit tests
		test_employee();
		System.out.println("endTest\n");
		
		test_manager();
		System.out.println("endTest\n");
		
		test_equals_between_classes();
		System.out.println("endTest\n");
		
		test_std_equal();
		System.out.println("endTest\n");
		
		test_change_clone();
		System.out.println("endTest\n");
	
		test_callable_func();
		System.out.println("endTest\n");
		
	}
	private static void test_callable_func() {
		Employee e = new Manager("m", 199, new Date().getTime());
		System.out.println("Test callable function of a (Employee)Manager");
		System.out.println("getName : " + e.getName());
		System.out.println("getSalary : "+ e.getSalary());
		System.out.println("couldn't getHire_date");
		
	}
	private static void test_change_clone() {
		System.out.println("Test of changeing clone's property");
		Manager manager = new Manager("M2", 1000, new Date().getTime());
		
		System.out.println("this.hire_date :" + manager.getHire_date());
		
		// change the clone manager's hire date
		System.out.println("Add 10 on hiredate of clone manager.");
		Manager clone_manager = manager;
		clone_manager.setHire_date(clone_manager.getHire_date() +10);
		
		// print the new hire date
		System.out.println("this.hire_date :" + manager.getHire_date());

		
		
	}
	private static void test_std_equal() {
		System.out.println("Compare of '==' and equals()");
		Employee employee1 = new Employee("E1",100);
		Employee employee2 = new Employee("E1",100);

		System.out.println("Both object has same name and salary");
		// this would print false because their address is not the same
		System.out.printf("E1 == E2 : %s\n",employee1== employee2);
		// this would print true because they have same address
		System.out.printf("E1 == E1 : %s\n",employee1==employee1);
		// this would print true because they have same property
		System.out.printf("E1.equals(E2) : %s \n",employee1.equals(employee2));
		
		
	}
	private static void test_employee() {
		// create two employee
		Employee employee1 = new Employee("E1",100);
		Employee employee2 = new Employee("E2",100);


		// print these employee out
		System.out.println("Print the name of Employee");
		
		System.out.println(employee1);
		System.out.println(employee2);
		
		// test whether the equal function Work
		System.out.println(employee1.equals(employee2));
		
		
		// manaually make them equal
		employee2.setName("E1");
		System.out.printf("E1 == E2 : %s\n",employee1.equals(employee2));
		
		
		// test of clone's equals()
		Employee employee3 = employee1;
		System.out.printf("E1 == clone of E1 : %s\n", employee1.equals(employee3));
	};

	private static void test_manager() {
		Manager manager1 = new Manager("M1", 1000, new Date().getTime());
		Manager manager2 = new Manager("M2", 1000, new Date().getTime());

		System.out.println("Print the name of manager");
		
		System.out.println(manager1);
		System.out.println(manager2);
		
		System.out.printf("M1 == M2 : %s \n", manager1.equals(manager2));
		
	}
	private static void test_equals_between_classes() {
		// create two "identical" manager and employee
		Manager manager = new Manager("EE", 100, new Date().getTime());
		Employee employee = new Employee("EE", 100);
		
		// print the test results
		System.out.println("Equals between classes");
		System.out.printf("manager.equals(employee) : %s\n",manager.equals(employee));
		/* 
		 * this print true is because the manager is an instance of 
		 * employee but employee is not a instance of manager
		 **/
		System.out.printf("employee.equals(manager) : %s\n",employee.equals(manager));
		
	};
	
	
}


