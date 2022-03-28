package exception;

public class ThrowsEx {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void findClass() throws ClassNotFoundException {
		Class cls=Class.forName("java.lang.String2");
	}
}
