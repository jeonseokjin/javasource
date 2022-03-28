package classtest;

public class Account {
	String accountNo;
	String owner;
	int balance;
	
	public Account (String accountNo, String owner, int balance) {
		super();
		this.accountNo=accountNo;
		this.owner=owner;
		this.balance=balance;
	}
	
	int deposit(int amount) {
		this.balance+=amount;
		return balance;
	}
	int withdraw(int amount) {
		this.balance-=amount;
		return balance;
	}
}
