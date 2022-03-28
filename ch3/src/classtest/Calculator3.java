package classtest;

public class Calculator3 {
	long a, b; //인스턴스 변수 (멤버변수)
	
	//멤버메소드(인스턴스 메소드)
	long add() {
		return a+b;
	}
	long substract() {
		return a-b;
	}
	long multiple() {
		return a*b;
	}
	double divide() {
		return a/b;
	}
	
	//클래스 메소드
	//static => 공유, 객체 생성없이 사용 가능
	//인스턴스 변수, 인스턴스 메소드 사용 불가
	static long add(long c, long d) {
		return c+d;
	}
	static long substract(long c, long d) {
		return c-d;
	}
	static long multiple(long c, long d) {
		return c*d;
	}
	static double divide(long c, long d) {
		return c/d;
	}
}
