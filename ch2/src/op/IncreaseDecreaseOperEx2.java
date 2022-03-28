package op;
//증감연산자는 앞,뒤에 올수 있음 
//대입연산자랑 만날 떄 앞쪽에 오는 경우는 증감을 먼저 하고 대입이 일어남
// 1. ++x
// 2. 1.의 결과 +20
// 3. =(대입연산자)가 실행 => 결과 22
// 뒤쪽에 오는 경우는 대입을 하고 증감이 일어남
// 1. x+20 이 먼저 실행
// 2. =(대입연산자)가 실행 => 결과 21
// 3. x++
public class IncreaseDecreaseOperEx2 {

	public static void main(String[] args) {
		int x=1;
		int y=1;
		
//		int result1=++x+20; //22
		int result1=x+++20;
		System.out.println("result1="+result1);
		System.out.println(x);
//		int result2=--y+20; //20
		int result2=y--+20;
		System.out.println("result2="+result2);
		System.out.println(y);

	}

}
