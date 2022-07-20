package capsule;

public class BankAccount {
	
	private String accountName;
	private int accountNumber;
	private int balanceTotal;
	
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
	
	void printDetails() {
		System.out.println("BankAccount: accountName="+accountName+", accountNumber="+accountNumber+", balanceTotal="+balanceTotal);
	}
	
	

}
