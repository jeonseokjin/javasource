package api;

public class MathEx3 {
	public static void main(String[] args) {
		//반복
		//1~3까지 난수(임의의 숫자) 3개 생성한 뒤 한줄에 출력
		//모두 같은 수가 나올 때까지 반복, 모두 같은 수이면 종료
//		double val1=Math.floor(Math.random()*3+1);
//		double val2=Math.floor(Math.random()*3+1);
//		double val3=Math.floor(Math.random()*3+1);
//		while(true) {
//			if(val1==val2&&val2==val3) {
//			System.out.println(val1);
//			System.out.println(val2);
//			System.out.println(val3);
//			break;}
//			
//		}
		while(true) {
			int num1=(int)(Math.random()*3)+1;
			int num2=(int)(Math.random()*3)+1;
			int num3=(int)(Math.random()*3)+1;
			System.out.printf("%d\t%d\t%d\n",num1,num2,num3);
			
			if(num1==num2&&num2==num3) {
				System.out.println("성공");
				break;
			}
		}
	}

}
