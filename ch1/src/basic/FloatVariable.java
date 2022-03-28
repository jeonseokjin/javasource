package basic;

//실수 => 3.14
//    => 부동 소수정 방식 ( 가수부분 / 지수부분)


//실수형 : 1. float(4byte=32bit) : 부호비트 1비트, 지수부분 8비트, 가수23비트(F,f를 사용해줘야 컴퓨터가 인식함)
//       2. double(8byte=64bit)-기본타입 : 부호비트 1비트, 지수부 11비트, 가수부 52비트
public class FloatVariable {
	public static void main(String[] args) {
//	float f1=90.17;
	float f1=90.17f;
	System.out.println("f1="+f1);
	}

}
