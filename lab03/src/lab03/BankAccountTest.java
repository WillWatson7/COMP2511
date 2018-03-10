package lab03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testBankAccount() {
		BankAccount a_account= new BankAccount("what's name");
		assertEquals(a_account.getName(),"what's name");
	}



	@Test
	void testGetName() {
		BankAccount a_account= new BankAccount("what's name");
		assertEquals(a_account.getName(),"what's name");
	}

	@Test
	void testSetName() {
		BankAccount a_account= new BankAccount("what's name");
		a_account.setName("new name");
		assertEquals(a_account.getName(),"new name");
	}

	@Test
	void testGetBalance() {
		BankAccount a_account= new BankAccount("what's name");
		assertEquals(a_account.getBalance(),0.0);
		
	}

	@Test
	void testWithdrawWithNoBalance() {
		// this account doesn't have any balance
		// hence it won't perform a withdraw
		BankAccount a_account= new BankAccount("what's name");
		assertEquals(a_account.withdraw(100),false);
		
	}

	@Test
	void testWithdrawOverDailyLimit(){
		BankAccount a_account= new BankAccount("what's name");
		
		// deposit some money, it can withdraw
		a_account.deposit(100);
		assertEquals(a_account.withdraw(100), true);
		
		// save some money 
		a_account.deposit(80000);
		// couldn't withdraw, because it's over the limit of daily limit
		assertEquals(a_account.withdraw(80000),false);
		
		// this could withdraw because it match the limit of 800-1 = $799
		assertEquals(a_account.withdraw(79900),true);
		
		// only remain $1 balance
		assertEquals(a_account.getBalance(),1.0);
	}
	@Test
	void testDeposit() {
		BankAccount a_account= new BankAccount("what's name");
		
		// deposit some money, it can show the correct balance
		a_account.deposit(100);
		assertEquals(a_account.getBalance(), 1.00);
	}


	@Test
	void testSetToday_withdrawal() {
		BankAccount a_account= new BankAccount("what's name");
		// I can set any amount to todays' withdraw
		a_account.setToday_withdrawal(200);
		assertEquals(a_account.getToday_withdrawal(),200);
	}

	@Test
	void testGetWithdrawal_limit() {
		BankAccount a_account= new BankAccount("what's name");
		// default limit is $800 which is 80000
		assertEquals(a_account.getWithdrawal_limit(), 80000);
	}

}
