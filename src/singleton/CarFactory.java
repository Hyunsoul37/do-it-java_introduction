package singleton;

public class CarFactory {
	private static CarFactory instance;
	private static int carSerialNum = 10000;
	
	private CarFactory() { };
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car(++carSerialNum);
		
		return car; 
	}
}
