package bankAccount;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	
	public Account(int number, String holder, double depositInitial) {
		this.number = number;
		this.holder = holder;
		this.balance = depositInitial;
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}


	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount + 5;
	}
	
	public String toString() {
		return "Account: " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", balance: " 
				+ balance;
	}

}

//System.out.printf("Account %d, Holder: %s, balance: %.2f %n", acc.number, acc.holder, acc.balance);








