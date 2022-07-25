package capsule;

public class BankAccount {
	
	private String accountName;
	private int accountNumber;
	private int balanceTotal;
	
	BankAccount(int balance) {
		this.balanceTotal = balance;
	}
	
	public void setAccountName(String name) {
		this.accountName = name;
	}
	
	public void setAccountNumber(int num) {
		if (num < 0) {
			this.accountNumber = 0;
		} else {
			this.accountNumber = num;
		}
	}
	
	public void withdrawMoney(int amount) {
		this.balanceTotal -= amount;
	}
	
	public void depositMoney(int amount) {
		this.balanceTotal += amount;
	}
	
	void printDetails() {
		System.out.println("BankAccount: accountName="+accountName+", accountNumber="+accountNumber+", balanceTotal="+balanceTotal);
	}

}
