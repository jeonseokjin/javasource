package classtest;

public class SubscriberInfoEx2 {
	public static void main(String[] args) {
		
		//기본타입의 초기화는 null 줄 수 없음(앞에 소문자로 시작하는 애들. ex)int, byte, short, char// String같이 대문자시작하는 타입은 null입력 가능하다)
//		int a=null;
//		String str=null;
//		TV tv=null;
		
		
		//SubscriberInfo 객체를 담을 배열 생성
		SubscriberInfo info[]=new SubscriberInfo[3];
		//생성된 배열에 subscriberInfo 객체 생성 후 담기
		info[0]= new SubscriberInfo("홍길동", "hong1234");
		info[1]= new SubscriberInfo("성춘향", "sung1234", "sung1234", "123-123-1234", "경기도 남양주시");
		info[2]= new SubscriberInfo("송중기", "song1234", "song1234", null );
		
		//생성된 정보 확인
		print(info)
	}
	
	static void print(SubscriberInfo info[]){
		//for(타입 변수명 : 배열명)
		for(SubscriberInfo s:info) {
			System.out.println("성명 : "+s.name);
			System.out.println("아이디 : "+s.id);
			System.out.println("비밀번호 : "+s.password);
			System.out.println("전화번호 : "+s.phone);
			System.out.println("주소 : "+s.address);
			System.out.println();
		}
	}
}
