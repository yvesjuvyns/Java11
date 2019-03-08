package Boat;

public class CarBoat extends Boat {
	
	public int capacity;
	public Car[] cars;
	
	
	public CarBoat() {
		
	}

	public CarBoat(int capacity, Car[] cars) {
		super();
		this.capacity = capacity;
		this.cars = cars;
	}

	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	@Override
	public void Float() {
		System.out.println("I float but cars don't");

	}

	@Override
	public void Move() {
		System.out.println("Moving cars over the water");

		
	}

}
