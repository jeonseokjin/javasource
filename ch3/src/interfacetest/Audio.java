package interfacetest;

public class Audio implements RemoteControl, Searchable {
	

	@Override
	public void search(String url) {
		System.out.println(url+ "À» °Ë»öÇÕ´Ï´Ù");
	}

	@Override
	public void turnOn() {
		System.out.println("Ä×");
	}

	@Override
	public void turnOff() {
		System.out.println("²°");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
