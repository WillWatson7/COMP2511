/**
 * 
 */
package lab03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author tecty
 *
 */
class InternetAccountTest {
	private InternetAccount iAccount;
	private void setup() {
		// TODO Auto-generated method stub
		this.iAccount = new InternetAccount("What is name");

	}

	/**
	 * Test method for {@link lab03.InternetAccount#withdraw(int)}.
	 */
	@Test
	void testWithdraw() {
		assertEquals(false, this.iAccount.withdraw(10));
	}

	/**
	 * Test method for {@link lab03.InternetAccount#deposit(int)}.
	 */
	@Test
	void testDeposit() {
		assertEquals(true, true);
	}

	/**
	 * Test method for {@link lab03.InternetAccount#InternetAccount(java.lang.String)}.
	 */
	@Test
	void testInternetAccount() {
	}

	/**
	 * Test method for {@link lab03.InternetAccount#getToday_withdrawals_count()}.
	 */
	@Test
	void testGetToday_withdrawals_count() {
	}

	/**
	 * Test method for {@link lab03.InternetAccount#setToday_withdrawals_count(int)}.
	 */
	@Test
	void testSetToday_withdrawals_count() {
	}

}
