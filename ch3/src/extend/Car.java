package extend;

public final class Car {
	private String name;
	final String color="white";
	public Car(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
