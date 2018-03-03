/**
 * 
 */
package lab02;
/**
 * @author tecty
 *
 */


public class Employee {
	protected String name;
	protected int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		// return the name of the employee
//		return getClass().getName(); // this would print lab02.Employee or lab02.Manager , which is it's full class name
		return getName();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			// the address is the same
			return true;
		}
		if (obj instanceof Employee) {
			// force to change type
			Employee that_obj = (Employee) obj;
			
			// name and salary must be equal
			return this.name == that_obj.name && this.salary == that_obj.salary ;
			
		}
		return false;
	}
}
