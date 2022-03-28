package interfacetest;

public class Television implements RemoteControl, Searchable {
	

	@Override
	public void search(String url) {
		System.out.println(url+ "À» °Ë»öÇÕ´Ï´Ù");
	}

	@Override
	public void turnOn() {
		System.out.println("Ä×´Ù");
	}

	@Override
	public void turnOff() {
		System.out.println("²°´Ù");
	}

	@Override
	public void serVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
