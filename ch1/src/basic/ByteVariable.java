package basic;


//클래스명이 두개의 단어로 이루어져있는 경우 :  각 시작은 대문자로
//변수 : 메모리 저장공간 ( 무엇(정수형인지 문자형인지)을 담을 것이냐에 따라서 타입을 지정)
//    : 담는 값이 변할 수 있음
//    : 정수형, 문자형, 실수형, 논리형
public class ByteVariable {
	public static void main(String[] args) {
		//정수형 : byte
		//타입 변수명 = 값;
		byte b1 = 3; //The value of the local variable b1 is not used
		System.out.println(b1);
		
		byte b2= -128;
//		byte b3= 120;
		byte b3= 127;
		System.out.println("b2="+b2+b3);
	}

}
