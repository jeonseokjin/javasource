package interfacetest;

public class MyAdder implements Adder {

	@Override
	public void print() {
		System.out.println("Ãâ·Â");
	}

	@Override
	public int add(int x, int y) {
		return x+y;
	}

}
