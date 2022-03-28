package io;

import java.io.Serializable;

public class Person implements Serializable {
	
	//직렬화 : 인스턴스를 저장, 전송
	//역직렬화 : 저장된 내용을 다시 복원
	
	//역직렬화 시 직력화 된 것과 같은 클래스냐? 구별
	private String name;
//	private String job;
	transient  String job;
	public Person(String name, String job) {
		super();
		this.name=name;
		this.job=job;	
	}
	@Override
	public String toString() {
		return "person[name=" + name+ " , job="+job+"]";
	}
}
