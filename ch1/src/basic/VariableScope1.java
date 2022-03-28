package basic;

//변수 유효 범위
//변수를 어디서 선언했느냐에 따라 미치는 범위가 다름
//{} : 블록안에서 선언 =>선언된 블록내에서만 사용가능
//1)클래스 내부에 선언
//2)메소드 내부에 선언

public class VariableScope1 {
	
	//클래스 내부 선언
//	int age;

	public static void main(String[] args) {
		
		//메소드 내부에서 선언-지역변수
		int age=4;
		int v1=3;

		{
			v1= age+30;
//			int age=4; //Duplicate local variable age   -동일한 위치에 동일한 변수를 사용할 수 없다.
			int v2=45;
		}
		System.out.println("v1="+v1);
//		System.out.println("v2="+v2); v2 변수가 다른 블록에 존재
	}
	public static void print() {
//		System.out.println(age);//age를 선언한 메소드와 다른 메소드, 즉 다른 블록에 age 변수가 존재하기에 출력할 수 없다.
	}

}
