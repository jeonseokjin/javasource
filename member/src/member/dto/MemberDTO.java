package member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//member 테이블과 똑같이 작성

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
	private int id;
	private String name;
	private String addr;
	private String email;
	private int age;
	public MemberDTO(String name, String addr, String email, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.email = email;
		this.age = age;
	}
	
	
}
/*
 *controller : 특정메뉴가 선택되었을 때 요청을 직접 받아서
 *흐름을 제어하는 클래스 정의
 *
 *action : 사용자의 요청들을 제어하는 action 클래스들이 정의  
 * 
 */
