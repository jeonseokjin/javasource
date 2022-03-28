package exception;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account("111", "ȫ�浿", 200000);
		
//		try {
//			account.withdraw(300000);
//		} catch (BalanceInsufficientException e) {
//			e.printStackTrace();
//		}
		try {
			account.withdraw(300000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
