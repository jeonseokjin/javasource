package exception;

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
	int withdraw(int amount) throws Exception {
		if(balance<amount) {
			//throw를 통해 예외 강제 발생
			throw new Exception("잔고부족 : "+(amount-balance)+"부족");
		}
		this.balance-=amount;
		return balance;
	}
}