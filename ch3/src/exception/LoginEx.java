package exception;

public class LoginEx {
	public static void main(String[] args) {
		
		try {
			login("white","12345");
		} catch (NotExistIDExecption | WrongPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			login("blue","54321");
		} catch (NotExistIDExecption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void login(String id, String password) throws NotExistIDExecption, WrongPasswordException {
		//id가 blue가 아니라면 NotExistIDException 발생
		//출력 : 아이디가 존재하지 않습니다.
		if(!id.equals("blue")) {
			throw new NotExistIDExecption("아이디가 존재하지 않습니다.");
		}
		//password가 12345가 아니라면 WrongpasswordException 발생
		//출력 : 패스워드가 틀립니다.
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
