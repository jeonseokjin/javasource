package abstracttest;

public class CarEx {
	public static void main(String[] args) {
		//Cannot instantiate the type Car
		//Car car = new Car;
		//추상클래스는 직접적으로 객체 생성불가능하다
		
		Car car=new SportsCar();
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
		
		car= new Truck();
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
	}
}
