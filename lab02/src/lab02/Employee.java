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
		return this.name;
	}
	
	public boolean equals(Employee obj) {
		System.out.println(this.name + obj.name + " is " + (this.name == obj.name));
		
		// name and salary must be equal
		return this.name == obj.name && this.salary == obj.salary ;
	}
}
