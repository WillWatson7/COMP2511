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
	/**
	 * Test method for {@link lab03.InternetAccount#withdraw(int)}.
	 */
	@Test
	void testWithdraw() {
		InternetAccount iAc = new InternetAccount("I don't need a name");
		iAc.deposit(110);
		for (int i = 0; i < 10; i++) {
			// daily limit on transaction is 8, so he could withdraw 8 times;
			assertEquals(iAc.withdraw(10),true);
		}
		// the 9th time would not be proceed
		assertEquals(iAc.withdraw(10),false);

	}


	/**
	 * Test method for {@link lab03.InternetAccount#getToday_withdrawals_count()}.
	 */
	@Test
	void testGetToday_withdrawals_count() {
		InternetAccount iAc = new InternetAccount("I don't need a name");
		iAc.deposit(110);
		for (int i = 0; i < 10; i++) {
			// daily limit on transaction is 8, so he could withdraw 8 times;
			iAc.withdraw(10);
			assertEquals(iAc.getToday_withdrawals_count(),i+1);
		}
		// the 11th time would not be proceed, it should be 10
		iAc.withdraw(10);
		assertEquals(iAc.getToday_withdrawals_count(),10);

	}

	/**
	 * Test method for {@link lab03.InternetAccount#setToday_withdrawals_count(int)}.
	 */
	@Test
	void testSetToday_withdrawals_count() {
		InternetAccount iAc = new InternetAccount("I don't need a name");
		iAc.deposit(110);
		for (int i = 0; i < 10; i++) {
			// daily limit on transaction is 8, so he could withdraw 8 times;
			assertEquals(iAc.withdraw(10),true);
		}
		// the 11th time would not be proceed
		assertEquals(iAc.withdraw(10),false);
		
		// assume here is another day, set it to 0
		iAc.setToday_withdrawals_count(0);
		// the 1st time would not be proceed
		assertEquals(iAc.withdraw(10),true);
				
	}

}
