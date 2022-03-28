package forjava.eclipse.variable;

public class constant {

	public static void main(String[] args) {
		long a=2147483648L;
		System.out.println(a);
		byte b=100;
		short c=200; 
		/*기본적으로 정수들은 default값인 int형태를 띄고 있다.
		 * 따라서 long을 사용할 경우 데이터형태를 L을 붙임으로써 long형태로
		 * 바꿔주어야한다. 하지만 byte와 short경우에는 default값인 int형태로
		 * 사용하여도 무방하다. 그러나 byte와 short의 range를 벗어나게되면
		 * error는 발생한다.(byte와 short는 int에 포함되는 범위이기에 허용되는걸로
		 * 보여진다)	
		 */
		

	}

}
