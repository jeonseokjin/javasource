package classtest;


//final : 최종적인
//		: 무조건 초기화 필요(수정 불가)
//      : 
public class Person {
	final String nation = "korea";
	final String ssn;
	String name;
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
}
