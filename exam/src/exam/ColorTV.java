package exam;

public class ColorTV extends TV{
	int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
		
	}
	public void printProperty() {
		System.out.println(getSize()+"??ġ"+" "+color+"?÷?");
	}
	
}
