package Boat;

public class Car extends Vehicle implements Drivable {
	
	private int horsePower;
	private BrandType brand;
	private double maxSpeed;
	private Person owner;
	private FuelType fuel;
	private double fuelUsage;
	private double maxFuel;


	public Car() {
		
	}
	
	public Car(BrandType brand, int horsePower, double maxSpeed, FuelType fuel, double maxFuel) {
		
	}

	
	public Car(int horsePower, BrandType brand, double maxSpeed, Person owner, FuelType fuel, double fuelUsage,
			double maxFuel) {
		super();
		this.horsePower = horsePower;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.owner = owner;
		this.fuel = fuel;
		this.fuelUsage = fuelUsage;
		this.maxFuel = maxFuel;
	}


	public int getHorsePower() {
		return horsePower;
	}


	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}


	public BrandType getBrand() {
		return brand;
	}


	public void setBrand(BrandType brand) {
		this.brand = brand;
	}


	public double getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public Person getOwner() {
		return owner;
	}


	public void setOwner(Person owner) {
		this.owner = owner;
	}


	public FuelType getFuel() {
		return fuel;
	}


	public void setFuel(FuelType fuel) {
		this.fuel = fuel;
	}


	public double getFuelUsage() {
		return fuelUsage;
	}


	public void setFuelUsage(double fuelUsage) {
		this.fuelUsage = fuelUsage;
	}


	public double getMaxFuel() {
		return maxFuel;
	}


	public void setMaxFuel(double maxFuel) {
		this.maxFuel = maxFuel;
	}

	@Override
	public void Move() {
		System.out.println("Moving fast on land");
		
	}

	@Override
	public void Drive() {
		System.out.println("Drive carefully and enjoy the ride");
		
	}
	
		
	
}
