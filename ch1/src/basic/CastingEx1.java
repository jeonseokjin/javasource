package basic;

//크기
//byte(1)<shor(2)<int(4)<long(8)<float(4)<double(8)

//형변환
//1. 자동형변환(Promotion) : 개발자가 신경쓰지 않아도 됨
//            큰 크기 타입=작은 크기 타입
//2. 강제형변환(Casting) : 컴파일 오류와 관련있기 때문에 신경을 써야 함
//                작은 크기 타입 = (작은 크기 타입) 큰 크기 타입
public class CastingEx1 {

	public static void main(String[] args) {
		int intValue = 1034;
		System.out.println("intValue="+intValue);
		//강제형변환
		byte byteValue = (byte)intValue; // cannot conver from int to byte
		System.out.println("byteValue="+byteValue); //10
		
		int num1=123456780;
		//자동형변환
		double num2=num1;
		System.out.println(num2);
		//강제형변환
		int num3=(int)num2;
		System.out.println(num3);

	}

}
