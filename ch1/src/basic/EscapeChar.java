package basic;

public class EscapeChar {

	public static void main(String[] args) {
		// \로 시작하는 문자는 약속된 규칙이 있음. \n, \t 들 같은 개념으로 컴퓨터가 이해함
		// \n(엔터 역할), \t, \"(쌍따옴표를 화면에 출력하는 것이 가능)
		System.out.println("\n안녕하세요");
		System.out.println("안녕하세요\t반갑습니다");
		System.out.println("'Hello'");
		System.out.println("\"Hello\"");
		
		//println에서 ln의 의미는(엔터의 의미이다)따라서 print로 사용할경우 붙어서 출력된다
		System.out.print("Hello");
		System.out.print("\nworld\t");
		// \하나를 표현하려면 => \\
		System.out.println("c:\\");

	}

}

