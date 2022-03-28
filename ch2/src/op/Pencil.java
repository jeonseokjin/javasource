package op;
//변수명
//소문자로 시작(대소문자 구별)- ex)filename fileName 는 서로 다른 변수명이다.
//두개의 단어가 붙은 경우 첫 문자를 대문자로 한다. (관례)firstName, maxspeed
//$,_ 로 시작하는 것은 혀용. 다른 특수문자는 불가능
public class Pencil {

	public static void main(String[] args) {
		//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때 학생 당 몇개를 가질 수 있고
		//최종적으로 몇 개가 남는지 출력하시오.
		//변수 사용, 산술 연산자 사용
		
		int pencil=534;
		int student=30;
		int result=pencil/student;
		int resultRest=pencil%student;
				System.out.println("result="+result);
				System.out.println("resultRest="+resultRest);    //본인 작성
		
		int pens=534;
		int stu=30;
		System.out.println("학생 한 명 당 연필 개수 : "+(pens/stu));
		System.out.println("나머지 연필 개수 : "+(pens%stu));
				

	}

}
