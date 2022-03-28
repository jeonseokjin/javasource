package forjava.eclipse.statement;

public class Switch {

	public static void main(String[] args) {
		System.out.println("switch(1)");
		switch(4) {
		case 1 :
			System.out.println("one");
			break;
		case 2 :
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break;
		default:
			System.out.println("default");                  //여기서의 default는 초기값을 의미하는 것이 아닌 실패를 의미한다. 따라서 case1,2,3에 해당하지 않는 숫자 (예를 들어 4)가 온다면 default라는 문구가 뜨도록 설정한 것이다.
		}
		switch(2) {
		case 1 :
			System.out.println("one");
		case 2 :
			System.out.println("two");
		case 3 :
			System.out.println("three");
		}
		switch(3) {
		case 1 :
			System.out.println("one");
		case 2 :
			System.out.println("two");
		case 3 :
			System.out.println("three"); }

	}

}
                                                        /*swith 문을 사용할 때 한가지 주의 할 것은 swith의 조건으로는 몇가지 제한된 데이터 타입만을 사용할 수 있다. byte, short, char , int, enum, String, Character, 
                                                          Byte, Short, Integer*/

                                                    
