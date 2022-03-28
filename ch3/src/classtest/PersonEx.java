package classtest;

public class PersonEx {
	public static void main(String[] args) {
		Person person= new Person("000000-000013", "홍길동");
				
				System.out.println("국적 : "+person.nation);
				System.out.println("주민번호 : "+person.ssn);
				System.out.println("이름 : "+person.name);
				
				person.name="홍두깨";
				System.out.println("이름 : "+person.name);
				
				//final타입은 변경 불가하다. person.ssn="000023";
	}

}
