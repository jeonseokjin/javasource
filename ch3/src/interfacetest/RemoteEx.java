package interfacetest;

public class RemoteEx {
	public static void main(String[] args) {
		
		RemoteControl rc=new Television();
		rc.turnOn();
		rc.turnOff();
		
		System.out.println();
		
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
		
		//RemoteControl rc1=new RemoteControl(); //직접 객체 생성 불가
		//익명 구현 객체
		
		RemoteControl rc1= new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("라디오를 킵니다");
			}

			@Override
			public void turnOff() {
				System.out.println("라디오를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("현재 볼륨"+ volume);
			}
			
		};
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
