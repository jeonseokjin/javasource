package exam;

public class IPTV extends ColorTV{
	String add;
	public IPTV(int size, int color, String add) {
		super(size, color);
		this.add=add;
	}
	@Override
	public void printProperty() {
		System.out.println("나의 IPTV는 "+add+" 주소의 "+getSize()+"인치 "+color+"컬러");
	}

}
