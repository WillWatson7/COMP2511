/**
 * 
 */
package lab02;

/**
 * @author tecty
 *
 */
public class Manager extends Employee {

	private long hire_date;

	public Manager(String name, int salary, long l) {
		super(name, salary);
		
//		record the hire date
		setHire_date(l);
		
	}

	
	/**
	 * @return the hire_date
	 */
	public long getHire_date() {
		return hire_date;
	}

	/**
	 * @param l the hire_date to set
	 */
	public void setHire_date(long l) {
		this.hire_date = l;
	}
	

	
	public boolean equals(Object obj) {
		if (obj == this) {
			// address is the same.
			return true;
		}
		if (obj instanceof Manager) {
			Manager that_obj = (Manager) obj;
			// Compare whether the hire_date is same 
			// compare whether the name and salary
			return this.hire_date == that_obj.hire_date && super.equals(that_obj);	
		}
		return false;
	}
}
