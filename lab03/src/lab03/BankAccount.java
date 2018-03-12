package lab03;



public class BankAccount {
	private String name;
	// use the bank's convention to store the balance
	// $1 === balance = 100 ;
	private int balance = 0;
	private int today_withdrawal = 0;
	private int withdrawal_limit = 800;
	
	public BankAccount(String name) {
//		set the account name for this class
		setName(name);
		
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
	 * @return the balance
	 */
	public double getBalance() {
		return balance/100;
	}

	/**
	 * changing the balance method
	 * Withdraw the amount by the checking the limits
	 */
	public boolean withdraw(int amount) {
		if(amount <0 ) return false;
		if (amount+this.today_withdrawal > this.getWithdrawal_limit() || amount > this.balance) {
			// Couldn't Process this transaction
			return false;
		}
		// reduce the balance
		this.balance -= amount;
		// record this transaction to make the limit work
		setToday_withdrawal(getToday_withdrawal()+ amount);
		return true;
	}
	
	// add some money to the account 
	public boolean deposit(int amount) {
		// couldn't enter a negetive value
		if(amount <0 ) return false;
		
		this.balance += amount;
		return true;
	}

	/**
	 * @return the today_withdrawal
	 */
	public int getToday_withdrawal() {
		return today_withdrawal;
	}

	/**
	 * @param today_withdrawal the today_withdrawal to set
	 */
	public void setToday_withdrawal(int today_withdrawal) {
		this.today_withdrawal = today_withdrawal;
	}

	/**
	 * @return the withdrawal_limit
	 */
	public int getWithdrawal_limit() {
		return withdrawal_limit*100;
	}

	 // not getter method for changing withdrawal limit
	
	
}
