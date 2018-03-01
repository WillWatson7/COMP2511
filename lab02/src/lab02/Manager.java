/**
 * 
 */
package lab02;

import java.util.Date;

/**
 * @author tecty
 *
 */
public class Manager extends Employee {

	private Date hire_date;

	public Manager(String name, int salary, Date hire_date) {
		super(name, salary);
		
//		record the hire date
		setHire_date(hire_date);
		
	}

	
	/**
	 * @return the hire_date
	 */
	public Date getHire_date() {
		return hire_date;
	}

	/**
	 * @param hire_date the hire_date to set
	 */
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	

	
	public boolean equals(Manager obj) {
		// Compare whether the hire_date is same 
		// compare whether the name and salary
		return this.hire_date == obj.hire_date && super.equals(obj);
	}
}
