package shop;

public class SmartTV extends Product {
	
	private String resolution; //�ػ�

	public SmartTV(String name, int price, String resolution) {
		super(name, price);
		this.resolution = resolution;
	}

	@Override
	public void printExtra() {
		System.out.println("�ػ� ���� : "+resolution);
	}

	

}