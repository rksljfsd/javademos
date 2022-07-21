package custom;

public class CustomExceptionTest {

	public static void main(String[] args) {
		CustomExceptionTest obj = new CustomExceptionTest();
		try {
			int withDrawAmount = 5000;
			System.out.println("Withdrawing: " + withDrawAmount);
			obj.withdrawFromATM(withDrawAmount, 4538);
			System.out.println("Amount Withdrawn");
		} catch (InsufficientFundsException ex) {
			System.out.println("Exception Occurred. " + ex.getMessage());
		}
	}
	
	void withdrawFromATM(int withDrawAmount, int accountNumber) {
		int balance = getBalanceFromAccount(accountNumber);
		if (withDrawAmount > balance) {
			throw new InsufficientFundsException("No more funds in account");
		} 
	}
	
	int getBalanceFromAccount(int accountNumber) {
		return 1000;
	}
}
