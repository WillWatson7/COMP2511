package lab03;

public class InternetAccount extends BankAccount {

	public InternetAccount(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	private int internet_withdrawal_limits = 10;
	private int today_withdrawals_count = 0;
	/**
	 * @return the today_withdrawals_count
	 */
	public int getToday_withdrawals_count() {
		return today_withdrawals_count;
	}
	/**
	 * @param today_withdrawals_count the today_withdrawals_count to set
	 */
	public void setToday_withdrawals_count(int today_withdrawals_count) {
		this.today_withdrawals_count = today_withdrawals_count;
	}
	/* (non-Javadoc)
	 * @see lab03.BankAccount#withdraw(int)
	 */
	@Override
	public boolean withdraw(int amount) {
		if (this.today_withdrawals_count >= this.internet_withdrawal_limits) 
			// couldn't Perform this transaction
			return false;
		// add a count for this transaction
		this.today_withdrawals_count ++;
		
		return super.withdraw(amount);
	}
	/* (non-Javadoc)
	 * @see lab03.BankAccount#deposit(int)
	 */
	@Override
	public boolean deposit(int amount) {
		// TODO Auto-generated method stub
		return super.deposit(amount);
	}
	
	

}
